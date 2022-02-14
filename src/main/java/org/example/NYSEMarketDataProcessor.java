package org.example;

import com.google.common.util.concurrent.RateLimiter;
import java.time.LocalDateTime;

public class NYSEMarketDataProcessor extends MarketDataProcessor {
	private static final Double HKSE_METHOD_CALL_PER_SECOND = 1.0;
	RateLimiter nyselimiter = RateLimiter.create(HKSE_METHOD_CALL_PER_SECOND);

	// Receive market data from Exchange and
	// Ensure each symbol will not have more than one publish per second
	public void receiveNYSEMarketData(MarketData data) {
		nyselimiter.acquire();
		onMessage(data);
	}

}
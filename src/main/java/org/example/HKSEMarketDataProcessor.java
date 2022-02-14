package org.example;

import com.google.common.util.concurrent.RateLimiter;

public class HKSEMarketDataProcessor extends MarketDataProcessor {
	private static final Double HKSE_METHOD_CALL_PER_SECOND = 1.0;
	RateLimiter hkselimiter = RateLimiter.create(HKSE_METHOD_CALL_PER_SECOND);

	// Receive market data from Exchange and
	// Ensure each symbol will not have more than 1 publish per second
	public void receiveHKSEMarketData(MarketData data) {
		hkselimiter.acquire();
		onMessage(data);
	}

}
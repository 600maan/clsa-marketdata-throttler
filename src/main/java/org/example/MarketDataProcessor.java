package org.example;

import com.google.common.util.concurrent.RateLimiter;

import java.time.LocalDateTime;

public abstract class MarketDataProcessor {

	private static final Double METHOD_CALL_PER_SECOND = 100.0;
	RateLimiter limiter = RateLimiter.create(METHOD_CALL_PER_SECOND);

	// Receive incoming market data public 
	public void onMessage(MarketData data){
		publishAggregatedMarketData(data);
	};

	// Publish aggregated and throttled market data 
	public void publishAggregatedMarketData(MarketData data) {
		// Configure a method is not called any more than 100 times/sec
		limiter.acquire();
		System.out.println("publishAggregatedMarketData method call at " + LocalDateTime.now() + " with MarketData :" + data.toString());
	};

}
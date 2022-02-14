package org.example;

import java.time.LocalDateTime;

public class Main 
{
    public static void main( String[] args )
    {
        HKSEMarketDataProcessor hksemdp = new HKSEMarketDataProcessor();
        NYSEMarketDataProcessor nysemdp = new NYSEMarketDataProcessor();
        for(int i = 0 ; i< 1000; i++ ){
            hksemdp.receiveHKSEMarketData(new HKSEMarketData( "BBB", 87.5, LocalDateTime.now()));
            nysemdp.receiveNYSEMarketData(new NYSEMarketData( "AAA", 87.5, LocalDateTime.now()));
        }
    }
}

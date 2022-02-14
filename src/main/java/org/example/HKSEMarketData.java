package org.example;

import java.time.LocalDateTime;

public class HKSEMarketData extends MarketData {
  private static String exchangeCode = "HKEX" ; 

  public void setSymbol(String symbol) { super.setSymbol(symbol); }
  public void setPrice(Double price) { super.setPrice(price);}
  public void setUpdatedTime(LocalDateTime updatedTime) { super.setUpdatedTime(updatedTime); }

  public String getSymbol() { return super.getSymbol(); }
  public Double getPrice() { return super.getPrice(); }
  public LocalDateTime getUpdatedTime() { return super.getUpdatedTime(); }
  
  HKSEMarketData(String symbol, Double price, LocalDateTime updatedTime) {
    super(symbol, price, updatedTime);
  }
  
  @Override
  public String toString() {
    return "HKSEMarketData{" +
              "ExchangeCode='" + exchangeCode + '\'' +
              "Symbol='" + super.getSymbol() + '\'' +
              ", Price='" + super.getPrice() + '\'' +
              ", updatedTime=" + super.getUpdatedTime() +
              '}';
    }
}
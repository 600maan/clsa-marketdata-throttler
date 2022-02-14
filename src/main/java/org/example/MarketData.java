package org.example;

import java.time.LocalDateTime;

public abstract class MarketData {
  private String symbol;
	private Double price;
	private LocalDateTime updatedTime;

  public MarketData(String symbol, Double price, LocalDateTime updatedTime) {
    this.symbol = symbol;
    this.price = price;
    this.updatedTime = updatedTime;
  }
  
  public String getSymbol() { return symbol; }
  public Double getPrice() { return price; }
  public LocalDateTime getUpdatedTime() { return updatedTime; }
  
  public void setSymbol(String symbol) { this.symbol = symbol; }
  public void setPrice(Double price) { this.price = price; }
  public void setUpdatedTime(LocalDateTime updatedTime) { this.updatedTime = updatedTime; }

  @Override
  public String toString() {
    return "MarketData{" +
              "Symbol='" + symbol + '\'' +
              ", Price='" + price + '\'' +
              ", updatedTime=" + updatedTime +
              '}';
    }
}



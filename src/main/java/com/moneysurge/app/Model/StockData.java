package com.moneysurge.app.Model;
import com.fasterxml.jackson.annotation.JsonProperty;


public class StockData {
    @JsonProperty("Global Quote")
    private GlobalQuote globalQuote;

    public class GlobalQuote{
        @JsonProperty("01. symbol") 
        public String symbol;
        @JsonProperty("02. open") 
        public String open;
        @JsonProperty("03. high") 
        public String high;
        @JsonProperty("04. low") 
        public String  low;
        @JsonProperty("05. price") 
        public String  price;
        @JsonProperty("06. volume") 
        public String  volume;
        @JsonProperty("07. latest trading day") 
        public String day;
        @JsonProperty("08. previous close") 
        public String close;
        @JsonProperty("09. change") 
        public String change;
        @JsonProperty("10. change percent") 
        public String percent;
        public String getSymbol() {
            return symbol;
        }
        public void setSymbol(String symbol) {
            this.symbol = symbol;
        }
        public String getOpen() {
            return open;
        }
        public void setOpen(String open) {
            this.open = open;
        }
        public String getHigh() {
            return high;
        }
        public void setHigh(String high) {
            this.high = high;
        }
        public String getLow() {
            return low;
        }
        public void setLow(String low) {
            this.low = low;
        }
        public String getPrice() {
            return price;
        }
        public void setPrice(String price) {
            this.price = price;
        }
        public String getVolume() {
            return volume;
        }
        public void setVolume(String volume) {
            this.volume = volume;
        }
        public String getDay() {
            return day;
        }
        public void setDay(String day) {
            this.day = day;
        }
        public String getClose() {
            return close;
        }
        public void setClose(String close) {
            this.close = close;
        }
        public String getChange() {
            return change;
        }
        public void setChange(String change) {
            this.change = change;
        }
        public String getPercent() {
            return percent;
        }
        public void setPercent(String percent) {
            this.percent = percent;
        }
        
    }

    public GlobalQuote getGlobalQuote() {
        return globalQuote;
    }

    public void setGlobalQuote(GlobalQuote globalQuote) {
        this.globalQuote = globalQuote;
    }
    
    
}

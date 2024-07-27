package com.moneysurge.app.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.moneysurge.app.Model.StockData;

@Component
public class StockService {
    
    private static final String API= "https://www.alphavantage.co/query?function=GLOBAL_QUOTE&symbol=SYMBOL&apikey=MYCQ6B712RT01IS2";

    @Autowired
    private RestTemplate restTemplate;
    
    public String getStockData(String symbol){
        String url = API.replace("SYMBOL", symbol);
        System.out.println(url);
        ResponseEntity<StockData> response=restTemplate.exchange(url, HttpMethod.GET, null,StockData.class);
        StockData data=response.getBody();
        if(data.getGlobalQuote()!=null){

            return data.getGlobalQuote().getOpen();
        }else{
            return "Problem";
        }
    }
    
}

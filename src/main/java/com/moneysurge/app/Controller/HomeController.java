package com.moneysurge.app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moneysurge.app.Service.StockService;

@RestController
@RequestMapping("/home")
public class HomeController {
    @Autowired
    private StockService stockService;


    @GetMapping("price/{symbol}")
    public String getStockData(@PathVariable String symbol) {
       return stockService.getStockData(symbol);
    }


}

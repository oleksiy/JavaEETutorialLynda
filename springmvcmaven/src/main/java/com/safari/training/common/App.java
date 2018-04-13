package com.safari.training.common;

import com.safari.training.stock.bo.StockBo;
import com.safari.training.stock.model.Stock;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[]args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");

        StockBo stockBusinessObject = (StockBo)applicationContext.getBean("stockBo");

        //insert
        Stock stock = new Stock();
        stock.setStockCode("7668");
        stock.setStockName("TSLA");
        stockBusinessObject.save(stock);


        //select
        Stock stock2 = stockBusinessObject.findByStockCode("7668");
        System.out.println(stock2);

        //update
        stock2.setStockName("AAPL");
        stockBusinessObject.update(stock2);

        stockBusinessObject.delete(stock2);

        System.out.println("done");
    }
}

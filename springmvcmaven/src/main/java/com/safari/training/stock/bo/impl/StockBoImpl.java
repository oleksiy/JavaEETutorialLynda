package com.safari.training.stock.bo.impl;

import com.safari.training.stock.bo.StockBo;
import com.safari.training.stock.dao.StockDao;
import com.safari.training.stock.model.Stock;

public class StockBoImpl implements StockBo {
    StockDao stockDao;

    public void setStockDao(StockDao dao){
        this.stockDao = dao;
    }
    @Override
    public void save(Stock stock) {
        stockDao.save(stock);
    }

    @Override
    public void update(Stock stock) {
        stockDao.update(stock);
    }

    @Override
    public void delete(Stock stock) {
        stockDao.delete(stock);
    }

    @Override
    public Stock findByStockCode(String stockCode) {
        return stockDao.findByStockCode(stockCode);
    }
}

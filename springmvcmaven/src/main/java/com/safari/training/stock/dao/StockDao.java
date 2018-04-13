package com.safari.training.stock.dao;

import com.safari.training.stock.model.Stock;

public interface StockDao {
    void save(Stock stock);
    void update(Stock stock);
    void delete(Stock stock);
    Stock findByStockCode(String stock);
}

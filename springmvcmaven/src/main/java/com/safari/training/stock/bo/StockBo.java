package com.safari.training.stock.bo;

import com.safari.training.stock.model.Stock;

public interface StockBo {

    void save(Stock stock);
    void update(Stock stock);
    void delete(Stock stock);

    Stock findByStockCode(String stockCode);
}

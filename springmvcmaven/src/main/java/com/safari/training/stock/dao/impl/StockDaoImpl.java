package com.safari.training.stock.dao.impl;

import com.safari.training.stock.dao.StockDao;
import com.safari.training.stock.model.Stock;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

public class StockDaoImpl extends HibernateDaoSupport implements StockDao {

    @Override
    public void save(Stock stock) {
        getHibernateTemplate().save(stock);
    }

    @Override
    public void update(Stock stock) {
        getHibernateTemplate().update(stock);
    }

    @Override
    public void delete(Stock stock) {
        getHibernateTemplate().delete(stock);
    }

    @Override
    public Stock findByStockCode(String stockCode) {
        List list = getHibernateTemplate().find("from stock where stockCode=?", stockCode);
        return (Stock)list.get(0);
    }
}

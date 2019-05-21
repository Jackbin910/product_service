package com.yangbin1.product_service.service.impl;

import com.yangbin1.product_service.domain.Product;
import com.yangbin1.product_service.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProductServiceImpl implements ProductService {

    private static Map<Integer,Product> daoMap = new HashMap<>();

    private final Logger logger = LoggerFactory.getLogger(getClass());

    static {
        Product p1 = new Product(1,"iphonex",9999,10);
        Product p2 = new Product(2,"冰箱",3000,20);
        Product p3 = new Product(3,"洗衣机",4000,30);
        Product p4 = new Product(4,"电脑",8000,40);
        Product p5 = new Product(5,"汽车",99999,50);
        Product p6 = new Product(6,"书",99,60);
        daoMap.put(p1.getId(),p1);
        daoMap.put(p2.getId(),p2);
        daoMap.put(p3.getId(),p3);
        daoMap.put(p4.getId(),p4);
        daoMap.put(p5.getId(),p5);
        daoMap.put(p6.getId(),p6);
    }

    @Override
    public List<Product> listProduct() {
        Collection<Product> collection = daoMap.values();
        List<Product> list = new ArrayList<>(collection);
        return list;
    }

    @Override
    public Product findById(int id) {
        logger.info("service findById");
        return daoMap.get(id);
    }
}

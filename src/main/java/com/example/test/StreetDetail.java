package com.example.test;


import javax.persistence.EmbeddedId;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.criteria.Order;

public class StreetDetail {
    @EmbeddedId
    private StreetDetailId id;
    @ManyToOne
    @MapsId("orderId")
    @JoinColumn(name = "order_id",referencedColumnName = "id",nullable = false)
    private Order order;
    @ManyToOne
    @MapsId("productId")
    @JoinColumn(name = "product_id",referencedColumnName = "id",nullable = false)
    private Product product;
}
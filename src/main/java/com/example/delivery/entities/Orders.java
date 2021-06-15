package com.example.delivery.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "courier_id")
    private Couriers couriers;
    private Long customer_id;
    @OneToOne
    @JoinColumn(name = "from_address_id")
    private Addresses adresses;
    @OneToOne
    @JoinColumn(name = "to_address_id")
    private Addresses addresses;
    private Long order_status_id;
    private int ransom_sum;
    private Date order_date;
    @OneToOne
    @JoinColumn(name = "admin_id")
    private Admins admins;
    private int delivery_price;
    private String comment;

    public Orders() {
    }

    public Orders(Couriers couriers, Long customer_id, Addresses adresses, Addresses addresses, Long order_status_id, int ransom_sum, Date order_date, Admins admins, int delivery_price, String comment) {
        this.couriers = couriers;
        this.customer_id = customer_id;
        this.adresses = adresses;
        this.addresses = addresses;
        this.order_status_id = order_status_id;
        this.ransom_sum = ransom_sum;
        this.order_date = order_date;
        this.admins = admins;
        this.delivery_price = delivery_price;
        this.comment = comment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Couriers getCouriers() {
        return couriers;
    }

    public void setCouriers(Couriers couriers) {
        this.couriers = couriers;
    }

    public Long getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Long customer_id) {
        this.customer_id = customer_id;
    }

    public Addresses getAdresses() {
        return adresses;
    }

    public void setAdresses(Addresses adresses) {
        this.adresses = adresses;
    }

    public Addresses getAddresses() {
        return addresses;
    }

    public void setAddresses(Addresses addresses) {
        this.addresses = addresses;
    }

    public Long getOrder_status_id() {
        return order_status_id;
    }

    public void setOrder_status_id(Long order_status_id) {
        this.order_status_id = order_status_id;
    }

    public int getRansom_sum() {
        return ransom_sum;
    }

    public void setRansom_sum(int ransom_sum) {
        this.ransom_sum = ransom_sum;
    }

    public Date getOrder_date() {
        return order_date;
    }

    public void setOrder_date(Date order_date) {
        this.order_date = order_date;
    }

    public Admins getAdmins() {
        return admins;
    }

    public void setAdmins(Admins admins) {
        this.admins = admins;
    }

    public int getDelivery_price() {
        return delivery_price;
    }

    public void setDelivery_price(int delivery_price) {
        this.delivery_price = delivery_price;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}

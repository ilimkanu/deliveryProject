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
}

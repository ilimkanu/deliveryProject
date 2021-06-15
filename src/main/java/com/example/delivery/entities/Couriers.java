package com.example.delivery.entities;

import javax.persistence.*;

@Entity
public class Couriers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fio;
    private Long phone;
    private Long account_id;
    @OneToOne
    @JoinColumn(name = "courier_status_id")
    private CouriersStatuses couriersStatuses;
}

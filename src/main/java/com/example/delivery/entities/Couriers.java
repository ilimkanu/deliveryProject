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

    public Couriers() {
    }

    public Couriers(String fio, Long phone, Long account_id, CouriersStatuses couriersStatuses) {
        this.fio = fio;
        this.phone = phone;
        this.account_id = account_id;
        this.couriersStatuses = couriersStatuses;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public Long getAccount_id() {
        return account_id;
    }

    public void setAccount_id(Long account_id) {
        this.account_id = account_id;
    }

    public CouriersStatuses getCouriersStatuses() {
        return couriersStatuses;
    }

    public void setCouriersStatuses(CouriersStatuses couriersStatuses) {
        this.couriersStatuses = couriersStatuses;
    }
}

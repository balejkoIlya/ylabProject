package com.example.models;

import com.example.enums.Status;

import java.time.LocalDateTime;

public class Order {
    private long id;
    private User client;
    private Car car;
    private Status status;
    private LocalDateTime dateOfCreation;

    public Order(long id, User client, Car car, Status status) {
        this.id = id;
        this.client = client;
        this.car = car;
        this.status = status;
        this.dateOfCreation = LocalDateTime.now();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getClient() {
        return client;
    }

    public void setClient(User client) {
        this.client = client;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalDateTime getDateOfCreation() {
        return dateOfCreation;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", client=" + client +
                ", car=" + car +
                ", status=" + status +
                ", dateOfCreation=" + dateOfCreation +
                '}';
    }
}

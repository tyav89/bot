package com.example.bot2.model;

import jakarta.persistence.*;

@Table(name="Address")
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name_address")
    private String nameAddress;

    @ManyToOne
    @JoinColumn(name = "point_id", nullable = false)
    private Point point;

    public Address() {
    }

    public long getId() {
        return id;
    }

    public Point getPoint() {
        return point;
    }

    public String getName() {
        return nameAddress;
    }

    public void setName(String name) {
        this.nameAddress = name;
    }
}

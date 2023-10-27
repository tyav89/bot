package com.example.bot2.model;

import jakarta.persistence.*;

import java.util.Set;

@Table(name="Point")
@Entity
public class Point {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "point_id")
    private long id;

    @Column(name = "name_point")
    private String namePoint;

    public Point(String name) {
        this.namePoint = name;
    }

    @OneToMany(mappedBy = "point")
    private Set<Address> addresses;

    public Point() {

    }

    public long getId() {
        return id;
    }

    public Set<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<Address> addresses) {
        this.addresses = addresses;
    }

    public String getNamePoint() {
        return namePoint;
    }

    public void setNamePoint(String name) {
        this.namePoint = name;
    }
}

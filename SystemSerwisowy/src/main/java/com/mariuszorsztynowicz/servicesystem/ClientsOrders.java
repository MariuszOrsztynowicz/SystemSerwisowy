package com.mariuszorsztynowicz.servicesystem;

import javax.persistence.*;


@Entity
public class ClientsOrders {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getContactPersonName() {
        return contactPersonName;
    }

    public void setContactPersonName(String contactPersonName) {
        this.contactPersonName = contactPersonName;
    }

    public int getContactPersonPhoneNumber() {
        return contactPersonPhoneNumber;
    }

    public void setContactPersonPhoneNumber(int contactPersonPhoneNumber) {
        this.contactPersonPhoneNumber = contactPersonPhoneNumber;
    }

    public String getOwnedMachine() {
        return ownedMachine;
    }

    public void setOwnedMachine(String ownedMachine) {
        this.ownedMachine = ownedMachine;
    }

    public boolean isServiceContract() {
        return serviceContract;
    }

    public void setServiceContract(boolean serviceContract) {
        this.serviceContract = serviceContract;
    }

    public ClientsOrders(int id,
                         String orderType,
                         String name,
                         String city,
                         String contactPersonName,
                         int contactPersonPhoneNumber,
                         String ownedMachine,
                         boolean serviceContract) {
        this.id = id;
        this.orderType = orderType;
        this.name = name;
        this.city = city;
        this.contactPersonName = contactPersonName;
        this.contactPersonPhoneNumber = contactPersonPhoneNumber;
        this.ownedMachine = ownedMachine;
        this.serviceContract = serviceContract;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @ManyToOne
    private String orderType;

    @ManyToOne
    private String name;

    @ManyToOne
    private String city;

    @ManyToOne
    private String contactPersonName;

    @ManyToOne
    private int contactPersonPhoneNumber;

    @ManyToOne
    private String ownedMachine;

    @ManyToOne
    private boolean serviceContract;

    public ClientsOrders() {
    }

}

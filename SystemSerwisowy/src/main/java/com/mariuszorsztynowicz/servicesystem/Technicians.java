package com.mariuszorsztynowicz.servicesystem;


import javax.persistence.*;


@Entity
public class Technicians {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLocalisation() {
        return localisation;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

    public Technicians(int id,
                       String firstName,
                       String lastName,
                       String localisation) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.localisation = localisation;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String localisation;

    public Technicians() {
    }

}

package com.mariuszorsztynowicz.servicesystem;


import javax.persistence.*;

@Entity
public class TechniciansTasks {

    public TechniciansTasks(int id,
                            ClientsOrders serviceOrder,
                            boolean isServiceFinished,
                            boolean isReportPrepared) {
        this.id = id;
        this.serviceOrder = serviceOrder;
        this.isServiceFinished = isServiceFinished;
        this.isReportPrepared = isReportPrepared;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ClientsOrders getServiceOrder() {
        return serviceOrder;
    }

    public void setServiceOrder(ClientsOrders serviceOrder) {
        this.serviceOrder = serviceOrder;
    }

    public boolean isServiceFinished() {
        return isServiceFinished;
    }

    public void setServiceFinished(boolean serviceFinished) {
        isServiceFinished = serviceFinished;
    }

    public boolean isReportPrepared() {
        return isReportPrepared;
    }

    public void setReportPrepared(boolean reportPrepared) {
        isReportPrepared = reportPrepared;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @ManyToOne
    private ClientsOrders serviceOrder;

    @Column
    private boolean isServiceFinished;

    @Column
    private boolean isReportPrepared;

    public TechniciansTasks() {
    }
}

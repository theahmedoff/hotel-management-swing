/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 *
 * @author Ahme_vn75
 */
public class Booking {
    private int id;
    private LocalDateTime checkIN;
    private LocalDateTime checkOUT;
    private Room room;
    private Customer customer;
    private boolean status;

    public Booking() {
    }

    public Booking(LocalDateTime checkIN, LocalDateTime checkOUT, Room room, Customer customer, boolean status) {
        this.checkIN = checkIN;
        this.checkOUT = checkOUT;
        this.room = room;
        this.customer = customer;
        this.status = status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    public LocalDateTime getCheckIN() {
        return checkIN;
    }

    public void setCheckIN(LocalDateTime checkIN) {
        this.checkIN = checkIN;
    }

    public LocalDateTime getCheckOUT() {
        return checkOUT;
    }

    public void setCheckOUT(LocalDateTime checkOUT) {
        this.checkOUT = checkOUT;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Booking{" + "id=" + id + ", checkIN=" + checkIN + ", checkOUT=" + checkOUT + ", room=" + room + ", customer=" + customer + ", status=" + status + '}';
    }

    
    
    
}

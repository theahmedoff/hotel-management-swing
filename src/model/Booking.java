/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 *
 * @author Ahme_vn75
 */
public class Booking {
    private int id;
    private LocalDate checkIN;
    private LocalDate checkOUT;
    private Room room;
    private Customer customer;

    public Booking() {
    }

    public Booking(LocalDate checkIN, LocalDate checkOUT, Room room, Customer customer) {
        this.checkIN = checkIN;
        this.checkOUT = checkOUT;
        this.room = room;
        this.customer = customer;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    public LocalDate getCheckIN() {
        return checkIN;
    }

    public void setCheckIN(LocalDate checkIN) {
        this.checkIN = checkIN;
    }

    public LocalDate getCheckOUT() {
        return checkOUT;
    }

    public void setCheckOUT(LocalDate checkOUT) {
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

    @Override
    public String toString() {
        return "Booking{" + "id=" + id + ", checkIN=" + checkIN + ", checkOUT=" + checkOUT + ", room=" + room + ", customer=" + customer + '}';
    }

    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Ahme_vn75
 */
public class Room {
    private int id;
    private String property;
    private String type;
    private String view;
    private int adultNo;
    private int childNo;
    private int number;
    private boolean status;

    public Room() {
    }

    public Room(int id, String property, String type, String view, int adultNo, int childNo, int number, boolean status) {
        this.id = id;
        this.property = property;
        this.type = type;
        this.view = view;
        this.adultNo = adultNo;
        this.childNo = childNo;
        this.number = number;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    public int getAdultNo() {
        return adultNo;
    }

    public void setAdultNo(int adultNo) {
        this.adultNo = adultNo;
    }

    public int getChildNo() {
        return childNo;
    }

    public void setChildNo(int childNo) {
        this.childNo = childNo;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Room{" + "id=" + id + ", property=" + property + ", type=" + type + ", view=" + view + ", adultNo=" + adultNo + ", childNo=" + childNo + ", number=" + number + ", status=" + status + '}';
    }
    
    

    
    
}

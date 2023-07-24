package com.example.homework_4_2;

import java.io.Serializable;

public class Ticket implements Serializable {

    private int id;
    private String departurePoint;
    private String departureDate;
    private String arrivalPoint;
    private String arrivalDate;
    private float costTicket;

    public Ticket(int id, String departurePoint, String departureDate, String arrivalPoint, String arrivalDate, float costTicket) {
        this.id =id;
        this.departurePoint = departurePoint;
        this.departureDate = departureDate;
        this.arrivalPoint = arrivalPoint;
        this.arrivalDate = arrivalDate;
        this.costTicket = costTicket;
    }

    //гет и сет
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDeparturePoint() {
        return departurePoint;
    }

    public void setDeparturePoint(String departurePoint) {
        this.departurePoint = departurePoint;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getArrivalPoint() {
        return arrivalPoint;
    }

    public void setArrivalPoint(String arrivalPoint) {
        this.arrivalPoint = arrivalPoint;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public float getCostTicket() {
        return costTicket;
    }

    public void setCostTicket(float costTicket) {
        this.costTicket = costTicket;
    }

    // переопределение метода toString

    @Override
    public String toString() {
        return "Железнодорожный билет:\n" +
                "Пассажир " + id +
                ", пункт отправления " + departurePoint +
                " в " + departureDate +
                ", пункт прибытия " + arrivalPoint +
                " в " + arrivalDate +
                ", стоимость билета " + costTicket + " монет";
    }
}

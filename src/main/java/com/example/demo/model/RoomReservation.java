package com.example.demo.model;

import java.util.Date;

public class RoomReservation {
    private String name;
    private Long nationalCode;
    private Date startDay;
    private Date endDay;
    private int roomCapacity;
    static int trackingNumber=10000;
    static int romeNumber=1;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(Long nationalCode) {
        this.nationalCode = nationalCode;
    }

    public Date getStartDay() {
        return startDay;
    }

    public void setStartDay(Date startDay) {
        this.startDay = startDay;
    }

    public Date getEndDay() {
        return endDay;
    }

    public void setEndDay(Date endDay) {
        this.endDay = endDay;
    }

    public int getRoomCapacity() {
        return roomCapacity;
    }

    public void setRoomCapacity(int roomCapacity) {
        this.roomCapacity = roomCapacity;
    }

    public static int getTrackingNumber() {
        return trackingNumber;
    }

    public static void setTrackingNumber(int trackingNumber) {
        RoomReservation.trackingNumber = trackingNumber;
    }

    public static int getRomeNumber() {
        return romeNumber;
    }

    public static void setRomeNumber(int romeNumber) {
        RoomReservation.romeNumber = romeNumber;
    }

}

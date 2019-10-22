package com.company;

public class vehicle {
    private String registrationNumber;
    private int mileage;


    public vehicle(String registrationNumber, int mileage) {
        this.registrationNumber = registrationNumber;
        this.mileage = mileage;

    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getMileage() {
        return mileage;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }
    
    public void addTrip(int amount){
        mileage += amount;
    }
}
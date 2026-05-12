package com.pluralsight.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Vehicle extends Asset{
    String makeModel;
    int year;
    int odometer;
    double value;

    public Vehicle(String description, String dateAccquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAccquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }


    public double calculateValue(){
        year = getYear();

        LocalDate vehicleAccquiredDate = LocalDate.parse(dateAccquired);
        LocalDate now = LocalDate.now();
        long year = ChronoUnit.YEARS.between(vehicleAccquiredDate, now);
        System.out.println();
        double depreciationPercentage;
        if(year <= 3 && year >= 0){
            depreciationPercentage = 0.03;
            value = originalCost - (originalCost * depreciationPercentage);
        } else if (year <=6 && year >=4) {
            depreciationPercentage = 0.06;
            value = originalCost - (originalCost * depreciationPercentage);
        } else if (year <= 10 && year >=7) {
            depreciationPercentage = 0.08;
            value = originalCost - (originalCost * depreciationPercentage);
        } else {
            value = 1000;
        }

        if(odometer >= 100000){
            depreciationPercentage = 0.25;
            value = originalCost - (originalCost * depreciationPercentage);
        }


        return value;
    }

    @Override
    public double getValue(){
       value = calculateValue();
       return value;
    }


}

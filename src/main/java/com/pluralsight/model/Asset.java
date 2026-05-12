package com.pluralsight.model;

public class Asset {
    String description;
    String dateAccquired;
    double originalCost;

    public Asset(String description, String dateAccquired, double originalCost) {
        this.description = description;
        this.dateAccquired = dateAccquired;
        this.originalCost = originalCost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateAccquired() {
        return dateAccquired;
    }

    public void setDateAccquired(String dateAccquired) {
        this.dateAccquired = dateAccquired;
    }

    public double getOriginalCost() {
        return originalCost;
    }

    public void setOriginalCost(double originalCost) {
        this.originalCost = originalCost;
    }

    public double getValue(){
        return originalCost;
    }

    @Override
    public String toString() {
        return "Asset{" +
                "description='" + description + '\'' +
                ", dateAccquired='" + dateAccquired + '\'' +
                ", originalCost=" + originalCost +
                '}';
    }
}

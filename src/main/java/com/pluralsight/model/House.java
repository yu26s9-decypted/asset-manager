package com.pluralsight.model;

public class House extends Asset{
    String address;
    int condition;
    int squareFoot;
    int lotSize;
    double valuePerSqFoot;
    double valuePerLotSize = 0.25;
    double actualValue;

    public House(String description, String dateAccquired, double originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAccquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    public double calculateValue(double valuePerFoot, double squareFoot, double valuePerLotSize, double lotSize){
        return (valuePerFoot * squareFoot) + (valuePerLotSize * lotSize);
    }


    @Override
    public double getValue(){
       if(condition == 1){
           valuePerSqFoot = 180;
           actualValue = calculateValue(valuePerSqFoot, squareFoot, valuePerLotSize, lotSize);
       } else if ( condition == 2){
           valuePerSqFoot = 130;
           actualValue = calculateValue(valuePerSqFoot, squareFoot, valuePerLotSize, lotSize);
       } else if (condition == 3) {
           valuePerSqFoot = 90;
           actualValue = calculateValue(valuePerSqFoot, squareFoot, valuePerLotSize, lotSize);
       } else if (condition == 4){
           valuePerSqFoot = 80;
           actualValue = calculateValue(valuePerSqFoot, squareFoot, valuePerLotSize, lotSize);
       } else {
          return 0;
       }
       return actualValue;
    }
}

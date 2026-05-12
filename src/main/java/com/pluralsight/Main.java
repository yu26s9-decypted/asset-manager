package com.pluralsight;

import com.pluralsight.model.Asset;
import com.pluralsight.model.House;
import com.pluralsight.model.Vehicle;

import java.util.ArrayList;

public class Main {
    static void main() {
        ArrayList<Asset> a = new ArrayList<>();
        double networth = 0;

        House h = new House(
                "Suburban Family Home",
                "2025-08-12",
                1250000,
                "123 Smith St, NJ",
                1,
                2400,
                8500
        );

        House h2 = new House(
                "Beach Vacation Home",
                "2025-06-10",
                1850000,
                "121 Smith Blvd, NY",
                2,
                3200,
                6000
        );

        Vehicle v1 = new Vehicle(
                "BYD Atto 3",
                "2020-05-20",
                36500,
                "2023 BYD Atto 3",
                2023,
                125000
        );

        Vehicle v2 = new Vehicle(
                "Toyota Corolla",
                "2025-08-14",
                22000,
                "2020 Toyota Corolla",
                2020,
                64000
        );

        a.add(h);
        a.add(h2);
        a.add(v1);
        a.add(v2);

        String msg = "";
        for(Asset asset : a){
         if(asset instanceof House){
             House house = (House) asset;
             msg = String.format("House is: %s Value of Property: $%.2f", house.getAddress(), house.getValue());
             networth += house.getValue();
         } else if (asset instanceof Vehicle){
             Vehicle car = (Vehicle) asset;
             msg = String.format("Vehicle: %s Year: %s - Value of vehicle after depreciation: $%.2f", car.getMakeModel(), car.getYear(), car.getValue());
             networth += car.getValue();
            }
            System.out.printf("%s\n", msg);
        }

        System.out.printf("Your total networth is $%,.2f", networth);



    }
}

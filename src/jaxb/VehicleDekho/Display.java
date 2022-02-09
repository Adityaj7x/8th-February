package jaxb.VehicleDekho;

import java.util.List;

public class Display {
    public static void printEmployeeInfo(List<Vehicle> vehicle) {
        for (Vehicle v : vehicle) {
            System.out.println("Name: " + v.getBrand() + " " + v.getName());

            System.out.println("==========================");

        }

    }

}

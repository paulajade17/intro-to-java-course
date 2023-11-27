package com.cbfacademy;

import java.util.List;

import com.cbfacademy.cars.Car;
import com.cbfacademy.cars.Showroom;

public class App {
    public static void main(String[] args) {
        Showroom shop = new Showroom();
        List<Car> listOfCars = shop.getCars();
        for (Car vehicle : listOfCars) { 		      
            System.out.println(vehicle.getDetails()); 		
       }

        //System.out.println("Hello World!");
    }
}

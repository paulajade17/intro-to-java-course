package com.cbfacademy.cars;

import java.util.ArrayList;
import java.util.List;

public class Showroom {
    
    public List<Car> getCars(){
        Car volvo = new Car("Volvo","V40", "Blue", 2012);
        Car porsche = new Car("Porsche","Panamera","Red", 2009);
        Car audi = new Car("Audi","A3","Grey",2018);
        
        List<Car> vehicles = new ArrayList<>();
        vehicles.add(volvo);
        vehicles.add(porsche);
        vehicles.add(audi);

        return vehicles;
    }
}

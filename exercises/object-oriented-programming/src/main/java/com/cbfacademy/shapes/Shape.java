package com.cbfacademy.shapes;


//Create abstract Shape class
abstract class Shape {
//abstract method to get the area of the shape    
    abstract double getArea();
//Create getName string method which returns get name
    String getName(){
        return this.getClass().getSimpleName();
    }
    
    
}


package com.cbfacademy.shapes;
import java.lang.Math;

//Create Sphere class
public class Sphere extends Shape {
    //create field 
    double radius;
    //create attribute
    String name = "Shape One";
    //create constructor arguement
    Sphere (double radius){
        this.radius = radius;

    }
    @Override double getArea(){
       return (4 * Math.PI * Math.pow (this.radius, 2));
    }
    
}

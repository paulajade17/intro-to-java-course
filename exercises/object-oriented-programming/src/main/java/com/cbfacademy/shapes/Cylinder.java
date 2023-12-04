package com.cbfacademy.shapes;
import java.lang.Math;

public class Cylinder extends Shape{
    double radius;
    double height;
    String name = "Shape Three";

    Cylinder(double radius, double height){
        this.radius = radius;
        this.height = height;
        
    }

    @Override
    double getArea(){
        return (this.height * Math.PI * (Math.pow(this.radius, 2)));
    }
    
}

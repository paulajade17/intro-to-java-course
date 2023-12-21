package com.cbfacademy.shapes;
import java.lang.Math;

public class Circle implements Enclosure{
    public double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double perimeter(){
        return (2 * Math.PI * radius);

    }

    
    public double area(){
        return (radius * radius * Math.PI);

    }


}


package com.cbfacademy.shapes;


public class Rectangle extends Shape {
    double length;
    double width;
    String name = "Shape Two";

    Rectangle(double length, double width){
        this.length = length;
        this.width = width;

    }

    double getArea(){
        // 1. Find out how to calculate the area of a rectangle
        // 2. Return the l * w
        return (this.length * this.width);
    }
    
}

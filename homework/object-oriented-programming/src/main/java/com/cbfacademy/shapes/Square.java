package com.cbfacademy.shapes;

public class Square implements Enclosure {
    double width;

    public Square(double width){
        this.width = width;
    }

    public double perimeter(){
        return (width * 4);

    }

    
    public double area(){
        return (width * 2);

    }
}

package com.cbfacademy.shapes;

import java.util.ArrayList;

public class Shapes {
    

    public double computeArea(ArrayList<Enclosure> Objects){ 
        double sum = 0;
        for (Enclosure shape: Objects){
            sum += shape.area();
        }
        return sum;

    }

    public double computePerimeter(ArrayList<Enclosure>Objects){
        double sum = 0;
        for (Enclosure shape: Objects){
            sum += shape.perimeter();
        }

        return sum;
    }


    
}

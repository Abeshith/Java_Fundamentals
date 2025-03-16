package com.inheritance;

public class Box {
    double length;
    double width;
    double height;

     Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    Box (){
         this.length = -1;
         this.width = -1;
         this.height = -1;
    }
    Box (double side){
         this.length = side;
         this.width = side;
         this.height = side;
    }
    Box (Box box){
         this.length = box.length;
         this.width = box.width;
         this.height = box.height;
    }
    void information(){
         System.out.println("Box Dimensions");
    }
}

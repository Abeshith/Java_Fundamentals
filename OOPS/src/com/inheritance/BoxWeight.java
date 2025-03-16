package com.inheritance;

public class BoxWeight extends Box {
    double weight;



    BoxWeight() {
        super();
        this.weight = -1;
    }

    BoxWeight(double side,double weight) {
        super(side);
        this.weight = weight;
    }
    BoxWeight(Box boxWeight,double weight) {
        super(boxWeight);
        this.weight = weight;
    }
    BoxWeight(BoxWeight boxWeight) {
        super(boxWeight);
        this.weight = boxWeight.weight;
    }

    public BoxWeight(double length, double width, double height, double weight) {
        super(length, width, height);
        this.weight = weight;
    }
}

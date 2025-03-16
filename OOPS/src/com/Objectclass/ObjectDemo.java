package com.Objectclass;

public class ObjectDemo {
    int num = 7;

    public ObjectDemo(int num) {
        this.num = num;
    }

    public ObjectDemo() {
        super();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

}

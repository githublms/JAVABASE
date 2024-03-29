package com.example.exer1;

public class MyRectangle extends  GeometricObject{
    private  double width;
    private  double height;

    @Override
    public double findArea() {
        return width * height;
    }

    public MyRectangle() {
    }

    public MyRectangle(double width,double height,String color, double weight) {
        super(color, weight);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}


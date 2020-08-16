package com.company;



public class Ques4
{
    public static void main(String[] args)
    {

    }
}

class Circle
{
    private double radius=1.0;
    private String color="Red";

    public Circle()
    {

    }

    public Circle(double radius)
    {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea()
    {
        return 3.14*getRadius()*getRadius();
    }
}

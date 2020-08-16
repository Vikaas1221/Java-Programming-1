package com.company;

public class Ques7
{
    public static void main(String[] args)
    {
        Triangle triangle=new Triangle(12,4,3);
        System.out.println("Area of triangle: "+triangle.getArea());
    }
}

class Triangle
{
    int a,b,c;

    public Triangle(int a, int b, int c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getArea()
    {
        double s = (a+b+c)/2;
        s = s*(s-a)*(s-b)*(s-c);
        return s;
    }
}

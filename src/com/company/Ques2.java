package com.company;
import java.util.*;
public class Ques2
{
    public static void main(String[] args)
    {
        RectangleArea area=new RectangleArea();
        area.read_input();
        System.out.println("Width: "+area.width+","+"Height: "+area.height);
        area.display();
    }
}
class Rectangle
{
    int width;
    int height;
    public Rectangle()
    {
        width=0;
        height=0;
    }
    public void display()
    {
        System.out.println("Width: "+width+","+"Height: "+height);
    }
}
class RectangleArea extends Rectangle
{
    Scanner sc;
    public RectangleArea()
    {
        sc=new Scanner(System.in);
    }
    public void read_input()
    {
        width=sc.nextInt();
        height=sc.nextInt();
    }
    public void display()
    {
        System.out.println(width*height);
    }
}
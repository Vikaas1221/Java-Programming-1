package com.company;

public class Calculator
{
    public static void main(String[] args)
    {
        Calculate calculate=new Calculate();
        int sum=calculate.addition.add(12,23);
        int difference=calculate.diff.difference(12,34);
        int multiply=calculate.pro.product(12,34);
        int division=calculate.div.safeDivision(34,2);
        System.out.println("Sum is: "+sum+'\n'+"Difference is: "+difference+'\n'+"Multiply is: "+multiply+
                '\n'+"Division is: "+division);
    }
}

class Calculate
{

    add addition=(int a,int b)->{
        return a+b;
    };
    difference diff=(int a,int b)->{
        if (a>=b)
        {
            return a-b;
        }
        return b-a;
    };
    product pro=(int a ,int b)->{
        return a*b;
    };
    safedivision div=(int a,int b)->
    {
        if(b!=0)
        {
            return a/b;
        }
        return b/a;
    };


}

interface add
{
    public int add(int a, int b);
}

interface difference
{
    public int difference(int a, int b);
}

interface product
{
    public int product(int a, int b);
}

interface safedivision
{
    public int safeDivision(int a, int b);
}
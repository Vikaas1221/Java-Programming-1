package com.company;

public class Ques5
{
    public static void main(String[] args)
    {
        Complex c1=new Complex(5,6);
        Complex c2=new Complex(3,4);
        Complex complex=new Complex();
        complex.sum(c1,c2);
        complex.difference(c1,c2);
        complex.product(c1,c2);
    }
}

class Complex
{
    int real;
    int imazinay;
    public Complex()
    {

    }

    public Complex(int real, int imazinay)
    {
        this.real = real;
        this.imazinay = imazinay;
    }
    public void sum(Complex c1,Complex c2)
    {
        int real_part=c1.real+c2.real;
        int img_part=c1.imazinay+c2.imazinay;
        System.out.println(real_part+"+"+img_part+"i");
    }
    public void difference(Complex c1,Complex c2)
    {
        int real_part=c1.real-c2.real;
        int img_part=c1.imazinay-c2.imazinay;
        System.out.println(real_part+"+"+img_part+"i");
    }
    public void product(Complex c1,Complex c2)
    {
        int real_part=c1.real*c2.real;
        int img_part=c1.imazinay*c2.imazinay;
        System.out.println(real_part+"+"+img_part+"i");
    }


}

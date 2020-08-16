package com.company;

public class Ques6
{
    public static void main(String[] args)
    {
        Employees emp1=new Employees("Robert",1994,"64C-wallstreet");
        Employees emp2=new Employees("Sam",2000,"68D-wallstreet");
        Employees emp3=new Employees("John",1999,"26B-wallstreet");
        System.out.println("Name"+"     "+"Joining"+"     "+"Address");
        System.out.println(emp1.getName()+"     "+emp1.getYear()+"     "+emp1.getAddress());
        System.out.println(emp2.getName()+"     "+emp2.getYear()+"     "+emp3.getAddress());
        System.out.println(emp3.getName()+"     "+emp3.getYear()+"     "+emp3.getAddress());
    }
}

class Employees
{
    private String name;
    private int year;
    private int salary;
    private String address;

    public Employees(String name, int year, String address)
    {
        this.name = name;
        this.year = year;
//        this.salary = salary;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public int getSalary() {
        return salary;
    }

    public String getAddress() {
        return address;
    }
}
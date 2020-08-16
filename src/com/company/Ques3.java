package com.company;

import java.util.ArrayList;

public class Ques3
{
    public static void main(String[] args)
    {
        Employee employee1=new Employee(111,"Vikas","Devloper",60000,"Banglore");
        Employee employee2=new Employee(222,"Vishal","Tester",40000,"Mumbai");
        Employee employee3=new Employee(333,"Hemant","Cyber",30000,"Maharastra");
        Employee employee4=new Employee(444,"Abhishek","Sale",70000,"Delhi");
        Employee employee5=new Employee(555,"Akash","ML Devloper",80000,"Mohali");
        Employee employee6=new Employee(666,"Ankur","Technical",30000,"Banglore");
        ArrayList<Employee> emplList=new ArrayList<>();
        emplList.add(employee1);
        emplList.add(employee2);
        emplList.add(employee3);
        emplList.add(employee4);
        emplList.add(employee5);
        emplList.add(employee6);
        System.out.println("Names of Employess");
        for (int i=0;i<emplList.size();i++)
        {
            System.out.println(emplList.get(i).getEmpName());
        }
        System.out.println("Employeess having salary greater than 50,000");
        for (int i=0;i<emplList.size();i++)
        {
            if (emplList.get(i).getEmpSalary()>50000)
            {
                System.out.println(emplList.get(i).getEmpName());
            }
        }
        System.out.println("Location starting with M");
        for (int i=0;i<emplList.size();i++)
        {
            if (emplList.get(i).getEmpLocation().startsWith("M"))
            {
                System.out.println(emplList.get(i).getEmpLocation());
            }
        }
        System.out.println("Degination ends with E");
        for (int i=0;i<emplList.size();i++)
        {
            if (emplList.get(i).getEmpDegination().endsWith("e"))
            {
                System.out.println(emplList.get(i).getEmpDegination());
            }
        }
    }
}

class Employee
{
    private int empid;
    private String empName;
    private String empDegination;
    private int empSalary;
    private String empLocation;

    public Employee(int empid, String empName, String empDegination, int empSalary, String empLocation) {
        this.empid = empid;
        this.empName = empName;
        this.empDegination = empDegination;
        this.empSalary = empSalary;
        this.empLocation = empLocation;
    }

    public int getEmpid()
    {
        return empid;
    }

    public void setEmpid(int empid)
    {
        this.empid = empid;
    }

    public String getEmpName()
    {
        return empName;
    }

    public void setEmpName(String empName)
    {
        this.empName = empName;
    }

    public String getEmpDegination()
    {
        return empDegination;
    }

    public void setEmpDegination(String empDegination)
    {
        this.empDegination = empDegination;
    }

    public int getEmpSalary()
    {
        return empSalary;
    }

    public void setEmpSalary(int empSalary)
    {
        this.empSalary = empSalary;
    }

    public String getEmpLocation()
    {
        return empLocation;
    }

    public void setEmpLocation(String empLocation)
    {
        this.empLocation = empLocation;
    }
}

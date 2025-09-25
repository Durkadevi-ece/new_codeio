package week_3;

import java.util.SplittableRandom;

public class EmployeeSalary {
    public static void main(String[] args) {
        Employee E1 = new Employee();
        E1.setmethod("Goms",12345678,100000);

        System.out.println( "Name : " + E1.getName());
        System.out.println( "id : " + E1.getId());
        System.out.println( "Salary : " + E1.getSalary());



    }
}
class Employee{
     private String name;
     private int id;
     private int salary;
    void  setmethod(String name,int id,int salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
  String getName(){
        return name;
    }
    int getId(){
        return id;
    }
    int getSalary(){
        return salary;
    }

}
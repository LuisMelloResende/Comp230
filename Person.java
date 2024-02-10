/* Tells name age and salary of a employee
Author: Luis Eduardo Mello de Lara Resende
02/09/2024
 */

public class Person{

    public String name;
    public int age;
    public double sal;

    public Person(String name, int age, double sal){
        this.name = name;
        this.age = age;
        this.sal = sal;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public double getIncome(){
        return this.sal;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setAge(int a){
        this.age = a;
    }
    public void setIncome(double i){
        this.sal = i;
    }
    public boolean equals(Person p) {
        if (p.name.equals(this.name)
                & p.age == this.age
                & p.sal == this.sal) {
            return true;
        }
        else {
            return false;
        }
    }
}


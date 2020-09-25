package com.company;

import java.util.ArrayList;

class Shape {
    public String toString() {
        return super.toString();
    }
}
class Tester{
    public static void print_info(Shape ob){
        System.out.println(ob.toString());
    }
}
class Ball{

}
class Book{

}
class Dog{
    String name;
    int age;
    Dog(String name, int age){
        this.name = name;
        this.age = age;
    }
    Dog(){

    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int toHumanAge(){
        return age * 7;
    }
    public int toHumanAge(int dogAge){
        return dogAge * 7;
    }
   public String ToString(){
        return name;
    }
}
class PetRoom{
    ArrayList<Dog> dogs = new ArrayList<Dog>();
    public void appDog(Dog newDog){
            dogs.add(newDog);
    }
    void printDogs(){
        for(Dog dog : dogs){
            System.out.println(dog.ToString());
        }
    }
}

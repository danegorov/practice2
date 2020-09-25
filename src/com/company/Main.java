package com.company;

import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        System.out.println("____________Практическая работа номер 2____________");
        Shape shp = new Shape();
        Tester test = new Tester();
        test.print_info(shp);
        System.out.println("Введите имя и возраст собаки");
        Scanner scan = new Scanner(System.in);
        Dog first = new Dog(scan.nextLine(), scan.nextInt());
        int g = scan.nextInt();
        String p =scan.nextLine();
        Dog second = new Dog(p, g);
        PetRoom house = new PetRoom();
        house.appDog(first);
        house.appDog(second);
        house.printDogs();

    }
}

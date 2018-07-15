package com.company;

public class Main {

    public static void main(String[] args) {

        Elevator E1 = new Elevator(false,0);
        Elevator E2 = new Elevator(true, 10);
        Elevator E3 = new Elevator(false, 20);

        Building tower1 = new Building(E1,E2,E3);

        tower1.isAnyWorking();

        System.out.println(" ------------------ ");

        tower1.smartButton(6);

        System.out.println(tower1.toString());




    }
}

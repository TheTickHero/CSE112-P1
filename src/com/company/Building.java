package com.company;

public class Building {
    
    private Elevator E1;
    private Elevator E2;
    private Elevator E3;


    public Building(Elevator E1, Elevator E2, Elevator E3) {
        this.E1 = E1;
        this.E2 = E2;
        this.E3 = E3;
    }

    public void isAnyWorking(){
        if(!E1.isBroken()){
            System.out.println("Elevator#1 is working");
        }

        if(!E2.isBroken()){
            System.out.println("Elevator#2 is working");
        }

        if(!E3.isBroken()){
            System.out.println("Elevator#3 is working");
        }

    }

    public void smartButton(int floor){
        Elevator temp;
        if( (Math.abs( floor - E1.getCurrentFloor()) < Math.abs( floor - E2.getCurrentFloor()))) {
            temp = E1;
        }else if( !E2.isBroken()){
            temp = E2;
        }else{
            temp = E1;
        }

        if( (Math.abs( floor - temp.getCurrentFloor()) > Math.abs( floor - E3.getCurrentFloor()))){
            temp = E3;
        }

        temp.call(floor);

    }


    public String toString(){
        String str;
        str = "Elevator#1 is on the floor " + E1.getCurrentFloor() + "\n"  + "Elevator#2 is on the floor " + E2.getCurrentFloor()
                + "\n" +"Elevator#3 is on the floor " + E3.getCurrentFloor();

        return str;
    }
}

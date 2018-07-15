package com.company;

public class Elevator {

    private boolean isBroken;
    private int currentFloor;


    public Elevator() {
        this.isBroken = false;
        this.currentFloor = 0;
    }

    public Elevator(boolean isBroken, int currentFloor){
        this.isBroken = isBroken;
        if(isValidFloor(currentFloor)){
            this.currentFloor = currentFloor;
        }
    }

    private boolean isValidFloor(int floor){
        if(floor >= 0 && floor <= 20){
            this.currentFloor = floor;
            return true;
        }else{
            System.out.println("Invalid floor");
            return false;
        }

    }

    public void call(int floor){
        if(!isBroken){
            if(floor >=0 && floor <= 20) {
                this.currentFloor = floor;
            }

        }
    }

    public boolean isBroken() {
        return isBroken;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }
}

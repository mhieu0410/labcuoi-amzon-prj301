/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labcuoi.amzon;

/**
 *
 * @author admin
 */
public class Penguin extends Animal implements Walk,Swim{
    
    private boolean isSwimming;
    private double walkSpeed;
    private double swimSpeed;

    public Penguin() {
        super("Penguin");
    }

    public boolean isIsSwimming() {
        return isSwimming;
    }

    public void setIsSwimming(boolean isSwimming) {
        this.isSwimming = isSwimming;
    }

    public double getWalkSpeed() {
        return walkSpeed;
    }

    public void setWalkSpeed(double walkSpeed) {
        this.walkSpeed = walkSpeed;
    }

    public double getSwimSpeed() {
        return swimSpeed;
    }

    public void setSwimSpeed(double swimSpeed) {
        this.swimSpeed = swimSpeed;
    }
    
    
    @Override
    public void eatingFood() {
        System.out.println("I am eating delicious fish.");
    }
    
    @Override
    public void eatingCompleted() {
        System.out.println("I haven eating fish");
    }

    @Override
    public void walking() {
        System.out.println("Penguin: I am walking at the speed " + walkSpeed + "mph");
    }

    @Override
    public void swimming() {
        System.out.println("Penguin: I am swimming at the speed of " + swimSpeed + "nautical miles per hour.");
    }
    
    
}

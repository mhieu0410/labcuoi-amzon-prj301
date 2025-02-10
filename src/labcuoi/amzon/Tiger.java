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
public class Tiger extends Animal implements Eat,Walk{
    
    private int numberOfStripes;
    private double speed;
    private double soundLevelOfRoar;
    
    public Tiger(){
        super("Tiger");
    }

    public Tiger(int numberOfStripes, double speed, double soundLevelOfRoar, String nameOfAnimal) {
        super(nameOfAnimal);
        this.numberOfStripes = numberOfStripes;
        this.speed = speed;
        this.soundLevelOfRoar = soundLevelOfRoar;
    }

    public int getNumberOfStripes() {
        return numberOfStripes;
    }

    public void setNumberOfStripes(int numberOfStripes) {
        this.numberOfStripes = numberOfStripes;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getSoundLevelOfRoar() {
        return soundLevelOfRoar;
    }

    public void setSoundLevelOfRoar(double soundLevelOfRoar) {
        this.soundLevelOfRoar = soundLevelOfRoar;
    }
    
    public void roar(){
        System.out.println("The tiger roars at " + soundLevelOfRoar + "dB!");
    }
    
    public void run(){
        System.out.println("The tiger run at " + speed + "km/h");
    }
    @Override
    public void eatingCompleted() {
        System.out.println("I have eanten meat.");
    }

    @Override
    public void walking() {
        System.out.println("Tiger: I am walking at the speed " + speed + "mph");
    }
    
}
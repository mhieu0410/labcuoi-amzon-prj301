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
public class Dolphin extends Animal implements Eat,Swim{
    private String colorOfDolphin;
    private double swimmingSpeed;

    public Dolphin() {
        super("Dolphin");
    }

    public Dolphin(String colorOfDolphin, double swimmingSpeed, String nameOfAnimal) {
        super(nameOfAnimal);
        this.colorOfDolphin = colorOfDolphin;
        this.swimmingSpeed = swimmingSpeed;
    }

    public String getColorOfDolphin() {
        return colorOfDolphin;
    }

    public void setColorOfDolphin(String colorOfDolphin) {
        this.colorOfDolphin = colorOfDolphin;
    }

    public double getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(double swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    public void swims(){
        System.out.println("The dolphin swim at " + swimmingSpeed + "km/h");
    }
    
    public void makeSound(){
        System.out.println("The dolphin makes clicking sounds");
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
    public void swimming() {
        System.out.println("Dolphin: I am swimming at the speed of " + swimmingSpeed + "nautical miles per hour.");
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labcuoi.amzon;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class LabcuoiAmzon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // for getting input
        Scanner keyboard = new Scanner(System.in);

        // for loop continuation - 1 represents true
        int continueOuterLoop = 1  ;
        int continueInnerLoop = 1;

        // for menu choice

        /** TODO 1: extend the class Animal to create a new
         *          land based animal named "Tiger" which extends
         *          Animal.
         *          Extra properties of class "Tiger" are:
         *          1. number of stripes
         *          2. speed
         *          3. sound level of roar
         *
         **/

        /** TODO 2: extend the class Animal to create a new
         *          water based animal named "Dolphin" which
         *          extends Animal
         *          Extra properties of class "Dolphin" include:
         *          1. color of dolphin
         *          2. swimming speed
         *
         **/


        /** TODO 3: implemement the "Eat" interface in the
         *          "Tiger" class created in the TODO 1
         *          and also in the
         *          "Dolphin" class created in TODO 2.
         **/



        /** TODO 5: implement the "Walk" interface in
         *          "Tiger" class created in the TODO 1
         *          and in the  implementation of the
         *          "walking" method of the interface
         *          display -
         *          " I am walking at the speed "
         *          and join the value of the variable "speed"
         *
         **/

        /** TODO 6: create a new interface named "Swim"
         *          and declaring a method inside it
         *          named "swimming" with the return type
         *          "void"
         **/

        /** TODO 7: implement the "Swim" interface
         *          in the "Dolphin" class and the
         *          "swimming" method in its implementation
         *          should display the swimming speed as
         *          "Dolphin: I am swimming at the speed ...."
         *          where .... is the value of the variable
         *          "swimmingSpeed"
         **/


        /** TODO 8: create a menu system to work with the Animal selected
         *          use the switch provided below
         **/
        
        
        do {
            switch (animalChoiceMenu(keyboard)) {
                case 1:
                    Tiger tiger = new Tiger();
                    do {
                        System.out.println("The animal which is chosen is : Tiger");
                        int menuChoice = animalDetailsManipulationMenu(keyboard, tiger);
                        // get menu choice
                        switch (menuChoice) {
                            case 1:
                                System.out.println("Enter number of stripes: ");
                                tiger.setNumberOfStripes(keyboard.nextInt());
                                System.out.println("Enter speed (mph): ");
                                tiger.setSpeed(keyboard.nextDouble());
                                System.out.println("Enter roar level: ");
                                tiger.setSoundLevelOfRoar(keyboard.nextDouble());                                break;

                            case 2:
                                System.out.println("Tiger Info: ");
                                System.out.println("Number of stripes: " + tiger.getNumberOfStripes());
                                System.out.println("Speed: " + tiger.getSpeed());
                                System.out.println("Roar Level: " + tiger.getSoundLevelOfRoar());
                                break;
                            case 3:
                                tiger.walking();
                                break;
                            case 4:
                                tiger.eatingFood();
                                break;
                            default:
                                System.out.println("Not supported");

                        }
                        System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while(continueInnerLoop == 1);

                    break;
                case 2:
                    Dolphin dolphin = new Dolphin();
                    do {
                        System.out.println("The animal which is chosen is : Dolphin");
                        int menuChoice = animalDetailsManipulationMenu(keyboard, dolphin);
                        // get menu choice
                        switch (menuChoice) {
                            case 1:
                                System.out.println("Enter dolphin color: ");
                                dolphin.setColorOfDolphin(keyboard.next());
                                System.out.println("Enter swimming speed (km/h): ");
                                dolphin.setSwimmingSpeed(keyboard.nextDouble());                                break;

                            case 2:
                                System.out.println("Dolphin Info: ");
                                System.out.println("Color: " + dolphin.getColorOfDolphin());
                                System.out.println("Swimming Speed: " + dolphin.getSwimmingSpeed());
                                break;
                            case 3:
                                dolphin.swims();
                                break;
                            case 4:
                                dolphin.eatingCompleted();
                                dolphin.eatingFood();
                                break;
                            default:
                                System.out.println("Not supported");

                        }
                        System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while(continueInnerLoop == 1);
                    break;
                case 3:
                    Penguin penguin = new Penguin();
                    System.out.println("Is the dolphin swimming (true/false): ");
                    penguin.setIsSwimming(keyboard.nextBoolean());
                    System.out.println("Enter the walk speed of penguin: ");
                    penguin.setWalkSpeed(keyboard.nextDouble());
                    System.out.println("Enter the swim speed of penguin: ");
                    penguin.setSwimSpeed(keyboard.nextDouble());
                    do {
                        System.out.println("The animal which is chosen is : Penguin");
                        int menuChoice = animalDetailsManipulationMenu(keyboard, penguin);
                        // get menu choice
                        switch (menuChoice) {
                            case 1:
                                System.out.print("Age: ");
                                penguin.setAge(keyboard.nextInt());
                                System.out.print("Height: ");
                                penguin.setHeight(keyboard.nextInt());
                                System.out.print("Weight: ");
                                penguin.setWeight(keyboard.nextInt());
                                System.out.print("Enter swim speed (mph): ");
                                penguin.setSwimSpeed(keyboard.nextDouble());
                                System.out.print("Enter walk speed (km/h): ");
                                penguin.setWalkSpeed(keyboard.nextDouble());
                           break;

                            case 2:
                        System.out.println("Penguin Info:");
                        System.out.println("Walk Speed: " + penguin.getWalkSpeed());
                        System.out.println("Swim Speed: " + penguin.getSwimSpeed());    
                                break;
                            case 3:
                                if(penguin.isIsSwimming()){
                                    penguin.swimming();
                                }else{
                                    penguin.walking();
                                }
                                break;
                            case 4:
                                penguin.eatingCompleted();
                                penguin.eatingFood();
                                break;
                            default:
                                System.out.println("Not supported");

                        }
                        System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while(continueInnerLoop == 1);

                    break;    
                

                default:
                    System.out.println("Sorry no such animal available.");
            }

            System.out.println("Continue main Zoo menu? (Enter 1 for yes/ 2 for no):");
            continueOuterLoop = keyboard.nextInt();

        } while(continueOuterLoop == 1);
        /** TODO 9: create a class "Penguin" from the "Animal" class **/

        /** TODO 10: integrate the choice to pick a "penguin" in the menu system **/

    }

    private static int animalChoiceMenu(Scanner keyboard) {
        int choiceGivenByUser;

        System.out.println("******* ZOO ANIMAL choice menu ******");
        System.out.println("1. Tiger");
        System.out.println("2. Dolphin");
        System.out.println("3. Penguin");

        System.out.println("Enter choice of animal:");
        choiceGivenByUser = keyboard.nextInt();
        return choiceGivenByUser;
    }

    private static int animalDetailsManipulationMenu(Scanner keyboard, Animal animal) {
        int choiceGivenByUser;

        System.out.println("******* ANIMAL details menu for: " + animal.getNameOfAnimal() + " ******");
        System.out.println("1. Set properties");
        System.out.println("2. Display properties");
        System.out.println("3. Display movement");
        System.out.println("4. Display eating");

        System.out.println("Enter choice (1-4):");
        choiceGivenByUser = keyboard.nextInt();
        return choiceGivenByUser;

    }
}



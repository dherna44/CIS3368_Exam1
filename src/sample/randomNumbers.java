package sample;

import java.util.UUID;

//Parameters for the randomNumbers class:
public class randomNumbers {
    public String minNumber;
    public String maxNumber;
    public String RandomNumber;
    public UUID id;


    /*public randomNumbers(int minNumber, int maxNumber) {
        this.minNumber = minNumber;
        this.maxNumber = maxNumber;
    }*/

//Constructor for the randomNumbers class:
    public randomNumbers(String minNumber, String maxNumber) {
        this.minNumber = minNumber;
        this.maxNumber = maxNumber;
    }

    /*@Override
    public String toString(){
        return RandomNumber;
    }*/
}
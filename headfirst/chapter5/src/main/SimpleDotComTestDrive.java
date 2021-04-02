package main;
public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom(); //instantiate a SimpleDotCom object
        int[] locations = {2, 3, 4}; //make an int array for the location of the dot com (3 consecutive ints out of a possible 7)
        dot.setLocationCells(locations); //invoke the setter method of the dot com
        String userGuess = "0"; // make a fake user guess
        String result = dot.checkYourself(userGuess); //invoke the checkYourself( method on the dot com object, and pass it the fake guess.
        }
    }


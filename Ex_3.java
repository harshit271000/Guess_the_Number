package Practice;

import java.util.Random;

import java.util.Scanner;

class Game{
    public int number;
    public int inputNumber;
    public int noOfGuesses = 0;

    public int getNoOfGuesses(){           // Getter
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses){     // Setter
        this.noOfGuesses = noOfGuesses;
    }

    Game(){                                      // Constructor
        Random rand = new Random();
        this.number = rand.nextInt(100);    // storing a random integer value from 0 to 100
    }

    void takeUserInput(){
        System.out.println("Guess the Number = ");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }

    boolean isCorrectNumber(){
        noOfGuesses ++ ;                         // incrementing noOfGuesses by 1 every time we guess
        if(inputNumber == number){
            System.out.println("You Guessed it Right it was " + number + " in " + noOfGuesses + " no. of guesses");
            return true;
        }
        else if (inputNumber < number) {
            System.out.println("Too low");
        }
        else if (inputNumber > number) {
            System.out.println("Too High");
        }
        return false;
    }
}

public class Ex_3 {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b = false;
        while(!b){
            g.takeUserInput();
            b = g.isCorrectNumber();
        }
    }
}

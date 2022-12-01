

package com.mycompany.guessinggame;
import java.util.*;
/**
 *
 * @author jervi
 */
public class GuessingGame {

    public static void main(String[] args) {
        guessGame();
    }
    public static void guessGame(){
        Scanner input = new Scanner(System.in);
        int result = 1 + (int)(100 * Math.random());
        int k = 5;
        int i, guess;
 
        System.out.println("A number is generated between 1 to 100");
        //System.out.println("Guess that number");
       // System.out.println("You have 5 tries");
 
        
        for(i = 0; i < k; i++){
           System.out.println("Guess the number");
            
            guess = input.nextInt();
        if (guess == result && i != k - 1){
            System.out.println("Congrats! Your answer is correct");
            break;
        }else if(result > guess && i != k - 1){
            System.out.println("The number is greater than: " + guess);
        }else if(result < guess){
            System.out.println("The number is less than: " + guess);
        }}
        if (i == k){
            System.out.println("You used up all tries");
            System.out.println("The number is: " + result);
        }
    }}


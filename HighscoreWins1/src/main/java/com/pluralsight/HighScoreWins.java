package com.pluralsight;
import java.util.Scanner;
import java.util.regex.Pattern;

public class HighScoreWins {

   static Scanner scanner =new Scanner(System.in);


   public static void main(String[] args){

       String userScore = PromptForString ("Please enter your game score");

    int indexOfBar = userScore.indexOf("|");

    String afterBar = userScore.substring(indexOfBar +1);

    String[] scores = afterBar.split(Pattern.quote(";"));

     int leftScore = Integer.parseInt(scores[0]);
     int rightScore = Integer.parseInt(scores[1]);

     boolean isLeftWinner =(leftScore > rightScore);

     if(isLeftWinner){
         System.out.println("Left wins!");
     }
     else{
         boolean isRightWinner = (rightScore > leftScore);

     }


        System.out.println(userScore);
        System.out.println(indexOfBar);
        System.out.println(afterBar);

    }



    public static String PromptForString(String prompt){
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }


}
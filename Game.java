/*
  Write a program that lets the user play the game of Rock, Paper,
  Scissors against the computer. The program should work as follows. 

1- When the program begins, a random number in the range of 1 through 3 is generated. 
   If the number is 1, then the computer has chosen rock. If the number is 2, then the computer has chosen paper.
   If the number is 3, then the computer has chosen scissors. (Donâ€™t display the computerâ€™s choice yet.) 


2- The user enters his or her choice of â€œrockâ€‌, â€œpaperâ€‌, or â€œscissorsâ€‌ at the keyboard. (You can use a menu if you prefer.) 

3- The computerâ€™s choice is displayed.

4- A winner is selected according to the following rules: 

  a- If one player chooses rock and the other player chooses scissors, then rock wins. (The rock smashes the scissors.) 
  b- If one player chooses scissors and the other player chooses paper, then scissors wins. (Scissors cuts paper.) 
  c- If one player chooses paper and the other player chooses rock, then paper wins. (Paper wraps rock.) 
  d- If both players make the same choice, the game must be played again to determine the winner
  
5- At the end of each game, you should ask the user whether or not he wants to play again. If the user chooses to play again, the game should be restarted automatically.
6- Be sure to divide the program into methods that perform each major task.
*/

/********************************************* START HERE  *************************************************/

import java.util.Random; 
import java.util.Scanner;

public  class Game {
    
      // var // 
     public static  int Rock = 1; 
     public static  int Paper = 2; 
     public static  int Scissors = 33; 
     public static  int user = 0; 
     public static  int Computer = 0;
     public static  int rep = 0;
     public static  int pt = 0;
     
     // main stat here .
     public static void main( String[] args)
     { 
      
         //play or read rules 
      System.out.print(" Do you want to play or read the rules ? \n " +
              " (1) play  (2) read rules \n choose a number : ");
      Scanner keyboard = new Scanner(System.in);
      pt= keyboard.nextInt();   
      if (pt==1){
                  System.out.print(" Let's play !");
      }
      else {
       System.out.println("\n Scissors cuts paper.\n Paper covers rock.\n Rock crushes Scissors. ");
       System.out.print(" Let's play !");
      }
        // Cup
        Computer=cup( Computer);
        // user
        user=player(user);
        // Comparison
        Comparison(user,Computer);
        // End 
        System.out.println(" Thank You for playing ");
  
     }

           // Computer selection
      public static int cup(int  cp) {
        Random myRand = new Random();
         cp = myRand.nextInt(3)+1;
        return cp;} 
      
      
            // user selection
       public static int player(int player) {
         Scanner myScan = new Scanner(System.in);
         System.out.print(" (1).Rock  (2).Paper  (3).Scissors \n choose a number : " );
         player = myScan.nextInt(); 
         return player;}  
         

            // Comparison
         public static int Comparison(int user , int Computer  ) {   
             System.out.println(" .......................................\n"
                     +" choice Computer = " + Computer + " || " +" choice user = " + user+
                     "\n .......................................\n");      
            // draw
          if ( user==Computer )
            {
              System.out.println("** The Game is a draw ** ");
              System.out.print("\n  Do you want to play Again? " + "\n (1) YES  \n (2) No \n Please choose a number :");
              Scanner keyboard = new Scanner(System.in);
              rep = keyboard.nextInt();
              if(rep==1){
              replay();}
               else{
                  return 0;
              }
                  }
          
               //user win 
              else if ( (user==Rock && Computer==Scissors) || (user==Scissors && Computer==Paper) || (user==Paper && Computer== Rock) ){
               System.out.println("** User Win! **");
               System.out.print("\n  Do you want to play Again? " + "\n (1) YES  \n (2) No \n Please choose a number :");
               Scanner keyboard = new Scanner(System.in);
               rep = keyboard.nextInt();
                if (rep==1) {
                   replay() ;}
                  else {
                    return 0;  
                  }}
              
                  //Computer win  
                 else{
                 System.out.println("** Computer WIn!** ");
                 System.out.print("\n  Do you want to play Again? " + "\n (1) YES  \n (2) No \n Please choose a number :");
                 Scanner keyboard = new Scanner(System.in);
                 rep = keyboard.nextInt();
                  if(rep==1){
                     replay();}
                    else{
                     return 0;} 
                        } 
                          return 0;} 
         
                     //replay 
                   public static int replay() {
                     Computer=cup( Computer);
                     user=player(user);
                     Comparison(user,Computer);
                     return 0;}
             }

package rock_paper_scissors;


import java.util.Random; 
import java.util.Scanner;

public  class Rock_paper_scissors {
    
      // var // 
     public static  int Rock = 1; 
     public static  int Paper = 2; 
     public static  int Scissors = 3; 
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

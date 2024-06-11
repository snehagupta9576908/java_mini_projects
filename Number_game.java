
import util.java.Scanner;
/**
 * Number_game
 */
public class Number_game{
     static int total_attempts=0; 
     static int random_num=88;
   static int total_wins=0;
   static  int attempts=5;
   public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   intputdata(sc);
   System.out.println("Your score card is:"+total_attempts+"  "+total_wins);
sc.close();
  }
  public static int inputdata(Scanner sc){
    int input=sc nextInt();
    //if input is even num then you can play unlimited times
    //if input is odd num then you can play limitd times
    if(input%2==0){
      System.out.println("hey you can play unlimited rounds");
      even(sc);

    }
    else{
      System.out.println("hey you can play limited rounds");
      odd(sc);
    }

  }
public static int even(Scanner sc){
  while(true){
    System.out.println("Enter your guess:");
  int guess_num=sc nextInt();
   total_attempts++;
  if(guess_num > random_num){
     System.out.println("Your guess is too high");
     
  }
  else if(guess_num < random_num){
    System.out.println("Your guess is too low");
    
  }
  else(guess_num==random_num){
    System.out.println("CONRATULATIONS!YOU WIN");
     total_wins++;
     break;
  }
  }
}
public static int odd(Scanner sc){
  for(int i=0;i<attempts;i++){
    System.out.println("Enter your guess:");
  int guess_num=sc.nextInt();
  int total_attempt++;
  if(guess_num > random_num){
    System.out.println("Your guess is too high");
    
 }
 else if(guess_num < random_num){
   System.out.println("Your guess is too low");
   
 }
 else(guess_num==random_num){
   System.out.println("CONRATULATIONS!YOU WIN");
     total_wins++;
     return;
 }
}
System.out.println("You failed,attempts are over");
}
}

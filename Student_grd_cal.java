/**
 * Student_grd_cal
 */
import java.util.Scanner;


public class Student_grd_cal {

    public static void main(String[] args) {
        int totalmarks=0;
        Scanner sc=new Scanner(System.in);
System.out.println("Enter the total number of subjects");
        int totalsubj=sc.nextInt();
        for(int i=1;i<=totalsubj;i++){
            System.out.println("Enter the number of each subj");
            int marks=sc.nextInt();
            if (marks<=100){
            totalmarks=totalmarks+marks;
           }   else{
            System.out.println("The number is entered is out of range:error");
        }
    }
    sc.close();
        System.out.println("Total marks of all subj"+totalmarks);
    double avg= ((double)totalmarks )/ totalsubj;
        if(avg<=50 && avg>=30 ){
            System.out.println("TRY TO PRACTICE HARD,YOU ARE // Grade:BELOW AVERAGE//");
        System.out.println("Here is your RESULT"+totalmarks+"  " +avg);
        }
        else if(avg<=70 && avg>=51){
        System.out.println("TRY TO PRACTICE HARD,YOU ARE //Grade: AVERAGE//");
        System.out.println("Here is your RESULT"+totalmarks+"  " +avg);
    }
        else if(avg<=85 && avg>=70){
        System.out.println("TRY TO PRACTICE HARD,YOU ARE // Grade:MORE THAN AVERAGE//");
        System.out.println("Here is your RESULT"+totalmarks+"  " +avg);
    
    }
            
        else if(avg <= 98 && avg >= 85){
        System.out.println("HEYY!CONGRATULATIONS // Grade:YOU SCORED HIGHEST//");
        System.out.println("Here is your RESULT"+totalmarks+"  " +avg);

        }

    }
    }
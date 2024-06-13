import java.util.*;
import java.util.Scanner;
public class guessnumber{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        Random rand = new Random();
        int rand_number=rand.nextInt(10);
        int guess=0;
        while(guess!=rand_number){
            System.out.println("enter a number:");
            guess=sc.nextInt();
            if(guess == rand_number){
                System.out.println("you win");
            }
            else{
                System.out.println("Try again ");
            }

        }

        }
    }


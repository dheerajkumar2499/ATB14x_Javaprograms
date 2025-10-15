package ex_13_Functions;
import java.util.Scanner;
public class Lab_Practice {
    public static void main(String[] args) {
        Scanner dk= new Scanner(System.in);
        System.out.println("Enter a number");
        int number= dk.nextInt();

        System.out.println("enter other number");
        int number_2= dk.nextInt();
        if (number==number_2)
        {
            System.out.println("you are a gay");
        }
        if  (number!=number_2)
        {
            System.out.println("You are a man");
        }

    }
}

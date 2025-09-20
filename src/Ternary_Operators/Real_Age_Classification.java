package Ternary_Operators;

public class Real_Age_Classification {
    public static void main(String[] args) {
        int age = 100;
        String diff = (age<=18)? "minor" : (age>=65)? "Senior citizen": "Adult";
        System.out.println("Your classified age is = " +diff );
    }
}

package ex_14_Strings;

public class Lab140_Interview_P1 {
    public static void main(String[] args) {
        String s1="Hello";
        String s2="Hello";
// because new will always create a new string other wise if no modification it is stored as one

        String s4= new String("Hello");
        System.out.println(s1+s2+s4);
    }
}

package ex_13_Functions;

public class Lab130_Simple_Method {
    public static void main(String[] args) {

        boolean b = return_boolean();
        System.out.println(b);
    }
    static void no_return_type()
    {
        System.out.println("do not return any value");
    }
    static String return_value()
        {
            System.out.println("who is dheeraj :");
            return "Dheeraj is a great SDET";
        }
        static boolean return_boolean()
        {
            return true;
        }
}

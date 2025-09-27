package If_Condition;

public class Lab_79_If {
    public static void main(String[] args) {
        String user_input =  args[0];
        System.out.println(args[0]);
        int age= Integer.parseInt(user_input);
        System.out.println(age);
        if(age>18)
        {
            System.out.println("you can vote");
        }
        else {
            System.out.println("you cannot vote");
        }
    }
}

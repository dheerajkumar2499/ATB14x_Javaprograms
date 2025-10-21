package ex_05_TypeCasting;

public class Lab061_TypCasting_Used {
    public static void main(String[] args) {
        int fee=100;
        float GST= 18.3f;
        int total= fee+(int)GST;
        System.out.println(total);
    }
}

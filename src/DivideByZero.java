
public class DivideByZero {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int a = 10;
        double b = 10.3;
        float c = 10.2f;

        System.out.println("not give exception :" +b/0);
        System.out.println("not give exception :" +c/0);
        System.out.println("give exception :"+a/0);

    }

}

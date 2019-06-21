package exceptions;

public class RunTimeExceptionsDemo {

    public static void main(String[] args) {
     /*   int a = 10;
        int b = 0;
        int c;

        //c = b / a;
        *try {
            c = a / b;
            System.out.println("The result is: " + c);
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println("Division by Zero is not possible");
        }*/

        int[] numbers = {1, 2, 3};
        try {
            for (int i = 0; i <= numbers.length -1; i++) {
                System.out.println(numbers[i]);
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Is your array length correct?");
        }
    }
}

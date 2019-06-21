package introduction;

public class ReverseString2 {

    public static void main(String[] args) {
        String forward = "Can I do this";
        String backwards = reverse(forward);
        System.out.println(backwards);
    }

    private static String reverse(String forward) {
        String reverse = "";
        if (forward.isEmpty() || forward == null)  {
            System.out.println("Empty or null values are not accepted");
        }

        if (forward.length() <=1) {
            reverse = forward;
        } else {
            String myArray[] = forward.split("\\s+");
            for (String item : myArray) {
                reverse = item + " " + reverse;
            }
        }

        return reverse;
    }
}

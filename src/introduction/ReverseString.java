package introduction;

public class ReverseString {

    public static void main(String[] args) {
        String forward = "This is a test string";
        String backward = reverse(forward);
        System.out.println(backward);
    }

    private static  String reverse(String forward) {
        String reverse = "";

        if (forward.isEmpty() || forward == null) {
            System.out.println("Empty and null strings are not accepted");
        }

        if  (forward.length() <= 1) {
            reverse = forward;
        } else {
            String[] originalArray = forward.split("\\s+");
            for (String item : originalArray) { //this, is, a, test, string
                reverse = item + " " + reverse; // this: is this: a is this: test a is this: string test a is this
            }
        }
        return reverse.trim();
    }
}

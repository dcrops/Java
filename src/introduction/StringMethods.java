package introduction;

public class StringMethods {
    public static void main(String[] args) {
        String str = "This is the Test String";

        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = "Welcome";
        String str4 = "";
        String str5 = "    Spaces all around         ";
        String str6 =  "Hello";


        System.out.println("Length of the string is " + str.length());
        System.out.println("Character at index 2 is " + str.charAt(2));
        System.out.println(str.concat("This is the appended string"));
        System.out.println("Does is exist in teh string? " + str.contains("is"));
        System.out.println("Does si exist in the string? " + str.contains("si"));
        System.out.println(str.startsWith("This"));
        System.out.println(str.startsWith("cake"));
        System.out.println(str.endsWith("String"));
        System.out.println(str.endsWith("cake"));
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str.indexOf('h'));
        System.out.println(str.indexOf('q'));
        System.out.println(str.isEmpty());
        System.out.println(str4.isEmpty());
        System.out.println(str5.trim());

        System.out.println(str6.replace('e', 'a'));
        System.out.println("Substring example 1 - " + str.substring(5));
        System.out.println("Substring example 2 - " + str.substring(5, 10));

        char[]  charArray = str.toCharArray();
        for (int i = 0; i<charArray.length; i++) {
            System.out.println("Index of " + i + " is " + charArray[i]);
        }
        System.out.println("Lower Case - " + str.toLowerCase());
        System.out.println("Upper Case - " + str.toUpperCase());



    }
}

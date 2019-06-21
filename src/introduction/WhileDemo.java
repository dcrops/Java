package introduction;

public class WhileDemo {

    public static void main(String[] args) {
        int i = 10;

     /*   while(i < 20) {

            i++;
            if (i == 17) {
                //break;

                continue;
            }
            System.out.println("The value of i is " + i);
        }*/
        System.out.println("Outside Loop");

        do {
            System.out.println(i);
            i++;
        }    while (i < 10) ;


        }
    }


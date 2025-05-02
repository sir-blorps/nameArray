import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> al = new ArrayList<>();
        boolean doNotExit = true;

        //*while doNotExit is true, always loop program*//

        while (doNotExit) {
            System.out.println("Input a username, please!");

            userNameEnter user = new userNameEnter();
            user.setUsername();

            System.out.println("Username is:" + user.getUsername());

            System.out.println("Add " + user.getUsername() + " to array?");
            System.out.print("'Y' for yes, 'N' for no.");
            String arrayEnter = input.next();

            if (arrayEnter.equalsIgnoreCase("Y")) {
                al.add(user.getUsername());
            } else if (arrayEnter.equalsIgnoreCase("N")) {
                System.out.println("Exit? Y/N");
                String exitEarly = input.next();
                if (exitEarly.equalsIgnoreCase("Y")) {
                    break;
                } else if (exitEarly.equalsIgnoreCase("N")){
                    continue;
                }

            } else {
                System.out.println("Error, please enter either 'Y' or 'N'.");
            }

            System.out.println("Do you have more usernames to add? (Y/N)");
            arrayEnter = input.next();

            if (arrayEnter.equalsIgnoreCase("Y")) //*changing to IgnoreCase*// {
                System.out.println("How many more?");
            int count = input.nextInt();

            for (int i = 0; i < count; i++) {
                if (arrayEnter.equalsIgnoreCase("Y")) {
                    user.setUsername();
                    al.add(user.getUsername());
                } else if (arrayEnter.equalsIgnoreCase("N")) {
                    System.out.println("Okay, showing array.");
                } else {
                    System.out.println("Error, please enter either 'Y' or 'N'.");
                    arrayEnter = input.next();
                }
            }

            Collections.sort(al);

            System.out.println(al);

            System.out.println("Want to exit or retry? E for Exit, R for Retry.");
            String enterExit = input.next();

                if (enterExit.equalsIgnoreCase("E")){
                    doNotExit = false;
                } else if (enterExit.equalsIgnoreCase("R")){
                    al.clear();
                    System.out.println("Restarting program.");
                } else {
                    System.out.println("Error. Defaulting to exit.");
                    doNotExit = false;
                }
            }
             input.close();
        }

    }


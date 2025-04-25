import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> al = new ArrayList<>();

        System.out.println("Input a username, please!");

        User user = new User();
        user.setUsername();

        System.out.println("Username is:" + user.getUsername());

        System.out.println("Add " + user.getUsername() + " to array?");
        System.out.print("'Y' for yes, 'N' for no.");
        String arrayEnter = input.next();

        if (arrayEnter.contains("Y")||arrayEnter.contains("y")){
          al.add(user.getUsername());
        } else if (arrayEnter.contains("N")||arrayEnter.contains("n")){
        } else {
            System.out.println("Error, please enter either 'Y' or 'N'.");
                    arrayEnter = input.next();
        }

        System.out.println("Do you have more usernames to add? (Y/N)");
        arrayEnter = input.next();

        if (arrayEnter.contains("Y")||arrayEnter.contains("y")){
            System.out.println("How many more?");
            int count = input.nextInt();

            for (int i = 0; i < count; i++){
                if (arrayEnter.contains("Y")||arrayEnter.contains("y")){
                    user.setUsername();
                    al.add(user.getUsername());
                } else if (arrayEnter.contains("N")||arrayEnter.contains("n")){
                    System.out.println("Okay, showing array.");
                } else {
                    System.out.println("Error, please enter either 'Y' or 'N'.");
                    arrayEnter = input.next();
                }
            }

        } else {
            System.out.println("Exiting.");
        }



        Collections.sort(al);

        System.out.println(al);

    }

    public static class User {
       private String userName;

       public void setUsername(){
           Scanner userObj = new Scanner(System.in);
           while (true){
               System.out.print("Enter username: ");
               String input = userObj.nextLine();

               if (input.length() > 0){
                   this.userName = input;
                   break;
               } else {
                   System.out.println("Error: Username cannot be empty. Please input again.");
               }
           }

       }

       public String getUsername(){
           return this.userName;
       }
    }


}
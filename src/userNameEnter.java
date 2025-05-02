import java.util.Scanner;

public class userNameEnter {
    private String userName;

    public void setUsername(){
        Scanner userObj = new Scanner(System.in);
        while (true){
            System.out.print("Enter username: ");
            String input = userObj.nextLine();

            if (!input.isEmpty()){
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

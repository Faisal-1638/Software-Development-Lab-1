import java.util.Scanner;

public class user_input {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String username = obj.nextLine();

        System.out.println("Welcome " + username);

        obj.close();
    }
    
    
}

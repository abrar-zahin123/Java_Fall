package logininterface;

import java.util.Scanner;

public class logininterface
{
public void logininterface()
{
Scanner input = new Scanner(System.in);

 String username;
String password;
System.out.println("Enter Username: ");
username = input.nextLine();
System.out.println("Enter Password: ");
password = input.nextLine();

 if(username.equals("username") && (password.equals("password")))
{
System.out.println("**********Welcome Admin**********");

}
}
}
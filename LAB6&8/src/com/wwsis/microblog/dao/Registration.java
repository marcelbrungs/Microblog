package com.wwsis.microblog.dao;
import java.util.Scanner;

public class Registration implements UserDao {
	static Register register = new Register();

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print(" Enter firstName => ");
            String firstName = scanner.nextLine();
            register.setFirstName(firstName);

            System.out.print(" Enter lastName => ");
            String lastName = scanner.nextLine();
            register.setLastName(lastName);

            System.out.print(" Enter userName => ");
            String userName = scanner.nextLine();
            register.setUserName(userName);

            System.out.print(" Enter password => ");
            String password = scanner.nextLine();
            register.setPassword(password);

            System.out.print(" Enter emailId => ");
            String emailId = scanner.nextLine();
            register.setEmailId(emailId);


            System.out.println(register.toString());
        }
    }
}

class Register {
    private String Name;
    private String lastName;
    private String userName;
    private String password;
    private String emailId;
    public String getFirstName() {
        return Name;
    }
    public void setFirstName(String Name) {
        this.Name = Name;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmailId() {
        return emailId;
    }
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
   
    @Override
    public String toString() {
        return "Register [Name=" + Name + ", lastName=" + lastName + ", userName=" + userName + ", password=" +
            password + ", emailId=" + emailId + " ]";
    }
}
	
}
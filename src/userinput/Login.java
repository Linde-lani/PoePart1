package userinput;

import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Login {
    public static boolean checkUserName(String username) {
     return username != null && username.length() <= 5 && username.contains("_") ;
      }

    public static boolean checkPasswordComplexity(String password) {
        if (password == null || password.length() < 8) {
            JOptionPane.showMessageDialog(null, "The password is too short");
            return false;
        }
        boolean hasCapital = Pattern.compile("[A-Z]").matcher(password).find();
        boolean hasNumber = Pattern.compile("[0-9]").matcher(password).find();
        boolean hasSpecialChar = Pattern.compile("[_!@#$%^&*()]").matcher(password).find();
      
        if(!hasCapital){
        
            JOptionPane.showMessageDialog(null, "Capital letter is not present");
            return false;
        }
        if(!hasNumber){
        
            JOptionPane.showMessageDialog(null, "Number is not present");
            return false;
        }
        if(!hasSpecialChar){
        
            JOptionPane.showMessageDialog(null, "Special character is not present");
            return false;
        }
    
        return true;  
    }
    

    public static String registerUser(String username, String password, String firstName, String lastName) {
        if (!checkUserName(username)) {
            return "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.";
        }

        if (!checkPasswordComplexity(password)) {
            return "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.";
        }
      

        return "Account successfully registered!";
    }

    public static boolean loginUser(String username, String Uname) {
       if(Uname.equals(username)){
           JOptionPane.showMessageDialog(null, Uname);
       }
       

        return true;
    }

    public static String returnLoginStatus(String username, String password) {
        if (loginUser(username, password )) {
            return "Welcome " + getFirstName() + " " + getLastName() + ", it is great to see you again.";
        } else {
            return "Username or password incorrect, please try again.";
        }
    }

    private static String getFirstName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static String getLastName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

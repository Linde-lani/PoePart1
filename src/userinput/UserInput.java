package userinput;
import javax.swing.JOptionPane;



public class UserInput {


    private static boolean checkUserName(String username) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static boolean checkPasswordComplexity(String password) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static boolean checkUsername(String username) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  

    public UserInput(String username, String password, String firstName, String lastName) {
    }

   public String username;
   public String password;
   public String firstName;
   public String lastName; 
    
        
    public static void main(String[] args) {
        Login login = new Login();
        
        String firstName = JOptionPane.showInputDialog("Enter first name:");
        String lastName = JOptionPane.showInputDialog("Enter last name:");
        String username ;
        String password ;

       

       do{
        username = JOptionPane.showInputDialog(null, "Enter a valid username");
       }while (!checkUserName(username));{
            JOptionPane.showMessageDialog(null, "Username successfully captured");
        }
       do{
        password = JOptionPane.showInputDialog(null, "Enter a password that has:\n- 8 characters\n- A capital letter\n- A number\n- A special character");
       }while (!checkPasswordComplexity(password));{
        JOptionPane.showMessageDialog(null, "Password succefully captured");
        }
       
        JOptionPane.showMessageDialog(null, "Account successfully created");
        
        String Uname = JOptionPane.showInputDialog("Enter username for login");
        String Pword = JOptionPane.showInputDialog("Enter password for login");
            
        if(Uname.equals(username)&& Pword.equals(password)){
            JOptionPane.showMessageDialog(null, " Welcome " + firstName+", "+ lastName + " it is great to see you again. ");
        }else{
            JOptionPane.showMessageDialog(null, "Username or password incorrect, please try again");  
        do{
           JOptionPane.showInputDialog(null, "Enter correct username");
        }while(!checkUsername(username));{
          JOptionPane.showMessageDialog(null, "Username correct");
        }
        
        }
    }

   

   
public class User {
    private final String username;
    private final String password;
    private final String firstName;
    private final String lastName;

    public User(String username, String password, String firstName, String lastName) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getters
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    

}




}





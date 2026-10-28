abstract class UserAccount {
     public abstract void showRole(); }
class StudentAccount extends UserAccount {
     @Override
      public void showRole() { 
        System.out.println("I am a Student");
     }
     }
class TeacherAccount extends UserAccount {
    
 @Override public void showRole() {
     System.out.println("I am a Teacher");
     } 
    }
class AccountFactory { 
    public static UserAccount createAccount(String type) { 
    if (type.equalsIgnoreCase("student")) {
     return new StudentAccount();

 } else if (type.equalsIgnoreCase("teacher")) {
     return new TeacherAccount();

 }
    throw new IllegalArgumentException("Unknown account type");
 }
  }
public class Main
 { public static void main(String[] args) {
     UserAccount account = 
    AccountFactory.createAccount("student");
    account.showRole();
 }
  }

package projectCodeAlpha;

import java.util.Scanner;

public class BankingApplication {
    public static void main(String[] args) {
 Scanner kb=new Scanner(System.in);       
    
    String acno;
    int password;
    long dep;
    long with;
    long reqbal;
    String choice;
        System.out.println("SBI bank welcomes you");
        System.out.println("you have account in SBI bank(yes/no)");
        choice=kb.next();
        if(choice.equalsIgnoreCase("yes"))
        {
            
        
        
        System.out.println("enter  Numericalaccount no");
        acno=kb.next();
            System.out.println("please enter password");
             password=kb.nextInt();
      
        System.out.println("please deposit money");
        int deposite=kb.nextInt();
        reqbal=deposite;
        
        System.out.println("now Select the operation youn want to perform");
        System.out.println("1.Withdrawl" );
      System.out.println("2.deposite"); 
      System.out.println("3.checkbalance");
      String opn=kb.next();
       if(opn.equalsIgnoreCase("deposite"))
      {
          System.out.println("enter the money you wants to deposite");
          dep=kb.nextLong();
          reqbal=deposite+dep;
          System.out.println("money Deposited Succsesfully");
          System.out.println("your total bal is now"+reqbal);
          
          
      }
       else if(opn.equalsIgnoreCase("Withdrawl"))
      {
          
          System.out.println("if u waqnt to withdrawl please enter your pass word");
          int b=kb.nextInt();
          if(b==password){
          System.out.println("enter the money you wants to withdrawl");
          with=kb.nextLong();
          if(with>reqbal)
          {
              System.out.println("not enough money");
              System.exit(0);
              
          }
          reqbal=reqbal-with;
          System.out.println("money withdrawl succesfully");
              System.out.println("your clear balance now "+reqbal);
          }
      }
       else if(opn.equalsIgnoreCase("checkbalance"))
       {
           System.out.println("your balance is "+reqbal);
       }
           
}
        else
        {
            System.out.println("account number not exist");
            System.out.println("please open the account in our SBI bank");
            System.out.println("Thank you for visting us ~regard SBI");
            System.exit(0);
        }
      
         System.out.println("Thank you for visting us ~regard SBI");
}
}
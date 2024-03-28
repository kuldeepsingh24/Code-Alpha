
package projectCodeAlpha;

import java.util.Scanner;

public class UseHotel {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
      
        System.out.println("welcome to hotel yashoda palace");
        System.out.println("Are you looking for rooms");
        String choice=kb.next();
          if(choice.equalsIgnoreCase("no"))
        {
             System.out.println("thankyou for visisting hotl yashoda palace");
            System.out.println(" please visit again");
            System.exit(0);
        }
          
        System.out.println("which type of room you Prefer to Stay");
        System.out.println("AcRoom"+"1200RS");
        System.out.println("NonAcRoom"+"1000Rs");
         String category=kb.next();
         System.out.println("do you want to book a room");
         String bookStatus=kb.next();
         if(bookStatus.equalsIgnoreCase("yes"))
         {
             System.out.println("please enter details ");
             System.out.println("please eneter name ");
             String name=kb.next();
            
             System.out.println("please enter age");
             int age=kb.nextInt();
             System.out.println("Please enter email id ");
             String  email=kb.next();
             System.out.println("please enter your  valid valid id number ");
             String id=kb.next();
             System.out.println("enter your mobile number");
             long mob=kb.nextLong();
             UserDetail User=new UserDetail();
         User.setName(name);
          User.setAge(age);
           User.setEmail(email);
            User.setId(id); 
            User.setMob(mob);
             
             System.out.println("your details are");
             System.out.println("name:"+User.getName()+"\n Age :"+User.getAge()+"\n email id :"+User.getEmail()+"\n Valid Id:"+User.getId()+" \n Phone Number:"+User.getMob());
             if(category.equalsIgnoreCase("acroom"))
             {
                 System.out.println("for How Many days you Want to stay");
                  int days=kb.nextInt();
                
                 int payment=1200;
                 
                 System.out.println("now as the guest after staying in hotel Yashodha place , if he/she want to leave  C"); 
                 System.out.println("Sir/Madam kindly please pay   the bill");
                 Payment req=new Payment(days,payment);
                 System.out.println("Sir/Mamdam your bill is of "+req.calculatebill()+"/-Rs");
             }
             else if(category.equalsIgnoreCase("nonacroom"))
             {
                 System.out.println("for How Many days you Want to stay");
                  int days=kb.nextInt();
                
                 int payment=1000;
                 
                 System.out.println("now as the guest after staying in hotel Yashodha place , if he/she want to leave  C"); 
                 System.out.println("Sir/Madam kindly please pay   the bill");
                 Payment req=new Payment(days,payment);
                 System.out.println("Sir/Mamdam your bill is of "+req.calculatebill()+"/-Rs");
             }
         }
    }
}
                 
                 
                 
                 
            
            
         
             
         
       
             
         
         
         
         
         
         
       
         
         
         
    


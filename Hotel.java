
package projectCodeAlpha;

import java.util.Scanner;

public class Hotel {
 
  
    String choice,category,bookStatus;

    public Hotel(String choice, String category, String bookStatus) {
        this.choice = choice;
        this.category = category;
        this.bookStatus = bookStatus;
      
        
    }
    
    
}
class UserDetail
{
String name,email,id;
int age;
long mob;

    public String getName() {
        
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public long getMob() {
        return mob;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMob(long mob) {
        this.mob = mob;
    }
    
    
    



}
class Payment
{
   int  days ,payment;

    public Payment(int days, int payment) {
        this.days = days;
        this.payment = payment;
    }
   public Integer calculatebill()
   {
      int  bill=days*payment;
       return bill;
   }

   
   
}
    
    
    


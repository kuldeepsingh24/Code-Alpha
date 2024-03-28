/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectCodeAlpha;

import java.util.Scanner;

/**
 *
 * @author singh
 */
public class StudentGradeTracker {
    public static void main(String[] args) {
        
    

        Scanner kb=new Scanner(System.in);
          int x=0;      
          int lowest=0;
          int y=0;
        int arr[][];
        int sum=0;
        System.out.println("enter the no student in class");
        int r=kb.nextInt();
        System.out.println("how many subjects are there for Students");
        int c=kb.nextInt();
        arr=new int[r][c];
        int brr[]=new int[r];
        int crr[]=new int[r];
  int topmarks=0;
         
         for(int i=0;i<arr.length;i++){
             sum=0;
             System.out.println("enter marks of student "+(i+1));
             for(int j=0;j<arr[i].length;j++){
                 arr[i][j]=kb.nextInt();
                 sum=sum+arr[i][j];
             }
             System.out.println("the total marks skored by student "+(i+1)+"is "+sum);
             brr[i]=sum;
             crr[i]=sum;
 
             if(topmarks<sum){
                 topmarks=sum;
                 x=i+1;  
             }
             
             if(lowest<sum){
                 lowest=sum;
                 y=i+1;
             }
             else{
                 lowest=sum;
                 y=i+1;
             }
             }
         System.out.println("highest mars=ks Scored"+topmarks);
         System.out.println("top marks scored by student "+x);
             System.out.println("lowest marks scored is "+lowest);
             System.out.println("student who scores lowest marks is"+y);
}
         
     
}


    


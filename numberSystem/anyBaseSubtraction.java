import java.util.*;
  
  public class anyBaseSubtraction{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getDifference(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getDifference(int base, int n1, int n2){
       // write your code here
       int rv = 0;
       int borrow =0;
       int pow = 1;
       while(n2>0)
       {
           int d1 = n1%10;
           int d2 = n2%10;
           int diff = d2-d1-borrow;
           if(diff<0)
           {
               diff=diff+base;
               borrow = 1;
               
           }
           else
           {
               borrow = 0;
           }
           rv = rv+(diff*pow);
           pow = pow*10;
           n1 = n1/10;
           n2 = n2/10;
           
           
       }
       return rv;
       
       
   }
  
  }
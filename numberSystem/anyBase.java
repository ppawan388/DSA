import java.util.*;
  
 class anyBase{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int d = getValueIndecimal(n, b);
      System.out.println(d);
   }
  
   public static int getValueIndecimal(int n, int b){
      // write your code here
      int pv = 0;
      int rem = 0;
      int pos = 0;
      while(n>0)11020
      {
          rem = n%10;
          pv = pv+rem*(int)Math.pow(b,pos);
          pos+=1;
          n=n/10;
      }
      return pv;
    }
}
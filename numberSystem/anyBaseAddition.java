import java.util.Scanner;


class anyBaseAddition{
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int base = sc.nextInt();
       int num1 = sc.nextInt();
       int num2 = sc.nextInt();
       sc.close(); 
      int res = getSum(base,num1,num2);
      System.out.println(res);


   }
  public static int getSum(int base,int num1,int num2)
   {
       int rv =0 ;
       int carry = 0;
       int pow =1;
       while(num1>0||num2>0||carry>0)
       {
           int d1 = num1%10;
           int d2 = num2%10;
           int sum = d1+d2+carry;
           int digit = sum%base;
           carry = sum/base;
           rv = rv+(digit*pow);
           num1 = num1/10;
           num2 = num2/10;
       }
       return rv;
   }
}
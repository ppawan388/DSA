import java.util.*;

public class Factorial {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(factorial(num));

        
    }

    public static int factorial(int n){
        if(n==1||n==0)
        {
            return 1;
            
        }
        int factm1 = factorial(n-1);
        int fact = n * factm1;
        return fact;
    }

}
import java.util.*;

public class PZZ {

    public static void main(String[] args) throws Exception {
        // write your code hereem
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        pzz(num);
    }

    public static void pzz(int n){
        if(n==1)
        {
            System.out.print("1 1 1 ");
            return;
        }
        System.out.print(n+" ");
        pzz(n-1);
        System.out.print(n+" ");
        pzz(n-1);
        System.out.print(n+" ");
        
    }

}
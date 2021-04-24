import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int len = sc.nextInt();
    int arr[] = new int[len];
    
    for(int idx=0;idx<len;idx++)
    {
      arr[idx] = sc.nextInt();
    } 
    
      int find = sc.nextInt();
    int res = findElement(arr,find);
    System.out.println(res);
    
 }
 public static int findElement(int[] arr,int find)
 {
     for(int idx=0;idx<arr.length;idx++)
     {
        if(arr[idx]==find)
        {
            return idx;
        }
     }
     return -1;
 }

}
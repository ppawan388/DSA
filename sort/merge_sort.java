class mergeSort{
public static void main(String[] args)
{
 int[] arr1=
  }
  public static int[] mergesort(int[] arr,int lo ,int hi)
{
 int mid =lo+hi/2;
  int[] hfs= new int[lo,mid);
  int[] 
public static int[] mergeTwoSorted(int[] arr1,int[] arr2)
{ 
  int len1=arr1.length;
  int len2=arr2.length;
  int[] mrgarr=new int[len1+len2]
  int i=len1-1;
  int j=len2-1;
  int k=0;
 while(i<len1&&j<len2)
{
  if(arr[i]<arr[j])
   {
     mrgarr[k]=arr1[i];
     i++;
    k++;
   }
   else{
    mrgarr[k]=arr2[j];
    j++;
    k++;
  }
}
while(i<len1)
{
 mrgarr[k]= arr1[i];
 i++
 k++;}
while(j<len2)
{
 mrgarr[k]=arr2[j];
 j++;
 k++;
}
return mrgarr;
}
  
}

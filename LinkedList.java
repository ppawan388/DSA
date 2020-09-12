 public class Linked_List{
      public static class Node{
          int data;
          Node next;
      }
      public static class Linked_List{
          Node head;
          Node tail;
          int size=0;
          public void addFirst(int val)
          {
              Node temp = new Node();
              temp.data=val;
              if(size==0)
              {
                  temp.next=null;
                  head=tail=temp;
              }
              else
              {
              temp.next=head;
              head=temp;
              }
          }

         public void addLast(int val)
          {
               Node temp = new Node();
               temp.data=val;
               temp.next=null;
              if(size==0)
              {
                 head=tail=temp;
              }
              else 
              {
                tail.next = temp;
                tail=temp;
                
              }
              size++;
         }
         public void addAt(int idx,int val)
         {
             if(idx<0||idx>size)
             {
                 System.out.println("invalid arguments");

             }
             else if(idx==0)
             {
                 addFirst(val);
             }
             else if(idx==size)
             Node node =new Node();
             nde.data=val;
             temp=head;
             for(int i=0;i<idx-1;i++)
             {
                 temp=temp.next;
             }
             node.next=temp.next;
             temp.next=node;
             size++;
        
         }
         public void display()
         {
             if(size==0)
             {
                 System.out.println("there is no linkedlist");
             }
             else{
                 Node temp=head;
                 //head.next=temp;
             for(int i=0;i<size;i++)
             {
                 if
               System.out.println(temp.data);
               temp=temp.next;

             }
            }
        }
         public void RemoveFirst()
         {
             if(size==0)
             {
                 System.out.println("List is empty");
             }
             else if(size==1)
             {
               head=null;
               tail=null;             
             }
             else
             {
               head=head.next;
               size--;
             }

         }
       /*  public void RemoveLast()
         {
             if(size==0)
             {
                 System.out.println("List is empty");
             }
             else if(size==1)
             {
                 temp=head=null;
             }
             else
             {
                 tail.next=tail;
             }
         }*/
         public int GetFirst()
         {
             if(size==0)
             {
                 System.out.println("list is empty");
                 return  -1;
             }
             else
             {
               return head.data;
             }
         }
         public int GetLast()
         {
             if(size==0)
             {
                 System.out.println("list is empty");
                 return  -1;
             }
             else
             {
               return tail.data;
             }
         }
         public int GetAt(int idx)
         {
          Node temp=head;
          if(size==0)
          {
              System.out.println("list is empty");
              return -1;
          }
          else if(idx<0||idx>=size)
          {
              System.out.println("invalid index");
              return -1;
          }
          else
          {
              for(int i=0;i<idx;i++)
              {
                  temp=temp.next;
              }
              return temp.data;
          }
         }
        } 
 }





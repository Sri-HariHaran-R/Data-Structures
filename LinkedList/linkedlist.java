package interviewpreparation;

import java.util.*;

class Node
{
    int data;
    Node next;
}

class backend
{
    Node head;
    
    public void insertAtEnd(int data)
    {
        Node node=new Node();
        node.data=data;
        node.next=null;
        
        //checking head points to null- only for first time alone
        if(head==null)
        {
            head=node;
        }
        else
        {
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=node;
        }
    }
    
    public void insertAtStart(int data)
    {
        Node node=new Node();
        node.data=data;
        node.next=null;
        
        if(head==null)
        {
            head=node;
        }
        else
        {
            node.next=head;
            head=node;
        }
        
        
    }
    
    public void insertAtindex(int data,int pos)
    {
        Node node=new Node();
        node.data=data;
        node.next=null;
        
        Node temp=head;
        int index=pos-1;
        if(index==0)
            insertAtStart(data);
        
        for(int i=0;i<index;i++)
        {
            temp=temp.next;
        }
        node.next=temp.next;
        temp.next=node;
    }
    
    public void deleteAtEnd()
    {
        Node temp=head;
        
        //goes to the address available in the temp node...so temp.next.next points to further node
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
        System.out.println(temp.next.data+" is deleted.");
        temp.next=null;
    }
    
    public void deleteAtStart()
    {
        
        if(head==null)
            return;
        else
        {
            Node temp=head;
            head=temp.next;
            System.out.println(temp.data+" is deleted.");
            temp.next=null;
        }
    }
    
    public void deleteAtindex(int index)
    {
        Node temp=head;
        
        for(int i=0;i<index-1;i++)
        {
            temp=temp.next;
        }
        System.out.println(temp.next.data+" is deleted.");
        temp.next=temp.next.next;
    }
    
    public void show()
    {
        Node temp=head;
        while(temp.next!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        //since while loop exits when it meet null
        System.out.print(temp.data+"\n");
    }
}
public class linkedlist 
{
    public static void main(String args[])
    {
        backend obj=new backend();
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("1.insertAtEnd 2.insertAtStart 3.insertAtPos 4.deleteAtEnd 5.deleteAtStart 6.deleteAtPos 7.show 8.exit");
            int choice=sc.nextInt();
            
            if (choice == 1)
            {
                System.out.println("Enter the value to inserted : ");
                int value=sc.nextInt();
                obj.insertAtEnd(value);
            }
            
            else if (choice == 2)
            {
                System.out.println("Enter the value to inserted : ");
                int value=sc.nextInt();
                obj.insertAtStart(value);
            }
            
            else if (choice == 3)
            {
                System.out.println("Enter the value to inserted : ");
                int value=sc.nextInt();
                System.out.println("Enter the index to be inserted : ");
                int pos=sc.nextInt();
                obj.insertAtindex(value,pos);
            }
            
            else if (choice == 4)
            {
                System.out.println("Deleted last node");
                obj.deleteAtEnd();
            }
            
            else if (choice == 5)
            {
                System.out.println("Deleted first node");
                obj.deleteAtStart();
            }
            
            else if (choice == 6)
            {
                System.out.println("Enter the index to be deleted : ");
                int index=sc.nextInt();
                obj.deleteAtindex(index);
            }
            
            else if (choice == 7)
            {
                obj.show();
            }
            
            else 
            {
                break;
                
            }
                
        }
    }
}

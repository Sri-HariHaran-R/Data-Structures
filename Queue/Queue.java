package interviewpreparation;

//Circular Queue

import java.util.Scanner;

class operations
{
    int[] arr=new int[5];
    int front=0,rear=0,size=0;
    
    void enqueue(int data)
    {
        if(isFull())
        {
            System.out.println("Queue is Full");
        }
        else
        {
            arr[rear]=data;
            rear=(rear+1)%5;
            size=size+1;
        }
    }
    
    int dequeue()
    {
        int value=0;
        
        if(isEmpty())
        {
            System.out.println("Queue is Empty");
        }
        else
        {
            value=arr[front];
            front=(front+1)%5;
            size=size-1;
        }
        return value;
    }
    
    void show()
    {
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[(front+i)%5]+" ");
        }
        System.out.println(" ");
    }
    
    boolean isFull()
    {
        return size==5;
    }
    
    boolean isEmpty()
    {
        return size==0;
    }
    
}


public class Queue 
{
    public static void main(String args[])
    {
        operations obj=new operations();
        
        Scanner sc=new Scanner(System.in);
        
        while(true)
        {
            System.out.println("1.enqueue 2.dequeue 3.show 4.exit");
            
            int value=sc.nextInt();
            
            if(value==1)
            {
                System.out.print("Enter Data to insert:"+" ");
                int data=sc.nextInt();
                System.out.println(" ");
                obj.enqueue(data);
            }
            
            else if (value==2)
            {
                System.out.println("Element removed:"+obj.dequeue());
            }
            
            else if (value==3)
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

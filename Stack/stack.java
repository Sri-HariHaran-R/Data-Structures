package interviewpreparation;

import java.util.*;

class Operations
{
    int top=0;
    int[] arr=new int[5];
    public void push(int data)
    {
        if(isFull())
        {
            System.out.println("Stack is Full");
        }
        else
        {
            arr[top]=data;
            top=top+1;
        }
        
    }
    public void pop()
    {
        int data=0;
        if(isEmpty())
        {
            System.out.println("Stack is Empty");
        }
        else
        {
            top=top-1;
            data=arr[top];
            arr[top]=0;
            System.out.println("The popped data is :"+data);
        }
    }
    public void peek()
    {
        int data=0;
        if(isEmpty())
        {
            System.out.println("Stack is Empty");
        }
        else
        {
            top-=1;
            data=arr[top];
            System.out.println("The peaked value : "+data);
        }
    }   
    public void show()
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
    }
    public boolean isEmpty()
    {
        return top<=0; 
    }
    public boolean isFull()
    {
        return top>=arr.length;
    }
        
}
/**
 *
 * @author Babuhari
 */
public class stack 
{
    public static void main(String args[])
    {
        Operations obj=new Operations();
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("1.push 2.pop 3.peek 4.show 5.exit");
            int value=sc.nextInt();
            
            if(value==1)
            {
                System.out.println("Enter the data to push:");
                int data=sc.nextInt();
                obj.push(data);
            }
            else if (value==2)
            {
                obj.pop();                
            }
            else if (value==3)
            {
                obj.peek();
            }
            else if (value==4)
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

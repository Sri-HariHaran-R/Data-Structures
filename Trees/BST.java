
package preparation;
import java.util.*;

class Node 
{
    int data;
    Node left;
    Node right;
}

class backend
{
    Node root;
    public void insert(int data)
    {
        root=insert_recursive(root,data);
    }
    Node insert_recursive(Node root,int data)
    {
        Node node=new Node();
        node.data=data;
        node.left=null;
        node.right=null;
                
        if(root==null)
        {
            root=node;
            return root;
        }
        
        if(data<root.data)
        {
            root.left=insert_recursive(root.left,data);
        }
        else
        {
            root.right=insert_recursive(root.right,data);
        }
        return root;
    }
    
    //bst displaying is traversal
    
    public void inorder()
    {
        inorder_recursive(root);
    }
    
    public void inorder_recursive(Node root)
    {
        if(root!=null)
        {
            inorder_recursive(root.left);
            System.out.print(root.data+"->");
            inorder_recursive(root.right);
        }
    }
    
    public void preorder()
    {
        preorder_recursive(root);
    }
    
    public void preorder_recursive(Node root)
    {
        if(root==null)
            return;
        System.out.print(root.data+",");
        preorder_recursive(root.left);
        preorder_recursive(root.right);
    }
    
    public void postorder()
    {
        postorder_recursive(root);
    }
    public void postorder_recursive(Node root)
    {
        if(root==null)
            return;
        postorder_recursive(root.left);
        postorder_recursive(root.right);
        System.out.print(root.data+",");
    }
    //searching is not done fully
    
    public void search(int key)
    {
        search_recursive(root,key);
    }
    public void search_recursive(Node root,int key)
    {
        if (root==null)
            return;
        
        if(root.data==key)
            System.out.println("Element Found");
        if(key<root.data)
        {
             search_recursive(root.left,key);
        }
        else if(key>root.data)
        {
            search_recursive(root.right,key);  
        }
        else
            System.out.println("Element Not Found");
        
    }
}

public class BST 
{
    public static void main(String args[])
    {
        backend obj=new backend();
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("\n1.Enter the data 2.inorder 3.preorder 4.postorder 5.search 6.exit");
            int value=sc.nextInt();
            if(value==1)
            {
                int data=sc.nextInt();
                obj.insert(data);
            }
            else if(value==2)
            {
                obj.inorder();
            }
            else if(value==3)
            {
                obj.preorder();
            }
            else if(value==4)
            {
                obj.postorder();
            }
            else if(value==5)
            {
                System.out.println("Enter the element to be searched : ");
                int key=sc.nextInt();
                obj.search(key);
            }
            else
            {
                break;
            }
        }    
    }
}

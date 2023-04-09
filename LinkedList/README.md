
# 💻**Linked List**

## **What is Linked List ?**

- linear datastructure 
- elements are arranged in sequential way
- types of linkedlist:-
    - singly linkedlist
    - doubly Linkedlist
    - circular linkedlist

# **Singly LinkedList**
![singly-linkedlist](https://user-images.githubusercontent.com/76623387/224223723-e77f03a6-5391-4cc3-9050-8938f229a0fe.png)

# **Doubly LinkedList**

- A node consist of three fields.
    - prev
    - data
    - next
- Therefore we can go in either direction 
    - forward
    - backward
- prev field in first node will points to null and next field in last node will points to null.

# **Circular LinkedList**
- A linkedlist where last element points to first element.
- This forms circular loop.
- Circular linkedlist can be either singly linked or doubly linked.

## **Opeartions in Linked List**
- insert at end
- insert at begin
- insert at index
- delete at end
- delete at begin
- delete at index
- show
- search a data
- reverse linked list
- sort elements
- check loop 

## **Basic Concepts**

- A Node consists of two fields:-
    - data -> consists value
    - next -> consists address

- Here field "next" consists address of next Node.Then only link is made.

- The last node always contains null in the "next" field.

- head node always points to first node.

- create a temporary node whenever you perform an operation. 

## **Difference between Arrays and LinkedList ?**

- The manipulations can be done easily in linkedlist whereas in arrays it is difficult.
- Linkedlist is slower compared to array. This is because we have to traverse the address of each node to reach the certain node. This is slightly time consuming process.

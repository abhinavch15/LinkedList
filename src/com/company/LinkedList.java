package com.company;

import java.util.Scanner;
import java.util.Stack;

class LinkedList
{
    Node head;

    public void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public void delete(int new_data)
    {
        Node node = head;
        if (head.data==new_data){
            head =node.next;
        }
        else {
            Node next_node = head.next;
            System.out.println(head.data + "");
            while (node != null) {
                if (next_node.data == new_data) {
                    node.next = next_node.next;
                }
                node = node.next;
                next_node = next_node.next;
            }
        }
    }

    public void printList()
    {
        Node tnode = head;
        if (tnode==null){
            System.out.println("Empty List");
        }
        while (tnode != null)
        {
            System.out.print(tnode.data+"\n");
            tnode = tnode.next;
        }
        System.out.println("\n");
    }
    public void revprintList()
    {
        Stack stack = new Stack();
        Node temp = head;
        if (temp==null){
            System.out.println("Empty List");
        }
        while (temp != null)
        {
            stack.push(temp.data);
            temp = temp.next;
        }

        while (!stack.empty()) {
            Integer a = (Integer) stack.pop();
            System.out.println(a+"");
        }
    }

    public static void main(String[] args)
    {

        LinkedList llist = new LinkedList();
        while (true){
            System.out.println("1.Insert node in the beginning \n2.delete node \n3.Traverse in forward direction \n4.Traverse in reverse direction\n" );
            int option;
            Scanner scanner =new Scanner(System.in);
            option=scanner.nextInt();
            switch (option){
                case 1:
                    System.out.println("Enter node value: ");
                    llist.push(scanner.nextInt());
                    break;
                case 2:
                    System.out.println("Enter value of node to be deleted");
                    llist.delete(scanner.nextInt());
                    break;
                case 3:
                    llist.printList();
                    break;
                case 4:
                    llist.revprintList();
                    break;

            }
        }
    }
}
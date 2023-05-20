package com.example.datastructureapp;

public class Queue
{
    //Variables
    private Node head;
    private Node tail;
    public String temp[];

    public boolean isEmpty()
    {
        return head == null;
    }

    public void add (int data)
    {
        Node node = new Node(data);

        if (tail != null)
        {
            tail.next = node;
        }

        tail = node;

        if (head == null)
        {
            head = node;
        }
    }//End add method

    public int remove ()
    {
        int data = head.data;
        head = head.next;

        if (head == null)
        {
            tail = null;
        }
        return data;
    }//End remove method

    //Output method
    public void showList()
    {
        Node position = head;
        while (position != null)
        {
            System.out.println(position.getData());
            position = position.getNext();
        }
    }

    //The other class, yes
    private class Node
    {
        //Variables
        private int data;
        private Node next;

        //Constructor
        private Node (int data)
        {
            this.data = data;
        }

        //Setters and Getters
        public int getData()
        {
            return data;
        }

        public Node getNext()
        {
            return next;
        }

        //toString
        @Override
        public String toString()
        {
            return "Data: " + data + " Next: " + next;
        }

    }//End Node class
}//End class Queue

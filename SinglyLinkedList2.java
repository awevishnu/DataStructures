package com.ds.example;

public class SinglyLinkedList2 {

    private ListNode head;
    private static class ListNode
    {
        private int data;
        private ListNode next;
        public ListNode(int data)
        {
            this.data=data;
            this.next=null;
        }
        @Override
        public String toString() {
            return "data=" + data + ", next=" + next ;
        }
    }
    // traverse the linkedlist
    public void display()
    {
        ListNode current=head;
        while(current!=null)
        {
            System.out.print(current.data +"-->");
            //System.out.println("cd:: "+current.data+" cn:: "+current.next);
            current=current.next;
        }
        System.out.println("null");
    }
    public int length()
    {
        if(head==null)
        {
            return 0;
        }
        int count=0;
        ListNode current=head;
        while(current!=null)
        {
            count++;
            current=current.next;
        }
        return count;

    }
    //inserting element at the begining of the linkedlist
    public void insertFirst(int value)
    {
        ListNode newNode=new ListNode(value);
        newNode.next=head;
        head=newNode;
    }
    //inserting elements into last
    public void insertLast(int value)
    {
        ListNode newNode=new ListNode(value);
        if(head==null)
        {
            head=newNode;
            return;
        }
        ListNode current=head;
        while(null!=current.next)
        {
            current=current.next;
        }
        current.next=newNode;

    }

    public static void main(String[] args) {
        SinglyLinkedList2 sll=new SinglyLinkedList2();
        sll.insertFirst(11);
        sll.insertFirst(8);
        sll.insertFirst(2);
        sll.display();
        SinglyLinkedList2 sll2=new SinglyLinkedList2();
        sll2.insertLast(2);
        sll2.insertLast(3);
        sll2.insertLast(4);
        sll2.display();

    }
}
/*
Time complexity of insertFirst method is O(1)

Space complexity of insertFirst method is O(1)

Time complexity of insertLast method is O(n)

Space complexity of insertLast method is O(1)
 */

import java.util.Scanner;

public class QueueArray {
    private int qarr[];
    private int rear;
    private int front;

    QueueArray() {
        qarr = new int[20];
        front = -1;
        rear = -1;
    }

    public QueueArray(int maxSize) {
        qarr = new int[maxSize];
        front = -1;
        rear = -1;
    }

    boolean isEmpty() {
        return (front == -1 || rear == -1);
    }

    boolean isFull()
    {
        return (rear==qarr.length-1);
    }
    int size()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty");
            return 0;
        }
        return (rear-front+1);
    }
    void insert(int x)
    {
        if(isFull())
        {
            System.out.println("Queue is full or overflow");
        }
        if(front==-1) {
            front = front + 1;
        }
            rear=rear+1;
            qarr[rear]=x;


    }
    int delete()
    {
        int k;
        if(isEmpty())
        {
            System.out.println("Queue is Empty or underflow");
        }
        k=qarr[front];
        front=front+1;
        return k;
    }
   int peek()
   {
       if(isEmpty())
       {
           System.out.println("Queue is Empty...");
       }
       return qarr[front];
   }
   void display()
   {
       if(isEmpty())
       {
           System.out.println("Queue is Empty...");
       }
       System.out.println("Queue elements are...");
       for (int i=front;i<=rear;i++)
       {
           System.out.println(qarr[i]);
       }
   }
    public static void main(String[] args) {
        int choice,x,n;
        Scanner sc = new Scanner(System.in);
       System.out.println("enter size of the queue:");
        n = sc.nextInt();
        QueueArray obj = new QueueArray(n);
        while(true)
        {
            System.out.println("1.INSERT\n2.DELETE\n3.PEEK(DISPLAY ELEMENT AT FRONT)\n4.DISPLAY ALL ELEMENTS\n5.DISPLAY SIZE OF QUEUE\n6.QUIT");
            System.out.println("enter your choice:");
            choice = sc.nextInt();
            if(choice==6)
                break;
            switch(choice)
            {
                case 1: System.out.println("enter an element to be inserted into queue:");
                    x = sc.nextInt();
                    obj.insert(x);
                    break;
                case 2: x = obj.delete();
                    System.out.println("deleted element is:"+x);
                    break;
                case 3: System.out.println("element at front of the queue:"+obj.peek());
                    break;
                case 4: System.out.println("Queue elements are:");
                    obj.display();
                    break;
                case 5: System.out.println("size of the queue:"+obj.size());
                    break;
                default: System.out.println("invalid choice.. please reenter");
            }
        }
    }
}

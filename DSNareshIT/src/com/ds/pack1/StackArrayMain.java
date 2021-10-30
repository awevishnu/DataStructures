import java.util.Scanner;

class StackArray {
    private int sarray[];
    private int top;

    public StackArray() {
        sarray=new int[5];
        top=-1;
    }
    StackArray(int maxSize)
    {
        sarray=new int[maxSize];
        top=-1;
    }
    int size()
    {
        return  top+1;
    }
    boolean isEmpty()
    {
        return (top==-1);
    }
    boolean isFull()
    {
        return (top==sarray.length-1);
    }
    void push(int x)
    {
        if (isFull()){
            System.out.println("Stack is Full");
            return;
        }
        top=top+1;
        sarray[top]=x;
    }
    int pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack is Empty or Underflow");
            return 0;
        }
        int x=sarray[top];
        top=top-1;
        return  x;
    }
    int peek()
    {
        if(isEmpty())
        {
            System.out.println("Stack is Empty or Underflow");
        }
        return sarray[top];
    }
    public void display()
    {
        int i;
        if(isEmpty())
        {
            System.out.println("Stack is empty or underflow");
            return;
        }
        System.out.println("Stack Elements Are:");
        for(i=top;i>0;i--)
            System.out.println(sarray[i]);
    }

}
public class StackArrayMain {
    public static void main(String[] args) {
        int choice,x,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of the stack:");
        n = sc.nextInt();
        StackArray obj = new StackArray(n);
        while(true)
        {
            System.out.println("1.PUSH\n2.POP\n3.PEEK(DISPLAY TOP ELEMENT)\n4.DISPLAY ALL ELEMENTS\n5.DISPLAY SIZE OF STACK\n6.QUIT");
            System.out.println("enter your choice:");
            choice = sc.nextInt();
            if(choice==6)
                break;
            switch(choice)
            {
                case 1: System.out.println("enter an element to be inserted into stack:");
                    x = sc.nextInt();
                    obj.push(x);
                    break;
                case 2: x = obj.pop();
                    System.out.println("Popped element is:"+x);
                    break;
                case 3: System.out.println("element at the top of the stack:"+obj.peek());
                    break;
                case 4: System.out.println("stack elements are:");
                    obj.display();
                    break;
                case 5: System.out.println("size of the stack:"+obj.size());
                    break;
                default: System.out.println("invalid choice.. please reenter");
            }
        }
    }
}
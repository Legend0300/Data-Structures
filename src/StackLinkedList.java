public class StackLinkedList {
    Node top;

    void push(int data)
    {
        Node node = new Node(data);
        if(top == null)
        {
            top = node;
        }
        node.next = top;
        top = node;
    }


    boolean isEmpty()
    {
        if(top == null)
        {
            return true;
        }
        else{
            return false;
        }
    }

    Node pop()
    {
        if(!isEmpty())
        {            
            Node temp;
            temp = top;
            top = top.next;
            return temp;
        }
        else{
            System.out.println("stack is empty");
            return null;
        }
    }


    void peek()
    {
        if (isEmpty()) {
        System.out.println("stack is empty");
    }
    else{
        System.out.println(top.data);
    }
    }
}

class Node{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
    }

    @Override
    public String toString() {
        return Integer.toString(data);
    }
}

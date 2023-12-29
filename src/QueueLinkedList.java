public class QueueLinkedList {
    Node front,rear = null;
    int size = 0;
    boolean isEmpty()
    {
        if(front == null)
            return true;
        else
            return false;
    }   

    int dequeue()
    {
        int data = 0;
        if(isEmpty())
        {
            return data;
        }
        else{
            data = front.data;
            front = front.next;
            size--;
        }
        return data;
    }

    void enqueue(int data)
    {
        Node node = new Node(data);
        if(front == null)
        {
            front = node;
            rear = node;
        }
        else{
            Node temp = front;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
            rear = node;
        }
        size++;
    }
    
    void peek()
    {
        if(!isEmpty())
        {

            System.out.println(front.data);
        }
        else{
            System.out.println("queue is empty");
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
}
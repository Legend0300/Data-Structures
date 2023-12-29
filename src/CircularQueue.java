import java.util.ArrayList;
import java.util.List;

public class CircularQueue {
    int[] list;
    CircularQueue(int size)
    {
        int[] list = new int[size];
    }
    int front, back, size;
    void enqueue(int data)
    {
        back = (back + 1) % size;
        list[back] = data;
        size++;
    } 

    boolean isEmpty()
    {
        if(size ==0)
        {
            return true;
        }
        return false;
    }
    
    boolean isFull()
    {
        if((back + 1) % size == front)
        {
            return true;
        }
        else{
            return false;
        }
    }

    int dequeue()
    {
        if(isEmpty())
        {
            return 0;
        }
        else{

            int data = list[front];
            front = (front + 1) %  size;
            size--;
            return data;
        }
    }

    void printqueue()
    {
        int index = front;
        for(int i = 0 ; i < size ; i++)
        {
            System.out.println(list[index]);
            index = (index % 1) % size;
        }
    }
}

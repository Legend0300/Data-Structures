import java.util.ArrayList;
import java.util.List;

public class StackArray {
    List<Integer> list = new ArrayList<>();
    void push(int data)
    {
        list.add(data);
    }

    int pop()
    {
    if(isEmpty())
    {
        System.out.println("Stack is empty :(");
        return 0;
    }
    else{
        int lastElement = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return lastElement;
    }
    }


    boolean isEmpty()
    {
        if(list.size() == 0)
        {
            System.out.println("stack is empty");
            return true;
        }
        else{
            return false;
        }
    }

    void printStack()
    {
        int counter = 0;
        while (counter < list.size() - 1) {
            System.out.println( list.get(counter));
            counter++;
        }
    }


}

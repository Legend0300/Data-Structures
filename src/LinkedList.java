public class LinkedList<T> {
    Node<T> head;

    void insert(T data) {
        Node<T> node = new Node<>(data);
        Node<T> current = head;
        if (head == null) {
            head = node;
        } else {
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
        printList();
        System.out.println("\n");
    }

    void insert(int index, T data) {
        Node<T> node = new Node<>(data);
        Node<T> current = head;
        int counter = 0;
        if (index == 0 && current != null) {
            current.next = node;
            head = current;
        } else {
            while (current.next != null && counter < index) {
                if (counter == index - 1) {
                    Node<T> temp = current.next;
                    current.next = node;
                    node.next = temp;
                    System.out.println("value inserted!");
                } else if (current.next == null) {
                    System.out.println("index out of bounds!");
                    break;
                }
                current = current.next;
                counter++;
            }
        }
        printList();
        System.out.println("\n");
    }

    Node<T> deleteNode(int index) {
        Node<T> current = head;
        int counter = 0;
        Node<T> deleted = null;
        while (current != null && counter < index) {
            if (counter == index - 1) {
                Node<T> temp = current.next.next;
                deleted = current.next;
                current.next = temp;
                System.out.println("value deleted!");
            } else if (current.next == null) {
                System.out.println("index out of bounds!");
                break;
            }
            current = current.next;
            counter++;
        }
        printList();
        System.out.println("\n");

        return deleted;
    }

    Node<T> deleteNodeByValue(T value) {
        Node<T> current = head;
        Node<T> deleted = null;

        if (current != null && current.data.equals(value)) {
            head = current.next;
            deleted = current;
            System.out.println("Value deleted!");
        } else {
            while (current != null && current.next != null) {
                if (current.next.data.equals(value)) {
                    Node<T> temp = current.next.next;
                    deleted = current.next;
                    current.next = temp;
                    System.out.println("Value deleted!");
                    break; 
                }
                current = current.next;
            }

            if (deleted == null) {
                System.out.println("Value not found in the list!");
            }
        }

        printList();
        System.out.println("\n");

        return deleted;
    }

    void printList()
    {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data);
            current = current.next;
        }
    }

    Node<T> searchNode(int index)
    {
        Node<T> current;
        int counter = 0;
        current = head;
        while (current != null && counter < index) {
            if(counter == index - 1)
            {
                System.out.println("value found! " + current.next.data);
            }
            current = current.next;
            counter++;
            if(current == null)
            {
                System.out.println("not found!");
            }
        }
        return current;
    }

    Node<T> searchByValue(T data)
    {
        Node<T> current;
        current = head;
        boolean found = false;
        int counter = 0;
        while (current != null) {
            if(current.data == data)
            {
                System.out.println("value found at index: " + counter);
                found = true;
            }
            counter++;
            current = current.next;
        }
        if (!found) {
            System.out.println("value not found -_-");
        }
        return current;
    }
    
void removeDuplicate() {
    Node<T> current = head;

    while (current != null) {
        Node<T> nextDistinct = current;

        while (nextDistinct.next != null) {
            if (current.data.equals(nextDistinct.next.data)) {
                nextDistinct.next = nextDistinct.next.next;
            } else {
                nextDistinct = nextDistinct.next;
            }
        }

        current = current.next;
    }
}
}



class Node<T> {
    Node<T> next;
    T data;

    Node(T data) {
        this.data = data;
    }
}
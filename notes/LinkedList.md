# LinkedList Implementation in Java

This Java program provides a simple implementation of a singly linked list along with various operations such as insertion, deletion, searching, and removing duplicates.

## Class Structure

### `LinkedList<T>`

#### Methods:

- `void insert(T data)`: Inserts a new node with the given data at the end of the linked list.
- `void insert(int index, T data)`: Inserts a new node with the given data at the specified index.
- `Node<T> deleteNode(int index)`: Deletes the node at the specified index.
- `Node<T> deleteNodeByValue(T value)`: Deletes the first occurrence of the node with the specified value.
- `void printList()`: Prints the elements of the linked list.
- `Node<T> searchNode(int index)`: Searches for and returns the node at the specified index.
- `Node<T> searchByValue(T data)`: Searches for and returns the node with the specified value.
- `void removeDuplicate()`: Removes duplicate nodes from the linked list.

### `Node<T>`

A simple node class representing an element in the linked list.

#### Fields:

- `Node<T> next`: Reference to the next node in the list.
- `T data`: Data stored in the node.

## Example Usage:

```java
LinkedList<Integer> list = new LinkedList<>();
list.insert(1);
list.insert(2);
list.insert(3);

list.printList(); // Output: 123

list.deleteNode(1);
list.printList(); // Output: 13

list.removeDuplicate();
list.printList(); // Output: 13

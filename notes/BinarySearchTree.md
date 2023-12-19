# Binary Search Tree Implementation in Java

This Java program provides a simple implementation of a Binary Search Tree (BST) along with various operations such as insertion, searching, finding the maximum and minimum values, calculating the height, and counting nodes.

## Class Structure

### `BinarySearchTree<T>`

#### Methods:

- `Node<T> insert(Node<T> rootNode, T data, Comparator<T> comparator)`: Inserts a new node with the given data into the BST.
- `void search(Node<T> rootNode, T data, Comparator<T> comparator)`: Searches for a node with the specified data in the BST.
- `Node<T> findMin(Node<T> rootNode)`: Finds the node with the minimum value in the BST.
- `Node<T> findMax(Node<T> rootNode)`: Finds the node with the maximum value in the BST.
- `int findHeight(Node<T> rootNode)`: Calculates the height of the BST.
- `int findNodes(Node<T> rootNode)`: Counts the number of nodes in the BST.

### `Node<T>`

A simple node class representing an element in the BST.

#### Fields:

- `Node<T> left`: Reference to the left child node.
- `Node<T> right`: Reference to the right child node.
- `T data`: Data stored in the node.

## Example Usage:

```java
BinarySearchTree<Integer> bst = new BinarySearchTree<>();
Comparator<Integer> comparator = Comparator.naturalOrder();

Node<Integer> rootNode = null;
rootNode = bst.insert(rootNode, 50, comparator);
rootNode = bst.insert(rootNode, 30, comparator);
rootNode = bst.insert(rootNode, 70, comparator);

bst.search(rootNode, 30, comparator); // Output: root node found
bst.search(rootNode, 40, comparator); // Output: not found

Node<Integer> minNode = bst.findMin(rootNode);
Node<Integer> maxNode = bst.findMax(rootNode);

int height = bst.findHeight(rootNode);
int nodesCount = bst.findNodes(rootNode);

System.out.println("Minimum Value: " + minNode.data);
System.out.println("Maximum Value: " + maxNode.data);
System.out.println("Height of the BST: " + height);
System.out.println("Number of Nodes: " + nodesCount);

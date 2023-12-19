# Binary Search Tree Implementation in Java

This repository contains a generic implementation of a Binary Search Tree (BST) in Java. The BST is designed to work with any type that extends `Comparable`. The implementation includes methods for insertion, searching, finding the minimum and maximum values, calculating the height of the tree, and counting the number of nodes.

## Usage

To use the Binary Search Tree, follow these steps:

1. **Insertion:**
    ```java
    BinarySearchTree<T> bst = new BinarySearchTree<>();
    Node<T> rootNode = null;
    rootNode = bst.insert(rootNode, data);
    ```

2. **Search:**
    ```java
    bst.search(rootNode, data);
    ```

3. **Find Minimum:**
    ```java
    Node<T> minNode = bst.findMin(rootNode);
    ```

4. **Find Maximum:**
    ```java
    Node<T> maxNode = bst.findMax(rootNode);
    ```

5. **Calculate Height:**
    ```java
    int height = bst.FindHeight(rootNode);
    ```

6. **Count Nodes:**
    ```java
    int nodesCount = bst.FindNodes(rootNode);
    ```

## Example

```java
BinarySearchTree<Integer> bst = new BinarySearchTree<>();
Node<Integer> rootNode = null;
rootNode = bst.insert(rootNode, 50);
bst.insert(rootNode, 30);
bst.insert(rootNode, 70);

bst.search(rootNode, 30); // Output: root node found
bst.search(rootNode, 40); // Output: not found

Node<Integer> minNode = bst.findMin(rootNode);
Node<Integer> maxNode = bst.findMax(rootNode);

int height = bst.FindHeight(rootNode);
int nodesCount = bst.FindNodes(rootNode);

System.out.println("Minimum Value: " + minNode.data);
System.out.println("Maximum Value: " + maxNode.data);
System.out.println("Height of the BST: " + height);
System.out.println("Number of Nodes: " + nodesCount);

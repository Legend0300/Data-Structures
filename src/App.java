
public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        // LinkedList<Integer> list = new LinkedList<>();
        // list.insert(1);
        // list.insert(2);
        // list.insert(3);
        // list.insert(4);
        // list.insert(1);
        // list.insert(1);
        // list.insert(1);

        // list.searchNode(3);
        // list.deleteNode(3); // Delete the node at index 2
        // list.searchByValue(2);


        // list.removeDuplicate();
        // list.printList();

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

    }
}

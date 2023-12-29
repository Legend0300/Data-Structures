import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {


        int exit = 1;
        int counter = 0;
        Scanner scanner = new Scanner(System.in);
        
        while (exit != 0) {
            System.out.println("|--------------------------------------------|");
            System.out.println("  Press 1 to insert a node");
            System.out.println("  Press 2 to search a node");
            System.out.println("  Press 3 to delete a node");
            System.out.println("  Press 4 to check the number of nodes");
            System.out.println("  Press 5 to check the height of the tree");
            System.out.println("  Press 6 to check the parent of a node");
            System.out.println("  Press 7 to check if a node has a child");
            System.out.println("  Press 8 to check if it's a BST or not");
            System.out.println("  Press 9 to print all the nodes InOrder");
            System.out.println("  Press 0 to exit");
            System.out.println("|--------------------------------------------|");
        
            exit = scanner.nextInt();
        
            switch (exit) {
                case 0:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                case 1:
                    // Add your logic for inserting a node
                    int data = scanner.nextInt();
                    System.out.println("Inserting a node...");
                    if(counter == 0)
                    {
                        System.out.println("inserting 1st node!");
                        Node node = new Node(data);
                        
                    }
                    else{
                        System.out.println("inserting child nodes");
                    }
                    counter++;
                    break;
                case 2:
                    // Add your logic for searching a node
                    System.out.println("Searching a node...");
                    break;
                case 3:
                    // Add your logic for deleting a node
                    counter--;
                    System.out.println("Deleting a node...");
                    break;
                case 4:
                    // Add your logic for checking the number of nodes
                    System.out.println("Checking the number of nodes...");
                    break;
                case 5:
                    // Add your logic for checking the height of the tree
                    System.out.println("Checking the height of the tree...");
                    break;
                case 6:
                    // Add your logic for checking the parent of a node
                    System.out.println("Checking the parent of a node...");
                    break;
                case 7:
                    // Add your logic for checking if a node has a child
                    System.out.println("Checking if a node has a child...");
                    break;
                case 8:
                    // Add your logic for checking if it's a BST or not
                    System.out.println("Checking if it's a BST or not...");
                    break;
                case 9:
                    // Add your logic for printing all nodes InOrder
                    System.out.println("Printing all nodes InOrder...");
                    break;
                default:
                    System.out.println("Invalid option. Please enter a valid option.");
                    break;
            }
        }
        
        


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

// BinarySearchTree<Integer> bst = new BinarySearchTree<>();

// Node<Integer> rootNode = null;
// rootNode = bst.insert(rootNode, 50);
// bst.insert(rootNode, 30);
// bst.insert(rootNode, 70);
// bst.insert(rootNode, 100);
// bst.insert(rootNode, 99);
// bst.insert(rootNode, 101);

// bst.search(rootNode, 30); // Output: root node found
// bst.search(rootNode, 40); // Output: not found

// bst.Inorder(rootNode);
// System.out.println("\n");

// bst.DeleteNote(rootNode, 50);

// bst.Inorder(rootNode);

// bst.FindParent(rootNode, 100);

// Node<Integer> minNode = bst.findMin(rootNode);
// Node<Integer> maxNode = bst.findMax(rootNode);

// int height = bst.FindHeight(rootNode);
// int nodesCount = bst.FindNodes(rootNode);

// System.out.println("Minimum Value: " + minNode.data);
// System.out.println("Maximum Value: " + maxNode.data);
// System.out.println("Height of the BST: " + height);
// System.out.println("Number of Nodes: " + nodesCount);

}
}
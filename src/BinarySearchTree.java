public class BinarySearchTree<T extends Comparable<T>>{

    Node<T> insert(Node<T> rootNode, T data) {
        if (rootNode == null) {
            Node<T> node = new Node<T>(data);
            return node;
        }
        else if (rootNode.data.compareTo(data) > 0) {
            rootNode.right = insert(rootNode.right, data);
        } else {
            rootNode.left = insert(rootNode.left, data);
        }
        return rootNode;
    }

    Node searchNode = null;

    void search(Node<T> rootNode , T data){
        if(rootNode == null)
        {
            System.out.println("not found");
        }
        else if(rootNode.data.compareTo(data) == 0){
            System.out.println("root node found");
            searchNode = rootNode;
        }
        else{
            if(rootNode.data.compareTo(data) > 0)
            {  
                search(rootNode.right, data);
            }
            else
            {
                search(rootNode.left, data);
            }
        }
    }


    Node<T> findMin(Node<T> rootNode)
    {
        while (rootNode.left != null) {
            rootNode = rootNode.left;
        }
        System.out.println("min: " + rootNode.data);
        return rootNode;
    }

    Node<T> findMax(Node<T> rootNode)
    {
        while (rootNode.right != null) {
            rootNode = rootNode.right;
        }
        return rootNode;
    }


    int FindHeight(Node<T> rootNode) {

        if(rootNode == null)
        {
            return -1;
        }

        int leftHeight = FindHeight(rootNode.left);
        int rightHeight = FindHeight(rootNode.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    int FindNodes(Node<T> rootNode) {

        if(rootNode == null)
        {
            return 0;
        }

        int leftNodes = FindNodes(rootNode.left);
        int rightNodes = FindNodes(rootNode.right);

        return Math.max(leftNodes, rightNodes) + 1;
    }

    Node FindParent(Node root , T value)
    {
        if ((root.left != null && root.left.data.equals(value)) || 
        (root.right != null && root.right.data.equals(value)))
        {
            System.out.println("parent: " + root.data);
            return root;
        }
        if(((Comparable<T>) root.data).compareTo(value) > 0)
        {
            return FindParent(root.right, value);
        }
        else{
            return FindParent(root.left, value);
        }
    }


    Node<T> DeleteNote(Node<T> root, T value) {
        search(root, value);
        Node<T> node = searchNode;
    
        if (node == null) {
            return root;
        }
    
        if (node.left == null && node.right == null) {
            node = null;
        } else if (node.left != null && node.right == null) {
            Node<T> parentNode = FindParent(root, value);
            if (parentNode != null) {
                parentNode.left = node.left;
            } else {
                root = node.left;
            }
        } else if (node.right != null && node.left == null) {
            Node<T> parentNode = FindParent(root, value);
            if (parentNode != null) {
                parentNode.right = node.right;
            } else {
                root = node.right;
            }
        } else {
            // delete with 2 nodes
            Node<T> inOrderSuccessor = findMin(node.right);
            node.data = inOrderSuccessor.data;
            node.right = DeleteNote(node.right, inOrderSuccessor.data);
        }
    
        return root;
    }

    void Inorder(Node root)
    {
        if(root == null)
        {
            return;
        }
        else{
            Inorder(root.left);
            System.out.print(root.data + ", ");
            Inorder(root.right);
        }

    }

}

//insert
//search
//FindMax
//FindMin
//FindHeight
//FindNodes

class Node<T>{
    Node<T> left;
    Node<T> right;
    T data;
    
    Node(T data)
    {
        left = null;
        right = null;
        this.data = data;
    }
}
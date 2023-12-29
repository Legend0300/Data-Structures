public class BinarySearchTree2 {
    int height;
    int nodes;
    Node root;

    Node insert(Node root , int data)
    {
        if(root == null)
        {
            Node node = new Node(data);
            root = node;
            return root;
        }
        else{
            if(root.data > data)
            {
                root.left = insert(root.left, data);
            }
            else{
                root.right = insert(root.right, data);
            }
        }
        return root;
    }

    void search(Node root , int data)
    {
        if (root == null) {
            return;
        }
        else if(root.data == data){
            System.out.println("value found!");
        }
        else{
            if(root.left.data > data)
            {
                search(root.right, data);
            }
            else{
                search(root.left, data);
            }
        }
    }

    int getHeight(Node root)
    {
        if(root == null)
        {
            return -1;
        }
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }


    int getNodes(Node root)
    {
        if(root == null)
        {
            return 0;
        }
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    Node deleteNode(Node root , int value)
    {
        if(root == null)
        {
            return root;
        }
        else if(value > root.data)
        {   
            root.right = deleteNode(root.right, value);
        }
        else if(value < root.data)
        {
            root.left = deleteNode(root.left, value);
        }
        else{
            if(root.left == null && root.right == null)
            {
                root = null;
            }
            else if(root.left == null && root.right != null)
            {
                root = root.right;
            }
            else if(root.right == null && root.left != null)
            {
                root = root.left;
            }
            else{
                Node inOrder = FindMin(root.right);
                root.data = inOrder.data;
                root.right = deleteNode(root.right, value);
            }
            return root;
        }
        return new Node(value);
    }

    Node FindMin(Node root)
    {
        if (root.left != null) {
            return FindMin(root.left);
        }
        return root;
    }

    boolean hasLeft(Node node) {
        return node != null && node.left != null;
    }
    
    boolean hasRight(Node node) {
        return node != null && node.right != null;
    }

    Node findParent(Node root, int key) {
        if (root == null || (root.left != null && root.left.data == key) || (root.right != null && root.right.data == key)) {
            return root;
        }

        Node leftParent = findParent(root.left, key);
        if (leftParent != null) {
            return leftParent;
        }

        return findParent(root.right, key);
    }
}

class Node{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data = data;
    }
}
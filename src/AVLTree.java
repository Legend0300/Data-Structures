public class AVLTree {
    
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
            else if(root.data < data){
                root.right = insert(root.right, data);
            }
            else{
                return root;
            }
        }
        updateHeight(root);

        return balance(root, data);
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
        updateHeight(root);

        return balance(root, value);
    }

    Node FindMin(Node root)
    {
        if (root.left != null) {
            return FindMin(root.left);
        }
        return root;
    }

    public int height(Node node)
    {
        if(node == null)
        {
            return 0;
        }
        else{
            return node.height;
        }
    }

    int getBalance(Node node) {
        if (node == null) {
            return 0;
        }
        return height(node.left) - height(node.right);
    }

    int updateHeight(Node node)
    {if(node == null)
        {
            return 0;
        }
        else{
            node.height = Math.max(height(node.left), height(node.right)) + 1;
            return node.height;
        }
    }

    Node rightRotate(Node y)
    {
        Node x = y.left;
        Node T2 = x.right;

        x.right = y;
        y.left = T2;

        return x;
    }

    Node leftRotate(Node x)
    {
        Node y = x.right;
        Node T2 = y.left;

        y.left = x;
        x.right = T2;

        return y;
    }


    Node balance(Node root , int key)
    {
        updateHeight(root);

        int balance = getBalance(root);

        //left left
        if(balance > 1 && key < root.left.data)
        {
            return rightRotate(root);
        }
        else if(balance < -1 && key > root.right.data)
        {
            return leftRotate(root);
        }
        else if(balance > 1 && key > root.left.data)
        {
            root.left = leftRotate(root);
            return rightRotate(root);
        }
        else{
            root.right = rightRotate(root);
            return leftRotate(root);
        }
    }
}

class Node{
    int height = 0;
    Node left;
    Node right;
    int data;
    Node(int data)
    {
        this.data = data;
    }
}
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


    void search(Node<T> rootNode , T data){
        if(rootNode == null)
        {
            System.out.println("not found");
        }
        else if(rootNode.data.compareTo(data) == 0){
            System.out.println("root node found");
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
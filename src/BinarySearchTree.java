import java.util.Comparator;

public class BinarySearchTree<T>{

    Node<T> insert(Node<T> rootNode, T data, Comparator<T> comparator) {
        if (rootNode == null) {
            Node<T> node = new Node<T>(data);
            return node;
        } else if (comparator.compare(rootNode.data, data) > 0) {
            rootNode.right = insert(rootNode.right, data, comparator);
        } else {
            rootNode.left = insert(rootNode.left, data, comparator);
        }
        return rootNode;
    }


    void search(Node<T> rootNode , T data , Comparator<T> comparator){
        if(rootNode == null)
        {
            System.out.println("not found");
        }
        else if(rootNode.data == data){
            System.out.println("root node found");
        }
        else{
            if(comparator.compare(rootNode.data, data) > 0)
            {  
                search(rootNode.right, data, comparator);
            }
            else
            {
                search(rootNode.left, data, comparator);
            }
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
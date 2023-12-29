// public class LinkedList2 {
//     Node root = null;
//     void insert(int data)
//     {
//         if(root == null)
//         {
//             Node node = new Node(data);
//             root = node;
//         }
//         else{
//             Node temp = root;
//             while (temp.next != null) {
//                 temp = temp.next;
//             }
//             temp.next = new Node(data);
//         }
//     }

//     Node delete(Node root, int data)
//     {
//         if(root == null)
//         {
//             return null;
//         }
//         else{
//             Node temp = root;
//             while (temp.next != null && temp.next.data != data ) {
//                 temp = temp.next;
//             }
//             Node node = temp.next;
//             temp.next = temp.next.next;
//             return node;
//         }
//     }
// }

// class Node{
//     int data;
//     Node next;

//     Node(int data)
//     {
//         this.data = data;
//     }
// }

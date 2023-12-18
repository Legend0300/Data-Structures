public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        LinkedList<Integer> list = new LinkedList<>();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(1);
        list.insert(1);
        list.insert(1);

        list.searchNode(3);
        list.deleteNode(3); // Delete the node at index 2
        list.searchByValue(2);


        list.removeDuplicate();
        list.printList();

    }
}

public class main {
    public static void main(String[] args) {
        linkedlist list = new linkedlist();

        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertAtEnd(30);
        list.display(); // Output: 20 -> 10 -> 30 -> null

        list.deleteFromBeginning();
        list.display(); // Output: 10 -> 30 -> null
    }
}

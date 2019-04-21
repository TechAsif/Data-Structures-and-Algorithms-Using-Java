package linkedlistpac;

public class MainClass {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insertAtStart(2);
        list.insertAt(0, 1);
        list.deleteAt(0);
        list.deleteAt(1);

        list.show();
    }
}
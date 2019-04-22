package linkedlistpac;

public class LinkedList {

    Node head;//default null

    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;//default vabei null na dileo problem nai

        if (head == null)
            head = node;
        else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void insertAtStart(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        node.next = head;
        head = node;

    }

    public void insertAt(int index, int data) {

        Node node = new Node();
        node.data = data;
        node.next = null;//na dileo hobe.default vabe null
        Node n = head;

        if (index == 0)
            insertAtStart(data);
        else {
            for (int i = 0; i < index - 1; i++) {

                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }


    }

    public void deleteAt(int index) {
        if (index == 0) {
            head = head.next;
        } else {
            Node n = head;
            Node temp = null;

            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            temp = n.next;
            n.next = temp.next;

            temp = null;
        }
    }

    public void show() {
        Node node = head;

        while (node.next != null) {
            System.out.println(node.data);
            node = node.next;

        }
        System.out.println(node.data);
    }
}

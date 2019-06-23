package binarysearchtree;

public class MainClass {

    public static void main(String[] args) {


        BinaryTree theTree = new BinaryTree();

        theTree.insert(32);

        theTree.insert(10);

        theTree.insert(55);

        theTree.insert(1);

        theTree.insert(19);

        theTree.insert(79);
        theTree.insert(16);
        theTree.insert(23);

        theTree.inOrderTraverseTree(theTree.root);

        Node findSpecificNode = theTree.findNode(1);
        if (findSpecificNode != null) {
            System.out.println("The value is found");
        } else {
            System.out.println("The value is not found");
        }
    }

}

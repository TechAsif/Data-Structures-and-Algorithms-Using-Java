package binarysearchtree;

class BinaryTree {

    Node root;

    public void insert(int value) {

        Node newNode = new Node(value);

        if (root == null) {

            root = newNode;

        } else {

            Node focusNode = root;
            Node parent;

            while (true) {
                parent = focusNode;

                if (value < focusNode.value) {
                    focusNode = focusNode.leftChild;
                    if (focusNode == null) {
                        parent.leftChild = newNode;
                        return; // All Done
                    }

                } else {
                    focusNode = focusNode.rightChild;
                    if (focusNode == null) {
                        parent.rightChild = newNode;
                        return; // All Done

                    }

                }

            }
        }

    }

    public void inOrderTraverseTree(Node focusNode) {

        if (focusNode != null) {
            inOrderTraverseTree(focusNode.leftChild);
            System.out.println(focusNode.value);
            inOrderTraverseTree(focusNode.rightChild);
        }
    }

    public void preorderTraverseTree(Node focusNode) {

        if (focusNode != null) {
            System.out.println(focusNode);
            preorderTraverseTree(focusNode.leftChild);
            preorderTraverseTree(focusNode.rightChild);
        }
    }

    public void postOrderTraverseTree(Node focusNode) {

        if (focusNode != null) {
            postOrderTraverseTree(focusNode.leftChild);
            postOrderTraverseTree(focusNode.rightChild);
            System.out.println(focusNode);
        }
    }

    public Node findNode(int value) {
        Node focusNode = root;
        while (focusNode.value != value) {
            if (value < focusNode.value) {
                focusNode = focusNode.leftChild;

            } else {
                focusNode = focusNode.rightChild;
            }

            if (focusNode == null)
                return null;
        }

        return focusNode;

    }
}
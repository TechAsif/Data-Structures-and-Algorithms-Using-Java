package com.company;

class BinaryTree {

    Node root;

    // This method mainly calls insertRec() 
    void insert(int value) {
        root = insertRec(root, value);
    }

    /* A recursive function to insert a new value in BST */
    Node insertRec(Node root, int value) {

        /* If the tree is empty, return a new node */
        if (root == null) {
            root = new Node(value);
            return root;
        }

        /* Otherwise, recur down the tree */
        if (value < root.value)
            root.leftChild = insertRec(root.leftChild, value);
        else if (value > root.value)
            root.rightChild = insertRec(root.rightChild, value);

        /* return the (unchanged) node pointer */
        return root;
    }



    /* Given a binary tree, print its nodes in preorder*/
    void printPreorder(Node node)
    {
        if (node == null)
            return;

        /* first print data of node */
        System.out.print(node.value + " ");

        /* then recur on left sutree */
        printPreorder(node.leftChild);

        /* now recur on right subtree */
        printPreorder(node.rightChild);
    }

    /* Given a binary tree, print its nodes in inorder*/
    void printInorder(Node node)
    {
        if (node == null)
            return;

        /* first recur on left child */
        printInorder(node.leftChild);

        /* then print the data of node */
        System.out.print(node.value + " ");

        /* now recur on right child */
        printInorder(node.rightChild);
    }

    /* Given a binary tree, print its nodes according to the
      "bottom-up" postorder traversal. */
    void printPostorder(Node node)
    {
        if (node == null)
            return;

        // first recur on left subtree
        printPostorder(node.leftChild);

        // then recur on right subtree
        printPostorder(node.rightChild);

        // now deal with the node
        System.out.print(node.value + " ");
    }

    // This method mainly calls SearchRec()

    public Node search(int key){
        return searchRec(root,key);
    }


    // A utility function to search a given key in BST
    public Node searchRec(Node root, int key)
    {
        // Base Cases: root is null or key is present at root
        if (root==null || root.value==key)
            return root;

        // val is greater than root's key
        if (root.value > key)
            return searchRec(root.leftChild, key);

        // val is less than root's key
        return searchRec(root.rightChild, key);
    }
}
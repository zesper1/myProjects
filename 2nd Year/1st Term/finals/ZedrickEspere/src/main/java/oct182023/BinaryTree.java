/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oct182023;
import static java.lang.Math.abs;
import java.util.LinkedList;
import java.util.Queue;
class Node {

String key;
Node left, right;
    public Node(String item){
	key = item;
	left = right = null;
    }
}

// A Java program to introduce Binary Tree
class BinaryTree {
// Root of Binary Tree
    Node root;
// Constructors
    BinaryTree(String key){ 
        root = new Node(key); 
    }
    BinaryTree(){ 
        root = null; 
    }
    int countNumNodes(Node root) {
    if (root == null)
      return (0);
    return (1 + countNumNodes(root.left) + countNumNodes(root.right));
  }

  // Check for complete binary tree
  boolean checkComplete(Node root, int index, int numberNodes) {

    // Check if the tree is empty
    if (root == null)
      return true;

    if (index >= numberNodes)
      return false;

    return (checkComplete(root.left, 2 * index + 1, numberNodes)
        && checkComplete(root.right, 2 * index + 2, numberNodes));
  }
  public void delete(String key) {
        root = deleteNode(root, key);
    }

    // Recursive helper function to delete a node with a given key
    private Node deleteNode(Node root, String key) {
        if (root == null)
            return root;

        // Recursively search for the node to be deleted
        if (key.compareToIgnoreCase(root.key) < 0)
            root.left = deleteNode(root.left, key);
        else if (key.compareToIgnoreCase(root.key) > 0)
            root.right = deleteNode(root.right, key);
        else {
            // Node with only one child or no child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            // Node with two children: Get the inorder successor (smallest in the right subtree)
            root.key = minValue(root.right);

            // Delete the inorder successor
            root.right = deleteNode(root.right, root.key);
        }
        return root;
    }

    // Function to find the minimum value in a binary tree
    private String minValue(Node root) {
        String minValue = root.key;
        while (root.left != null) {
            minValue = root.left.key;
            root = root.left;
        }
        return minValue;
    }

    // Utility function to insert a node into the binary tree
    public void insert(String key) {
        root = insertNode(root, key);
    }

    // Recursive helper function to insert a node into the binary tree
    private Node insertNode(Node root, String key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key.compareToIgnoreCase(root.key) < 0)
            root.left = insertNode(root.left, key);
        else if (key.compareToIgnoreCase(root.key) > 0)
            root.right = insertNode(root.right, key);

        return root;
    }
    
    // Utility function to perform an inorder traversal of the binary tree
    public void inorder() {
        traverseInOrder(root);
    }

    // Recursive helper function to perform an inorder traversal of the binary tree
    private void traverseInOrder(Node root) {
        if (root != null) {
            traverseInOrder(root.left);
            System.out.print(root.key + " ");
            traverseInOrder(root.right);
        }
    }
    //pre-order
    public void preorder(){
        preorderHelper(root);
    }
    private void preorderHelper(Node root){
        if(root!=null){
            System.out.print(root.key + " ");
            preorderHelper(root.left);
            preorderHelper(root.right);
        }
    }
    //post-order
    public void postorder(){
        postorderHelper(root);
    }
    private void postorderHelper(Node root){
        if(root!=null){
            preorderHelper(root.left);
            preorderHelper(root.right);
            System.out.print(root.key + " ");
        }
    }
     // Add a node to the tree
    void addNode(String value) {
        Node newNode = new Node(value);
        if (this.root == null) {
            this.root = newNode;
        } else {
            Node currentNode = this.root;
            while (true) {
                if (value.compareToIgnoreCase(root.key) < 0) {
                    if (currentNode.left == null) {
                        currentNode.left = newNode;
                        break;
                    } else {
                        currentNode = currentNode.left;
                    }
                } else {
                    if (currentNode.right == null) {
                        currentNode.right = newNode;
                        break;
                    } else {
                        currentNode = currentNode.right;
                    }
                }
            }
        }
    }

    // Remove a node from the tree
    boolean removeNode(String key) {
        Node currentNode = this.root;
        Node parentNode = null;
        boolean isLeftChild = false;

        // Find the node to remove
        while (currentNode != null && currentNode.key != key) {
            parentNode = currentNode;
            if (key.compareToIgnoreCase(root.key) < 0) {
                currentNode = currentNode.left;
                isLeftChild = true;
            } else {
                currentNode = currentNode.right;
                isLeftChild = false;
            }
        }

        // If the node is not found
        if (currentNode == null) {
            return false;
        }

        // Case 1: Node has no children
        if (currentNode.left == null && currentNode.right == null) {
            if (currentNode == this.root) {
                this.root = null;
            } else if (isLeftChild) {
                parentNode.left = null;
            } else {
                parentNode.left = null;
            }
        }
        // Case 2: Node has one child
        else if (currentNode.left == null) {
            if (currentNode == this.root) {
                this.root = currentNode.right;
            } else if (isLeftChild) {
                parentNode.left = currentNode.right;
            } else {
                parentNode.right = currentNode.right;
            }
        } else if (currentNode.right == null) {
            if (currentNode == this.root) {
                this.root = currentNode.left;
            } else if (isLeftChild) {
                parentNode.left = currentNode.left;
            } else {
                parentNode.right = currentNode.right;
            }
        }
        // Case 3: Node has two children
        else {
            Node replacementNode = getReplacementNode(currentNode);
            if (currentNode == this.root) {
                this.root = replacementNode;
            } else if (isLeftChild) {
                parentNode.left = replacementNode;
            } else {
                parentNode.right = replacementNode;
            }
            replacementNode.left = currentNode.left;
        }

        return true;
    }

    // Helper method to find the replacement node for a node with two children
    private Node getReplacementNode(Node replacedNode) {
        Node replacementNode = replacedNode.right;
        Node parent = replacedNode;
        while (replacementNode.left != null) {
            parent = replacementNode;
            replacementNode = replacementNode.left;
        }
        if (replacementNode != replacedNode.right) {
            parent.left = replacementNode.right;
            replacementNode.right = replacedNode.right;
        }
        return replacementNode;
    }

    // Implement DFS algorithm using recursion
    void DFS(Node node) {
        if (node != null) {
            System.out.print(node.key + " ");
            DFS(node.left);
            DFS(node.right);
        }
    }

    // Implement BFS algorithm using a Queue
    void BFS(Node node) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            Node currentNode = queue.remove();
            System.out.print(currentNode.key + " ");
            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }
        }
    }
    //get depth
    int getDepth(Node node){
        if (node == null)
        return 0;
    else {
        /* compute the depth of each subtree */
        int lDepth = getDepth(node.left);
        int rDepth = getDepth(node.right);
 
        /* use the larger one */
        if (lDepth > rDepth)
            return (lDepth + 1);
        else
            return (rDepth + 1);
    }
    }
    // Get the height of the binary tree
    int getHeight(Node node) {
        if (node == null) {
            return 0;
        } else {
            int leftSubtreeHeight = getHeight(node.left);
            int rightSubtreeHeight = getHeight(node.right);
            return Math.max(leftSubtreeHeight, rightSubtreeHeight) + 1;
        }
    }
    //isBalanced method
    boolean isBalanced(Node node)
{
    // for height of left subtree
    int lh;
 
    // for height of right subtree
    int rh;
 
    // If tree is empty then return true
    if (node == null)
        return true;
 
    // Get the height of left and right sub trees
    lh = getHeight(node.left);
    rh = getHeight(node.right);
 
    if (abs(lh - rh) <= 1 && isBalanced(node.left)
        && isBalanced(node.right))
        return true;
 
    // If we reach here then tree is not height-balanced
    return false;
    }
    //isPerfect method
    Boolean isPerfect(Node node, int depth, int treeDepth) {
    // check for the leaf nodes
    if (depth == treeDepth && (node.left == null && node.right == null)) {
        return true;
    }
    // check for internal nodes (depth != treeDepth)
    if ((node.left != null && node.right != null)) {
        return isPerfect(node.left, 1 + depth, treeDepth) &&
                isPerfect(node.right, 1 + depth, treeDepth);
    }
    return false;
}
    // Print each level of the binary tree
    void printLevel(Node node, int level) {
        if (node == null) {
            return;
        }
        if (level == 1) {
            System.out.print(node.key + " ");
        } else if (level > 1) {
            printLevel(node.left, level - 1);
            printLevel(node.right, level - 1);
        }
    }

    // Perform Level Order Traversal using Recursion
    void levelOrderTraversal() {
        int height = getHeight(this.root);
        for (int i = 1; i <= height; i++) {
            printLevel(this.root, i);
        }
    }
    int LevelThis(Node node, String data, int level)
    {
        if (node == null)
            return 0;
 
        if (node.key == data)
            return level;
 
        int downlevel
            = LevelThis(node.left, data, level + 1);
        if (downlevel != 0)
            return downlevel;
 
        downlevel
            = LevelThis(node.right, data, level + 1);
        return downlevel;
    }
 
    /* Returns level of given data value */
    int getLevel(Node node, String data)
    {
        return LevelThis(node, data, 1);
    }
    //Full checker
    boolean isFullTree(Node node)
    {
        // if empty tree
        if(node == null)
        return true;
          
        // if leaf node
        if(node.left == null && node.right == null )
            return true;
          
        // if both left and right subtrees are not null
        // they are full
        if((node.left!=null) && (node.right!=null))
            return (isFullTree(node.left) && isFullTree(node.right));
          
        // if none work
        return false;
    }
}
    //get sum
//    public int calculateSum(Node temp){  
//        int sum, sumLeft, sumRight;  
//        sum = sumRight = sumLeft = 0;  
//  
//        //Check whether tree is empty  
//        if(root == null) {  
//            System.out.println("Tree is empty");  
//            return 0;  
//        }  
//        else {  
//            //Calculate the sum of nodes present in left subtree  
//            if(temp.left != null)  
//                sumLeft = calculateSum(temp.left);  
//  
//            //Calculate the sum of nodes present in right subtree  
//            if(temp.right != null)  
//                sumRight = calculateSum(temp.right);  
//  
//            //Calculate the sum of all nodes by adding sumLeft, sumRight and root node's data  
//            sum = temp.key + sumLeft + sumRight;  
//            return sum;  
//        }



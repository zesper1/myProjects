/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oct182023;
public class BinaryTreeExample {
    public static void main(String[] args){
    BinaryTree bt  = new BinaryTree("snacks");
    bt.addNode("na");
    bt.addNode("ko");
    bt.addNode("sagot");
    bt.addNode("sinesindak, ");
    bt.addNode(" Tara");
    bt.inorder();
    }
}
//        //1
//        BinaryTree bt  = new BinaryTree("apple");
//        bt.addNode("banana");
//        bt.addNode("cherry");
//        bt.addNode("orange");
//        bt.addNode("kiwi");
//        bt.addNode("pear");
//        bt.addNode("grape");
//        bt.addNode("pineapple");
//        bt.addNode("mango");
//        bt.addNode("strawberry");
//        //2
//        System.out.println("Number of nodes: " + bt.countNumNodes(bt.root));
//        //3
//        bt.inorder(); System.out.println("");
//        //4
//        bt.preorder(); System.out.println("");
//        //5
//        bt.postorder(); System.out.println("");
//        //6
//        bt.levelOrderTraversal(); System.out.println("");
//        //7
//        System.out.println("Height: " + bt.getHeight(bt.root));
//        //8
//        System.out.println("Depth:" + (bt.getDepth(bt.root)+1));
//        //9
//        int node_count = bt.countNumNodes(bt.root);
//        int index = 0;
//
//        if (bt.isFullTree(bt.root))
//            System.out.println("The tree is a full binary tree");
//        else
//            System.out.println("The tree is not a full binary tree");
//        //10
//        if (bt.isBalanced(bt.root)== true){
//        System.out.println("Tree is balanced");
//        }else{
//        System.out.println("Tree is not balanced");}
//        //11
//        if (bt.isPerfect(bt.root, bt.getHeight(bt.root),bt.getDepth(bt.root))== true){
//        System.out.println("Tree is perfect");
//        }else
//        System.out.println("Tree is not perfect");
//        //12
//        if (bt.checkComplete(bt.root, index, node_count))
//            System.out.println("The tree is a complete binary tree");
//        else
//            System.out.println("The tree is not a complete binary tree");
//        System.out.println("Number of Nodes: " + node_count);
//        //13
//        bt.removeNode("orange");
//        bt.removeNode("kiwi");
//        ////14
//        //2
//        System.out.println("Number of nodes: " + bt.countNumNodes(bt.root));
//        //3
//        bt.inorder(); System.out.println("");
//        //4
//        bt.preorder(); System.out.println("");
//        //5
//        bt.postorder(); System.out.println("");
//        //6
//        bt.levelOrderTraversal(); System.out.println("");
//        //7
//        System.out.println("Height: " + bt.getHeight(bt.root));
//        //8
//        System.out.println("Depth:" + (bt.getDepth(bt.root)+1));
//        //9
//        if (bt.isFullTree(bt.root))
//            System.out.println("The tree is a full binary tree");
//        else
//            System.out.println("The tree is not a full binary tree");
//        //10
//        if (bt.isBalanced(bt.root)== true){
//        System.out.println("Tree is balanced");
//        }else{
//        System.out.println("Tree is not balanced");}
//        //11
//        if (bt.isPerfect(bt.root, bt.getHeight(bt.root),bt.getDepth(bt.root))== true){
//        System.out.println("Tree is perfect");
//        }else
//        System.out.println("Tree is not perfect");
//        //12
//        if (bt.checkComplete(bt.root, index, node_count))
//            System.out.println("The tree is a complete binary tree");
//        else
//            System.out.println("The tree is not a complete binary tree");
//        System.out.println("Number of Nodes: " + node_count);
//        ////15
//        bt.addNode("lemon");
//        bt.addNode("lime");
//        bt.addNode("coconut");
//        ////16
//        //2
//        System.out.println("Number of nodes: " + bt.countNumNodes(bt.root));
//        //3
//        bt.inorder(); System.out.println("");
//        //4
//        bt.preorder(); System.out.println("");
//        //5
//        bt.postorder(); System.out.println("");
//        //6
//        bt.levelOrderTraversal(); System.out.println("");
//        //7
//        System.out.println("Height: " + bt.getHeight(bt.root));
//        //8
//        System.out.println("Depth:" + (bt.getDepth(bt.root)+1));
//        //9
//        if (bt.isFullTree(bt.root))
//            System.out.println("The tree is a full binary tree");
//        else
//            System.out.println("The tree is not a full binary tree");
//        //10
//        if (bt.isBalanced(bt.root)== true){
//        System.out.println("Tree is balanced");
//        }else{
//        System.out.println("Tree is not balanced");}
//        //11
//        if (bt.isPerfect(bt.root, bt.getHeight(bt.root),bt.getDepth(bt.root))== true){
//        System.out.println("Tree is perfect");
//        }else
//        System.out.println("Tree is not perfect");
//        //12
//        if (bt.checkComplete(bt.root, index, node_count))
//            System.out.println("The tree is a complete binary tree");
//        else
//            System.out.println("The tree is not a complete binary tree");
//        System.out.println("Number of Nodes: " + node_count);
//        //17
//        String x = "banana";
//        System.out.println("Level of " + x + " is " + bt.getLevel(bt.root, x));
//    }
//}    
//        BinaryTree bt = new BinaryTree(55);
//        bt.addNode(23);
//        bt.addNode(11);
//        bt.addNode(75);
//        bt.addNode(50);
//        bt.addNode(15);
//        bt.addNode(25);
//        bt.addNode(60);
//        bt.addNode(63);
//        bt.addNode(69);
//        System.out.println("Number of nodes: " + bt.countNumNodes(bt.root));
//        bt.inorder(); System.out.println("");
//        bt.preorder(); System.out.println("");
//        bt.postorder(); System.out.println("");
//        bt.levelOrderTraversal(); System.out.println("");
//        System.out.println("Height: " + bt.getHeight(bt.root));
//        System.out.println("Depth:" + (bt.getDepth(bt.root)+1));
//        int node_count = bt.countNumNodes(bt.root);
//        int index = 0;
//
//        if (bt.checkComplete(bt.root, index, node_count))
//            System.out.println("The tree is a complete binary tree");
//        else
//            System.out.println("The tree is not a complete binary tree");
//        System.out.println("Number of Nodes: " + node_count);
//        if (bt.isBalanced(bt.root)== true){
//        System.out.println("Tree is balanced");
//        }else{
//        System.out.println("Tree is not balanced");}
//        if (bt.isPerfect(bt.root, bt.getHeight(bt.root),bt.getDepth(bt.root))== true){
//        System.out.println("Tree is perfect");
//        }else{
//        System.out.println("Tree is not perfect");}
//        //13
//        bt.removeNode(50);
//        bt.removeNode(60);
//        bt.removeNode(75);
//        //14
//        System.out.println("Number of nodes: " + bt.countNumNodes(bt.root));
//        bt.inorder(); System.out.println("");
//        bt.preorder(); System.out.println("");
//        bt.postorder(); System.out.println("");
//        bt.levelOrderTraversal(); System.out.println("");
//        System.out.println("Height: " + bt.getHeight(bt.root));
//        System.out.println("Depth:" + (bt.getDepth(bt.root)+1));
//
//        if (bt.checkComplete(bt.root, index, node_count))
//            System.out.println("The tree is a complete binary tree");
//        else
//            System.out.println("The tree is not a complete binary tree");
//        System.out.println("Number of Nodes: " + node_count);
//        if (bt.isBalanced(bt.root)== true){
//        System.out.println("Tree is balanced");
//        }else{
//        System.out.println("Tree is not balanced");}
//        if (bt.isPerfect(bt.root, bt.getHeight(bt.root),bt.getDepth(bt.root))== true){
//        System.out.println("Tree is perfect");
//        }else{
//        System.out.println("Tree is not perfect");}
//        //15
//        bt.addNode(5);
//        bt.addNode(10);
//        bt.addNode(20);
//        //16
//        System.out.println("Number of nodes: " + bt.countNumNodes(bt.root));
//        bt.inorder(); System.out.println("");
//        bt.preorder(); System.out.println("");
//        bt.postorder(); System.out.println("");
//        bt.levelOrderTraversal(); System.out.println("");
//        System.out.println("Height: " + bt.getHeight(bt.root));
//        System.out.println("Depth:" + (bt.getDepth(bt.root)+1));
//
//        if (bt.checkComplete(bt.root, index, node_count))
//            System.out.println("The tree is a complete binary tree");
//        else
//            System.out.println("The tree is not a complete binary tree");
//        System.out.println("Number of Nodes: " + node_count);
//        if (bt.isBalanced(bt.root)== true){
//        System.out.println("Tree is balanced");
//        }else{
//        System.out.println("Tree is not balanced");}
//        if (bt.isPerfect(bt.root, bt.getHeight(bt.root),bt.getDepth(bt.root))== true){
//        System.out.println("Tree is perfect");
//        }else{
//        System.out.println("Tree is not perfect");}
//        //17
//        int x = 5;
//        System.out.println("Level of " + x + " is " + bt.getLevel(bt.root, x));
//        //18
//        System.out.println("Sum of the nodes: " + bt.calculateSum(bt.root));
//  }
//}



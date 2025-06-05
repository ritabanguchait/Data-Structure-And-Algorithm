import java.util.*;

public class BinaryTree {
    // Node class represents a single node in the binary tree
    static class node {
        int data;
        node right;
        node left;

        // Constructor to initialize the node with data
        node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Binary tree class contains methods to build and traverse the tree
    static class binarytree {
        static int idx = -1; // Index for building tree from array

        // Build the binary tree from given array using preorder traversal
        // -1 indicates null node
        public static node buildtree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            node rg = new node(nodes[idx]); // Create node with current value
            rg.left = buildtree(nodes); // Recursively build left subtree
            rg.right = buildtree(nodes); // Recursively build right subtree
            return rg; // Return current node
        }

        // Preorder traversal: root -> left -> right
        public static void preorder(node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        // Inorder traversal: left -> root -> right
        public static void inorder(node root) {
            if (root == null) {
                return;
            }
            preorder(root.left);
            System.out.print(root.data + " ");
            preorder(root.right);
        }

        // Postorder traversal: left -> right -> root
        public static void postorder(node root) {
            if (root == null) {
                return;
            }
            preorder(root.left);
            preorder(root.right);
            System.out.print(root.data + " ");
        }

        // Level order traversal (Breadth First Search) with levels printed on new lines
        public static void levelorder(node root) {
            Queue<node> list = new LinkedList<>();
            list.add(root);
            list.add(null); // Marker for end of current level

            if (root == null) {
                return;
            }

            while (!list.isEmpty()) {
                node curr = list.remove();

                if (curr == null) {
                    System.out.println(); // End of one level
                    if (list.isEmpty()) {
                        break;
                    } else {
                        list.add(null); // Add marker for next level
                    }
                } else {
                    System.out.print(curr.data + " "); // Print current node data

                    if (curr.left != null) {
                        list.add(curr.left); // Add left child to queue
                    }
                    if (curr.right != null) {
                        list.add(curr.right); // Add right child to queue
                    }
                }
            }
        }

        // Count total nodes in the binary tree recursively
        public static int countofnodes(node root) {
            if (root == null) {
                return 0;
            }
            int left = countofnodes(root.left);
            int right = countofnodes(root.right);
            return left + right + 1;
        }

        // Calculate sum of all nodes in the binary tree recursively
        public static int sumofnodes(node root) {
            if (root == null) {
                return 0;
            }
            int leftsum = sumofnodes(root.left);
            int rightsum = sumofnodes(root.right);
            return leftsum + rightsum + root.data;
        }

        // Calculate height of the binary tree recursively
        public static int height(node root) {
            if (root == null) {
                return 0;
            }
            int left = height(root.left);
            int right = height(root.right);
            int myheight = Math.max(left, right) + 1;
            return myheight;
        }
    }

    // Main method to execute binary tree operations
    public static void main(String[] args) {
        int[] node = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        binarytree rg = new binarytree();

        node a = rg.buildtree(node); // Build tree from array
        System.out.println(a.data);

        System.out.println("Print Binary Tree in Pre-order");
        rg.preorder(a);
        System.out.println();

        System.out.println("Print Binary Tree in IN-order");
        rg.inorder(a);
        System.out.println();

        System.out.println("Print Binary Tree in Post-order");
        rg.postorder(a);
        System.out.println();

        System.out.println("Print Binary tree in level order");
        rg.levelorder(a);
        System.out.println();

        System.out.println("Count of the Nodes in Binary Tree");
        int b = rg.countofnodes(a);
        System.out.println(b);

        System.out.println("The Sum of the nodes in binarytree");
        int c = rg.sumofnodes(a);
        System.out.println(c);

        System.out.println("The Height of the Binary Tree is");
        int k = rg.height(a);
        System.out.println(k);
    }
}

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    static class node {
        int data;
        node right;
        node left;

        node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Insert a value into the BST
    public static node insert(node root, int val) {
        if (root == null) {
            root = new node(val);
            return root;
        }
        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    // Inorder traversal to print nodes in sorted order
    public static void inorder(node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Search for a value in the BST
    public static boolean search(node root, int data) {
        if (root == null) {
            return false;
        }
        if (root.data > data) {
            return search(root.left, data);  // Added return to fix logic
        } else if (root.data < data) {
            return search(root.right, data);  // Added return to fix logic
        }
        // root.data == data
        return true;
    }

    // Delete a node from the BST
    public static node delete(node root, int data) {
        if (root == null) {
            return null;
        }
        if (root.data > data) {
            root.left = delete(root.left, data);
        } else if (root.data < data) {
            root.right = delete(root.right, data);
        } else {
            // Node to delete found
            if (root.right == null && root.left == null) {
                return null; // No child
            }
            if (root.right == null) {
                return root.left; // One child (left)
            }
            if (root.left == null) {
                return root.right; // One child (right)
            }
            // Two children: get inorder successor (smallest in right subtree)
            node is = inordersucesser(root.right);
            root.data = is.data;
            root.right = delete(root.right, is.data);
        }
        return root;
    }

    // Find inorder successor (leftmost child of right subtree)
    public static node inordersucesser(node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    // Print all nodes in the range [x, y]
    public static void printinrange(node root, int x, int y) {
        if (root == null) {
            return;
        }
        if (x <= root.data && root.data <= y) {
            printinrange(root.left, x, y);
            System.out.print(root.data + " ");
            printinrange(root.right, x, y);
        }
        if (root.data < x) {
            printinrange(root.right, x, y);
        }
        if (root.data > y) {
            printinrange(root.left, x, y);
        }
    }

    // Level Order Traversal (Breadth-First Search)
    public static void levelorder(node root) {
        if (root == null) {
            return;
        }
        Queue<node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            node current = queue.poll();
            System.out.print(current.data + " ");
            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int value[] = {5, 1, 3, 4, 2, 7};
        node root = null;

        // Insert values into the BST
        for (int i = 0; i < value.length; i++) {
            root = insert(root, value[i]);
        }

        System.out.print("Inorder traversal of BST: ");
        inorder(root);
        System.out.println();

        // Search for value 5
        if (search(root, 5)) {
            System.out.println("Value 5: Found in BST");
        } else {
            System.out.println("Value 5: Not Found in BST");
        }

        // Search for value 14
        if (search(root, 14)) {
            System.out.println("Value 14: Found in BST");
        } else {
            System.out.println("Value 14: Not Found in BST");
        }

        // Delete node with value 5
        root = delete(root, 5);

        System.out.print("Inorder traversal after deleting 5: ");
        inorder(root);
        System.out.println();

        System.out.print("Print nodes in range [3, 10]: ");
        printinrange(root, 3, 10);
        System.out.println();

        // Level Order Traversal
        System.out.print("Level order traversal of BST: ");
        levelorder(root);
    }
}

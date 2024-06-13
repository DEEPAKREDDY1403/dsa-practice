import java.util.*;
import java.util.LinkedList;
class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

class QueueItem {
    Node node;
    int hd;

    QueueItem(Node node, int hd) {
        this.node = node;
        this.hd = hd;
    }
}

class Tree {
    void bottomView(Node root) {
        if (root == null) {
            return;
        }

        Queue<QueueItem> queue = new LinkedList<>();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        queue.add(new QueueItem(root, 0));

        while (!queue.isEmpty()) {
            QueueItem temp = queue.poll();
            Node node = temp.node; // node value (nodes)
            int hd = temp.hd;      // horizontal distance
            map.put(hd, node.data);

            // level order traversal
            if (node.left != null) {
                queue.add(new QueueItem(node.left, hd - 1));
            }
            if (node.right != null) {
                queue.add(new QueueItem(node.right, hd + 1));
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.print(entry.getValue() + " ");
        }
        System.out.println();
    }

    static Node addNode(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }
        if (value < root.data) {
            root.left = addNode(root.left, value);
        } else if (value > root.data) {
            root.right = addNode(root.right, value);
        }
        return root;
    }
}

public class bottomview {
    public static void main(String[] args) {
        Tree tree = new Tree();
        
        Node root = null;
        int[] arr = {3, 2, 5, 1, 4, 7};
        for (int i : arr) {
            root = Tree.addNode(root, i);
        }

        tree.bottomView(root);
    }
}

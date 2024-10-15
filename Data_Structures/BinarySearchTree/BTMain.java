package Data_Structures.BinarySearchTree;

public class BTMain {
    /*
     * Binary Search Tree = A tree data structure, where each node is greater than it's left child,
     *                      but less than it's right.
     * Benefit: easy to locate a node when they are in this order
     * 
     * Time complexity : best case - O(log n)
     *                   worst case O(n)
     * 
     * Space complexity : O(n)
     */
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(new BTNode(5));
        tree.insert(new BTNode(1));
        tree.insert(new BTNode(9));
        tree.insert(new BTNode(2));
        tree.insert(new BTNode(7));
        tree.insert(new BTNode(3));
        tree.insert(new BTNode(6));
        tree.insert(new BTNode(4));
        tree.insert(new BTNode(8));

        tree.remove(6);
        tree.display();
        System.out.println(tree.search(9));

    }
}

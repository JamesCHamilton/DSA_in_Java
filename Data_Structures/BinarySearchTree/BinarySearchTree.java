package Data_Structures.BinarySearchTree;

public class BinarySearchTree {
    BTNode root;

    public void insert(BTNode node){
        root = insertHelper(root, node);
    }
    private BTNode insertHelper(BTNode root, BTNode node){
        
        int data = node.data;

        if (root == null){

            root = node;
            return root;

        }else if(data < root.data){

            root.left = insertHelper(root.left, node);
        }else{

            root.right = insertHelper(root.right, node);
        }
        return root;
    }
    public void display(){
        displayhelper(root);
    }
    private void displayhelper(BTNode root){
        if(root != null){
            displayhelper(root.left);
            System.out.println(root.data);
            displayhelper(root.right);
        }
    }
    public boolean search(int data){
        return seachHelper(root, data);
    }
    private boolean seachHelper(BTNode root, int data){
        if (root == null){
            return false;
        }else if(root.data == data){
            return true;
        }else if(root.data > data){
            return seachHelper(root.left, data);
        }else return seachHelper(root.right, data);
    }
    public void remove(int data){
        if(search(data)){
            removeHelper(root, data);
        }else{
            System.out.println(data + " could not be found");
        }
    }
    private BTNode removeHelper(BTNode root, int data){
        if(root == null ){
            return root;
        }else if (data < root.data){
            root.left = removeHelper(root.left, data);
        }else if(data > root.data){
            root.right = removeHelper(root.right, data);
        }else{
            if (root.left == null && root.right == null){
                root = null;
            }else if(root.right != null){// find a successor to replace this node
                root.data = successor(root);
                root.right = removeHelper(root.right, root.data);
            }else{// find a predecessor to replace this node
                root.data = predeccesor(root);
                root.left = removeHelper(root.left, root.data);
            }
        }
        return root;
    }
    private int successor(BTNode root){// find the least value below the right child of this root node
            root = root.right;
            while(root.left != null){
                root = root.left;
            }
            return root.data;
    }
    private int predeccesor(BTNode root){
        root = root.left;
        while(root.right != null){
            root = root.right;
        }
        return root.data;
    }
}

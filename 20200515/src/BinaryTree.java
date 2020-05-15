/**
 * Created with Intellij IDEA
 *
 * @program: 20200515
 * @Description:
 * @USer:LD
 * @Date: 2020-05-15 19:44
 * @time: 19:44
 **/
class Node {
    public char val;
    public Node left;
    public Node right;

    public Node(char val) {
        this.val = val;
    }
}
public class BinaryTree {

    public Node buildTree() {
        Node A = new Node('A');
        Node B = new Node('B');
        Node C = new Node('C');
        Node D = new Node('D');
        Node E = new Node('E');
        Node F = new Node('F');
        Node G = new Node('G');
        Node H = new Node('H');
        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        E.right = H;
        C.left = F;
        C.right = G;
        return A;
    }
    // 前序遍历   递归来实现
    void preOrderTraversal(Node root){
        if(root == null) {
            return;
        }
        System.out.print(root.val+" ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    // 中序遍历
    void inOrderTraversal(Node root){
        if(root == null) {
            return;
        }
        postOrderTraversal(root.left);
        System.out.print(root.val + " ");
        postOrderTraversal(root.right);

    }
    // 后序遍历
    void postOrderTraversal(Node root){
        if(root == null) {
            return;
        }
        inOrderTraversal(root.left);
        inOrderTraversal(root.right);
        System.out.print(root.val + " ");
    }
    // 遍历思路-求结点个数   前序遍历
    static int size = 0;
    int getSize1(Node root){
        if(root == null) {
            return size;
        }
       size++;
        getSize1(root.left);
        getSize1(root.right);
        return size;
    }
    // 子问题思路-求结点个数
    int getSize2(Node root){
        if(root == null) {
            return 0;
        }
        return getSize2(root.left) + getSize2(root.right) +1;
    }
    //遍历思路-求叶子结点个数
    static int leafSize = 0;
     void getLeafSize1(Node root){
        if(root == null) {
            return;
        }
        if(root.left == null && root.right == null) {
            leafSize++;
        }
        getLeafSize1(root.left);
        getLeafSize1(root.right);
    }
    // 子问题思路-求叶子结点个数
    int getLeafSize2(Node root) {
         if(root == null) {
             return 0;
         }
         if(root.right == null && root.left == null) {
             return 1;
         }
         return getLeafSize2(root.right) + getLeafSize2(root.left);
    }
}

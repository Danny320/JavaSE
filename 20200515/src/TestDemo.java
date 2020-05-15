/**
 * Created with Intellij IDEA
 *
 * @program: 20200515
 * @Description:
 * @USer:LD
 * @Date: 2020-05-15 20:19
 * @time: 20:19
 **/
public class TestDemo {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        Node root = binaryTree.buildTree();
        binaryTree.preOrderTraversal(root);
        System.out.println();
        binaryTree.inOrderTraversal(root);
        System.out.println();
        binaryTree.postOrderTraversal(root);
        System.out.println();
        System.out.println("节点的个数" + binaryTree.getSize1(root));
        System.out.println("节点的个数" + binaryTree.getSize2(root));
        binaryTree.getLeafSize1(root);
        System.out.println("叶子节点的个数" + binaryTree.leafSize);
        System.out.println("叶子节点的个数" + binaryTree.getLeafSize2(root));



    }
}

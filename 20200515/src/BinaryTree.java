import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
    void preOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    // 中序遍历
    void inOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        postOrderTraversal(root.left);
        System.out.print(root.val + " ");
        postOrderTraversal(root.right);

    }

    // 后序遍历
    void postOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);
        inOrderTraversal(root.right);
        System.out.print(root.val + " ");
    }

    // 遍历思路-求结点个数   前序遍历
    static int size = 0;

    int getSize1(Node root) {
        if (root == null) {
            return size;
        }
        size++;
        getSize1(root.left);
        getSize1(root.right);
        return size;
    }

    // 子问题思路-求结点个数
    int getSize2(Node root) {
        if (root == null) {
            return 0;
        }
        return getSize2(root.left) + getSize2(root.right) + 1;
    }

    //遍历思路-求叶子结点个数
    static int leafSize = 0;

    void getLeafSize1(Node root) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            leafSize++;
        }
        getLeafSize1(root.left);
        getLeafSize1(root.right);
    }

    // 子问题思路-求叶子结点个数
    int getLeafSize2(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.right == null && root.left == null) {
            return 1;
        }
        return getLeafSize2(root.right) + getLeafSize2(root.left);
    }

    //求第k层节点个数
    int getKLevelSize(Node root, int k) {
        if (root == null) {
            return 0;
        } else if (k == 1) {
            return 1;
        } else {
            return getKLevelSize(root.left, k - 1) + getKLevelSize(root.right, k - 1);
        }
    }

    //获取二叉树的高度
    int getHeight(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        return rightHeight > leftHeight ? rightHeight + 1 : leftHeight + 1;
    }

    // 查找 val 所在结点，没有找到返回 null
    // 按照 根 -> 左子树 -> 右子树的顺序进行查找
    // 一旦找到，立即返回，不需要继续在其他位置查找
    Node find(Node root, char val) {
        if (root == null) {
            return null;
        }

        if (root.val == val) {
            return root;
        }
        Node left = find(root.left, val);
        if (left != null) {
            return left;
        }
        Node right = find(root.right, val);
        if (right != null) {
            return right;
        }
        return null;
    }

    //判断两颗树是否相等
    public boolean isSameTree(Node p, Node q) {
        if ((p == null && q != null) || (p != null && q == null)) {
            return false;
        }
        if (p == null && q == null) {
            return true;
        }
        if (p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    //另一颗树的子树
    public boolean isSubtree(Node s, Node t) {
        if (s == null || t == null) {
            return false;
        }
        if (isSameTree(s, t)) {
            return true;
        }
        if (isSubtree(s.left, t)) {
            return true;
        }
        if (isSubtree(s.right, t)) {
            return true;
        }
        return false;
    }
    
    //平衡二叉树
    public boolean isBalanced(Node root) {
      if(root == null) {
          return true;
      }
      int leftHeight = getHeight(root.left);
      int rightHeight = getHeight(root.right);
      return Math.abs(leftHeight - rightHeight) < 2&&
              isBalanced(root.left) &&
              isBalanced(root.right);
    }

    //层序遍历
    public void levelOrderTraversal(Node root){
        if(root == null) return;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            Node cur = queue.poll();
           System.out.print(cur.val + " ");
           if(cur.left != null) {
               queue.offer(cur.left);
           }
            if(cur.right != null) {
                queue.offer(cur.right);
            }
        }
        System.out.println();
    }


    public List<List<Character>> levelOrder(Node root) {
        List<List<Character>> ret = new LinkedList<>();
        if(root == null) return ret;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            //1、求当前队列的大小  size
            int size = queue.size();
            List<Character> list = new LinkedList<>();
                while(size > 0) {// -->控制当前每一层的数据个数
                    Node cur = queue.poll();
                    if(cur != null) {
                        list.add(cur.val);
                    }
                    if(cur.left != null) {
                        queue.offer(cur.left);
                    }
                    if(cur.right != null) {
                        queue.offer(cur.right);
                    }
                    size--;
                }
                ret.add(list);
        }
        return ret;
    }


    boolean isCompleteTree(Node root) {
        if(root == null) {
            return true;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            Node cur = queue.poll();
            if(cur != null){
                queue.offer(cur.left);
                queue.offer(cur.right);
            }else {
                break;
            }
        }

        //看下队列里面是否都是空
        while(!queue.isEmpty()) {
            Node cur2 = queue.peek();
            if(cur2 != null) {
                return false;
            }else {
                queue.poll();
            }
        }
        return true;
    }
}

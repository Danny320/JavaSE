/**
 * Created with Intellij IDEA
 *
 * @program: 20200528
 * @Description:
 * @USer:LD
 * @Date: 2020-05-28 20:15
 * @time: 20:15
 **/
public class BSTree {
    public static class Node {
        public int val;
        public Node left;
        public Node right;

        public Node(int val) {
            this.val = val;
        }
    }
    public Node root = null;

    //插入元素
    public boolean insert(int val) {
        Node node = new Node(val);
        if(root == null) {
            root = node;
            return true;
        }

        Node cur = root;
        Node parent = null;

        while (cur != null) {
            if (cur.val == val) {
                return false;
            }else if(cur.val < val) {
                parent = cur;
                cur = cur.right;
            }else {
                parent = parent;
                cur = cur.left;
            }
        }
        //cur为空  位置找到  进行插入
        //两种情况-》
        if(val > parent.val) {
            parent.right = node;
        }
        if(val < parent.val) {
            parent.left = node;
        }
        return true;
    }


    //查找元素
    public Node search(int val) {
        Node cur = root;
        while (cur != null) {
            if(cur.val == val ) {
                return cur;
            }else if(cur.val < val) {
                cur = cur.right;
            }else {
                cur = cur.left;
            }
        }
        return null;
    }


    //前序遍历
    public void preOrder (Node root) {
        if(root == null) return;
        System.out.println(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }


    //中序遍历
    public void inOrder (Node root) {
        if(root == null) {
            return;
        }
        inOrder(root.left);
        System.out.println(root.val);
        inOrder(root.right);
    }


    //删除元素
    public boolean remove(int key) {
        Node cur = root;
        Node partent = null;
        while (cur != null) {
            if(cur.val == key) {
                removeNode(partent,cur);
                return true;
            }else if(key > cur.val){
                cur = cur.right;
            }else {
                cur = cur.left;
            }
        }
        return false;
    }
    public void removeNode(Node parent,Node cur) {
        if(cur.left == null){
            if(cur == root) {
                root = root.right;
            }else if(cur == parent.left) {
                parent.left = cur.right;
            }else {
                parent.right = cur.right;
            }
        }else if(cur.right == null){
            if(cur == root) {
                root = cur.left;
            }else if(cur == parent.left) {
                parent.left = cur.left;
            }else {
                parent.right = cur.left;
            }
        }else {
            Node targetPartent = cur;
            Node target = cur.right;
            while (target.left != null) {
                targetPartent = target;
                target = target.left;
            }
            cur.val = target.val;
            if(target == targetPartent.left) {
                targetPartent.left = target.right;
            }else {
                targetPartent.right = target.right;
            }
        }
    }
}

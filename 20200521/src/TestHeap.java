import java.util.Arrays;

/**
 * Created with Intellij IDEA
 *
 * @program: 20200521
 * @Description:
 * 堆（优先级队列）
 * @USer:LD
 * @Date: 2020-05-21 18:49
 * @time: 18:49
 **/
public class TestHeap {

    public int[] elem;
    public int usedSize;

    public TestHeap() {
        this.elem = new int[10];
    }

    /**
     *
     * @param root 每棵子树的开始位置
     * @param len  结束位置
     */
    public void adjustDown(int root,int len) {
        int parent = root;
        int child = 2*parent+1;
        while (child < len) {
            //0、判断是否有左右孩子  有的话 找到最大值 C下标表示最大值下标
            if(child + 1 < len && this.elem[child] < this.elem[child+ 1]) {
                child++;
            }
            //代码指向到这里，c表示最大值下标
            if(this.elem[child] > this.elem[parent]) {
                //交换
                int tmp = this.elem[child];
                this.elem[child] = this.elem[parent];
                this.elem[parent] = tmp;
                parent = child;
                child = 2*parent + 1;
            }else {
                break;
            }
        }

    }

    public void createHeap(int[] array) {
        for (int i = 0; i < array.length; i++) {
            this.elem[i] = array[i];
            this.usedSize++;
        }
        //i：每棵子树的根节点下标
        for (int i = (this.usedSize-1-1)/2; i >= 0 ; i--) {
            adjustDown(i,this.usedSize);
        }
    }

    //添加元素
    public void push(int val) {
        //0、堆是否是满的--》扩容
        if(isFull()) {
            this.elem = Arrays.copyOf(this.elem,2*this.elem.length);
        }
        //1、放到数组的最后一个位置
        this.elem[this.usedSize] = val;
        this.usedSize++;
        //2、进行调整
        adjustUp(this.usedSize-1);
    }
    public void adjustUp(int child) {
        int parent = (child-1)/2;
        while (child > 0) {
            if(this.elem[child] > this.elem[parent]) {
                int tmp = this.elem[child];
                this.elem[child] = this.elem[parent];
                this.elem[parent] = tmp;
                child = parent;
                parent = (child - 1)/2;
            } else {
                break;
            }
        }
    }
    public boolean isFull() {
        return this.usedSize == this.elem.length;
    }


    //删除元素
    public void pop() {
        if(this.usedSize == 0) {
            return;
        }
        int tmp = this.elem[0];
        this.elem[0] = this.elem[this.usedSize-1];
        this.elem[this.usedSize-1] = tmp;
        this.usedSize--;
        adjustDown( this.elem[0],this.usedSize);
    }
    //判断是否为空
    public boolean isEmpty() {
        return this.usedSize == 0;
    }


    //查看优先级最高的元素
    public int peek() {
        if(isEmpty()) {
            return -1;
        }
        return this.elem[0];
    }


    //堆排序：时间复杂度O(N*logN)
    public void heapSort() {
        int end = this.usedSize-1;
        while (end > 0) {
            int tmp = this.elem[0];
            this.elem[0] = this.elem[end];
            this.elem[end] = tmp;
            adjustDown(0,end);
            end--;        }
    }

    public void show() {
        for(int i = 0; i < this.usedSize;i++) {
            System.out.print(this.elem[i] + " ");
        }
        System.out.println();
    }
}

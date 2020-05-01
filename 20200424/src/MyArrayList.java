import java.util.Arrays;

/**
 * Created with Intellij IDEA
 *
 * @program: 20200424
 * @Description:
 * @USer:LD
 * @Date: 2020-05-01 14:28
 * @time: 14:28
 **/
public class MyArrayList {
    public int[] elem;//数组
    public int usedSize;// 有效数据个数  不初始化默认值也是0

    public MyArrayList() {
        this.elem = new int[10];
        this.usedSize = 0;
    }


    // 打印顺序表
    public void display() {
        for(int i = 0;i < this.usedSize;i++) {
            System.out.print(this.elem[i] + " ");
        }
        System.out.println();
    }


    // 在 pos 位置新增元素
    public void add(int pos, int data) {
        //检验插入位置的合法性
        checkPos(pos);
        //检验数组是否已满  如果满了需要扩容
        if(isFull()) {
            this.elem = Arrays.copyOf(this.elem,2*this.elem.length);
        }
        //插入数据
        for(int i = this.usedSize-1; i >=pos;i--) {
            this.elem[i+1] = this.elem[i];
        }
        this.elem[pos] = data;
        this.usedSize++;
    }
    private void checkPos(int pos) {
        if(pos < 0 || pos >this.usedSize) {
            throw new RuntimeException("pos位置不合法！");
        }
    }
    private boolean isFull() {
        if(this.usedSize == this.elem.length) {
            return true;
        }
        return false;
    }



    // 判定是否包含某个元素
    public boolean contains(int toFind) {
        for(int i = 0;i < this.usedSize;i++) {
            if(this.elem[i] == toFind) {
                return true;
            }
        }
        return false;
    }


    // 查找某个元素对应的位置
    public int search(int toFind) {
        for(int i = 0;i < this.usedSize; i++) {
            if(this.elem[i] == toFind) {
                return i;
            }
        }
        return -1;
    }



    // 获取 pos 位置的元素
    public int getPos(int pos) {
        if(isEmpty()) {
            throw new RuntimeException("顺序表为空");
        }
        checkPos(pos);
        return this.elem[pos];
    }
    private boolean isEmpty() {
        if(this.usedSize == 0) {
            return true;
        }
        return false;
    }



    // 给 pos 位置的元素设为 value
    public void setPos(int pos, int value) {
        if(isEmpty()) {
            throw new RuntimeException("顺序表为空");
        }
        checkPos(pos);
        this.elem[pos] =value;
    }


    //删除第一次出现的关键字key
    public void remove(int toRemove) {
        int ret = search(toRemove);
        if(ret == -1) {
            System.out.println("没有要删除的元素");
            return;
        }
        for(int i = ret; i < this.usedSize-1; i++) {
            this.elem[i] = this.elem[i+1];
        }
        this.usedSize--;
    }


    // 获取顺序表长度
    public int size() {
        return this.usedSize;
    }


    // 清空顺序表
    public void clear() {
        this.usedSize = 0;
    }

}

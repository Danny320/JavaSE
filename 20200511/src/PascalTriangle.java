import java.util.ArrayList;
import java.util.List;

/**
 * Created with Intellij IDEA
 *
 * @program: 20200511
 * @Description:杨辉三角
 * @USer:LD
 * @Date: 2020-05-12 14:47
 * @time: 14:47
 **/
public class PascalTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ret = new ArrayList<>();
        if(numRows == 0) {
            return ret;//当numRows为0时返回空
        }
        List<Integer> oneRow = new ArrayList<>();//第一行
        ret.add(oneRow);//添加第一行
        ret.get(0).add(1);//添加第一行元素1
        //直接从第二行开始计算
        for(int i = 1; i < numRows; i++) {
            List<Integer> curRow = new ArrayList<>();
            curRow.add(1);//当前行的第一个元素
            List<Integer> prevRow = ret.get(i-1);//前一行
            for(int j = 1; j < i; j++) {
                int x = prevRow.get(j);
                int y = prevRow.get(j-1);
                curRow.add(x+y);
            }
            curRow.add(1);//最后一个元素
            ret.add(curRow);
        }
        return ret;
    }
    public static void main(String[] args) {
        List<List<Integer>> lists = generate(5);
        for (int i = 0;i < lists.size();i++) {
            for (int j = 0;j < lists.get(i).size();j++) {
                System.out.print(lists.get(i).get(j));
            }
            System.out.println();
        }
    }
}

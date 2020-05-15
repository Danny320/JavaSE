import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created with Intellij IDEA
 *
 * @program: 20200512
 * @Description:
 * 员工的重要性
 * @USer:LD
 * @Date: 2020-05-15 09:46
 * @time: 09:46
 **/
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
class Solution {
    public int getImportance(List<Employee> employees, int id) {
        if(employees.size() == 0) {
            return 0;
        }
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(id);
        int result = 0;
        while(!(queue.size() == 0)) {
            int tmp = queue.poll();
            for (Employee e:employees) {
                if(tmp == e.id) {
                    result += e.importance;
                    for (int i:e.subordinates) {
                        queue.add(i);
                    }
                }
            }
        }
        return result;
    }
}
public class TestDemo2 {


}

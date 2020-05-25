import java.util.Comparator;

/**
 * Created with Intellij IDEA
 *
 * @program: 20200522
 * @Description:
 * @USer:LD
 * @Date: 2020-05-25 23:16
 * @time: 23:16
 **/
public class ScoreComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        //从小到大排序
        return o1.score-o2.score;
    }
}

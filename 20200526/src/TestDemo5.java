import java.util.Arrays;

/**
 * Created with Intellij IDEA
 *
 * @program: 20200526
 * @Description:
 * @USer:LD
 * @Date: 2020-05-26 22:25
 * @time: 22:25
 **/
class Solution {
    public int compareVersion(String version1, String version2) {
      String[] s1 = version1.split(".");
      String[] s2 = version2.split(".");
      int len1 = s1.length;
      int len2 = s2.length;
      if(len1 < len2) {
          s1 = Arrays.copyOf(s1,s2.length);
          for(int i = 0; i < s1.length; i++) {
              if(s1[i] == null) {
                  s1[i] = "0";
              }
          }
      }
        if(len1 > len2) {
            s2 = Arrays.copyOf(s2,s1.length);
            for(int i = 0; i < s2.length; i++) {
                if(s2[i] == null) {
                    s2[i] = "0";
                }
            }
        }
        for(int i = 0; i < s1.length; i++) {

            if (s1[i].compareTo(s2[i]) > 0) {
                return 1;
            }
            if (s1[i].compareTo(s2[i]) < 0) {
                return -1;
            }
        }
        System.out.println(s1.toString());
        System.out.println(s2.toString());

        return 0;
    }
}
public class TestDemo5 {
    public static void main(String[] args) {
        String s1 = "1.2.4";
        String s2 = "1.3";
        Solution solution = new Solution();
       System.out.println( solution.compareVersion(s1,s2));
    }

}

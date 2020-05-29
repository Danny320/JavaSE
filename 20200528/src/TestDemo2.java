import java.util.HashMap;

/**
 * Created with Intellij IDEA
 *
 * @program: 20200528
 * @Description:
 * @USer:LD
 * @Date: 2020-05-29 15:41
 * @time: 15:41
 **/
class Solution1 {
    public void sortColors(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length-1-i;j++) {
                if(nums[j] > nums[j+1]) {
                    int tmp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = tmp;
                }
            }
        }
    }
    public boolean isIsomorphic1(String s, String t) {
        return isIsomorphic(s,t)&&isIsomorphic(t,s);
    }
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            char s1 = s.charAt(i);
            char t1 = t.charAt(i);
            if(map.containsKey(s1)) {
                if(map.get(s1) != t1) {
                    return false;
                }
            }else {
                map.put(s1,t1);
            }
        }
        return true;
    }



    public int[] intersect(int[] nums1, int[] nums2) {

    }
}
public class TestDemo2 {

}

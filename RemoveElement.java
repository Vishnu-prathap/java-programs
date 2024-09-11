
import java.util.ArrayList;
// import java.util.List;

public class RemoveElement {

    public static int RemoveElement(int[] nums, int val) {
        ArrayList<Integer> lst = new ArrayList<>();
        for (int num : nums) {
            lst.add(num);
        }
        lst.removeIf(num -> num == val);
        nums = lst.stream().mapToInt(Integer::intValue).toArray();
        return nums.length;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3, 5, 5, 5, 3, 6};
        int val = 3;
        int length = RemoveElement(nums, val);
        System.out.println(length);
    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by sunline on 2016/8/12.
 */
public class UserPass {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            String str = getString();
            System.out.println(str);
        }
    }

    private static String getString() {
        List<Character> chars = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            int temp = 97+i;
            chars.add((char) temp);
            //System.out.println(chars[i]);
        }
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            nums.add(i);
        }
        Collections.shuffle(chars);
        Collections.shuffle(nums);
        Random random = new Random();
        String str = "";
        for (int i = 0; i < 4; i++) {
            str += chars.get(random.nextInt(26));
        }
        for (int i = 0; i < 6; i++) {
            str += nums.get(random.nextInt(10));
        }
        return str;
    }
}
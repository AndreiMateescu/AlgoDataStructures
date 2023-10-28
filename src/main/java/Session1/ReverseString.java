package Session1;

import java.util.Arrays;

public class ReverseString {
    public static void reverseString() {
        char[] s1 = {'h', 'e', 'l', 'l', 'o'};

        int j = s1.length - 1;

        StringBuilder myStr = new StringBuilder();
        while (j >= 0) {
            myStr.append(s1[j]);
            j--;
        }
        System.out.println(myStr);

//        StringBuilder str = new StringBuilder(Arrays.toString(s1)).reverse();
//        System.out.println(str);
    }

    public static void reverse(char[] s) {
        int i = 0;
        int j = s.length - 1;
        while (i < j) {
            char tmp = s[i];
            s[i] = s[j];
            s[j] = tmp;
            i++;
            j--;
        }
    }
}

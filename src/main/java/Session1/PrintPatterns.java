package Session1;

import java.util.ArrayList;
import java.util.List;

public class PrintPatterns {
    public static void trianglePattern1(int rows) {
        int count=0;
        for(int i=0; i<rows; i++) {
            for(int j=0; j<=i; j++) {
                count++;
                System.out.print(count + " ");
            }
            System.out.println();
        }
    }

    public static void printPascalTriangle(int rows) {
        List<List<Integer>> pattern = new ArrayList<>();
        List<Integer> first = new ArrayList<>();
        first.add(1);
        pattern.add(first);
        for (int i = 1; i <= rows; i++) {
            List<Integer> previous = pattern.get(i-1);
            List<Integer> current = new ArrayList<>();
            current.add(1);
            for (int j = 1; j < i; j++) {
                current.add(previous.get(j-1) + previous.get(j));
            }
            current.add(1);
            pattern.add(current);
        }

        for (int i=0; i < pattern.size(); i++) {
            for (int j=rows-i; j>1; j--) {
                System.out.print(" ");
            }
            for (Integer l : pattern.get(i)) {
                System.out.print(l + " ");
            }
            System.out.println();
        }
    }

    public static void trianglePattern2(int rows) {
        int count = 0;
        for (int i=0; i<rows; i++) {
            for (int j=rows-i; j>1; j--) {
                System.out.print(" ");
            }
            for (int j=0; j<=i; j++ ) {
                count++;
                System.out.print(count + " ");
            }
            System.out.println();
        }
    }


}

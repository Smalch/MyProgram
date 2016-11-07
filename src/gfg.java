import java.io.PrintStream;
import java.util.Scanner;

/**
 * Created by student1 on 07.10.16.
 */

import java.io.PrintStream;
import java.util.Scanner;

    public class gfg {
        public static Scanner in = new Scanner(System.in);
        public static PrintStream out = System.out;

        public static void main(String[] args) {

            int n = in.nextInt();
            int m = 444;
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] =m;
                m=m+3;

            }
            for (int i = 0; i < n; i++) {
                System.out.print(a[i]+" ");
            }
        }
    }

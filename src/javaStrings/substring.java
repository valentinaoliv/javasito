package javaStrings;
import java.util.*;

public class substring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();


        String rta = S.substring(start, end);

        System.out.println(rta);

        in.close();

    }

}
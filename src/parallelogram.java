import java.util.*;

public class parallelogram {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int b = sc.nextInt();
            int h = sc.nextInt();

            if (b > 0 && h > 0) {
                if (b <= 100 && h <= 100) {
                    int area = b * h;
                    System.out.println(area);
                }
            } else {
                throw new Exception("java.lang.Exception: Breadth and height must be positive");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    }


import java.util.Scanner;

public class javaEOF {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int j = 1;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(j + " " + line);
                j++;
            }
        }
    }
}

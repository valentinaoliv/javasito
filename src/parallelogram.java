import java.util.*;
public class parallelogram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int h =sc.nextInt();

        if(b>0 && h>0){
            if(b <= 100 && h <= 100){
                int area=b*h;
                System.out.println(area);
            }
        }else{
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        sc.close();
    }
    }
}

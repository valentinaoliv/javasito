package javaStrings;

import java.util.*;

public class intro {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A = "manzana";
        String B = "banana";


        int sum = A.length()+B.length();
        /*Suma las longitudes de ambas palabras*/
        System.out.println(sum);

        //el compareTo() Si comparacion < 0, significa que A va antes que B en el orden lexicográfico.
        int comp = A.compareTo(B);
        if(comp > 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
       /*El subString () hace que (a,b) a es el indice de donde toma la letra o letras y b desde que indice eja de tomar*/
        //en este caso tome la primera letra y el otro es para mayus
        String Amayus = A.substring(0,1).toUpperCase()+A.substring(1);
        String Bmayus = B.substring(0,1).toUpperCase()+B.substring(1);



        System.out.println(Amayus+" "+Bmayus);

        sc.close();
    }

}

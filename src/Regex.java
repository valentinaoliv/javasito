
import java.util.Scanner;

class desarrollo{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new Regex().pattern));
        }

    }
}

class Regex{



    String re = "([01]?\\d\\d?|2[0-4]\\d|25[0-5])";

    // El patrón de la expresión regular para validar una dirección IP
    // está compuesto por cuatro segmentos de números separados por puntos.
    // Cada segmento se valida utilizando el siguiente patrón:
    //   - El patrón "(?:[01]?\\d\\d?|2[0-4]\\d|25[0-5])" valida los números del 0 al 199,
    //     los números del 200 al 249 y los números del 250 al 255.
    //     Explicado de izquierda a derecha:
    //       - El grupo de no captura "(?:...)" indica que se trata de un grupo de no captura.
    //         Esto significa que no se almacena en una variable de captura.
    //       - "[01]?" indica que puede haber un dígito 0 o 1 opcionalmente.
    //       - "\\d\\d?" indica que se esperan dos dígitos (números del 0 al 9).
    //         El último "?" indica que el último dígito es opcional, permitiendo que el número sea de uno o dos dígitos.
    //       - "2[0-4]\\d" indica que el número debe comenzar con el dígito 2,
    //         seguido de un dígito que puede ser cualquier número del 0 al 4,
    //         y luego cualquier dígito del 0 al 9.
    //       - "25[0-5]" indica que el número debe comenzar con los dígitos 25,
    //         seguido de un dígito que puede ser cualquier número del 0 al 5.
    //   - Los segmentos de la dirección IP están separados por el carácter punto literal ("\\.").

    public String pattern = re + "\\." + re + "\\." + re + "\\." + re;

    //ALTERNATIVE SOLUTION  String re =  "([0-9]|[0-9][0-9]|(0|1)[0-9][0-9]|2[0-4][0-9]|25[0-5])";
    //    public String pattern = re+"."+re+"."+re+"."+re;

}
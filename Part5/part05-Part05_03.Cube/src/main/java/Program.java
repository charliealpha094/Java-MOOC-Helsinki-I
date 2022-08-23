
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cube edificioTransparente = new Cube(14);
        System.out.println(edificioTransparente.volume());
        System.out.println(edificioTransparente);
        
        System.out.println();
        
        Cube salt = new Cube(2);
        System.out.println(salt.volume());
        System.out.println(salt);
    }
}

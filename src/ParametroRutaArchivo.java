import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ParametroRutaArchivo {
    public static void main(String[] args) throws IOException {
        int resultado = 0;
        Path rutaArchivo = Paths.get(args[0]);
        Scanner scn = new Scanner(System.in);
        System.out.println("Ingresar * o + si quiere sumar o multiplicar los números:");
        String operador = scn.nextLine();

            if(operador.charAt(0) == '+'){
                for(String num : Files.readAllLines(rutaArchivo)){
            resultado = resultado + Integer.parseInt(num.trim());
                }
            } else

            if(operador.charAt(0) == '*') {
                resultado = 1;
                for (String num : Files.readAllLines(rutaArchivo)) {
                    resultado = resultado * Integer.parseInt(num.trim());
                }
            }
        System.out.println("El resultado es: " + resultado);




    }
}

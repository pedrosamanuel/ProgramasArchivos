/*El programa recibe los archivos de entrada y salida por comando, luego se elige si se quiere decodificar o codificar
y el numero del desplazo por consola. Si quiere codificar el mensaje tiene que estar en el archivo de entrada
si  quiere decodificar el encriptado debe estar en el archivo de salida.
Solo se puede realizar de una frase o texto a la vez. Luego de codificar o decodificar el programa vacia el archivo
que contenga el mensaje o el codificado.
 */


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class CifradoCesar {
    public static void main(String[] args) throws IOException {
        Scanner scn = new Scanner(System.in);
        Path rutaEntrada = Paths.get(args[0]);
        Path rutaSalida = Paths.get(args[1]);

        System.out.println("Ingrese c (codificación) o d (decodificación): ");
        String control = scn.nextLine();
        System.out.println("Ingrese el valor del desplazo: ");
        int desplazo = scn.nextInt();


        if (control.charAt(0) == 'c') {
            String mensaje = Files.readString(rutaEntrada);
            String codificado = "";
            for (int i = 0; i < mensaje.length(); i++) {
                int valorAscii = mensaje.charAt(i);
                codificado = codificado + (char) (valorAscii + desplazo);
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter(args[0]));
            bw.write("");
            bw.close();
            Files.writeString(rutaSalida, codificado);
        }

        if (control.charAt(0) == 'd') {
            String mensaje = "";
            String codificado = Files.readString(rutaSalida);
            for (int i = 0; i < codificado.length(); i++) {
                int valorAscii = codificado.charAt(i);
                mensaje = mensaje + (char) (valorAscii - desplazo);
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter(args[1]));
            bw.write("");
            bw.close();
            Files.writeString(rutaEntrada, mensaje);

        }

    }

}

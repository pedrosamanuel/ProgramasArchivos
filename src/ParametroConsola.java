//metodo que ordena los numeros ingresados por consola
import java.util.Scanner;
public class ParametroConsola {
    public static void main(String[] args) {
        consola();
    }
    public static void consola(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Ingrese d (descendente) o a (ascendente): ");
        String letra = scn.nextLine();
        System.out.println("Ingrese 3 números :");
        int[] numeros = new int[3];
        for(int i = 0;i < numeros.length;i++){
            numeros[i] = scn.nextInt();
        }

        int aux;
        if (letra.charAt(0) == 'a'){
            for(int i = 0;i < numeros.length;i++){
                for (int j = 0;j < numeros.length-1;j++){
                    if(numeros[j]>numeros[j+1]){
                        aux = numeros[j];
                        numeros[j] = numeros[j+1];
                        numeros[j+1] = aux;
                    }
                }
            }
            for (int n : numeros) {
                System.out.println(n);
            }
        }
        if (letra.charAt(0) == 'd') {
            for (int i = 0; i < numeros.length; i++) {
                for (int j = 0; j < numeros.length - 1; j++) {
                    if (numeros[j] < numeros[j + 1]) {
                        aux = numeros[j];
                        numeros[j] = numeros[j + 1];
                        numeros[j + 1] = aux;
                    }
                }
            }
            for (int n : numeros) {
                System.out.println(n);
            }
        }
    }
}

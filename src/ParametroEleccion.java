//Realiza ParametroComando si se ingresan o ParametroConsola de lo contrario
public class ParametroEleccion {
    public static void main(String[] args) {
        if (args.length == 0) {
            ParametroConsola.consola();
        } else {
            String aux;
            if (args[0].charAt(0) == 'a') {
                for (int i = 1; i < args.length; i++) {
                    for (int j = 1; j < args.length - 1; j++) {
                        if (Integer.parseInt(args[j]) > Integer.parseInt(args[j + 1])) {
                            aux = args[j];
                            args[j] = args[j + 1];
                            args[j + 1] = aux;
                        }
                    }
                }
                for (String arg : args) {
                    System.out.println(arg);
                }
            }
            if (args[0].charAt(0) == 'd') {
                for (int i = 1; i < args.length; i++) {
                    for (int j = 1; j < args.length - 1; j++) {
                        if (Integer.parseInt(args[j]) < Integer.parseInt(args[j + 1])) {
                            aux = args[j];
                            args[j] = args[j + 1];
                            args[j + 1] = aux;
                        }
                    }
                }
                for (String arg : args) {
                    System.out.println(arg);
                }
            }
        }
    }
}

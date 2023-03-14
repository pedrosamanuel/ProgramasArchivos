// pasar por comando d (descendente) o a (ascendente) y luego numeros para ser ordenados
public class ParametroComando {
    public static void main(String[] args) {
        String aux;
        if (args[0].charAt(0) == 'a'){
            for(int i = 1;i < args.length;i++){
                for (int j = 1;j < args.length-1;j++){
                    if(Integer.parseInt(args[j])>Integer.parseInt(args[j+1])){
                          aux = args[j];
                          args[j] = args[j+1];
                          args[j+1] = aux;
                    }
                }
            }
            for (String arg : args) {
                System.out.println(arg);
            }
        }
        if (args[0].charAt(0) == 'd'){
            for(int i = 1;i < args.length;i++){
                for (int j = 1;j < args.length-1;j++){
                    if(Integer.parseInt(args[j])<Integer.parseInt(args[j+1])){
                        aux = args[j];
                        args[j] = args[j+1];
                        args[j+1] = aux;
                    }
                }
            }
            for (String arg : args) {
                System.out.println(arg);
            }
        }

    }
}

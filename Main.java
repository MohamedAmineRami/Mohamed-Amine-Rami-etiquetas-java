public class Main {
    public static void main(String[] args) {
        if (args.length == 1) {
                    int caras = Integer.parseInt(args[0]);
                    int resultado = (int) (Math.random() * caras) + 1;
                    System.out.println("Resultado del dado: " + resultado);
            }else if (args.length == 2) {
                    int caras = Integer.parseInt(args[0]);
                    int numeroDeDados = Integer.parseInt(args[1]);
                    System.out.println("Resultados de los dados:");
                    for (int i = 0; i < numeroDeDados; i++) {
                        int resultado = (int) (Math.random() * caras) + 1;
                        System.out.println("Dado " + (i + 1) + ": " + resultado);
                    }
            }
    }
}

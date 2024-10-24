public class Main {
    public static void main(String[] args) {
        if (args.length == 1) {
                    int caras = Integer.parseInt(args[0]);
                    int resultado = (int) (Math.random() * caras) + 1;
                    System.out.println("Resultado del dado: " + resultado);
            }
    }
}

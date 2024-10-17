public class Main {
    public static void main(String[] args) {
        try {
            if (args.length == 0) {
                System.out.println("No hay argumentos");
            } else {
                System.out.println("Hay " + args.length + " argumentos");
            }

            for (int i = 0; i < args.length; i++) { 
                System.out.println(args[i]);
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}

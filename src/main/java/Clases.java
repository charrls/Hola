public class Clases {

    public static void main(String[] args) {
        //prueba   s
        if (args.length == 0){
            System.out.println("Faltan argumentos");
            System.exit(1);
        }
        int suma = 0;
        int media = 0;
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        for (int i = 0; i < args.length; i++){
            int x = 0;

            try{
                x = Integer.parseInt(args[i]);
            }catch (NumberFormatException ex){
                System.out.println("Error en formato de numeros");
                System.exit(2);
            }

            min = Math.min(min, x);
            max = Math.max(min, x);
            suma = suma + x;
        }
        System.out.println("Suma = " + suma);
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
        System.out.println("Media = " + (suma / args.length));


    }
}

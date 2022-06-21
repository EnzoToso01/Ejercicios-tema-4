public class Main {
    public static void main(String[] args) {

        //if
        int numeroif = 5;
        if (numeroif == 0) {
            System.out.println("El numero es 0");
        } else if (numeroif < 0) {
            System.out.println("El numero es negativo");
        } else {
            System.out.println("El numero es positivo");
        }

        //while
        int numerowhile = 0;
        while (numerowhile < 3) {
            System.out.println(numerowhile);
            numerowhile++;

        }

        //do while
        int numerodowhile = 3;
        do {
            System.out.println(numerodowhile);
            numerodowhile++;

        } while (numerodowhile < 3);

        //for
        int numerofor;
        for (numerofor = 0; numerofor <= 3; numerofor++) {

            System.out.println(numerofor);

        }

        //switch
        String estacion = "Verano";

        switch (estacion) {

            case "Verano": {
                System.out.println("La estacion es Verano");
                break;
            }
            case "Invierno": {
                System.out.println("La estacion es Invierno");
                break;
            }
            case "Otoño": {
                System.out.println("La estacion es Otoño");
                break;
            }
            case "primavera": {
                System.out.println("La estacion es Primavera");
                break;
            }
            default: {
                System.out.println("La variable no es una estacion");
                break;
            }
        }/**/

    }
}
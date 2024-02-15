import java.util.Scanner;

public class Manager{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ancho,altura, numerodeRectangulos, i;


        System.out.println("Ancho: ");
        ancho= sc.nextInt();
        System.out.println("Altura: ");
        altura= sc.nextInt();
        System.out.println("Numero de Rectangulos: ");
        numerodeRectangulos = sc.nextInt();
        
        for (i = 0; i < numerodeRectangulos; i++){
            rectangle(ancho, altura);
        
        }

        System.out.println(" \n");
    }

    static void rectangle(int z, int y) {

        String espacios = "";
        int i;

        for (i = 0; i < z; i++){
            System.out.print("*");
            if (i == z -1) {
                System.out.print("* \n");
            }
        }
        
        for (i=0; i < z -1; i++){
            espacios = espacios + " ";
        }
        
        for (i = 0; i < y; i++) {
            System.out.println("*" + espacios + "*");
        }

        for (i = 0; i < z; i++){
            System.out.print("*");
            if (i == z -1) {
                System.out.print("* \n");
            }

    }


    }
}
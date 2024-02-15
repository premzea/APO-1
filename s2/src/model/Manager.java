import java.util.Scanner;

public class Manager{

    public static void main(String[] x){
        int x1, x2, y1,y2;
        double  xMedio, yMedio, pendiente, intercepto;
        // String coordenada1, coordenada2; 

        Scanner sc= new Scanner(System.in);

        // System.out.println("Coordenada 1: ");
        // coordenada1 = sc.getString();
        // System.out.println("Coordenada 2: ");
        // coordenada2 = sc.getString();
        
        System.out.println("Coordenada x1: ");
        x1 = sc.nextInt();
        System.out.println("Coordenada x2: ");
        x2 = sc.nextInt();
        
        System.out.println("Coordenada y1: ");
        y1 = sc.nextInt();
        System.out.println("Coordenada y2: ");
        y2 = sc.nextInt();

        xMedio = (double) (x1 + x2)/2;

        yMedio = (double) (y1+y2)/2;

        System.out.println("El punto medio es (" + xMedio + ", " + yMedio + ")");

        pendiente = (double) (y2 - y1)/(x2 - x1);

        intercepto = y1- (pendiente * x1);
        
        String recta = "y = " + pendiente + "x + (" + intercepto + ")";
        
        System.out.println("La recta que representa el camino mas corto entre la coordenada 1 y la coordenada 2 es: " + recta);

    }
}
import java.util.Scanner; 

public class Manager{
    public static void main(String[] x){
        int x1, x2, y1,y2;

        Scanner sc= new Scanner(System.in);
        System.out.println("Coordenada x1: ");
        x1 = sc.nextInt();
        System.out.println("Coordenada x2: ");
        x2 = sc.nextInt();
        
        System.out.println("Coordenada y1: ");
        y1 = sc.nextInt();
        System.out.println("Coordenada y2: ");
        y2 = sc.nextInt();

        recta(x1,x2,y1, y2);


    }

    public static void recta(int x1,int x2,int y1,int y2){
        double  xMedio, yMedio, pendiente, intercepto;

        xMedio = (double) (x1 + x2)/2;

        yMedio = (double) (y1+y2)/2;

        System.out.println("El punto medio es (" + xMedio + ", " + yMedio + ")");

        pendiente = (double) (y2 - y1)/(x2 - x1);

        intercepto = y1- (pendiente * x1);
        
        String recta = "y = " + pendiente + "x + (" + intercepto + ")";
        
        System.out.println("La recta que representa el camino mas corto entre la coordenada 1 y la coordenada 2 es: " + recta);
    }

}

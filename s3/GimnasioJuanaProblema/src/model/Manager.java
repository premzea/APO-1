import java.util.Scanner;

public class Manager{
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] input){
        double alturaCliente;
        int pesoCliente, pesoIdeal, sesionesTotales, aproxsesionesPorKilo, kilosaPerder,sesionesporSemana;
         
        int caloriasQuemadasporSesion = 450;
        int caloriasporKiloGrasa = 3500;
        int minutosporSesion = 45;
    
        
        System.out.println("Calcula cuanto tiempo te tomara para llegar a tu peso ideal /n");
        System.out.println("Altura(m): ");
        alturaCliente= sc.nextDouble();
        System.out.println("Peso Actual: ");
        pesoCliente= sc.nextInt();
        System.out.println("Sesiones de aerobicos por semana: ");
        sesionesporSemana = sc.nextInt();
        
    
        int alturaClienteCm = (int)((alturaCliente - 1) * 100);
    
        pesoIdeal= alturaClienteCm - 10;
        kilosaPerder= pesoCliente - pesoIdeal;
        aproxsesionesPorKilo = Math.round(caloriasporKiloGrasa/ caloriasQuemadasporSesion);
        sesionesTotales= aproxsesionesPorKilo * kilosaPerder;
        int semanasResultantes= Math.round(sesionesTotales/sesionesporSemana);
        int meses= (int) semanasResultantes/4;

        
        System.out.println("Te demoraras " + semanasResultantes + " semanas llegando a tu peso ideal, o " + meses + " meses, haciendo " + sesionesporSemana + " sesiones de " + minutosporSesion + " minutos de ejercicios aerobicos por semana");
    }
    
}
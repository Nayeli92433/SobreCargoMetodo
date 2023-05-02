import java.util.Scanner;

public class Principal {
    Scanner scanner= new Scanner(System.in);
    Operaciones operacionesInt= new Operaciones();
    public void pedirDatos(){
        int resultado;
        System.out.println("--------------------------------------------------------");
        System.out.println("\tOperaciones basicas con sobre carga de metodos");
        System.out.println("--------------------------------------------------------");
        System.out.println("Ingrese dos datos eneteros para realizar las operaciones basicas");
        System.out.println("Valor1: ");
        int a= scanner.nextInt();
        System.out.println("Valor2: ");
        int b= scanner.nextInt();
        operacionesInt.operacionesInt(a,b);

        System.out.println("Ingrese dos datos double para realizar las operaciones basicas");
        System.out.println("Valor1: ");
        double c= scanner.nextDouble();
        System.out.println("Valor2: ");
        double d= scanner.nextDouble();
        operacionesInt.operacionesDouble(c,d);

        System.out.println("Ingrese dos datos float para realizar las operaciones basicas");
        System.out.println("Valor1: ");
        float e= scanner.nextFloat();
        System.out.println("Valor2: ");
        float f= scanner.nextFloat();
        operacionesInt.operacionesFloat(e,f);

        System.out.println("Ingrese dos caracteres para realizar las operaciones basicas");
        System.out.println("Valor1: ");
        char g=scanner.next().charAt(0);
        System.out.println("Valor2: ");
        char h=scanner.next().charAt(0);
        operacionesInt.operacionesChar(g,h);

    }


}

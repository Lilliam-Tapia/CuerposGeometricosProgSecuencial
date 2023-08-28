import java.util.Scanner;

public class Esfera{

    public static void main(String []args){
    Scanner lector = new Scanner(System.in);

    double radio,area,volumen;

    System.out.print("Ingrese el valor del radio: ");
    radio = lector.nextDouble();

    area = 4*Math.PI*(radio*radio);
    volumen = 4.0/3.0*Math.PI*(radio*radio*radio);

    System.out.println("El valor del area es: "+area+" m cuadrados");
    System.out.println("El valor del volumen es: "+volumen+" m cuadrados");
    
 }

}

    
import java.util.Scanner;

public class ZonaEsferica{

    public static void main(String []args){
    Scanner lector = new Scanner(System.in);

    double radioM,radio,altura;
    double area,volumen;

    System.out.print("Ingrese la altura: ");
    altura = lector.nextDouble();
    System.out.print("Ingrese el radio menor: ");
    radio = lector.nextDouble();
    System.out.print("Ingrese el radio: ");
    radioM = lector.nextDouble();
    
    area = 2*Math.PI*radioM*altura;
    volumen = Math.PI*altura*((altura*altura)+3*radioM+3*radio)/6;

    System.out.println("El area de la zona esferica es: "+area+" cm cuadradas");
    System.out.println("El volumen de la zona esferica es: "+volumen+" cm cuadradas");

    lector.close();

 }
}
import java.util.Scanner;

public class Ortoedro{

    public static void main(String [] args){
    Scanner lector = new Scanner(System.in);

     double a,b,c;
     double area,volumen,diagonal;

     System.out.print("Ingrese el valor de a: ");
     a =lector.nextDouble();
     System.out.print("Ingrese el valor de b: ");
     b =lector.nextDouble();
     System.out.print("Ingrese el valor de c: ");
     c =lector.nextDouble();

     area = 2*(a*b+a*c+b*c);
     diagonal = Math.sqrt((a*a)+(b*b)+(c*c));
     volumen = a*b*c;

     System.out.println("El valor del area es: "+area+" cm cuadrados");
     System.out.println("El valor del volumen es: "+volumen+" cm cuadrados");
     System.out.println("El valor de la diagonal es: "+diagonal+" cm cuadrados");
     
     lector.close();

 }

}
   
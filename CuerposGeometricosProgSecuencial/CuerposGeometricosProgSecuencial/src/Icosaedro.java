import java.math.BigDecimal;
import java.util.Scanner;

public class Icosaedro{
   
    public static void main(String []args){
        Scanner lector = new Scanner(System.in);

        int arista;
        double areaT,areaCara,volumen;

        System.out.print("Ingrese el valor de la arista: ");
        arista = lector.nextInt();

        areaT = (5*(arista*arista)*Math.sqrt(3));
        areaCara = areaT/20;
        volumen = ((5.0/12)*(3+ Math.sqrt(5)*arista*arista*arista));

        System.out.println("El valor del area Toltal es: "+areaT+" cm cuadrados");
        System.out.println("El valor del area de las caras es: "+areaCara+" cm cuadrados");
        System.out.println("El valor del volumen es: "+volumen+" cm cuadrados");  
  }
}
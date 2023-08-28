import java.util.Scanner;

public class Octaedro{

    public static void main(String []args){
    Scanner lector = new Scanner(System.in);
    
    int arista;
    double areaT,areaCara,volumen;

    System.out.print("Ingrese el valor de la arista: ");
    arista = lector.nextInt();
    
    areaT = (2*(arista*arista)*Math.sqrt(3));
    areaCara = areaT/8;
    volumen = Math.sqrt(2)/3*(arista*arista*arista);

     System.out.println("El valor del area Total es: "+areaT+ " cm cuadrados");
     System.out.println("El valor del area de la cara es: "+areaCara+" cm cuadrados");
     System.out.println("El valor del volumen es: "+volumen+" cm cuadrados");

     lector.close();
    }
}
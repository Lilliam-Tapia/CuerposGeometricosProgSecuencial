import java.util.Scanner;
 
public class Cono{

    public static void main(String[] args){
    Scanner lector = new Scanner(System.in);

    double areaBase, areaT,areaL,volumen;
    double altura, generatriz, radio, periBase;

     System.out.print("Ingrese la altura del cono: ");
     altura = lector.nextDouble();
     System.out.print("Ingrese el radio del cono:  ");
     radio = lector.nextDouble();
     
     periBase = (Math.PI*radio);
     generatriz = Math.sqrt((radio*radio)+(altura*altura));
     areaL = periBase*generatriz;
     areaBase = (Math.PI*(radio*radio));
     areaT = areaL + areaBase;
     volumen = areaBase*altura/3;
     

     System.out.println("El area lateral el cono es: "+areaL+" unidades cuadradas");
     System.out.println("El area total del cono es: "+areaT+" unidaes cuadradas");
     System.out.println("el volumen del cono es: "+volumen+ " unidades cuadradas");
     lector.close();
    }
}
import java.util.Scanner;

 public class Cubo {

     public static void main(String[] args) throws Exception {
     Scanner lector = new Scanner(System.in);

     double  altura, areaL, areaT, Vol;
     double perBase, areaBase,radio;
 
      System.out.print("Ingrese la altura del cono: ");
      altura = lector.nextDouble();
      System.out.print("Ingrese el radio del cono:  ");
      radio =  lector.nextDouble();

      perBase = 2*Math.PI*radio;
      areaL = perBase*altura;
      areaBase= Math.PI* (radio*radio);
      areaT = 2*Math.PI*radio*(altura + radio);
      Vol = areaBase*altura;
      System.out.println("El Area Lateral del cubo es: " + areaL + " unidades cuadradas");
      System.out.println("El Area Total del cubo es: " + areaT + " unidades cuadradas");
      System.out.println("El volumen del cubo es: " + Vol + " unidaes cuadradas");
      lector.close();


        }
      
    }
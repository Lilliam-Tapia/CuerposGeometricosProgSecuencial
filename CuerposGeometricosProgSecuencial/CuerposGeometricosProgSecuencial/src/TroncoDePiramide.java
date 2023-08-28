import java.util.Scanner;

public class TroncoDePiramide{

    public static void main(String [] args){
        Scanner lector = new Scanner(System.in);
      
        double areaL,areaT,PB,Pb;
        double a,AB,Ab,altura,volumen;
        double AM,Am,c;

        System.out.print("Ingrese la longitud de la arista mayor: ");
        AM= lector.nextDouble();
        System.out.print("Ingrese la longitud de la arista menor: ");
        Am = lector.nextDouble();
        System.out.print("Ingresa el valor de la altura: ");
        altura = lector.nextDouble();

        c= (AM-Am)/2;
        a = Math.sqrt((altura*altura)+(c*c));
        PB = AM*altura; 
        Pb = Am*altura;
        areaL = (PB+Pb)/2*a;
        AB = (AM*AM);
        Ab = (Am*Am);
        areaT= areaL+AB+Ab;
        volumen = 1.0/3*altura*(AB+Ab+Math.sqrt(AB*Ab));

        System.out.println("El area lateral es igual a: "+areaL+" cm cuadradas");
        System.out.println("El area total es igual a: "+areaT+" cm cuadradas");
        System.out.println("El volumen es igual a: "+volumen+" cm cuadradas");

       lector.close();

    }
}

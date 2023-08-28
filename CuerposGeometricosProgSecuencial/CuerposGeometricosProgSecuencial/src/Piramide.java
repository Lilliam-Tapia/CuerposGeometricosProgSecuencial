import java.util.Scanner;

public class Piramide{
 public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);

        int cantLados;
        double areaL, areaTotal, volumen,altura,apotemaPiramide;
        double periBase, Apotema, areaBase,longLados;

        System.out.print("Ingrese la altura de la pirámide: ");
        altura = lector.nextDouble();
        System.out.print("Ingrese la cantidad de lados de la pirámide: ");
        cantLados = lector.nextInt();
        System.out.print("Ingrese el apotema de la pirámide: ");
        apotemaPiramide = lector.nextDouble();
        System.out.print("Ingrese la Longitud de los lados : ");
        longLados = lector.nextDouble();
        System.out.print("Ingrese el apotema de la base: ");
        Apotema = lector.nextDouble();

        periBase = cantLados * longLados;
        apotemaPiramide = (Math.sqrt(altura*altura)+(Apotema*Apotema));
        areaL = (periBase*apotemaPiramide)/2;
        areaBase = periBase*2*(Apotema+apotemaPiramide);
        areaTotal = (areaL+areaBase);
        volumen = (areaBase+altura)/3;
        
       System.out.println("El area Lateral de la pirámide es: "+areaL+" unidades cuadradas");
       System.out.println("El area total de la pirámide es "+areaTotal+" unidades cuadrados");
       System.out.println("El volumen de la pirámide es: "+volumen+ " unidades cuadradas");

       lector.close();



    }

}
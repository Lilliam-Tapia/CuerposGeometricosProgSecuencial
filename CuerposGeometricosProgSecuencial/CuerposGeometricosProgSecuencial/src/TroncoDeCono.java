import java.util.Scanner;

public class TroncoDeCono{

    public static void main(String [] args){
    Scanner lector = new Scanner(System.in);

    double AreaL, areaT, volumen,areaB,areab;
    double altura,radio,radioM,generatriz;

    System.out.print("Ingrese la altura: ");
    altura = lector.nextDouble();
    System.out.print("Ingrese el radio menor: ");
    radio = lector.nextDouble();
    System.out.print("Ingrese el radio Mayor: ");
    radioM = lector.nextDouble();

    generatriz = Math.sqrt((altura*altura)+(radioM*radioM-radio*radio));
    AreaL = Math.PI*generatriz*(radioM+radio);
    areaB = Math.PI*radioM;
    areab = Math.PI*radio;
    areaT = AreaL + areaB+ areab;
    volumen = 1.0/3*Math.PI*altura*((radioM*radioM)+(radio*radio)+radioM*radio);


      System.out.println("El area lateral es: "+AreaL+" unidades cuadradas");
      System.out.println("El area total es: "+areaT+" unidades cuadradas");
      System.out.println("El volumen es: "+volumen+" unidades cuadradas");

      lector.close();
 
 }

}

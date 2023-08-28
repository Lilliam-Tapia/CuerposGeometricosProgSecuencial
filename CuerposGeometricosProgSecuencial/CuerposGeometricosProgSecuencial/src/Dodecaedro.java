import java.util.Scanner;

public class Dodecaedro{

    public static void main(String [] args){
    Scanner lector = new Scanner(System.in);
   
    int arista;
    double Apent,area,volumen,apotema;

    System.out.print("ingrese el valor de la arista: ");
    arista = lector.nextInt();

    double alfa = 36*(Math.PI/180);
    apotema = (arista/2*Math.tan(alfa));
    area = 3*(arista*arista)*Math.sqrt(25+10*Math.sqrt(5));
    Apent = 5/2*arista*apotema;
    volumen = 1.0/4*(15+7*Math.sqrt(5))*(arista*arista*arista);

    System.out.println("El area del Dodecaedro es: "+area+" cm cuadradas");
    System.out.println("El area de un pentagono del dodecaedro es: "+Apent+" cm cuadradas");
    System.out.println("El volumen del dodecaedro es: "+volumen+" cm cuadradas");

    lector.close();



    }
}
import java.util.Scanner;

public class Hexaedro{

    public static void main(String [] args) throws Exception{
    Scanner lector = new Scanner(System.in);

    int arista;
    double area,volumen, diagonal;

    System.out.print("Ingrese el valor de la arista: ");
    arista = lector.nextInt();

    area = (6*(arista*arista));
    volumen = (arista*arista*arista);
    diagonal = (arista*Math.sqrt(3));

    System.out.println("El area del hexaedro es: "+area); 
    System.out.println("El volumen del hexaedro es: "+volumen);
    System.out.println("La diagonal del hexaedro es: "+area);
    

    }


}

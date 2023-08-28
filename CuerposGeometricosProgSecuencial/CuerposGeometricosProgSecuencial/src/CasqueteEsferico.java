import java.util.Scanner;

public class CasqueteEsferico{

    public static void main(String [] args){
    Scanner lector = new Scanner(System.in);

   double area, volumen, volumenm;
   double radio,RadioM,altura,aream;
   
   System.out.print("Ingrese la altura: ");
   altura = lector.nextDouble();
   System.out.print("Ingrese el radio Mayor: ");
   RadioM = lector.nextDouble();
   System.out.print("Ingrese el radio menor: ");
   radio = lector.nextDouble();

    area = 2*Math.PI*RadioM*altura;
    aream = Math.PI*((radio*radio)+(altura*altura));
    volumen = Math.PI*(altura*altura)*(3*RadioM-altura)/3;
    volumenm = Math.PI*altura/6*(3*(radio*radio)+(altura*altura));

    System.out.println("Area en funcion del radio de la esfera: "+area);
    System.out.println("Area en funcion del radio menor: "+aream);
    System.out.println("volumen en funcion del radio de la esfera: "+volumen);
    System.out.println("Area en funcion del radio menor: "+volumenm);

    lector.close();




   
   


}

}
   
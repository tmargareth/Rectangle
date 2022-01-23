import java.util.Scanner;
import java.lang.*;

class Rectangle {
    public static void main (String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Ristküliku pikkus:");
        double length = s.nextDouble();
        System.out.println("Ristküliku laius:");
        double width = s.nextDouble();
        //Ümbermõõt
        double perimeter = 2*(length*width);
        //Diagonaal
        double diagonal = Math.sqrt((length * length) + (width * width));
        //Pindala
        double area = length*width;
        System.out.println("Ristküliku ümbermõõt: "+perimeter);
        System.out.println("Ristküliku diagonaal: "+diagonal);
        System.out.println("Ristküliku pindala: "+area);
    }
}
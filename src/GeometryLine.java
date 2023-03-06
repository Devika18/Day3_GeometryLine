import java.util.Scanner;

public class GeometryLine {
    public static void main (String[] args) {
        System.out.println("Welcome to Geometry Line Program");

        System.out.println("Enter the value of Co-ordinates x1, y1, x2, y2: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x1: ");
        int x1=sc.nextInt();
        System.out.println("Enter y1: ");
        int y1=sc.nextInt();
        System.out.println("Enter x2: ");
        int x2=sc.nextInt();
        System.out.println("Enter y2: ");
        int y2=sc.nextInt();
        double length = Math.sqrt((x2-x1)^2 + (y2-y1)^2);
        System.out.println("Length Of Line is:"+length);
    }
}

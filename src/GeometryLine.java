import java.util.Scanner;

public class GeometryLine {
    public static void main (String[] args) {
        System.out.println("Welcome to Geometry Line Program");

        System.out.println("Enter the value of Co-ordinates x1, y1, x2, y2: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x1: ");
        Integer x1=sc.nextInt();
        System.out.println("Enter y1: ");
        Integer y1=sc.nextInt();
        System.out.println("Enter x2: ");
        Integer x2=sc.nextInt();
        System.out.println("Enter y2: ");
        Integer y2=sc.nextInt();
        double length = Math.sqrt((x2-x1)^2 + (y2-y1)^2);
        System.out.println("Length Of Line is:"+length);

        System.out.println();
        System.out.println("The result of Equality is:\n ");
        boolean result1 = x1.equals(y1);
        System.out.println("Result of equals()="+result1);
        boolean result2 = x2.equals(y2);
        System.out.println("Result of equals()="+result2);

        System.out.println();
        System.out.println("The result of Comparison is:\n ");
        Integer res1 = Integer.compare(x1,y1);
        System.out.println("Result of compare(x1,y1)is:"+ res1);
        Integer res2 = Integer.compare(x2,y2);
        System.out.println("Result of compare(x2,y2)is:"+ res2);
    }
}

import java.util.Scanner;
public class CircleArea {
    public static void main (String[]args){
        Scanner input=new Scanner(System.in);
        int radius,centralAngle;
        double PI=3.14,area;
        System.out.print("Enter the radius of circle:");
        radius=input.nextInt();
        System.out.print("Enter the central angle of circle:");
        centralAngle=input.nextInt();
        area=(PI*(radius*radius)*centralAngle)/360;
        System.out.print("The area of a sector of circle: "+area);
    }
}

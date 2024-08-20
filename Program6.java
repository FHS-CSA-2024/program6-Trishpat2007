//import stuff here!
import java.util.Scanner;
//Your code here
class Program6{
    public static void main(String[] args){
        Scanner myScanner=new Scanner(System.in);
        
        double radius= 0.000;
        double pi= 3.14159;
        double diameter= 0.000;
        
        System.out.println("Enter Radius: ");
        radius= myScanner.nextDouble();
        System.out.println("The Radius of the circle = " + radius);
        
        diameter= radius*2.0;
        System.out.println("The Diameter of the circle = " +diameter);
        
        double area= pi*(radius*radius)*1000;
        area= (int)(area);
        area= (double)(area/1000)+0.001;
        System.out.println("The Area of the circle = "+ area);
        
        double circumference=(2*pi*radius)*1000;
        circumference= (int)(circumference);
        circumference= (double)(circumference/1000);
        System.out.println("The circumfrence of the circle = "+ circumference);
        
    }
}
//Paste console output below:
/*
Enter Radius: 
3.712
The Radius of the circle = 3.712
The Diameter of the circle =7.424
The Area of the circle = 43.288
The circumfrence of the circle = 23.323
*/

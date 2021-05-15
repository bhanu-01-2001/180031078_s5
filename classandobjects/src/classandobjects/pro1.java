package classandobjects;
import java.util.Scanner;
public class pro1 {

    double h,w,d;

     pro1(double width,double height,double depth)
    {
        h=height;
        w=width;
        d=depth;
    }
    double volume()
    { double v;
    v=h*w*d;
    return v;
    }
   
    public static void main(String[] args) {
       
    pro1 bc = new pro1(9.5,90.3,9.6);
    System.out.println(bc.volume());

    }

}
import java.util.Scanner;

class  Area {
    double length;
    double breadth;
    public void setDim(double l,double b){
        this.length=l;
        this.breadth=b;
    }
    public double getArea(){
        return length*breadth;
    }
}
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length");
        double length=sc.nextDouble();
        System.out.println("enter breadth");
        double breadth=sc.nextDouble();
        Area a=new Area();
        a.setDim(length, breadth);
        System.out.println(a.getArea());
}

}

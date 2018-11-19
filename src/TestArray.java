import java.util.ArrayList;

public class TestArray {
    public static void main(String[] args) {
        ArrayList points=new ArrayList(4);
        Point[] points2;
        Point p1=new Point(1,2);
        Point p2=new Point(2,3);
        points.add(p1);
        points.add(p2);
        System.out.println("Numero elementi array");
        System.out.println(points.size());
        //downcast per prendere un punto
        Point p3=(Point)points.get(0);
        System.out.println(p3.toString());
        System.out.println(points.indexOf(p2));
    }
}

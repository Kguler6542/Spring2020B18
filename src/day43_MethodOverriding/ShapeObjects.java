package day43_MethodOverriding;

public class ShapeObjects {

    public static void main(String[] args) {

        Circle circle1 = new Circle (3);

        System.out.println(circle1.radius);

        circle1.calculateArea(); // bug suppose to be : pi*r*r
        circle1.calculatePerimeter(); // bug :

        System.out.println("======================================================");

         Rectangle rec1 = new Rectangle(3,2);
        System.out.println(rec1.length);
        System.out.println(rec1.width);

        rec1.calculateArea(); // bug suppose :to be w*l
        rec1.calculatePerimeter(); // bug

        System.out.println("============================================");

        Square sg1 = new Square(3);
        System.out.println(sg1.side);

        sg1.calculateArea(); // bug suppose to be : side*side
        sg1.calculatePerimeter(); // bug

    }
}

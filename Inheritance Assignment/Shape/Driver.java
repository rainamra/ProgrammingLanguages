public class Driver
{
    public static void main(String[] args) {
        Shape s1 = new Shape();
        System.out.println(s1.toString());
        System.out.println(s1.getColor());

        Circle c1 = new Circle();
        System.out.println(c1.toString());
        System.out.println(c1.getArea());

        Rectangle r1 = new Rectangle(2,4);
        System.out.println(r1.toString());
        System.out.println(r1.getWidth());

        Square q1 = new Square(3,"red",true);
        System.out.println(q1.toString());
    }


}

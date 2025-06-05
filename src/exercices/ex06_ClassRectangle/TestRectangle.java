package exercices.ex06_ClassRectangle;

public class TestRectangle {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(8, 5);
        Rectangle r2 = new Rectangle(6, 6);     // carré

        r1.setLargeur(-10);
        r2.setLargeur(15);
        System.out.println(r1.toString());
        System.out.println(r2.toString());
    }
}

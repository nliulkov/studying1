package ua.nickl.firstRound;

public class first {

  public static void main(String[] args) {

    talk("Vasja");
    talk("Sashko");
    talk("Yuliia");

    Square s = new Square(5);
    System.out.println("Площадь квадрата со стороной " + s.l + " = " + kvadrat(s));

    Rectangle r = new Rectangle(7, 9);
    System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + premoj(r));

  }
    public static void talk(String g) {
    System.out.println("Hello, " + g + "!!!");
    }

    public static double kvadrat(Square s) {

     return s.l * s.l;
    }

    public static double premoj(Rectangle r) {
      return r.a * r.b;
    }
}

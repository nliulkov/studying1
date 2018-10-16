package ua.nickl.firstRound;

public class first {

  public static void main(String[] args) {

    talk("Vasja");
    talk("Sashko");
    talk("Yuliia");

    double a = 5;
    System.out.println("Площадь квадрата со стороной " + a + " = " + kvadrat(a));

    double storona1 = 7;
    double storona2 = 9;
    System.out.println("Площадь прямоугольника со сторонами " + storona1 + " и " + storona2 + " = " + premoj(storona1, storona2));

  }
    public static void talk(String g) {
    System.out.println("Hello, " + g + "!!!");
    }

    public static double kvadrat(double l) {

     return l * l;
    }

    public static double premoj(double a, double b) {
      return a * b;
    }
}

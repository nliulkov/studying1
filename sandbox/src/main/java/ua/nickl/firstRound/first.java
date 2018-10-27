package ua.nickl.firstRound;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;

public class first {

  public static void main(String[] args) {

    talk("Vasja");
    talk("Sashko");
    talk("Yuliia");

    Square s = new Square(5);
    System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.kvadrat());

    Rectangle r = new Rectangle(7, 9);
    System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.premoj());

    Triangle f = new Triangle(5, 6,10);
    System.out.println("Площадь треугольника со сторонами " + f.a + ", " + f.b + ", " + f.c + " = " + f.trykytnik());

  }
    public static void talk(String g) {
    System.out.println("Hello, " + g + "!!!");
    }


}

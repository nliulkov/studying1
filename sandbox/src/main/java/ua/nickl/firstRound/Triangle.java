package ua.nickl.firstRound;

public class Triangle {

  public double a;
  public double b;
  public double c;

 public Triangle(double a, double b, double c) {
  this.a = a;
  this.b = b;
  this.c = c;
}
  public double trykytnik() {
    return 0.25 * Math.sqrt((this.a+this.b+this.c)*(this.b+this.c-this.a)*(this.c+this.a-this.b)*(this.a+this.b-this.c));

  }

}

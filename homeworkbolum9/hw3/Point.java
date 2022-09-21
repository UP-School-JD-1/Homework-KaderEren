package homeworkbolum9.hw3;

import java.lang.Math;

public class Point {

  private double x;
  private double y;

  // Başlatma Bloğu

  {
    x = 7;
    y = 98;
  }

  public Point(double x, double y) {
    this.setX(x);
    this.setY(y);
  }

  public Point() {}

  // GETTER AND SETTER

  public double getY() {
    return y;
  }

  public void setY(double y) {
    this.y = y;
  }

  public double getX() {
    return x;
  }

  public void setX(double x) {
    this.x = x;
  }

  // Bir nesnenin başka bir point nesnesine olan uzaklığı.
  public double calculateDistance(double x2, double y2) {
    double distance;
    double temp = Math.pow((x - x2), 2) + Math.pow((y - y2), 2);
    distance = Math.pow(temp, 0.5);
    return distance;
  }

  // Bir nesnenin merkeze olan uzaklığını hesaplanması.
  public double distanceToCenter() {
    return calculateDistance(0, 0);
  }

  // metotla aynı koordinatlara sahip bir başka Point nesnesi oluşturup döndürmek.
  public Point clone() {
    return new Point(this.x, this.y);
  }

  // bu metot ile nesneyi, "x" ya da "y" yönünde belirtilen miktar kadar hareket
  // ettimek.
  public void move(double k, double m) {
    this.setX(getX() + k);
    this.setY(getY() + m);
  }

  public String coordinates() {
    return "(" + getX() + "," + getY() + ")";
  }
}

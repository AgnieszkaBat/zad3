public class Main {

  public static void main(String[] args) {
    Punkt punkt = new Punkt(3.5, 7.2);

    System.out.println("Współrzędne punktu: ");
    System.out.println("x = " + punkt.getX());
    System.out.println("y = " + punkt.getY());

    punkt.setX(10.5);
    punkt.setY(-2.3);

    System.out.println("\nWspółrzędne punktu po zmianie: ");
    System.out.println("x = " + punkt.getX());
    System.out.println("y = " + punkt.getY());
  }
}

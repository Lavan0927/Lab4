class QuadrilateralTest {
  public static void main(String[] args) {
    Quadrilateral quadrilateral = new Quadrilateral();
    Quadrilateral trapezoid = new Trapezoid();
    Quadrilateral parallelogram = new Parallelogram();
    Quadrilateral rectangle = new Rectangles();
    Quadrilateral square = new Square();
        
    System.out.println("Coordinates of Quadrilateral are:");
    quadrilateral.endPoints(1.1,1.2,6.6,2.8,6.2,9.9,2.2,7.4);
    System.out.println("Coordinates of Trapezoid are:");
    trapezoid.endPoints(0,0,10,0,8,5,3.3,5);
    System.out.println("Coordinates of Parallelogram are:");
    parallelogram.endPoints(5,5,11,5,12,20,6,20);
    System.out.println("Coordinates of Rectangle are:");
    rectangle.endPoints(17.0,14.0,30,14,30,28,17,28);
    System.out.println("Coordinates of Square are:");
    square.endPoints(4,0,8,0,8,4,4,4);
  }
}

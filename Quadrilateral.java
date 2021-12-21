class Quadrilateral {
	private double x1;
	private double y1;
	private double x2;
	private double y2;
	private double x3;
	private double y3;
	private double x4;
	private double y4;

  public void endPoints( double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4 ) {
    	this.x1 = x1;
	this.y1 = y1;
    	this.x2 = x2;
	this.y2 = y2;
    	this.x3 = x3;
	this.y3 = y3;
    	this.x4 = x4;
	this.y4 = y4;

        System.out.println( "(" + x1 + "," + y1 + ")" + "(" + x2 + "," + y2 + ")" + "(" + x3 + "," + y3 + ")" + "(" + x4 + "," + y4 + ")" + "\n");
  }
}

class Trapezoid extends Quadrilateral {
  public void endPoints(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4  ) {
    System.out.println( "(" + x1 + "," + y1 + ")" + "(" + x2 + "," + y2 + ")" + "(" + x3 + "," + y3 + ")" + "(" + x4 + "," + y4 + ")");
    System.out.println("Height is: " + (y3-y2));
    System.out.println("Area is: " + (0.5 * (y3-y2) * (x2 - x1 + x3 - x4)) + "\n" );
  }
}

class Parallelogram extends Quadrilateral {
  public void endPoints( double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4 ) {
    System.out.println( "(" + x1 + "," + y1 + ")" + "(" + x2 + "," + y2 + ")" + "(" + x3 + "," + y3 + ")" + "(" + x4 + "," + y4 + ")");
    System.out.println("Height is: " + (y3-y2));
    System.out.println("Width is: " + (x2 - x1));
    System.out.println("Area is: " + ( (y3 - y2) * (x2 - x1)) + "\n");
  }
}

class Rectangles extends Quadrilateral {
  public void endPoints(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4 ) {
   System.out.println( "(" + x1 + "," + y1 + ")" + "(" + x2 + "," + y2 + ")" + "(" + x3 + "," + y3 + ")" + "(" + x4 + "," + y4 + ")");
   System.out.println("Height is: " + (y3-y2));
    System.out.println("Width is: " + (x2 - x1));
   System.out.println("Area is: " + ( (y3 - y2) * (x2 - x1)) + "\n");
  }
}

class Square extends Quadrilateral {
  public void endPoints( double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4 ) {
    System.out.println( "(" + x1 + "," + y1 + ")" + "(" + x2 + "," + y2 + ")" + "(" + x3 + "," + y3 + ")" + "(" + x4 + "," + y4 + ")");
    System.out.println("Side is: " + (y3-y2));
    System.out.println("Area is: " + ((y3-y2) * (y3-y2) ) + "\n");
  }
}


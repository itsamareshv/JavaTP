/*
 * A 2-dimensional point represents a location in (x,y) co-ordinate space.
Create a Point class, which will have two fields of int type: x and y.

User should be able to create Point instances in following ways:
a) Pass x and y co-ordinate values at the time of initialization.

b) If x and y values are not passed, then both x and y should be 0.

Provide the printPoint() method, which should print "Point: (x, y)" on to the console, x and y should
get replaced by values at runtime.
 */
package codingchallenge9;

public class Point {
	int x;
	int y;
	
	public void printPoint() {
		System.out.println("X value= " +this.x);
		System.out.println("Y value= " +this.y);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point c = new Point();
//		c.x=10;
//		c.y=20;
		c.printPoint();
				
	}

}



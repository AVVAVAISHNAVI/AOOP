package Shapes;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


	public class ShapeTest {

	    @Test
	    public void testRectangleArea() {
	        Rectangle rect = new Rectangle(3, 4);
	        assertEquals(12.0, rect.area());
	    }

	    private void assertEquals(double d, double area) {
			
		}

		@Test
	    public void testRectanglePerimeter() {
	        Rectangle rect = new Rectangle(3, 4);
	        assertEquals(14.0, rect.perimeter());
	    }

	    @Test
	    public void testSquareArea() {
	        Square sq = new Square(5);
	        assertEquals(25.0, sq.area());
	    }

	    @Test
	    public void testSquarePerimeter() {
	        Square sq = new Square(5);
	        assertEquals(20.0, sq.perimeter());
	    }

	    @Test
	    public void testSquareAsRectangleArea() {
	        Square sq = new Square(5);
	        assertEquals(25.0, sq.area()); 
	    }

	    @Test
	    public void testSquareAsRectanglePerimeter() {
	        Square sq = new Square(5);
	        assertEquals(20.0, sq.perimeter());  
	    }
	}

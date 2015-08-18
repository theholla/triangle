import org.junit.*;
import static org.junit.Assert.*;

public class TriangleTest {

  @Test
  public void newTriangle_instantiatesCorrectly_true() {
    Triangle testTriangle = new Triangle(3, 3, 3);
    assertEquals(true, testTriangle instanceof Triangle);
  }

  @Test
  public void isNotTriangular_whenNotATriangle_true() {
    Triangle testTriangle = new Triangle(1, 2, 4);
    assertEquals(true, testTriangle.isNotTriangular());
  }

  @Test
  public void newTriangle_isEquilateral_true() {
    Triangle testTriangle = new Triangle(4, 4, 4);
    assertEquals(true, testTriangle.isEquilateral());
  }

  @Test
  public void isEquilateral_whenNotEquilateral_false() {
    Triangle testTriangle = new Triangle(3, 4, 4);
    assertEquals(false, testTriangle.isEquilateral());
  }
}

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
    Triangle testTriangle = new Triangle(1,2,4);
    assertEquals(true, testTriangle.isNotTriangular());
  }

}

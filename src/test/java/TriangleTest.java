import org.junit.*;
import static org.junit.Assert.*;

public class TriangleTest {

  @Test
  public void newTriangle_instantiatesCorrectly_true() {
    Triangle testTriangle = new Triangle(3, 3, 5);
    assertEquals(true, testRectangle instanceof Rectangle);
  }



}

public class Triangle {
  public static void main(String[] args) {}

  //why Integer here? We only use int when passing in args?
  private Integer mSideOne;
  private Integer mSideTwo;
  private Integer mSideThree;

  public Triangle(int sideOne, int sideTwo, int sideThree) {
    mSideOne = sideOne;
    mSideTwo = sideTwo;
    mSideThree = sideThree;
  }

  public int getSideOne() {
    return mSideOne;
  }

  public int getSideTwo () {
    return mSideTwo;
  }

  public int getSideThree() {
    return mSideThree;
  }

/*
  public boolean isEquilateral() {}
  public boolean isIsosceles() {}
  public boolean isScalene() {}
*/

}

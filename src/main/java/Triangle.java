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

  public boolean isNotTriangular() {
    return (mSideOne + mSideTwo < mSideThree) || (mSideTwo + mSideThree < mSideOne)
          || (mSideThree + mSideOne < mSideTwo);
  }

  public boolean isEquilateral() {
    return (mSideOne == mSideTwo) && (mSideOne == mSideThree);
  }

  public boolean isScalene() {
    // also needs to != isNotTriangular
    return (mSideOne != mSideTwo) && (mSideOne != mSideThree) && (mSideTwo != mSideThree);
  }

  public boolean isIsosceles() {
    //also needs to != isNotTriangular
    return (mSideOne == mSideTwo) | (mSideTwo == mSideThree) | (mSideThree == mSideOne);
  }
}

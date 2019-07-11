package PylonC.NET;

public enum EPylonImageOrientation {
  ImageOrientation_TopDown(0L),
  ImageOrientation_BottomUp(1L),
  ;
  private long numVal;

  EPylonImageOrientation(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}

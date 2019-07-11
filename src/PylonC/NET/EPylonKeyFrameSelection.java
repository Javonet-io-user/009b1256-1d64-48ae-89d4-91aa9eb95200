package PylonC.NET;

public enum EPylonKeyFrameSelection {
  KeyFrameSelection_NoKeyFrame(0L),
  KeyFrameSelection_KeyFrame(1L),
  KeyFrameSelection_Auto(2L),
  ;
  private long numVal;

  EPylonKeyFrameSelection(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}

package PylonC.NET;

public enum EPylonGrabStatus {
  Idle(0L),
  Queued(1L),
  Grabbed(2L),
  Canceled(3L),
  Failed(4L),
  UndefinedGrabStatus(-1L),
  ;
  private long numVal;

  EPylonGrabStatus(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}

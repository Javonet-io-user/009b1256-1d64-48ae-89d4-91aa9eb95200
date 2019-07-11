package PylonC.NET;

public enum EGenApiAccessMode {
  NI(0L),
  NA(1L),
  WO(2L),
  RO(3L),
  RW(4L),
  _UndefinedAccesMode(-1L),
  ;
  private long numVal;

  EGenApiAccessMode(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}

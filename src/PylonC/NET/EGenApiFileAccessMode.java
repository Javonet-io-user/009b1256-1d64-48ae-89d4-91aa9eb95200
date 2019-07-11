package PylonC.NET;

public enum EGenApiFileAccessMode {
  GenApiFileReadAccess(0L),
  GenApiFileWriteAccess(1L),
  ;
  private long numVal;

  EGenApiFileAccessMode(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}

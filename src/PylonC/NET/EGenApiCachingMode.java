package PylonC.NET;

public enum EGenApiCachingMode {
  NoCache(0L),
  WriteThrough(1L),
  WriteAround(2L),
  _UndefinedCachingMode(-1L),
  ;
  private long numVal;

  EGenApiCachingMode(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}

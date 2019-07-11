package PylonC.NET;

public enum EGenApiVisibility {
  Beginner(0L),
  Expert(1L),
  Guru(2L),
  Invisible(3L),
  _UndefinedVisibility(-1L),
  ;
  private long numVal;

  EGenApiVisibility(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}

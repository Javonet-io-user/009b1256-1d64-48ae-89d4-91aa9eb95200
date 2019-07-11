package PylonC.NET;

public enum EGenApiNameSpace {
  Custom(0L),
  Standard(1L),
  _UndefinedNameSpace(-1L),
  ;
  private long numVal;

  EGenApiNameSpace(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}

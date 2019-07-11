package PylonC.NET;

public enum EGenApiRepresentation {
  Linear(0L),
  Logarithmic(1L),
  Boolean(2L),
  PureNumber(3L),
  HexNumber(4L),
  _UndefinedRepresentation(-1L),
  ;
  private long numVal;

  EGenApiRepresentation(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}

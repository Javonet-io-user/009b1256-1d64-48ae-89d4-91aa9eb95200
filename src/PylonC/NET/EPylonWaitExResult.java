package PylonC.NET;

public enum EPylonWaitExResult {
  waitex_timeout(0L),
  waitex_signaled(1L),
  waitex_abandoned(2L),
  waitex_alerted(-1L),
  ;
  private long numVal;

  EPylonWaitExResult(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}

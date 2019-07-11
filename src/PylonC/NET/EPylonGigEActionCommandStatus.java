package PylonC.NET;

public enum EPylonGigEActionCommandStatus {
  PylonGigEActionCommandStatus_Ok(0L),
  PylonGigEActionCommandStatus_NoRefTime(-519995373L),
  PylonGigEActionCommandStatus_Overflow(-519995371L),
  PylonGigEActionCommandStatus_ActionLate(-519995370L),
  ;
  private long numVal;

  EPylonGigEActionCommandStatus(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}

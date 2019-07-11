package PylonC.NET;

public enum EPylonPayloadType {
  PayloadType_Image(0L),
  PayloadType_RawData(1L),
  PayloadType_File(2L),
  PayloadType_ChunkData(3L),
  PayloadType_DeviceSpecific(32768L),
  PayloadType_Undefined(-1L),
  ;
  private long numVal;

  EPylonPayloadType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}

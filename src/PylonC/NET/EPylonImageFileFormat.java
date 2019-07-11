package PylonC.NET;

public enum EPylonImageFileFormat {
  ImageFileFormat_Bmp(0L),
  ImageFileFormat_Tiff(1L),
  ImageFileFormat_Jpeg(2L),
  ImageFileFormat_Png(3L),
  ;
  private long numVal;

  EPylonImageFileFormat(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}

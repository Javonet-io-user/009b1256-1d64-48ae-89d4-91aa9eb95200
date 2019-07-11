package PylonC.NET;

public enum EPylonShowWindow {
  EPylonShowWindow_SW_HIDE(0L),
  EPylonShowWindow_SW_SHOWNORMAL(1L),
  EPylonShowWindow_SW_SHOWMINIMIZED(2L),
  EPylonShowWindow_SW_SHOWMAXIMIZED(3L),
  EPylonShowWindow_SW_SHOWNOACTIVATE(4L),
  EPylonShowWindow_SW_SHOW(5L),
  EPylonShowWindow_SW_MINIMIZE(6L),
  EPylonShowWindow_SW_SHOWMINNOACTIVE(7L),
  EPylonShowWindow_SW_SHOWNA(8L),
  EPylonShowWindow_SW_RESTORE(9L),
  EPylonShowWindow_SW_SHOWDEFAULT(10L),
  EPylonShowWindow_SW_FORCEMINIMIZE(11L),
  ;
  private long numVal;

  EPylonShowWindow(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}

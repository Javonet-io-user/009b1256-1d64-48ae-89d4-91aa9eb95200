package PylonC.NET;

public enum EGenApiNodeType {
  IntegerNode(0L),
  BooleanNode(1L),
  FloatNode(2L),
  CommandNode(3L),
  StringNode(4L),
  EnumerationNode(5L),
  EnumEntryNode(6L),
  Category(7L),
  _UnknownNodeType(-1L),
  ;
  private long numVal;

  EGenApiNodeType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}

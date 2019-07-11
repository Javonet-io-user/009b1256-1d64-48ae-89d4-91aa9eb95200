package PylonC.NET;

public enum EPylonPixelType {
  PixelType_Mono8(17301505L),
  PixelType_Mono8signed(17301506L),
  PixelType_BayerGR8(17301512L),
  PixelType_BayerRG8(17301513L),
  PixelType_BayerGB8(17301514L),
  PixelType_BayerBG8(17301515L),
  PixelType_Mono10p(17432646L),
  PixelType_BayerBG10p(17432658L),
  PixelType_BayerGB10p(17432660L),
  PixelType_BayerGR10p(17432662L),
  PixelType_BayerRG10p(17432664L),
  PixelType_Mono10packed(17563652L),
  PixelType_Mono12packed(17563654L),
  PixelType_BayerGR12Packed(17563690L),
  PixelType_BayerRG12Packed(17563691L),
  PixelType_BayerGB12Packed(17563692L),
  PixelType_BayerBG12Packed(17563693L),
  PixelType_Mono12p(17563719L),
  PixelType_BayerBG12p(17563731L),
  PixelType_BayerGB12p(17563733L),
  PixelType_BayerGR12p(17563735L),
  PixelType_BayerRG12p(17563737L),
  PixelType_Mono10(17825795L),
  PixelType_Mono12(17825797L),
  PixelType_Mono16(17825799L),
  PixelType_BayerGR10(17825804L),
  PixelType_BayerRG10(17825805L),
  PixelType_BayerGB10(17825806L),
  PixelType_BayerBG10(17825807L),
  PixelType_BayerGR12(17825808L),
  PixelType_BayerRG12(17825809L),
  PixelType_BayerGB12(17825810L),
  PixelType_BayerBG12(17825811L),
  PixelType_BayerGR16(17825838L),
  PixelType_BayerRG16(17825839L),
  PixelType_BayerGB16(17825840L),
  PixelType_BayerBG16(17825841L),
  PixelType_YUV411packed(34340894L),
  PixelType_YUV422packed(34603039L),
  PixelType_YUV422_YUYV_Packed(34603058L),
  PixelType_RGB8packed(35127316L),
  PixelType_BGR8packed(35127317L),
  PixelType_YUV444packed(35127328L),
  PixelType_RGB8planar(35127329L),
  PixelType_RGBA8packed(35651606L),
  PixelType_BGRA8packed(35651607L),
  PixelType_BGR10V1packed(35651612L),
  PixelType_BGR10V2packed(35651613L),
  PixelType_RGB12V1packed(35913780L),
  PixelType_RGB10packed(36700184L),
  PixelType_BGR10packed(36700185L),
  PixelType_RGB12packed(36700186L),
  PixelType_BGR12packed(36700187L),
  PixelType_RGB10planar(36700194L),
  PixelType_RGB12planar(36700195L),
  PixelType_RGB16planar(36700196L),
  PixelType_RGB16packed(36700211L),
  PixelType_Double(-2127560448L),
  PixelType_Undefined(-1L),
  ;
  private long numVal;

  EPylonPixelType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}

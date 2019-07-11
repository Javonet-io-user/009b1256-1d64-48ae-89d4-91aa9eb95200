package PylonC.NET;

import Common.Activation;
import static Common.JavonetHelper.Convert;
import static Common.JavonetHelper.getGetObjectName;
import static Common.JavonetHelper.getReturnObjectName;
import static Common.JavonetHelper.ConvertToConcreteInterfaceImplementation;
import Common.JavonetHelper;
import Common.MethodTypeAnnotation;
import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.JavonetFramework;
import com.javonet.api.NObject;
import com.javonet.api.NEnum;
import com.javonet.api.keywords.NRef;
import com.javonet.api.keywords.NOut;
import com.javonet.api.NControlContainer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import java.lang.*;
import PylonC.NET.*;

public class PylonGrabResult_t {
  protected NObject javonetHandle;
  /** GetFiled */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getContext() {
    try {
      java.lang.Integer res = javonetHandle.get("Context");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setContext(java.lang.Integer param) {
    try {
      javonetHandle.set("Context", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public PYLON_STREAMBUFFER_HANDLE gethBuffer() {
    try {
      Object res = javonetHandle.<NObject>get("hBuffer");
      if (res == null) return null;
      return new PYLON_STREAMBUFFER_HANDLE((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void sethBuffer(PYLON_STREAMBUFFER_HANDLE param) {
    try {
      javonetHandle.set("hBuffer", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public EPylonGrabStatus getStatus() {
    try {
      Object res = javonetHandle.<NEnum>get("Status");
      if (res == null) return null;
      return EPylonGrabStatus.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setStatus(EPylonGrabStatus param) {
    try {
      javonetHandle.set("Status", NEnum.fromJavaEnum(param));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Long getFrameNr() {
    try {
      java.lang.Long res = javonetHandle.get("FrameNr");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setFrameNr(java.lang.Long param) {
    try {
      javonetHandle.set("FrameNr", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public EPylonPayloadType getPayloadType() {
    try {
      Object res = javonetHandle.<NEnum>get("PayloadType");
      if (res == null) return null;
      return EPylonPayloadType.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setPayloadType(EPylonPayloadType param) {
    try {
      javonetHandle.set("PayloadType", NEnum.fromJavaEnum(param));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public EPylonPixelType getPixelType() {
    try {
      Object res = javonetHandle.<NEnum>get("PixelType");
      if (res == null) return null;
      return EPylonPixelType.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setPixelType(EPylonPixelType param) {
    try {
      javonetHandle.set("PixelType", NEnum.fromJavaEnum(param));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Long getTimeStamp() {
    try {
      java.lang.Long res = javonetHandle.get("TimeStamp");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setTimeStamp(java.lang.Long param) {
    try {
      javonetHandle.set("TimeStamp", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getSizeX() {
    try {
      java.lang.Integer res = javonetHandle.get("SizeX");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setSizeX(java.lang.Integer param) {
    try {
      javonetHandle.set("SizeX", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getSizeY() {
    try {
      java.lang.Integer res = javonetHandle.get("SizeY");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setSizeY(java.lang.Integer param) {
    try {
      javonetHandle.set("SizeY", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getOffsetX() {
    try {
      java.lang.Integer res = javonetHandle.get("OffsetX");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setOffsetX(java.lang.Integer param) {
    try {
      javonetHandle.set("OffsetX", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getOffsetY() {
    try {
      java.lang.Integer res = javonetHandle.get("OffsetY");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setOffsetY(java.lang.Integer param) {
    try {
      javonetHandle.set("OffsetY", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getPaddingX() {
    try {
      java.lang.Integer res = javonetHandle.get("PaddingX");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setPaddingX(java.lang.Integer param) {
    try {
      javonetHandle.set("PaddingX", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getPaddingY() {
    try {
      java.lang.Integer res = javonetHandle.get("PaddingY");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setPaddingY(java.lang.Integer param) {
    try {
      javonetHandle.set("PaddingY", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Long getPayloadSize() {
    try {
      java.lang.Long res = javonetHandle.get("PayloadSize");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setPayloadSize(java.lang.Long param) {
    try {
      javonetHandle.set("PayloadSize", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Long getErrorCode() {
    try {
      java.lang.Long res = javonetHandle.get("ErrorCode");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setErrorCode(java.lang.Long param) {
    try {
      javonetHandle.set("ErrorCode", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.math.BigInteger getBlockID() {
    try {
      java.math.BigInteger res = javonetHandle.get("BlockID");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setBlockID(java.math.BigInteger param) {
    try {
      javonetHandle.set("BlockID", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public PylonGrabResult_t() {
    try {
      javonetHandle = Javonet.New("PylonC.NET.PylonGrabResult_t");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public PylonGrabResult_t(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}

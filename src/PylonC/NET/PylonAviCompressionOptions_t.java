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
import jio.System.*;

public class PylonAviCompressionOptions_t {
  protected NObject javonetHandle;
  /** GetFiled */
  @MethodTypeAnnotation(type = "GetField")
  public IntPtr gethParentWindow() {
    try {
      Object res = javonetHandle.<NObject>get("hParentWindow");
      if (res == null) return null;
      return (jio.System.IntPtr) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void sethParentWindow(IntPtr param) {
    try {
      javonetHandle.set("hParentWindow", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getshowDialog() {
    try {
      java.lang.Boolean res = javonetHandle.get("showDialog");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setshowDialog(java.lang.Boolean param) {
    try {
      javonetHandle.set("showDialog", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getuserDialogReturnOk() {
    try {
      java.lang.Boolean res = javonetHandle.get("userDialogReturnOk");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setuserDialogReturnOk(java.lang.Boolean param) {
    try {
      javonetHandle.set("userDialogReturnOk", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getautoKeyFrameInsertionRate() {
    try {
      java.lang.Integer res = javonetHandle.get("autoKeyFrameInsertionRate");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setautoKeyFrameInsertionRate(java.lang.Integer param) {
    try {
      javonetHandle.set("autoKeyFrameInsertionRate", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Long getfccType() {
    try {
      java.lang.Long res = javonetHandle.get("fccType");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setfccType(java.lang.Long param) {
    try {
      javonetHandle.set("fccType", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Long getfccHandler() {
    try {
      java.lang.Long res = javonetHandle.get("fccHandler");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setfccHandler(java.lang.Long param) {
    try {
      javonetHandle.set("fccHandler", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Long getdwKeyFrameEvery() {
    try {
      java.lang.Long res = javonetHandle.get("dwKeyFrameEvery");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setdwKeyFrameEvery(java.lang.Long param) {
    try {
      javonetHandle.set("dwKeyFrameEvery", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Long getdwQuality() {
    try {
      java.lang.Long res = javonetHandle.get("dwQuality");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setdwQuality(java.lang.Long param) {
    try {
      javonetHandle.set("dwQuality", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Long getdwBytesPerSecond() {
    try {
      java.lang.Long res = javonetHandle.get("dwBytesPerSecond");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setdwBytesPerSecond(java.lang.Long param) {
    try {
      javonetHandle.set("dwBytesPerSecond", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Long getdwFlags() {
    try {
      java.lang.Long res = javonetHandle.get("dwFlags");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setdwFlags(java.lang.Long param) {
    try {
      javonetHandle.set("dwFlags", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Byte[] getformatBuffer(Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.<NObject[]>get("formatBuffer");
      if (res == null) return null;
      return (java.lang.Byte[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setformatBuffer(java.lang.Byte[] param) {
    try {
      javonetHandle.set("formatBuffer", new Object[] {param});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Byte[] getparmsBuffer(Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.<NObject[]>get("parmsBuffer");
      if (res == null) return null;
      return (java.lang.Byte[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setparmsBuffer(java.lang.Byte[] param) {
    try {
      javonetHandle.set("parmsBuffer", new Object[] {param});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Long getdwInterleaveEvery() {
    try {
      java.lang.Long res = javonetHandle.get("dwInterleaveEvery");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setdwInterleaveEvery(java.lang.Long param) {
    try {
      javonetHandle.set("dwInterleaveEvery", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public PylonAviCompressionOptions_t() {
    try {
      javonetHandle = Javonet.New("PylonC.NET.PylonAviCompressionOptions_t");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public PylonAviCompressionOptions_t(NObject handle) {
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

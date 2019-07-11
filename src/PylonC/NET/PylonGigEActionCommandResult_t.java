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

public class PylonGigEActionCommandResult_t {
  protected NObject javonetHandle;
  /** GetFiled */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getDeviceAddress() {
    try {
      java.lang.String res = javonetHandle.get("DeviceAddress");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setDeviceAddress(java.lang.String param) {
    try {
      javonetHandle.set("DeviceAddress", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getStatus() {
    try {
      java.lang.Integer res = javonetHandle.get("Status");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setStatus(java.lang.Integer param) {
    try {
      javonetHandle.set("Status", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public PylonGigEActionCommandResult_t() {
    try {
      javonetHandle = Javonet.New("PylonC.NET.PylonGigEActionCommandResult_t");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public PylonGigEActionCommandResult_t(NObject handle) {
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

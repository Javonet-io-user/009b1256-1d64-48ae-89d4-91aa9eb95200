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

public class PylonBuffer<T> implements IDisposable {
  protected NObject javonetHandle;
  /** GetProperty */
  @MethodTypeAnnotation(type = "Method")
  public T[] getArray(Class<?> returnType, Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.invoke("get_Array");
      if (res == null) return null;
      return (T[]) JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public IntPtr getPointer() {
    try {
      Object res = javonetHandle.<NObject>get("Pointer");
      if (res == null) return null;
      return (jio.System.IntPtr) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GenericConstructor */

  @MethodTypeAnnotation(type = "GetField")
  public PylonBuffer(java.lang.Long size, java.lang.Boolean sizeInByte, Class<?> T) {
    try {
      javonetHandle = Javonet.getType("PylonC.NET.PylonBuffer`1", getReturnObjectName(T)).create();
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GenericConstructor */

  @MethodTypeAnnotation(type = "GetField")
  public PylonBuffer(T[] array, Class<?> T) {
    try {
      javonetHandle = Javonet.getType("PylonC.NET.PylonBuffer`1", getReturnObjectName(T)).create();
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public PylonBuffer(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Dispose() {
    try {
      javonetHandle.explicitInterface("jio.System.IDisposable").invoke("Dispose");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}

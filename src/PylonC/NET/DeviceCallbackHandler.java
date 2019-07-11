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

public class DeviceCallbackHandler {
  protected NObject javonetHandle;

  public DeviceCallbackHandler() {
    try {
      javonetHandle = Javonet.New("PylonC.NET.DeviceCallbackHandler");
      javonetHandle.addEventListener(
          "CallbackEvent",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DeviceCallbackHandler.DeviceCallback handler : _CallbackEventListeners) {
                handler.Invoke(Convert(objects[0], PYLON_DEVICE_HANDLE.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DeviceCallbackHandler(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Event */

  private java.util.ArrayList<DeviceCallbackHandler.DeviceCallback> _CallbackEventListeners =
      new java.util.ArrayList<DeviceCallbackHandler.DeviceCallback>();

  public void addCallbackEvent(DeviceCallbackHandler.DeviceCallback toAdd) {
    _CallbackEventListeners.add(toAdd);
  }

  public void removeCallbackEvent(DeviceCallbackHandler.DeviceCallback toRemove) {
    _CallbackEventListeners.remove(toRemove);
  }

  public interface DeviceCallback {
    /** Method */
    @MethodTypeAnnotation(type = "DelegateMethod")
    public void Invoke(PYLON_DEVICE_HANDLE hDev);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}

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
import Microsoft.Win32.SafeHandles.*;
import jio.System.*;

public class Pylon {
  protected NObject javonetHandle;
  /** GetFiled */
  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getcPylonDeviceInfoFullNameKey() {
    try {
      java.lang.String res = Javonet.getType("PylonC.NET.Pylon").get("cPylonDeviceInfoFullNameKey");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setcPylonDeviceInfoFullNameKey(java.lang.String param) {
    try {
      Javonet.getType("PylonC.NET.Pylon").set("cPylonDeviceInfoFullNameKey", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getcPylonDeviceInfoFriendlyNameKey() {
    try {
      java.lang.String res =
          Javonet.getType("PylonC.NET.Pylon").get("cPylonDeviceInfoFriendlyNameKey");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setcPylonDeviceInfoFriendlyNameKey(java.lang.String param) {
    try {
      Javonet.getType("PylonC.NET.Pylon").set("cPylonDeviceInfoFriendlyNameKey", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getcPylonDeviceInfoVendorNameKey() {
    try {
      java.lang.String res =
          Javonet.getType("PylonC.NET.Pylon").get("cPylonDeviceInfoVendorNameKey");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setcPylonDeviceInfoVendorNameKey(java.lang.String param) {
    try {
      Javonet.getType("PylonC.NET.Pylon").set("cPylonDeviceInfoVendorNameKey", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getcPylonDeviceInfoDeviceClassKey() {
    try {
      java.lang.String res =
          Javonet.getType("PylonC.NET.Pylon").get("cPylonDeviceInfoDeviceClassKey");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setcPylonDeviceInfoDeviceClassKey(java.lang.String param) {
    try {
      Javonet.getType("PylonC.NET.Pylon").set("cPylonDeviceInfoDeviceClassKey", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getcPylonDeviceInfoSerialNumberKey() {
    try {
      java.lang.String res =
          Javonet.getType("PylonC.NET.Pylon").get("cPylonDeviceInfoSerialNumberKey");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setcPylonDeviceInfoSerialNumberKey(java.lang.String param) {
    try {
      Javonet.getType("PylonC.NET.Pylon").set("cPylonDeviceInfoSerialNumberKey", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getcPylonDeviceInfoUserDefinedNameKey() {
    try {
      java.lang.String res =
          Javonet.getType("PylonC.NET.Pylon").get("cPylonDeviceInfoUserDefinedNameKey");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setcPylonDeviceInfoUserDefinedNameKey(java.lang.String param) {
    try {
      Javonet.getType("PylonC.NET.Pylon").set("cPylonDeviceInfoUserDefinedNameKey", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getcPylonDeviceInfoModelNameKey() {
    try {
      java.lang.String res =
          Javonet.getType("PylonC.NET.Pylon").get("cPylonDeviceInfoModelNameKey");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setcPylonDeviceInfoModelNameKey(java.lang.String param) {
    try {
      Javonet.getType("PylonC.NET.Pylon").set("cPylonDeviceInfoModelNameKey", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getcPylonDeviceInfoDeviceFactoryKey() {
    try {
      java.lang.String res =
          Javonet.getType("PylonC.NET.Pylon").get("cPylonDeviceInfoDeviceFactoryKey");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setcPylonDeviceInfoDeviceFactoryKey(java.lang.String param) {
    try {
      Javonet.getType("PylonC.NET.Pylon").set("cPylonDeviceInfoDeviceFactoryKey", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getcPylonDeviceInfoDeviceVersionKey() {
    try {
      java.lang.String res =
          Javonet.getType("PylonC.NET.Pylon").get("cPylonDeviceInfoDeviceVersionKey");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setcPylonDeviceInfoDeviceVersionKey(java.lang.String param) {
    try {
      Javonet.getType("PylonC.NET.Pylon").set("cPylonDeviceInfoDeviceVersionKey", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getcPylonDeviceInfoAddressKey() {
    try {
      java.lang.String res = Javonet.getType("PylonC.NET.Pylon").get("cPylonDeviceInfoAddressKey");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setcPylonDeviceInfoAddressKey(java.lang.String param) {
    try {
      Javonet.getType("PylonC.NET.Pylon").set("cPylonDeviceInfoAddressKey", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getcPylonDeviceInfoIpAddressKey() {
    try {
      java.lang.String res =
          Javonet.getType("PylonC.NET.Pylon").get("cPylonDeviceInfoIpAddressKey");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setcPylonDeviceInfoIpAddressKey(java.lang.String param) {
    try {
      Javonet.getType("PylonC.NET.Pylon").set("cPylonDeviceInfoIpAddressKey", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getcPylonDeviceInfoDefaultGatewayKey() {
    try {
      java.lang.String res =
          Javonet.getType("PylonC.NET.Pylon").get("cPylonDeviceInfoDefaultGatewayKey");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setcPylonDeviceInfoDefaultGatewayKey(java.lang.String param) {
    try {
      Javonet.getType("PylonC.NET.Pylon").set("cPylonDeviceInfoDefaultGatewayKey", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getcPylonDeviceInfoSubnetMaskKey() {
    try {
      java.lang.String res =
          Javonet.getType("PylonC.NET.Pylon").get("cPylonDeviceInfoSubnetMaskKey");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setcPylonDeviceInfoSubnetMaskKey(java.lang.String param) {
    try {
      Javonet.getType("PylonC.NET.Pylon").set("cPylonDeviceInfoSubnetMaskKey", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getcPylonDeviceInfoPortNrKey() {
    try {
      java.lang.String res = Javonet.getType("PylonC.NET.Pylon").get("cPylonDeviceInfoPortNrKey");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setcPylonDeviceInfoPortNrKey(java.lang.String param) {
    try {
      Javonet.getType("PylonC.NET.Pylon").set("cPylonDeviceInfoPortNrKey", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getcPylonDeviceInfoMacAddressKey() {
    try {
      java.lang.String res =
          Javonet.getType("PylonC.NET.Pylon").get("cPylonDeviceInfoMacAddressKey");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setcPylonDeviceInfoMacAddressKey(java.lang.String param) {
    try {
      Javonet.getType("PylonC.NET.Pylon").set("cPylonDeviceInfoMacAddressKey", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getcPylonDeviceInfoInterfaceKey() {
    try {
      java.lang.String res =
          Javonet.getType("PylonC.NET.Pylon").get("cPylonDeviceInfoInterfaceKey");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setcPylonDeviceInfoInterfaceKey(java.lang.String param) {
    try {
      Javonet.getType("PylonC.NET.Pylon").set("cPylonDeviceInfoInterfaceKey", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getcPylonDeviceInfoIpConfigOptionsKey() {
    try {
      java.lang.String res =
          Javonet.getType("PylonC.NET.Pylon").get("cPylonDeviceInfoIpConfigOptionsKey");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setcPylonDeviceInfoIpConfigOptionsKey(java.lang.String param) {
    try {
      Javonet.getType("PylonC.NET.Pylon").set("cPylonDeviceInfoIpConfigOptionsKey", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getcPylonDeviceInfoIpConfigCurrentKey() {
    try {
      java.lang.String res =
          Javonet.getType("PylonC.NET.Pylon").get("cPylonDeviceInfoIpConfigCurrentKey");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setcPylonDeviceInfoIpConfigCurrentKey(java.lang.String param) {
    try {
      Javonet.getType("PylonC.NET.Pylon").set("cPylonDeviceInfoIpConfigCurrentKey", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getcPylonDeviceInfoSubnetAddressKey() {
    try {
      java.lang.String res =
          Javonet.getType("PylonC.NET.Pylon").get("cPylonDeviceInfoSubnetAddressKey");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setcPylonDeviceInfoSubnetAddressKey(java.lang.String param) {
    try {
      Javonet.getType("PylonC.NET.Pylon").set("cPylonDeviceInfoSubnetAddressKey", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getcPylonDeviceInfoPortIDKey() {
    try {
      java.lang.String res = Javonet.getType("PylonC.NET.Pylon").get("cPylonDeviceInfoPortIDKey");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setcPylonDeviceInfoPortIDKey(java.lang.String param) {
    try {
      Javonet.getType("PylonC.NET.Pylon").set("cPylonDeviceInfoPortIDKey", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getcPylonDeviceInfoDeviceIDKey() {
    try {
      java.lang.String res = Javonet.getType("PylonC.NET.Pylon").get("cPylonDeviceInfoDeviceIDKey");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setcPylonDeviceInfoDeviceIDKey(java.lang.String param) {
    try {
      Javonet.getType("PylonC.NET.Pylon").set("cPylonDeviceInfoDeviceIDKey", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getcPylonDeviceInfoInitialBaudRateKey() {
    try {
      java.lang.String res =
          Javonet.getType("PylonC.NET.Pylon").get("cPylonDeviceInfoInitialBaudRateKey");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setcPylonDeviceInfoInitialBaudRateKey(java.lang.String param) {
    try {
      Javonet.getType("PylonC.NET.Pylon").set("cPylonDeviceInfoInitialBaudRateKey", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getcPylonDeviceInfoDeviceGUIDKey() {
    try {
      java.lang.String res =
          Javonet.getType("PylonC.NET.Pylon").get("cPylonDeviceInfoDeviceGUIDKey");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setcPylonDeviceInfoDeviceGUIDKey(java.lang.String param) {
    try {
      Javonet.getType("PylonC.NET.Pylon").set("cPylonDeviceInfoDeviceGUIDKey", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getcPylonDeviceInfoManufacturerInfoKey() {
    try {
      java.lang.String res =
          Javonet.getType("PylonC.NET.Pylon").get("cPylonDeviceInfoManufacturerInfoKey");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setcPylonDeviceInfoManufacturerInfoKey(java.lang.String param) {
    try {
      Javonet.getType("PylonC.NET.Pylon").set("cPylonDeviceInfoManufacturerInfoKey", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Integer getcPylonAccessModeMonitor() {
    try {
      java.lang.Integer res = Javonet.getType("PylonC.NET.Pylon").get("cPylonAccessModeMonitor");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setcPylonAccessModeMonitor(java.lang.Integer param) {
    try {
      Javonet.getType("PylonC.NET.Pylon").set("cPylonAccessModeMonitor", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Integer getcPylonAccessModeControl() {
    try {
      java.lang.Integer res = Javonet.getType("PylonC.NET.Pylon").get("cPylonAccessModeControl");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setcPylonAccessModeControl(java.lang.Integer param) {
    try {
      Javonet.getType("PylonC.NET.Pylon").set("cPylonAccessModeControl", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Integer getcPylonAccessModeStream() {
    try {
      java.lang.Integer res = Javonet.getType("PylonC.NET.Pylon").get("cPylonAccessModeStream");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setcPylonAccessModeStream(java.lang.Integer param) {
    try {
      Javonet.getType("PylonC.NET.Pylon").set("cPylonAccessModeStream", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Integer getcPylonAccessModeEvent() {
    try {
      java.lang.Integer res = Javonet.getType("PylonC.NET.Pylon").get("cPylonAccessModeEvent");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setcPylonAccessModeEvent(java.lang.Integer param) {
    try {
      Javonet.getType("PylonC.NET.Pylon").set("cPylonAccessModeEvent", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Integer getcPylonAccessModeExclusive() {
    try {
      java.lang.Integer res = Javonet.getType("PylonC.NET.Pylon").get("cPylonAccessModeExclusive");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setcPylonAccessModeExclusive(java.lang.Integer param) {
    try {
      Javonet.getType("PylonC.NET.Pylon").set("cPylonAccessModeExclusive", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.Integer getcPylonImageWindowUseDefault() {
    try {
      java.lang.Integer res =
          Javonet.getType("PylonC.NET.Pylon").get("cPylonImageWindowUseDefault");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setcPylonImageWindowUseDefault(java.lang.Integer param) {
    try {
      Javonet.getType("PylonC.NET.Pylon").set("cPylonImageWindowUseDefault", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static SafeWaitHandle WaitObjectGetW32Handle(PYLON_WAITOBJECT_HANDLE hWobj) {
    try {
      Object res = Javonet.getType("PylonC.NET.Pylon").invoke("WaitObjectGetW32Handle", hWobj);
      if (res == null) return null;
      return new SafeWaitHandle((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static <T> void DevicePortRead(
      PYLON_DEVICE_HANDLE hDev,
      PylonBuffer<T> buffer,
      java.lang.Long Address,
      java.lang.Long Length) {
    try {
      Javonet.getType("PylonC.NET.Pylon").invoke("DevicePortRead", hDev, buffer, Address, Length);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static <T> void DevicePortWrite(
      PYLON_DEVICE_HANDLE hDev,
      PylonBuffer<T> buffer,
      java.lang.Long Address,
      java.lang.Long Length) {
    try {
      Javonet.getType("PylonC.NET.Pylon").invoke("DevicePortWrite", hDev, buffer, Address, Length);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static <T> void ImagePersistenceSave(
      EPylonImageFileFormat imageFileFormat,
      java.lang.String filename,
      PylonBuffer<T> buffer,
      EPylonPixelType pixelType,
      java.lang.Long width,
      java.lang.Long height,
      java.lang.Long paddingX,
      EPylonImageOrientation orientation,
      PylonImagePersistenceOptions_t options) {
    try {
      Javonet.getType("PylonC.NET.Pylon")
          .invoke(
              "ImagePersistenceSave",
              NEnum.fromJavaEnum(imageFileFormat),
              filename,
              buffer,
              NEnum.fromJavaEnum(pixelType),
              width,
              height,
              paddingX,
              NEnum.fromJavaEnum(orientation),
              options);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static <T> void ImagePersistenceSave(
      EPylonImageFileFormat imageFileFormat,
      java.lang.String filename,
      PylonBuffer<T> buffer,
      EPylonPixelType pixelType,
      java.lang.Long width,
      java.lang.Long height,
      java.lang.Long paddingX,
      EPylonImageOrientation orientation) {
    try {
      Javonet.getType("PylonC.NET.Pylon")
          .invoke(
              "ImagePersistenceSave",
              NEnum.fromJavaEnum(imageFileFormat),
              filename,
              buffer,
              NEnum.fromJavaEnum(pixelType),
              width,
              height,
              paddingX,
              NEnum.fromJavaEnum(orientation));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static <T> java.lang.Boolean ImagePersistenceLoad(
      java.lang.String filename,
      PylonBuffer<T> buffer,
      IntPtr bufferSize,
      EPylonPixelType pixelType,
      AtomicReference<java.lang.Long> width,
      AtomicReference<java.lang.Long> height,
      AtomicReference<java.lang.Long> paddingX,
      EPylonImageOrientation orientation) {
    try {
      java.lang.Boolean res =
          Javonet.getType("PylonC.NET.Pylon")
              .invoke(
                  "ImagePersistenceLoad",
                  filename,
                  buffer,
                  bufferSize,
                  NEnum.fromJavaEnum(pixelType),
                  new NOut(width, JavonetHelper.JavaToDotnetType.get(java.lang.Long.class)),
                  new NOut(height, JavonetHelper.JavaToDotnetType.get(java.lang.Long.class)),
                  new NOut(paddingX, JavonetHelper.JavaToDotnetType.get(java.lang.Long.class)),
                  NEnum.fromJavaEnum(orientation));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static <T> void AviWriterAdd(
      PYLON_AVI_WRITER_HANDLE hWriter,
      PylonBuffer<T> buffer,
      EPylonPixelType pixelType,
      java.lang.Long width,
      java.lang.Long height,
      java.lang.Long paddingX,
      EPylonImageOrientation orientation,
      EPylonKeyFrameSelection keyFrameSelection) {
    try {
      Javonet.getType("PylonC.NET.Pylon")
          .invoke(
              "AviWriterAdd",
              hWriter,
              buffer,
              NEnum.fromJavaEnum(pixelType),
              width,
              height,
              paddingX,
              NEnum.fromJavaEnum(orientation),
              NEnum.fromJavaEnum(keyFrameSelection));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void AviWriterOpen(
      PYLON_AVI_WRITER_HANDLE hWriter,
      java.lang.String filename,
      java.lang.Double framesPerSecondPlayback,
      EPylonPixelType pixelType,
      java.lang.Long width,
      java.lang.Long height,
      EPylonImageOrientation orientation) {
    try {
      Javonet.getType("PylonC.NET.Pylon")
          .invoke(
              "AviWriterOpen",
              hWriter,
              filename,
              framesPerSecondPlayback,
              NEnum.fromJavaEnum(pixelType),
              width,
              height,
              NEnum.fromJavaEnum(orientation));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void AviWriterOpen(
      PYLON_AVI_WRITER_HANDLE hWriter,
      java.lang.String filename,
      java.lang.Double framesPerSecondPlayback,
      EPylonPixelType pixelType,
      java.lang.Long width,
      java.lang.Long height,
      EPylonImageOrientation orientation,
      PylonAviCompressionOptions_t compressionOptions) {
    try {
      Javonet.getType("PylonC.NET.Pylon")
          .invoke(
              "AviWriterOpen",
              hWriter,
              filename,
              framesPerSecondPlayback,
              NEnum.fromJavaEnum(pixelType),
              width,
              height,
              NEnum.fromJavaEnum(orientation),
              compressionOptions);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static <T> void ImageWindowSetImage(
      java.lang.Long winIndex,
      PylonBuffer<T> buffer,
      EPylonPixelType pixelType,
      java.lang.Long width,
      java.lang.Long height,
      java.lang.Long paddingX,
      EPylonImageOrientation orientation) {
    try {
      Javonet.getType("PylonC.NET.Pylon")
          .invoke(
              "ImageWindowSetImage",
              winIndex,
              buffer,
              NEnum.fromJavaEnum(pixelType),
              width,
              height,
              paddingX,
              NEnum.fromJavaEnum(orientation));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static IntPtr ImageWindowGetWindowHandle(java.lang.Long winIndex) {
    try {
      Object res =
          Javonet.getType("PylonC.NET.Pylon").invoke("ImageWindowGetWindowHandle", winIndex);
      if (res == null) return null;
      return (jio.System.IntPtr) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void ImageWindowShow(java.lang.Long winIndex, java.lang.Integer nShow) {
    try {
      Javonet.getType("PylonC.NET.Pylon").invoke("ImageWindowShow", winIndex, nShow);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void ImageWindowShow(java.lang.Long winIndex) {
    try {
      Javonet.getType("PylonC.NET.Pylon").invoke("ImageWindowShow", winIndex);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static <T> void ImageWindowDisplayImage(
      java.lang.Long winIndex,
      PylonBuffer<T> buffer,
      EPylonPixelType pixelType,
      java.lang.Long width,
      java.lang.Long height,
      java.lang.Long paddingX,
      EPylonImageOrientation orientation) {
    try {
      Javonet.getType("PylonC.NET.Pylon")
          .invoke(
              "ImageWindowDisplayImage",
              winIndex,
              buffer,
              NEnum.fromJavaEnum(pixelType),
              width,
              height,
              paddingX,
              NEnum.fromJavaEnum(orientation));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static <T> void ImageWindowDisplayImage(
      java.lang.Long winIndex, PylonBuffer<T> buffer, PylonGrabResult_t grabResult) {
    try {
      Javonet.getType("PylonC.NET.Pylon")
          .invoke("ImageWindowDisplayImage", winIndex, buffer, grabResult);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void GigEIssueActionCommand(
      java.lang.Long deviceKey,
      java.lang.Long groupKey,
      java.lang.Long groupMask,
      java.lang.String broadcastAddress) {
    try {
      Javonet.getType("PylonC.NET.Pylon")
          .invoke("GigEIssueActionCommand", deviceKey, groupKey, groupMask, broadcastAddress);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean GigEIssueActionCommand(
      java.lang.Long deviceKey,
      java.lang.Long groupKey,
      java.lang.Long groupMask,
      java.lang.String broadcastAddress,
      java.lang.Long timeoutMs,
      java.lang.Long numResults,
      PylonGigEActionCommandResult_t[] results) {
    try {
      java.lang.Boolean res =
          Javonet.getType("PylonC.NET.Pylon")
              .invoke(
                  "GigEIssueActionCommand",
                  deviceKey,
                  groupKey,
                  groupMask,
                  broadcastAddress,
                  timeoutMs,
                  numResults,
                  new Object[] {results});
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void GigEIssueScheduledActionCommand(
      java.lang.Long deviceKey,
      java.lang.Long groupKey,
      java.lang.Long groupMask,
      java.math.BigInteger actiontimeNs,
      java.lang.String broadcastAddress) {
    try {
      Javonet.getType("PylonC.NET.Pylon")
          .invoke(
              "GigEIssueScheduledActionCommand",
              deviceKey,
              groupKey,
              groupMask,
              actiontimeNs,
              broadcastAddress);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean GigEIssueScheduledActionCommand(
      java.lang.Long deviceKey,
      java.lang.Long groupKey,
      java.lang.Long groupMask,
      java.math.BigInteger actiontimeNs,
      java.lang.String broadcastAddress,
      java.lang.Long timeoutMs,
      java.lang.Long numResults,
      PylonGigEActionCommandResult_t[] results) {
    try {
      java.lang.Boolean res =
          Javonet.getType("PylonC.NET.Pylon")
              .invoke(
                  "GigEIssueScheduledActionCommand",
                  deviceKey,
                  groupKey,
                  groupMask,
                  actiontimeNs,
                  broadcastAddress,
                  timeoutMs,
                  numResults,
                  new Object[] {results});
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean DeviceFeatureIsAvailable(
      PYLON_DEVICE_HANDLE hDev, java.lang.String name) {
    try {
      java.lang.Boolean res =
          Javonet.getType("PylonC.NET.Pylon").invoke("DeviceFeatureIsAvailable", hDev, name);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean DeviceFeatureIsReadable(
      PYLON_DEVICE_HANDLE hDev, java.lang.String name) {
    try {
      java.lang.Boolean res =
          Javonet.getType("PylonC.NET.Pylon").invoke("DeviceFeatureIsReadable", hDev, name);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean DeviceFeatureIsWritable(
      PYLON_DEVICE_HANDLE hDev, java.lang.String name) {
    try {
      java.lang.Boolean res =
          Javonet.getType("PylonC.NET.Pylon").invoke("DeviceFeatureIsWritable", hDev, name);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void GigEGetPersistentIpAddress(
      PYLON_DEVICE_HANDLE hDev,
      AtomicReference<java.lang.String> ipAddress,
      AtomicReference<java.lang.String> subnetMask,
      AtomicReference<java.lang.String> defaultGateway) {
    try {
      Javonet.getType("PylonC.NET.Pylon")
          .invoke(
              "GigEGetPersistentIpAddress",
              hDev,
              new NOut(ipAddress, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)),
              new NOut(subnetMask, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)),
              new NOut(defaultGateway, JavonetHelper.JavaToDotnetType.get(java.lang.String.class)));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String FeaturePersistenceSaveToString(NODEMAP_HANDLE hMap) {
    try {
      java.lang.String res =
          Javonet.getType("PylonC.NET.Pylon").invoke("FeaturePersistenceSaveToString", hMap);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void Initialize() {
    try {
      Javonet.getType("PylonC.NET.Pylon").invoke("Initialize");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void Terminate() {
    try {
      Javonet.getType("PylonC.NET.Pylon").invoke("Terminate");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static <T> java.lang.Boolean DeviceGrabSingleFrame(
      PYLON_DEVICE_HANDLE hDev,
      java.lang.Integer channel,
      PylonBuffer<T> buffer,
      PylonGrabResult_t grabResult,
      java.lang.Long timeout) {
    try {
      java.lang.Boolean res =
          Javonet.getType("PylonC.NET.Pylon")
              .invoke("DeviceGrabSingleFrame", hDev, channel, buffer, grabResult, timeout);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static <T> PYLON_STREAMBUFFER_HANDLE StreamGrabberRegisterBuffer(
      PYLON_STREAMGRABBER_HANDLE hStg, PylonBuffer<T> buffer) {
    try {
      Object res =
          Javonet.getType("PylonC.NET.Pylon").invoke("StreamGrabberRegisterBuffer", hStg, buffer);
      if (res == null) return null;
      return new PYLON_STREAMBUFFER_HANDLE((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void StreamGrabberQueueBuffer(
      PYLON_STREAMGRABBER_HANDLE hStg, PYLON_STREAMBUFFER_HANDLE hBuf, java.lang.Integer context) {
    try {
      Javonet.getType("PylonC.NET.Pylon").invoke("StreamGrabberQueueBuffer", hStg, hBuf, context);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean StreamGrabberRetrieveResult(
      PYLON_STREAMGRABBER_HANDLE hStg, PylonGrabResult_t grabResult) {
    try {
      java.lang.Boolean res =
          Javonet.getType("PylonC.NET.Pylon")
              .invoke("StreamGrabberRetrieveResult", hStg, grabResult);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static <TargetT, SourceT> void PixelFormatConverterConvert(
      PYLON_FORMAT_CONVERTER_HANDLE hConv,
      PylonBuffer<TargetT> targetBuffer,
      PylonBuffer<SourceT> sourceBuffer) {
    try {
      Javonet.getType("PylonC.NET.Pylon")
          .invoke("PixelFormatConverterConvert", hConv, targetBuffer, sourceBuffer);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static <T> void ImageFormatConverterConvert(
      PYLON_IMAGE_FORMAT_CONVERTER_HANDLE hConv,
      PylonBuffer<T> targetBuffer,
      PylonBuffer<T> sourceBuffer,
      EPylonPixelType sourcePixelType,
      java.lang.Long sourceWidth,
      java.lang.Long sourceHeight,
      java.lang.Long sourcePaddingX,
      EPylonImageOrientation sourceOrientation) {
    try {
      Javonet.getType("PylonC.NET.Pylon")
          .invoke(
              "ImageFormatConverterConvert",
              hConv,
              targetBuffer,
              sourceBuffer,
              NEnum.fromJavaEnum(sourcePixelType),
              sourceWidth,
              sourceHeight,
              sourcePaddingX,
              NEnum.fromJavaEnum(sourceOrientation));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean EventGrabberRetrieveEvent(
      PYLON_EVENTGRABBER_HANDLE hEvg, PylonEventResult_t eventResult) {
    try {
      java.lang.Boolean res =
          Javonet.getType("PylonC.NET.Pylon")
              .invoke("EventGrabberRetrieveEvent", hEvg, eventResult);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void EventAdapterDeliverMessage(
      PYLON_EVENTADAPTER_HANDLE hEva, PylonEventResult_t eventResult) {
    try {
      Javonet.getType("PylonC.NET.Pylon").invoke("EventAdapterDeliverMessage", hEva, eventResult);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static <T> void ChunkParserAttachBuffer(
      PYLON_CHUNKPARSER_HANDLE hChp, PylonBuffer<T> buffer) {
    try {
      Javonet.getType("PylonC.NET.Pylon").invoke("ChunkParserAttachBuffer", hChp, buffer);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static <T> void ChunkParserUpdateBuffer(
      PYLON_CHUNKPARSER_HANDLE hChp, PylonBuffer<T> buffer) {
    try {
      Javonet.getType("PylonC.NET.Pylon").invoke("ChunkParserUpdateBuffer", hChp, buffer);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void DeviceDeregisterRemovalCallback(
      PYLON_DEVICE_HANDLE hDev, PYLON_DEVICECALLBACK_HANDLE hCb) {
    try {
      Javonet.getType("PylonC.NET.Pylon").invoke("DeviceDeregisterRemovalCallback", hDev, hCb);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static PYLON_DEVICECALLBACK_HANDLE DeviceRegisterRemovalCallback(
      PYLON_DEVICE_HANDLE hDev, DeviceCallbackHandler cbFunction) {
    try {
      Object res =
          Javonet.getType("PylonC.NET.Pylon")
              .invoke("DeviceRegisterRemovalCallback", hDev, cbFunction);
      if (res == null) return null;
      return new PYLON_DEVICECALLBACK_HANDLE((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void DestroyDevice(PYLON_DEVICE_HANDLE hDev) {
    try {
      Javonet.getType("PylonC.NET.Pylon").invoke("DestroyDevice", hDev);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static PYLON_IMAGE_FORMAT_CONVERTER_HANDLE ImageFormatConverterCreate() {
    try {
      Object res = Javonet.getType("PylonC.NET.Pylon").invoke("ImageFormatConverterCreate");
      if (res == null) return null;
      return new PYLON_IMAGE_FORMAT_CONVERTER_HANDLE((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static NODEMAP_HANDLE ImageFormatConverterGetNodeMap(
      PYLON_IMAGE_FORMAT_CONVERTER_HANDLE hConv) {
    try {
      Object res =
          Javonet.getType("PylonC.NET.Pylon").invoke("ImageFormatConverterGetNodeMap", hConv);
      if (res == null) return null;
      return new NODEMAP_HANDLE((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void ImageFormatConverterSetOutputPixelFormat(
      PYLON_IMAGE_FORMAT_CONVERTER_HANDLE hConv, EPylonPixelType pixelType) {
    try {
      Javonet.getType("PylonC.NET.Pylon")
          .invoke("ImageFormatConverterSetOutputPixelFormat", hConv, NEnum.fromJavaEnum(pixelType));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static EPylonPixelType ImageFormatConverterGetOutputPixelFormat(
      PYLON_IMAGE_FORMAT_CONVERTER_HANDLE hConv) {
    try {
      Object res =
          Javonet.getType("PylonC.NET.Pylon")
              .invoke("ImageFormatConverterGetOutputPixelFormat", hConv);
      if (res == null) return null;
      return EPylonPixelType.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void ImageFormatConverterSetOutputPaddingX(
      PYLON_IMAGE_FORMAT_CONVERTER_HANDLE hConv, java.lang.Long paddingX) {
    try {
      Javonet.getType("PylonC.NET.Pylon")
          .invoke("ImageFormatConverterSetOutputPaddingX", hConv, paddingX);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Long ImageFormatConverterGetOutputPaddingX(
      PYLON_IMAGE_FORMAT_CONVERTER_HANDLE hConv) {
    try {
      java.lang.Long res =
          Javonet.getType("PylonC.NET.Pylon")
              .invoke("ImageFormatConverterGetOutputPaddingX", hConv);
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Long ImageFormatConverterGetBufferSizeForConversion(
      PYLON_IMAGE_FORMAT_CONVERTER_HANDLE hConv,
      EPylonPixelType sourcePixelType,
      java.lang.Long sourceWidth,
      java.lang.Long sourceHeight) {
    try {
      java.lang.Long res =
          Javonet.getType("PylonC.NET.Pylon")
              .invoke(
                  "ImageFormatConverterGetBufferSizeForConversion",
                  hConv,
                  NEnum.fromJavaEnum(sourcePixelType),
                  sourceWidth,
                  sourceHeight);
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void ImageFormatConverterDestroy(PYLON_IMAGE_FORMAT_CONVERTER_HANDLE hConv) {
    try {
      Javonet.getType("PylonC.NET.Pylon").invoke("ImageFormatConverterDestroy", hConv);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static PYLON_AVI_WRITER_HANDLE AviWriterCreate() {
    try {
      Object res = Javonet.getType("PylonC.NET.Pylon").invoke("AviWriterCreate");
      if (res == null) return null;
      return new PYLON_AVI_WRITER_HANDLE((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void AviWriterDestroy(PYLON_AVI_WRITER_HANDLE hWriter) {
    try {
      Javonet.getType("PylonC.NET.Pylon").invoke("AviWriterDestroy", hWriter);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void AviWriterClose(PYLON_AVI_WRITER_HANDLE hWriter) {
    try {
      Javonet.getType("PylonC.NET.Pylon").invoke("AviWriterClose", hWriter);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean AviWriterIsOpen(PYLON_AVI_WRITER_HANDLE hWriter) {
    try {
      java.lang.Boolean res =
          Javonet.getType("PylonC.NET.Pylon").invoke("AviWriterIsOpen", hWriter);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean AviWriterCanAddWithoutConversion(
      PYLON_AVI_WRITER_HANDLE hWriter,
      EPylonPixelType pixelType,
      java.lang.Long width,
      java.lang.Long height,
      java.lang.Long paddingX,
      EPylonImageOrientation orientation) {
    try {
      java.lang.Boolean res =
          Javonet.getType("PylonC.NET.Pylon")
              .invoke(
                  "AviWriterCanAddWithoutConversion",
                  hWriter,
                  NEnum.fromJavaEnum(pixelType),
                  width,
                  height,
                  paddingX,
                  NEnum.fromJavaEnum(orientation));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Long AviWriterGetImageDataBytesWritten(PYLON_AVI_WRITER_HANDLE hWriter) {
    try {
      java.lang.Long res =
          Javonet.getType("PylonC.NET.Pylon").invoke("AviWriterGetImageDataBytesWritten", hWriter);
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Long AviWriterGetCountOfAddedImages(PYLON_AVI_WRITER_HANDLE hWriter) {
    try {
      java.lang.Long res =
          Javonet.getType("PylonC.NET.Pylon").invoke("AviWriterGetCountOfAddedImages", hWriter);
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void ImageWindowCreate(
      java.lang.Long winIndex,
      java.lang.Integer x,
      java.lang.Integer y,
      java.lang.Integer nWidth,
      java.lang.Integer nHeight) {
    try {
      Javonet.getType("PylonC.NET.Pylon")
          .invoke("ImageWindowCreate", winIndex, x, y, nWidth, nHeight);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void ImageWindowHide(java.lang.Long winIndex) {
    try {
      Javonet.getType("PylonC.NET.Pylon").invoke("ImageWindowHide", winIndex);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void ImageWindowClose(java.lang.Long winIndex) {
    try {
      Javonet.getType("PylonC.NET.Pylon").invoke("ImageWindowClose", winIndex);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String DeviceInfoGetPropertyValueByName(
      PYLON_DEVICE_INFO_HANDLE hDi, java.lang.String name) {
    try {
      java.lang.String res =
          Javonet.getType("PylonC.NET.Pylon").invoke("DeviceInfoGetPropertyValueByName", hDi, name);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String DeviceInfoGetPropertyValueByIndex(
      PYLON_DEVICE_INFO_HANDLE hDi, java.lang.Long index) {
    try {
      java.lang.String res =
          Javonet.getType("PylonC.NET.Pylon")
              .invoke("DeviceInfoGetPropertyValueByIndex", hDi, index);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String DeviceInfoGetPropertyName(
      PYLON_DEVICE_INFO_HANDLE hDi, java.lang.Long index) {
    try {
      java.lang.String res =
          Javonet.getType("PylonC.NET.Pylon").invoke("DeviceInfoGetPropertyName", hDi, index);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String DeviceFeatureToString(
      PYLON_DEVICE_HANDLE hDev, java.lang.String name) {
    try {
      java.lang.String res =
          Javonet.getType("PylonC.NET.Pylon").invoke("DeviceFeatureToString", hDev, name);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean DeviceFeatureIsImplemented(
      PYLON_DEVICE_HANDLE hDev, java.lang.String name) {
    try {
      java.lang.Boolean res =
          Javonet.getType("PylonC.NET.Pylon").invoke("DeviceFeatureIsImplemented", hDev, name);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static EPylonWaitExResult WaitObjectsWaitForAllEx(
      PYLON_WAITOBJECTS_HANDLE hWos, java.lang.Long timeout, java.lang.Boolean alertable) {
    try {
      Object res =
          Javonet.getType("PylonC.NET.Pylon")
              .invoke("WaitObjectsWaitForAllEx", hWos, timeout, alertable);
      if (res == null) return null;
      return EPylonWaitExResult.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static EPylonWaitExResult WaitObjectsWaitForAnyEx(
      PYLON_WAITOBJECTS_HANDLE hWos,
      java.lang.Long timeout,
      AtomicReference<java.lang.Long> index,
      java.lang.Boolean alertable) {
    try {
      Object res =
          Javonet.getType("PylonC.NET.Pylon")
              .invoke(
                  "WaitObjectsWaitForAnyEx",
                  hWos,
                  timeout,
                  new NOut(index, JavonetHelper.JavaToDotnetType.get(java.lang.Long.class)),
                  alertable);
      if (res == null) return null;
      return EPylonWaitExResult.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void EventGrabberOpen(PYLON_EVENTGRABBER_HANDLE hEvg) {
    try {
      Javonet.getType("PylonC.NET.Pylon").invoke("EventGrabberOpen", hEvg);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void EventGrabberClose(PYLON_EVENTGRABBER_HANDLE hEvg) {
    try {
      Javonet.getType("PylonC.NET.Pylon").invoke("EventGrabberClose", hEvg);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean EventGrabberIsOpen(PYLON_EVENTGRABBER_HANDLE hEvg) {
    try {
      java.lang.Boolean res =
          Javonet.getType("PylonC.NET.Pylon").invoke("EventGrabberIsOpen", hEvg);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static PYLON_WAITOBJECT_HANDLE EventGrabberGetWaitObject(PYLON_EVENTGRABBER_HANDLE hEvg) {
    try {
      Object res = Javonet.getType("PylonC.NET.Pylon").invoke("EventGrabberGetWaitObject", hEvg);
      if (res == null) return null;
      return new PYLON_WAITOBJECT_HANDLE((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static NODEMAP_HANDLE EventGrabberGetNodeMap(PYLON_EVENTGRABBER_HANDLE hEvg) {
    try {
      Object res = Javonet.getType("PylonC.NET.Pylon").invoke("EventGrabberGetNodeMap", hEvg);
      if (res == null) return null;
      return new NODEMAP_HANDLE((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Long EventGrabberGetNumBuffers(PYLON_EVENTGRABBER_HANDLE hEvg) {
    try {
      java.lang.Long res =
          Javonet.getType("PylonC.NET.Pylon").invoke("EventGrabberGetNumBuffers", hEvg);
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void EventGrabberSetNumBuffers(
      PYLON_EVENTGRABBER_HANDLE hEvg, java.lang.Long numBuffers) {
    try {
      Javonet.getType("PylonC.NET.Pylon").invoke("EventGrabberSetNumBuffers", hEvg, numBuffers);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void ChunkParserDetachBuffer(PYLON_CHUNKPARSER_HANDLE hChp) {
    try {
      Javonet.getType("PylonC.NET.Pylon").invoke("ChunkParserDetachBuffer", hChp);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean ChunkParserHasCRC(PYLON_CHUNKPARSER_HANDLE hChp) {
    try {
      java.lang.Boolean res = Javonet.getType("PylonC.NET.Pylon").invoke("ChunkParserHasCRC", hChp);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean ChunkParserCheckCRC(PYLON_CHUNKPARSER_HANDLE hChp) {
    try {
      java.lang.Boolean res =
          Javonet.getType("PylonC.NET.Pylon").invoke("ChunkParserCheckCRC", hChp);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static PYLON_FORMAT_CONVERTER_HANDLE PixelFormatConverterCreate(
      PYLON_DEVICE_HANDLE hDev, java.lang.Integer outAlign) {
    try {
      Object res =
          Javonet.getType("PylonC.NET.Pylon").invoke("PixelFormatConverterCreate", hDev, outAlign);
      if (res == null) return null;
      return new PYLON_FORMAT_CONVERTER_HANDLE((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Long PixelFormatConverterGetOutputBufferSize(
      PYLON_FORMAT_CONVERTER_HANDLE hConv) {
    try {
      java.lang.Long res =
          Javonet.getType("PylonC.NET.Pylon")
              .invoke("PixelFormatConverterGetOutputBufferSize", hConv);
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void PixelFormatConverterDestroy(PYLON_FORMAT_CONVERTER_HANDLE hConv) {
    try {
      Javonet.getType("PylonC.NET.Pylon").invoke("PixelFormatConverterDestroy", hConv);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer BitsPerPixel(EPylonPixelType pixelType) {
    try {
      java.lang.Integer res =
          Javonet.getType("PylonC.NET.Pylon").invoke("BitsPerPixel", NEnum.fromJavaEnum(pixelType));
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean IsMono(EPylonPixelType pixelType) {
    try {
      java.lang.Boolean res =
          Javonet.getType("PylonC.NET.Pylon").invoke("IsMono", NEnum.fromJavaEnum(pixelType));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean IsBayer(EPylonPixelType pixelType) {
    try {
      java.lang.Boolean res =
          Javonet.getType("PylonC.NET.Pylon").invoke("IsBayer", NEnum.fromJavaEnum(pixelType));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static EPylonPixelType PixelTypeFromString(java.lang.String aString) {
    try {
      Object res = Javonet.getType("PylonC.NET.Pylon").invoke("PixelTypeFromString", aString);
      if (res == null) return null;
      return EPylonPixelType.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static PYLON_WAITOBJECT_HANDLE WaitObjectFromW32(
      SafeWaitHandle hW32, java.lang.Boolean duplicate) {
    try {
      Object res = Javonet.getType("PylonC.NET.Pylon").invoke("WaitObjectFromW32", hW32, duplicate);
      if (res == null) return null;
      return new PYLON_WAITOBJECT_HANDLE((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void FeaturePersistenceSave(NODEMAP_HANDLE hMap, java.lang.String fileName) {
    try {
      Javonet.getType("PylonC.NET.Pylon").invoke("FeaturePersistenceSave", hMap, fileName);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void FeaturePersistenceLoad(
      NODEMAP_HANDLE hMap, java.lang.String fileName, java.lang.Boolean verify) {
    try {
      Javonet.getType("PylonC.NET.Pylon").invoke("FeaturePersistenceLoad", hMap, fileName, verify);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void FeaturePersistenceLoadFromString(
      NODEMAP_HANDLE hMap, java.lang.String features, java.lang.Boolean verify) {
    try {
      Javonet.getType("PylonC.NET.Pylon")
          .invoke("FeaturePersistenceLoadFromString", hMap, features, verify);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static PYLON_WAITOBJECT_HANDLE StreamGrabberGetWaitObject(
      PYLON_STREAMGRABBER_HANDLE hStg) {
    try {
      Object res = Javonet.getType("PylonC.NET.Pylon").invoke("StreamGrabberGetWaitObject", hStg);
      if (res == null) return null;
      return new PYLON_WAITOBJECT_HANDLE((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void StreamGrabberSetMaxNumBuffer(
      PYLON_STREAMGRABBER_HANDLE hStg, java.lang.Long numBuffers) {
    try {
      Javonet.getType("PylonC.NET.Pylon").invoke("StreamGrabberSetMaxNumBuffer", hStg, numBuffers);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Long StreamGrabberGetMaxNumBuffer(PYLON_STREAMGRABBER_HANDLE hStg) {
    try {
      java.lang.Long res =
          Javonet.getType("PylonC.NET.Pylon").invoke("StreamGrabberGetMaxNumBuffer", hStg);
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void StreamGrabberSetMaxBufferSize(
      PYLON_STREAMGRABBER_HANDLE hStg, java.lang.Long maxSize) {
    try {
      Javonet.getType("PylonC.NET.Pylon").invoke("StreamGrabberSetMaxBufferSize", hStg, maxSize);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Long StreamGrabberGetMaxBufferSize(PYLON_STREAMGRABBER_HANDLE hStg) {
    try {
      java.lang.Long res =
          Javonet.getType("PylonC.NET.Pylon").invoke("StreamGrabberGetMaxBufferSize", hStg);
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void StreamGrabberDeregisterBuffer(
      PYLON_STREAMGRABBER_HANDLE hStg, PYLON_STREAMBUFFER_HANDLE hBuf) {
    try {
      Javonet.getType("PylonC.NET.Pylon").invoke("StreamGrabberDeregisterBuffer", hStg, hBuf);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void StreamGrabberPrepareGrab(PYLON_STREAMGRABBER_HANDLE hStg) {
    try {
      Javonet.getType("PylonC.NET.Pylon").invoke("StreamGrabberPrepareGrab", hStg);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void StreamGrabberFinishGrab(PYLON_STREAMGRABBER_HANDLE hStg) {
    try {
      Javonet.getType("PylonC.NET.Pylon").invoke("StreamGrabberFinishGrab", hStg);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void StreamGrabberCancelGrab(PYLON_STREAMGRABBER_HANDLE hStg) {
    try {
      Javonet.getType("PylonC.NET.Pylon").invoke("StreamGrabberCancelGrab", hStg);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static NODEMAP_HANDLE StreamGrabberGetNodeMap(PYLON_STREAMGRABBER_HANDLE hStg) {
    try {
      Object res = Javonet.getType("PylonC.NET.Pylon").invoke("StreamGrabberGetNodeMap", hStg);
      if (res == null) return null;
      return new NODEMAP_HANDLE((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean WaitObjectIsValid(PYLON_WAITOBJECT_HANDLE hWobj) {
    try {
      java.lang.Boolean res =
          Javonet.getType("PylonC.NET.Pylon").invoke("WaitObjectIsValid", hWobj);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean WaitObjectWait(
      PYLON_WAITOBJECT_HANDLE hWobj, java.lang.Long timeout) {
    try {
      java.lang.Boolean res =
          Javonet.getType("PylonC.NET.Pylon").invoke("WaitObjectWait", hWobj, timeout);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static EPylonWaitExResult WaitObjectWaitEx(
      PYLON_WAITOBJECT_HANDLE hWobj, java.lang.Long timeout, java.lang.Boolean alertable) {
    try {
      Object res =
          Javonet.getType("PylonC.NET.Pylon").invoke("WaitObjectWaitEx", hWobj, timeout, alertable);
      if (res == null) return null;
      return EPylonWaitExResult.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static PYLON_WAITOBJECT_HANDLE WaitObjectCreate() {
    try {
      Object res = Javonet.getType("PylonC.NET.Pylon").invoke("WaitObjectCreate");
      if (res == null) return null;
      return new PYLON_WAITOBJECT_HANDLE((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void WaitObjectDestroy(PYLON_WAITOBJECT_HANDLE hWobj) {
    try {
      Javonet.getType("PylonC.NET.Pylon").invoke("WaitObjectDestroy", hWobj);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void WaitObjectSignal(PYLON_WAITOBJECT_HANDLE hWobj) {
    try {
      Javonet.getType("PylonC.NET.Pylon").invoke("WaitObjectSignal", hWobj);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void WaitObjectReset(PYLON_WAITOBJECT_HANDLE hWobj) {
    try {
      Javonet.getType("PylonC.NET.Pylon").invoke("WaitObjectReset", hWobj);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static PYLON_WAITOBJECTS_HANDLE WaitObjectsCreate() {
    try {
      Object res = Javonet.getType("PylonC.NET.Pylon").invoke("WaitObjectsCreate");
      if (res == null) return null;
      return new PYLON_WAITOBJECTS_HANDLE((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void WaitObjectsDestroy(PYLON_WAITOBJECTS_HANDLE hWos) {
    try {
      Javonet.getType("PylonC.NET.Pylon").invoke("WaitObjectsDestroy", hWos);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Long WaitObjectsAdd(
      PYLON_WAITOBJECTS_HANDLE hWos, PYLON_WAITOBJECT_HANDLE hWobj) {
    try {
      java.lang.Long res =
          Javonet.getType("PylonC.NET.Pylon").invoke("WaitObjectsAdd", hWos, hWobj);
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void WaitObjectsRemoveAll(PYLON_WAITOBJECTS_HANDLE hWos) {
    try {
      Javonet.getType("PylonC.NET.Pylon").invoke("WaitObjectsRemoveAll", hWos);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean WaitObjectsWaitForAll(
      PYLON_WAITOBJECTS_HANDLE hWos, java.lang.Long timeout) {
    try {
      java.lang.Boolean res =
          Javonet.getType("PylonC.NET.Pylon").invoke("WaitObjectsWaitForAll", hWos, timeout);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean WaitObjectsWaitForAny(
      PYLON_WAITOBJECTS_HANDLE hWos,
      java.lang.Long timeout,
      AtomicReference<java.lang.Long> index) {
    try {
      java.lang.Boolean res =
          Javonet.getType("PylonC.NET.Pylon")
              .invoke(
                  "WaitObjectsWaitForAny",
                  hWos,
                  timeout,
                  new NOut(index, JavonetHelper.JavaToDotnetType.get(java.lang.Long.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static NODEMAP_HANDLE DeviceGetTLNodeMap(PYLON_DEVICE_HANDLE hDev) {
    try {
      Object res = Javonet.getType("PylonC.NET.Pylon").invoke("DeviceGetTLNodeMap", hDev);
      if (res == null) return null;
      return new NODEMAP_HANDLE((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static PYLON_CHUNKPARSER_HANDLE DeviceCreateChunkParser(PYLON_DEVICE_HANDLE hDev) {
    try {
      Object res = Javonet.getType("PylonC.NET.Pylon").invoke("DeviceCreateChunkParser", hDev);
      if (res == null) return null;
      return new PYLON_CHUNKPARSER_HANDLE((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void DeviceDestroyChunkParser(
      PYLON_DEVICE_HANDLE hDev, PYLON_CHUNKPARSER_HANDLE hChp) {
    try {
      Javonet.getType("PylonC.NET.Pylon").invoke("DeviceDestroyChunkParser", hDev, hChp);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static PYLON_EVENTADAPTER_HANDLE DeviceCreateEventAdapter(PYLON_DEVICE_HANDLE hDev) {
    try {
      Object res = Javonet.getType("PylonC.NET.Pylon").invoke("DeviceCreateEventAdapter", hDev);
      if (res == null) return null;
      return new PYLON_EVENTADAPTER_HANDLE((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void DeviceDestroyEventAdapter(
      PYLON_DEVICE_HANDLE hDev, PYLON_EVENTADAPTER_HANDLE hEva) {
    try {
      Javonet.getType("PylonC.NET.Pylon").invoke("DeviceDestroyEventAdapter", hDev, hEva);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void DeviceSetIntegerFeature(
      PYLON_DEVICE_HANDLE hDev, java.lang.String name, java.lang.Long value) {
    try {
      Javonet.getType("PylonC.NET.Pylon").invoke("DeviceSetIntegerFeature", hDev, name, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Long DeviceGetIntegerFeature(
      PYLON_DEVICE_HANDLE hDev, java.lang.String name) {
    try {
      java.lang.Long res =
          Javonet.getType("PylonC.NET.Pylon").invoke("DeviceGetIntegerFeature", hDev, name);
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Long DeviceGetIntegerFeatureMin(
      PYLON_DEVICE_HANDLE hDev, java.lang.String name) {
    try {
      java.lang.Long res =
          Javonet.getType("PylonC.NET.Pylon").invoke("DeviceGetIntegerFeatureMin", hDev, name);
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Long DeviceGetIntegerFeatureMax(
      PYLON_DEVICE_HANDLE hDev, java.lang.String name) {
    try {
      java.lang.Long res =
          Javonet.getType("PylonC.NET.Pylon").invoke("DeviceGetIntegerFeatureMax", hDev, name);
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Long DeviceGetIntegerFeatureInc(
      PYLON_DEVICE_HANDLE hDev, java.lang.String name) {
    try {
      java.lang.Long res =
          Javonet.getType("PylonC.NET.Pylon").invoke("DeviceGetIntegerFeatureInc", hDev, name);
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void DeviceSetFloatFeature(
      PYLON_DEVICE_HANDLE hDev, java.lang.String name, java.lang.Double value) {
    try {
      Javonet.getType("PylonC.NET.Pylon").invoke("DeviceSetFloatFeature", hDev, name, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Double DeviceGetFloatFeature(
      PYLON_DEVICE_HANDLE hDev, java.lang.String name) {
    try {
      java.lang.Double res =
          Javonet.getType("PylonC.NET.Pylon").invoke("DeviceGetFloatFeature", hDev, name);
      if (res == null) return 0.0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0.0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Double DeviceGetFloatFeatureMin(
      PYLON_DEVICE_HANDLE hDev, java.lang.String name) {
    try {
      java.lang.Double res =
          Javonet.getType("PylonC.NET.Pylon").invoke("DeviceGetFloatFeatureMin", hDev, name);
      if (res == null) return 0.0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0.0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Double DeviceGetFloatFeatureMax(
      PYLON_DEVICE_HANDLE hDev, java.lang.String name) {
    try {
      java.lang.Double res =
          Javonet.getType("PylonC.NET.Pylon").invoke("DeviceGetFloatFeatureMax", hDev, name);
      if (res == null) return 0.0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0.0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void DeviceSetBooleanFeature(
      PYLON_DEVICE_HANDLE hDev, java.lang.String name, java.lang.Boolean value) {
    try {
      Javonet.getType("PylonC.NET.Pylon").invoke("DeviceSetBooleanFeature", hDev, name, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean DeviceGetBooleanFeature(
      PYLON_DEVICE_HANDLE hDev, java.lang.String name) {
    try {
      java.lang.Boolean res =
          Javonet.getType("PylonC.NET.Pylon").invoke("DeviceGetBooleanFeature", hDev, name);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void DeviceExecuteCommandFeature(PYLON_DEVICE_HANDLE hDev, java.lang.String name) {
    try {
      Javonet.getType("PylonC.NET.Pylon").invoke("DeviceExecuteCommandFeature", hDev, name);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean DeviceIsCommandDone(
      PYLON_DEVICE_HANDLE hDev, java.lang.String name) {
    try {
      java.lang.Boolean res =
          Javonet.getType("PylonC.NET.Pylon").invoke("DeviceIsCommandDone", hDev, name);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void DeviceFeatureFromString(
      PYLON_DEVICE_HANDLE hDev, java.lang.String name, java.lang.String value) {
    try {
      Javonet.getType("PylonC.NET.Pylon").invoke("DeviceFeatureFromString", hDev, name, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static EGenApiAccessMode DeviceFeatureGetAccessMode(
      PYLON_DEVICE_HANDLE hDev, java.lang.String name) {
    try {
      Object res =
          Javonet.getType("PylonC.NET.Pylon").invoke("DeviceFeatureGetAccessMode", hDev, name);
      if (res == null) return null;
      return EGenApiAccessMode.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void StreamGrabberOpen(PYLON_STREAMGRABBER_HANDLE hStg) {
    try {
      Javonet.getType("PylonC.NET.Pylon").invoke("StreamGrabberOpen", hStg);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void StreamGrabberClose(PYLON_STREAMGRABBER_HANDLE hStg) {
    try {
      Javonet.getType("PylonC.NET.Pylon").invoke("StreamGrabberClose", hStg);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean StreamGrabberIsOpen(PYLON_STREAMGRABBER_HANDLE hStg) {
    try {
      java.lang.Boolean res =
          Javonet.getType("PylonC.NET.Pylon").invoke("StreamGrabberIsOpen", hStg);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Long EnumerateDevices() {
    try {
      java.lang.Long res = Javonet.getType("PylonC.NET.Pylon").invoke("EnumerateDevices");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Long GigEEnumerateAllDevices() {
    try {
      java.lang.Long res = Javonet.getType("PylonC.NET.Pylon").invoke("GigEEnumerateAllDevices");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void GigEForceIp(
      java.lang.String macAddress,
      java.lang.String ipAddress,
      java.lang.String subnetMask,
      java.lang.String defaultGateway) {
    try {
      Javonet.getType("PylonC.NET.Pylon")
          .invoke("GigEForceIp", macAddress, ipAddress, subnetMask, defaultGateway);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void GigERestartIpConfiguration(java.lang.String macAddress) {
    try {
      Javonet.getType("PylonC.NET.Pylon").invoke("GigERestartIpConfiguration", macAddress);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void GigEChangeIpConfiguration(
      PYLON_DEVICE_HANDLE hDev,
      java.lang.Boolean EnablePersistentIp,
      java.lang.Boolean EnableDhcp) {
    try {
      Javonet.getType("PylonC.NET.Pylon")
          .invoke("GigEChangeIpConfiguration", hDev, EnablePersistentIp, EnableDhcp);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void GigESetPersistentIpAddress(
      PYLON_DEVICE_HANDLE hDev,
      java.lang.String ipAddress,
      java.lang.String subnetMask,
      java.lang.String defaultGateway) {
    try {
      Javonet.getType("PylonC.NET.Pylon")
          .invoke("GigESetPersistentIpAddress", hDev, ipAddress, subnetMask, defaultGateway);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void GigEAnnounceRemoteDevice(java.lang.String ipAddress) {
    try {
      Javonet.getType("PylonC.NET.Pylon").invoke("GigEAnnounceRemoteDevice", ipAddress);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean GigERenounceRemoteDevice(java.lang.String ipAddress) {
    try {
      java.lang.Boolean res =
          Javonet.getType("PylonC.NET.Pylon").invoke("GigERenounceRemoteDevice", ipAddress);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void GigEBroadcastIpConfiguration(
      java.lang.String macAddress,
      java.lang.Boolean EnablePersistentIp,
      java.lang.Boolean EnableDHCP,
      java.lang.String ipAddress,
      java.lang.String subnetMask,
      java.lang.String defaultGateway,
      java.lang.String userdefinedName,
      AtomicReference<java.lang.Boolean> retval) {
    try {
      Javonet.getType("PylonC.NET.Pylon")
          .invoke(
              "GigEBroadcastIpConfiguration",
              macAddress,
              EnablePersistentIp,
              EnableDHCP,
              ipAddress,
              subnetMask,
              defaultGateway,
              userdefinedName,
              new NOut(retval, JavonetHelper.JavaToDotnetType.get(java.lang.Boolean.class)));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static PYLON_DEVICE_INFO_HANDLE GetDeviceInfoHandle(java.lang.Long index) {
    try {
      Object res = Javonet.getType("PylonC.NET.Pylon").invoke("GetDeviceInfoHandle", index);
      if (res == null) return null;
      return new PYLON_DEVICE_INFO_HANDLE((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Long DeviceInfoGetNumProperties(PYLON_DEVICE_INFO_HANDLE hDi) {
    try {
      java.lang.Long res =
          Javonet.getType("PylonC.NET.Pylon").invoke("DeviceInfoGetNumProperties", hDi);
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static PYLON_DEVICE_HANDLE CreateDeviceByIndex(java.lang.Long index) {
    try {
      Object res = Javonet.getType("PylonC.NET.Pylon").invoke("CreateDeviceByIndex", index);
      if (res == null) return null;
      return new PYLON_DEVICE_HANDLE((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static PYLON_DEVICE_HANDLE CreateDeviceFromDirectShowID(java.lang.Integer id) {
    try {
      Object res = Javonet.getType("PylonC.NET.Pylon").invoke("CreateDeviceFromDirectShowID", id);
      if (res == null) return null;
      return new PYLON_DEVICE_HANDLE((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean IsDeviceAccessible(
      java.lang.Long index, java.lang.Integer accessMode) {
    try {
      java.lang.Boolean res =
          Javonet.getType("PylonC.NET.Pylon").invoke("IsDeviceAccessible", index, accessMode);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void DeviceOpen(PYLON_DEVICE_HANDLE hDev, java.lang.Integer accessMode) {
    try {
      Javonet.getType("PylonC.NET.Pylon").invoke("DeviceOpen", hDev, accessMode);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void DeviceClose(PYLON_DEVICE_HANDLE hDev) {
    try {
      Javonet.getType("PylonC.NET.Pylon").invoke("DeviceClose", hDev);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean DeviceIsOpen(PYLON_DEVICE_HANDLE hDev) {
    try {
      java.lang.Boolean res = Javonet.getType("PylonC.NET.Pylon").invoke("DeviceIsOpen", hDev);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer DeviceAccessMode(PYLON_DEVICE_HANDLE hDev) {
    try {
      java.lang.Integer res = Javonet.getType("PylonC.NET.Pylon").invoke("DeviceAccessMode", hDev);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static PYLON_DEVICE_INFO_HANDLE DeviceGetDeviceInfoHandle(PYLON_DEVICE_HANDLE hDev) {
    try {
      Object res = Javonet.getType("PylonC.NET.Pylon").invoke("DeviceGetDeviceInfoHandle", hDev);
      if (res == null) return null;
      return new PYLON_DEVICE_INFO_HANDLE((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Long DeviceGetNumStreamGrabberChannels(PYLON_DEVICE_HANDLE hDev) {
    try {
      java.lang.Long res =
          Javonet.getType("PylonC.NET.Pylon").invoke("DeviceGetNumStreamGrabberChannels", hDev);
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static PYLON_STREAMGRABBER_HANDLE DeviceGetStreamGrabber(
      PYLON_DEVICE_HANDLE hDev, java.lang.Long index) {
    try {
      Object res =
          Javonet.getType("PylonC.NET.Pylon").invoke("DeviceGetStreamGrabber", hDev, index);
      if (res == null) return null;
      return new PYLON_STREAMGRABBER_HANDLE((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static PYLON_EVENTGRABBER_HANDLE DeviceGetEventGrabber(PYLON_DEVICE_HANDLE hDev) {
    try {
      Object res = Javonet.getType("PylonC.NET.Pylon").invoke("DeviceGetEventGrabber", hDev);
      if (res == null) return null;
      return new PYLON_EVENTGRABBER_HANDLE((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static NODEMAP_HANDLE DeviceGetNodeMap(PYLON_DEVICE_HANDLE hDev) {
    try {
      Object res = Javonet.getType("PylonC.NET.Pylon").invoke("DeviceGetNodeMap", hDev);
      if (res == null) return null;
      return new NODEMAP_HANDLE((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
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

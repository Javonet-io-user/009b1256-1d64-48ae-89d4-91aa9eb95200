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

public class GenApi {
  protected NObject javonetHandle;

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static NODE_CALLBACK_HANDLE NodeRegisterCallback(
      NODE_HANDLE hNode, NodeCallbackHandler cbFunction) {
    try {
      Object res =
          Javonet.getType("PylonC.NET.GenApi").invoke("NodeRegisterCallback", hNode, cbFunction);
      if (res == null) return null;
      return new NODE_CALLBACK_HANDLE((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean FileExists(NODEMAP_HANDLE hMap, java.lang.String fileName) {
    try {
      java.lang.Boolean res =
          Javonet.getType("PylonC.NET.GenApi").invoke("FileExists", hMap, fileName);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static GENAPI_FILE_HANDLE FileOpen(
      NODEMAP_HANDLE hMap, java.lang.String fileName, EGenApiFileAccessMode accessMode) {
    try {
      Object res =
          Javonet.getType("PylonC.NET.GenApi")
              .invoke("FileOpen", hMap, fileName, NEnum.fromJavaEnum(accessMode));
      if (res == null) return null;
      return new GENAPI_FILE_HANDLE((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void FileClose(GENAPI_FILE_HANDLE hFile) {
    try {
      Javonet.getType("PylonC.NET.GenApi").invoke("FileClose", hFile);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Long SelectorGetNumSelectingFeatures(NODE_HANDLE hNode) {
    try {
      java.lang.Long res =
          Javonet.getType("PylonC.NET.GenApi").invoke("SelectorGetNumSelectingFeatures", hNode);
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static NODE_HANDLE SelectorGetSelectingFeatureByIndex(
      NODE_HANDLE hNode, java.lang.Long index) {
    try {
      Object res =
          Javonet.getType("PylonC.NET.GenApi")
              .invoke("SelectorGetSelectingFeatureByIndex", hNode, index);
      if (res == null) return null;
      return new NODE_HANDLE((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Long SelectorGetNumSelectedFeatures(NODE_HANDLE hNode) {
    try {
      java.lang.Long res =
          Javonet.getType("PylonC.NET.GenApi").invoke("SelectorGetNumSelectedFeatures", hNode);
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static NODE_HANDLE SelectorGetSelectedFeatureByIndex(
      NODE_HANDLE hNode, java.lang.Long index) {
    try {
      Object res =
          Javonet.getType("PylonC.NET.GenApi")
              .invoke("SelectorGetSelectedFeatureByIndex", hNode, index);
      if (res == null) return null;
      return new NODE_HANDLE((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String GetLastErrorMessage() {
    try {
      java.lang.String res = Javonet.getType("PylonC.NET.GenApi").invoke("GetLastErrorMessage");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String GetLastErrorDetail() {
    try {
      java.lang.String res = Javonet.getType("PylonC.NET.GenApi").invoke("GetLastErrorDetail");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String NodeGetName(NODE_HANDLE hNode) {
    try {
      java.lang.String res = Javonet.getType("PylonC.NET.GenApi").invoke("NodeGetName", hNode);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String NodeGetToolTip(NODE_HANDLE hNode) {
    try {
      java.lang.String res = Javonet.getType("PylonC.NET.GenApi").invoke("NodeGetToolTip", hNode);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String NodeGetDescription(NODE_HANDLE hNode) {
    try {
      java.lang.String res =
          Javonet.getType("PylonC.NET.GenApi").invoke("NodeGetDescription", hNode);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String NodeGetDisplayName(NODE_HANDLE hNode) {
    try {
      java.lang.String res =
          Javonet.getType("PylonC.NET.GenApi").invoke("NodeGetDisplayName", hNode);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String NodeToString(NODE_HANDLE hNode) {
    try {
      java.lang.String res = Javonet.getType("PylonC.NET.GenApi").invoke("NodeToString", hNode);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String FloatGetUnit(NODE_HANDLE hNode) {
    try {
      java.lang.String res = Javonet.getType("PylonC.NET.GenApi").invoke("FloatGetUnit", hNode);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String EnumerationEntryGetSymbolic(NODE_HANDLE hNode) {
    try {
      java.lang.String res =
          Javonet.getType("PylonC.NET.GenApi").invoke("EnumerationEntryGetSymbolic", hNode);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String NodeToStringEx(NODE_HANDLE hNode, java.lang.Boolean verify) {
    try {
      java.lang.String res =
          Javonet.getType("PylonC.NET.GenApi").invoke("NodeToStringEx", hNode, verify);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static <T> java.lang.Long FileRead(GENAPI_FILE_HANDLE hFile, PylonBuffer<T> buffer) {
    try {
      java.lang.Long res = Javonet.getType("PylonC.NET.GenApi").invoke("FileRead", hFile, buffer);
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static <T> void FileWrite(
      GENAPI_FILE_HANDLE hFile, PylonBuffer<T> buffer, java.lang.Long length) {
    try {
      Javonet.getType("PylonC.NET.GenApi").invoke("FileWrite", hFile, buffer, length);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static <T> void PortRead(
      NODE_HANDLE hNode, PylonBuffer<T> buffer, java.lang.Long Address, java.lang.Long Length) {
    try {
      Javonet.getType("PylonC.NET.GenApi").invoke("PortRead", hNode, buffer, Address, Length);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static <T> void PortWrite(
      NODE_HANDLE hNode, PylonBuffer<T> buffer, java.lang.Long Address, java.lang.Long Length) {
    try {
      Javonet.getType("PylonC.NET.GenApi").invoke("PortWrite", hNode, buffer, Address, Length);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void NodeDeregisterCallback(NODE_HANDLE hNode, NODE_CALLBACK_HANDLE hCb) {
    try {
      Javonet.getType("PylonC.NET.GenApi").invoke("NodeDeregisterCallback", hNode, hCb);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static EGenApiRepresentation IntegerGetRepresentation(NODE_HANDLE hNode) {
    try {
      Object res = Javonet.getType("PylonC.NET.GenApi").invoke("IntegerGetRepresentation", hNode);
      if (res == null) return null;
      return EGenApiRepresentation.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void BooleanSetValue(NODE_HANDLE hNode, java.lang.Boolean value) {
    try {
      Javonet.getType("PylonC.NET.GenApi").invoke("BooleanSetValue", hNode, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean BooleanGetValue(NODE_HANDLE hNode) {
    try {
      java.lang.Boolean res = Javonet.getType("PylonC.NET.GenApi").invoke("BooleanGetValue", hNode);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void FloatSetValue(NODE_HANDLE hNode, java.lang.Double value) {
    try {
      Javonet.getType("PylonC.NET.GenApi").invoke("FloatSetValue", hNode, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void FloatSetValueEx(
      NODE_HANDLE hNode, java.lang.Boolean verify, java.lang.Double value) {
    try {
      Javonet.getType("PylonC.NET.GenApi").invoke("FloatSetValueEx", hNode, verify, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Double FloatGetValue(NODE_HANDLE hNode) {
    try {
      java.lang.Double res = Javonet.getType("PylonC.NET.GenApi").invoke("FloatGetValue", hNode);
      if (res == null) return 0.0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0.0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Double FloatGetValueEx(NODE_HANDLE hNode, java.lang.Boolean verify) {
    try {
      java.lang.Double res =
          Javonet.getType("PylonC.NET.GenApi").invoke("FloatGetValueEx", hNode, verify);
      if (res == null) return 0.0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0.0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Double FloatGetMin(NODE_HANDLE hNode) {
    try {
      java.lang.Double res = Javonet.getType("PylonC.NET.GenApi").invoke("FloatGetMin", hNode);
      if (res == null) return 0.0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0.0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Double FloatGetMax(NODE_HANDLE hNode) {
    try {
      java.lang.Double res = Javonet.getType("PylonC.NET.GenApi").invoke("FloatGetMax", hNode);
      if (res == null) return 0.0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0.0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static EGenApiRepresentation FloatGetRepresentation(NODE_HANDLE hNode) {
    try {
      Object res = Javonet.getType("PylonC.NET.GenApi").invoke("FloatGetRepresentation", hNode);
      if (res == null) return null;
      return EGenApiRepresentation.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void CommandExecute(NODE_HANDLE hNode) {
    try {
      Javonet.getType("PylonC.NET.GenApi").invoke("CommandExecute", hNode);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean CommandIsDone(NODE_HANDLE hNode) {
    try {
      java.lang.Boolean res = Javonet.getType("PylonC.NET.GenApi").invoke("CommandIsDone", hNode);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Long EnumerationGetNumEntries(NODE_HANDLE hNode) {
    try {
      java.lang.Long res =
          Javonet.getType("PylonC.NET.GenApi").invoke("EnumerationGetNumEntries", hNode);
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static NODE_HANDLE EnumerationGetEntryByIndex(NODE_HANDLE hNode, java.lang.Long index) {
    try {
      Object res =
          Javonet.getType("PylonC.NET.GenApi").invoke("EnumerationGetEntryByIndex", hNode, index);
      if (res == null) return null;
      return new NODE_HANDLE((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static NODE_HANDLE EnumerationGetEntryByName(NODE_HANDLE hNode, java.lang.String name) {
    try {
      Object res =
          Javonet.getType("PylonC.NET.GenApi").invoke("EnumerationGetEntryByName", hNode, name);
      if (res == null) return null;
      return new NODE_HANDLE((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Integer EnumerationEntryGetValue(NODE_HANDLE hNode) {
    try {
      java.lang.Integer res =
          Javonet.getType("PylonC.NET.GenApi").invoke("EnumerationEntryGetValue", hNode);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean NodeIsImplemented(NODE_HANDLE hNode) {
    try {
      java.lang.Boolean res =
          Javonet.getType("PylonC.NET.GenApi").invoke("NodeIsImplemented", hNode);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean NodeIsReadable(NODE_HANDLE hNode) {
    try {
      java.lang.Boolean res = Javonet.getType("PylonC.NET.GenApi").invoke("NodeIsReadable", hNode);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean NodeIsWritable(NODE_HANDLE hNode) {
    try {
      java.lang.Boolean res = Javonet.getType("PylonC.NET.GenApi").invoke("NodeIsWritable", hNode);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean NodeIsAvailable(NODE_HANDLE hNode) {
    try {
      java.lang.Boolean res = Javonet.getType("PylonC.NET.GenApi").invoke("NodeIsAvailable", hNode);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Long CategoryGetNumFeatures(NODE_HANDLE hNode) {
    try {
      java.lang.Long res =
          Javonet.getType("PylonC.NET.GenApi").invoke("CategoryGetNumFeatures", hNode);
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static NODE_HANDLE CategoryGetFeatureByIndex(NODE_HANDLE hNode, java.lang.Long index) {
    try {
      Object res =
          Javonet.getType("PylonC.NET.GenApi").invoke("CategoryGetFeatureByIndex", hNode, index);
      if (res == null) return null;
      return new NODE_HANDLE((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean FilesAreSupported(NODEMAP_HANDLE hMap) {
    try {
      java.lang.Boolean res =
          Javonet.getType("PylonC.NET.GenApi").invoke("FilesAreSupported", hMap);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static NODE_HANDLE NodeMapGetNode(NODEMAP_HANDLE hMap, java.lang.String name) {
    try {
      Object res = Javonet.getType("PylonC.NET.GenApi").invoke("NodeMapGetNode", hMap, name);
      if (res == null) return null;
      return new NODE_HANDLE((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Long NodeMapGetNumNodes(NODEMAP_HANDLE hMap) {
    try {
      java.lang.Long res = Javonet.getType("PylonC.NET.GenApi").invoke("NodeMapGetNumNodes", hMap);
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static NODE_HANDLE NodeMapGetNodeByIndex(NODEMAP_HANDLE hMap, java.lang.Long index) {
    try {
      Object res =
          Javonet.getType("PylonC.NET.GenApi").invoke("NodeMapGetNodeByIndex", hMap, index);
      if (res == null) return null;
      return new NODE_HANDLE((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void NodeMapPoll(NODEMAP_HANDLE hMap, java.lang.Long timestamp) {
    try {
      Javonet.getType("PylonC.NET.GenApi").invoke("NodeMapPoll", hMap, timestamp);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static EGenApiAccessMode NodeGetAccessMode(NODE_HANDLE hNode) {
    try {
      Object res = Javonet.getType("PylonC.NET.GenApi").invoke("NodeGetAccessMode", hNode);
      if (res == null) return null;
      return EGenApiAccessMode.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static EGenApiNameSpace NodeGetNameSpace(NODE_HANDLE hNode) {
    try {
      Object res = Javonet.getType("PylonC.NET.GenApi").invoke("NodeGetNameSpace", hNode);
      if (res == null) return null;
      return EGenApiNameSpace.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static EGenApiVisibility NodeGetVisibility(NODE_HANDLE hNode) {
    try {
      Object res = Javonet.getType("PylonC.NET.GenApi").invoke("NodeGetVisibility", hNode);
      if (res == null) return null;
      return EGenApiVisibility.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void NodeInvalidateNode(NODE_HANDLE hNode) {
    try {
      Javonet.getType("PylonC.NET.GenApi").invoke("NodeInvalidateNode", hNode);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static EGenApiCachingMode NodeGetCachingMode(NODE_HANDLE hNode) {
    try {
      Object res = Javonet.getType("PylonC.NET.GenApi").invoke("NodeGetCachingMode", hNode);
      if (res == null) return null;
      return EGenApiCachingMode.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static EGenApiNodeType NodeGetType(NODE_HANDLE hNode) {
    try {
      Object res = Javonet.getType("PylonC.NET.GenApi").invoke("NodeGetType", hNode);
      if (res == null) return null;
      return EGenApiNodeType.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Long NodeGetPollingTime(NODE_HANDLE hNode) {
    try {
      java.lang.Long res = Javonet.getType("PylonC.NET.GenApi").invoke("NodeGetPollingTime", hNode);
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void NodeImposeAccessMode(NODE_HANDLE hNode, EGenApiAccessMode imposedAccessMode) {
    try {
      Javonet.getType("PylonC.NET.GenApi")
          .invoke("NodeImposeAccessMode", hNode, NEnum.fromJavaEnum(imposedAccessMode));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void NodeImposeVisibility(NODE_HANDLE hNode, EGenApiVisibility imposedVisibility) {
    try {
      Javonet.getType("PylonC.NET.GenApi")
          .invoke("NodeImposeVisibility", hNode, NEnum.fromJavaEnum(imposedVisibility));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void NodeFromStringEx(
      NODE_HANDLE hNode, java.lang.Boolean verify, java.lang.String aString) {
    try {
      Javonet.getType("PylonC.NET.GenApi").invoke("NodeFromStringEx", hNode, verify, aString);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void NodeFromString(NODE_HANDLE hNode, java.lang.String aString) {
    try {
      Javonet.getType("PylonC.NET.GenApi").invoke("NodeFromString", hNode, aString);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static NODE_HANDLE NodeGetAlias(NODE_HANDLE hNode) {
    try {
      Object res = Javonet.getType("PylonC.NET.GenApi").invoke("NodeGetAlias", hNode);
      if (res == null) return null;
      return new NODE_HANDLE((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void IntegerSetValue(NODE_HANDLE hNode, java.lang.Long value) {
    try {
      Javonet.getType("PylonC.NET.GenApi").invoke("IntegerSetValue", hNode, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void IntegerSetValueEx(
      NODE_HANDLE hNode, java.lang.Boolean verify, java.lang.Long value) {
    try {
      Javonet.getType("PylonC.NET.GenApi").invoke("IntegerSetValueEx", hNode, verify, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Long IntegerGetValue(NODE_HANDLE hNode) {
    try {
      java.lang.Long res = Javonet.getType("PylonC.NET.GenApi").invoke("IntegerGetValue", hNode);
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Long IntegerGetValueEx(NODE_HANDLE hNode, java.lang.Boolean verify) {
    try {
      java.lang.Long res =
          Javonet.getType("PylonC.NET.GenApi").invoke("IntegerGetValueEx", hNode, verify);
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Long IntegerGetMin(NODE_HANDLE hNode) {
    try {
      java.lang.Long res = Javonet.getType("PylonC.NET.GenApi").invoke("IntegerGetMin", hNode);
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Long IntegerGetMax(NODE_HANDLE hNode) {
    try {
      java.lang.Long res = Javonet.getType("PylonC.NET.GenApi").invoke("IntegerGetMax", hNode);
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Long IntegerGetInc(NODE_HANDLE hNode) {
    try {
      java.lang.Long res = Javonet.getType("PylonC.NET.GenApi").invoke("IntegerGetInc", hNode);
      if (res == null) return null;
      return res;
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

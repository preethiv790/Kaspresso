//[kaspresso](../../index.md)/[com.kaspersky.kaspresso.interceptors.behaviorkautomator.impl.flakysafety](../index.md)/[FlakySafeObjectBehaviorInterceptor](index.md)/[interceptCheck](intercept-check.md)



# interceptCheck  
[androidJvm]  
Brief description  


Wraps the given activity invocation with the flaky safety.



## Parameters  
  
androidJvm  
  
|  Name|  Summary| 
|---|---|
| activity| <br><br>the activity to invoke.<br><br>
| assertion| <br><br>the intercepted UiObjectAssertion.<br><br>
| interaction| <br><br>the intercepted UiObjectInteraction.<br><br>
  
  
Content  
open override fun <[T](intercept-check.md)> [interceptCheck](intercept-check.md)(interaction: UiObjectInteraction, assertion: UiOperation<UiObject2>, activity: () -> [T](intercept-check.md)): [T](intercept-check.md)  




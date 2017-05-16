# DefaultApi

All URIs are relative to *http://localhost/apidocs/api/pal/servlet/Payment/v18*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authorise**](DefaultApi.md#authorise) | **POST** /authorise | Creates a payment authorisation
[**authorise3d**](DefaultApi.md#authorise3d) | **POST** /authorise3d | Completes a 3-D Secure payment authorisation
[**cancel**](DefaultApi.md#cancel) | **POST** /cancel | Cancels a payment authorisation
[**cancelrefund**](DefaultApi.md#cancelrefund) | **POST** /cancelOrRefund | Cancels or refunds a payment
[**capture**](DefaultApi.md#capture) | **POST** /capture | Captures a payment authorisation
[**disable**](DefaultApi.md#disable) | **POST** /disable | Disable a stored payment detail
[**listecurringetails**](DefaultApi.md#listecurringetails) | **POST** /listRecurringDetails | Retrieves stored payment details for a shopper
[**refund**](DefaultApi.md#refund) | **POST** /refund | Refunds a payment


<a name="authorise"></a>
# **authorise**
> PaymentResult authorise(paymentRequest)

Creates a payment authorisation

Creates a payment with a unique reference (pspReference) and attempts to obtain an authorisation hold, which can be \&quot;captured\&quot; or \&quot;cancelled\&quot; later. While for cards an authorised payment can be captured later, non-card methods typically don&#39;t support this and will automatically capture as part of the authorisation.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
PaymentRequest paymentRequest = new PaymentRequest(); // PaymentRequest | The Payment Request
try {
    PaymentResult result = apiInstance.authorise(paymentRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#authorise");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentRequest** | [**PaymentRequest**](PaymentRequest.md)| The Payment Request |

### Return type

[**PaymentResult**](PaymentResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="authorise3d"></a>
# **authorise3d**
> PaymentResult authorise3d(paymentRequest3d)

Completes a 3-D Secure payment authorisation

For an authenticated 3-D secure session, creates a payment with a unique reference (pspReference) and attempts to obtain an authorisation hold, which can be \&quot;captured\&quot; or \&quot;cancelled\&quot; later.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
PaymentRequest3d paymentRequest3d = new PaymentRequest3d(); // PaymentRequest3d | The Payment Request
try {
    PaymentResult result = apiInstance.authorise3d(paymentRequest3d);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#authorise3d");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentRequest3d** | [**PaymentRequest3d**](PaymentRequest3d.md)| The Payment Request |

### Return type

[**PaymentResult**](PaymentResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cancel"></a>
# **cancel**
> ModificationResult cancel(modificationRequest)

Cancels a payment authorisation

Cancels the authorisation hold on a payment, returning a unique reference for this request.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
ModificationRequest modificationRequest = new ModificationRequest(); // ModificationRequest | The Modification Request
try {
    ModificationResult result = apiInstance.cancel(modificationRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#cancel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modificationRequest** | [**ModificationRequest**](ModificationRequest.md)| The Modification Request |

### Return type

[**ModificationResult**](ModificationResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cancelrefund"></a>
# **cancelrefund**
> ModificationResult cancelrefund(modificationRequest)

Cancels or refunds a payment

Performs a \&quot;cancel\&quot; on a payment if it has not yet been captured or a \&quot;refund\&quot; if it has already been captured. This is useful when it is not certain if the payment has been captured yet (e.g. when using auto-capture).

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
ModificationRequest modificationRequest = new ModificationRequest(); // ModificationRequest | The Modification Request
try {
    ModificationResult result = apiInstance.cancelrefund(modificationRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#cancelrefund");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modificationRequest** | [**ModificationRequest**](ModificationRequest.md)| The Modification Request |

### Return type

[**ModificationResult**](ModificationResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="capture"></a>
# **capture**
> ModificationResult capture(modificationRequest)

Captures a payment authorisation

Captures the authorisation hold on a payment, returning a unique reference for this request. Usually the full authorisation amount is captured, however it&#39;s also possible to capture a smaller amount which results in cancelling the remaining authorisation balance. Payment methods which automatically capture as part of authorisation don&#39;t need to be captured, but submitting a capture request on these transactions will not result in double charges.&lt;br&gt;Please note that: &lt;br&gt;&lt;ol&gt;&lt;li&gt;if immediate or delayed auto-capture is enabled, calling the capture method is not neccessary.&lt;/ol&gt;

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
ModificationRequest modificationRequest = new ModificationRequest(); // ModificationRequest | The Modification Request
try {
    ModificationResult result = apiInstance.capture(modificationRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#capture");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modificationRequest** | [**ModificationRequest**](ModificationRequest.md)| The Modification Request |

### Return type

[**ModificationResult**](ModificationResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="disable"></a>
# **disable**
> DisableResult disable(request)

Disable a stored payment detail

Disable a stored payment detail

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
DisableRequest request = new DisableRequest(); // DisableRequest | The DisableRequest
try {
    DisableResult result = apiInstance.disable(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#disable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**DisableRequest**](DisableRequest.md)| The DisableRequest |

### Return type

[**DisableResult**](DisableResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listecurringetails"></a>
# **listecurringetails**
> RecurringDetailsResult listecurringetails(request)

Retrieves stored payment details for a shopper

Lists the stored payment details for a shopper, if available. The recurring detail ID can be used with a regular authorisation request to charge the shopper. A summary of the payment detail is returned for presentation to the shopper.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
RecurringDetailsRequest request = new RecurringDetailsRequest(); // RecurringDetailsRequest | The Recurring Details Request
try {
    RecurringDetailsResult result = apiInstance.listecurringetails(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#listecurringetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**RecurringDetailsRequest**](RecurringDetailsRequest.md)| The Recurring Details Request |

### Return type

[**RecurringDetailsResult**](RecurringDetailsResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="refund"></a>
# **refund**
> ModificationResult refund(modificationRequest)

Refunds a payment

Refunds a payment which has previously been captured, returning a unique reference for this request. Refunding can be done on the full captured amount or a partial amount. Multiple (partial) refunds will be accepted as long as their sum doesn&#39;t exceed the captured amount. Payments which have been authorised, but not captured cannot be refunded, use the \&quot;cancel\&quot; method instead.&lt;br&gt;Please note that: &lt;br&gt;&lt;ol&gt;&lt;li&gt; some payment methods / gateways do not support partial/multiple refunds;&lt;li&gt; a margin above the captured limit can be configured to cover shipping/handling costs.&lt;/ol&gt;

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
ModificationRequest modificationRequest = new ModificationRequest(); // ModificationRequest | The Modification Request
try {
    ModificationResult result = apiInstance.refund(modificationRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#refund");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modificationRequest** | [**ModificationRequest**](ModificationRequest.md)| The Modification Request |

### Return type

[**ModificationResult**](ModificationResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


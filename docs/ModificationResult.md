
# ModificationResult

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pspReference** | **String** | the unique identifier assigned to this modification. |  [optional]
**response** | [**ResponseEnum**](#ResponseEnum) | the response which indicates if the modification request has been received for processing. |  [optional]
**additionalData** | **String** | a map of name/value pairs for passing back additional / industry-specific data |  [optional]


<a name="ResponseEnum"></a>
## Enum: ResponseEnum
Name | Value
---- | -----
CAPTURE_RECEIVED_ | &quot;[capture-received]&quot;
CANCEL_RECEIVED_ | &quot;[cancel-received]&quot;
REFUND_RECEIVED_ | &quot;[refund-received]&quot;
CAPTUREORREFUND_RECEIVED_ | &quot;[captureOrRefund-received]&quot;




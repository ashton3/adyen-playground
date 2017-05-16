
# ThreeDSecureData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cavvAlgorithm** | **String** | the CAVV algorithm used |  [optional]
**directoryResponse** | [**DirectoryResponseEnum**](#DirectoryResponseEnum) | the enrollment response from the 3D directory server |  [optional]
**authenticationResponse** | [**AuthenticationResponseEnum**](#AuthenticationResponseEnum) | the authentication response if the shopper was redirected |  [optional]
**xid** | **String** | the transaction identifier (base64 encoded, 20 bytes in decoded form) |  [optional]
**cavv** | **String** | the cardholder authentication value (base64 encoded, 20 bytes in decoded form) |  [optional]
**eci** | **String** | the electronic commerce indicator |  [optional]


<a name="DirectoryResponseEnum"></a>
## Enum: DirectoryResponseEnum
Name | Value
---- | -----
Y | &quot;Y&quot;
N | &quot;N&quot;
U | &quot;U&quot;
E | &quot;E&quot;


<a name="AuthenticationResponseEnum"></a>
## Enum: AuthenticationResponseEnum
Name | Value
---- | -----
Y | &quot;Y&quot;
N | &quot;N&quot;
U | &quot;U&quot;
A | &quot;A&quot;




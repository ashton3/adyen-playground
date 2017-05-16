
# PaymentRequest3d

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**md** | **String** |  |  [optional]
**paResponse** | **String** |  |  [optional]
**amount** | [**Amount**](Amount.md) | the amount to charge |  [optional]
**reference** | **String** | the reference assigned to the payment |  [optional]
**billingAddress** | [**Address**](Address.md) | the address where to send the invoice |  [optional]
**shopperIP** | **String** | the IP address of the shopper |  [optional]
**merchantAccount** | **String** | the merchant account which will be used to process the payment |  [optional]
**browserInfo** | [**BrowserInfo**](BrowserInfo.md) | the browser info data |  [optional]
**shopperInteraction** | [**ShopperInteractionEnum**](#ShopperInteractionEnum) | how the shopper interacts with the system |  [optional]
**shopperEmail** | **String** | the email address of the shopper / customer |  [optional]
**shopperReference** | **String** | a reference used to uniquely identify the shopper (e.g. user ID or account ID) |  [optional]
**recurring** | [**Recurring**](Recurring.md) | the recurring properties of the payment |  [optional]
**shopperStatement** | **String** | the text to appear on the shopper&#39;s statement |  [optional]
**fraudOffset** | **Integer** | the offset that is added to the normal fraud score (positive or negative) |  [optional]
**sessionId** | **String** |  |  [optional]
**additionalAmount** | [**Amount**](Amount.md) | the portion of the \&quot;amount\&quot; which is additional/surcharged. Required to be in the same currency as the amount. |  [optional]
**selectedRecurringDetailReference** | **String** | the recurringDetailReference you want to use for this payment |  [optional]
**orderReference** | **String** | the order reference to link multiple partial payments |  [optional]
**merchantOrderReference** | **String** | the reference to link multiple transactions to each other |  [optional]
**dccQuote** | [**ForexQuote**](ForexQuote.md) | the forex quote as returned in the response of the forex service |  [optional]
**additionalData** | **String** | a map of name/value pairs for passing in additional/industry-specific data |  [optional]
**shopperName** | [**Name**](Name.md) | the name of the shopper |  [optional]
**shopperLocale** | **String** | the combination of language code and country code to specify the language to be used in the payment |  [optional]
**selectedBrand** | **String** | the selected brand how to process the payment for dual branded cards |  [optional]
**deliveryAddress** | [**Address**](Address.md) | the address where to deliver |  [optional]
**deliveryDate** | [**LocalDate**](LocalDate.md) | the expected date of delivery or fulfillment |  [optional]
**deviceFingerprint** | **String** |  |  [optional]
**installments** | [**Installments**](Installments.md) | the installment properties of the payment |  [optional]
**socialSecurityNumber** | **String** | the shopper&#39;s social security number |  [optional]
**captureDelayHours** | **Integer** | the number of hours delay between the authorisation and scheduled auto-capture |  [optional]
**dateOfBirth** | [**LocalDate**](LocalDate.md) | the shopper&#39;s date of birth |  [optional]
**telephoneNumber** | **String** | the shopper&#39;s telephone number |  [optional]
**mcc** | **String** | the mcc value that is required to process this payment |  [optional]
**metadata** | **String** | a map of key/value pairs of metadata sent by merchant |  [optional]


<a name="ShopperInteractionEnum"></a>
## Enum: ShopperInteractionEnum
Name | Value
---- | -----
ECOMMERCE | &quot;Ecommerce&quot;
CONTAUTH | &quot;ContAuth&quot;
MOTO | &quot;Moto&quot;




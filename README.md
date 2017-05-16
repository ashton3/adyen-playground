# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.DefaultApi;

import java.io.File;
import java.util.*;

public class DefaultApiExample {

    public static void main(String[] args) {
        
        DefaultApi apiInstance = new DefaultApi();
        PaymentRequest paymentRequest = new PaymentRequest(); // PaymentRequest | The Payment Request
        try {
            PaymentResult result = apiInstance.authorise(paymentRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#authorise");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost/apidocs/api/pal/servlet/Payment/v18*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**authorise**](docs/DefaultApi.md#authorise) | **POST** /authorise | Creates a payment authorisation
*DefaultApi* | [**authorise3d**](docs/DefaultApi.md#authorise3d) | **POST** /authorise3d | Completes a 3-D Secure payment authorisation
*DefaultApi* | [**cancel**](docs/DefaultApi.md#cancel) | **POST** /cancel | Cancels a payment authorisation
*DefaultApi* | [**cancelrefund**](docs/DefaultApi.md#cancelrefund) | **POST** /cancelOrRefund | Cancels or refunds a payment
*DefaultApi* | [**capture**](docs/DefaultApi.md#capture) | **POST** /capture | Captures a payment authorisation
*DefaultApi* | [**disable**](docs/DefaultApi.md#disable) | **POST** /disable | Disable a stored payment detail
*DefaultApi* | [**listecurringetails**](docs/DefaultApi.md#listecurringetails) | **POST** /listRecurringDetails | Retrieves stored payment details for a shopper
*DefaultApi* | [**refund**](docs/DefaultApi.md#refund) | **POST** /refund | Refunds a payment


## Documentation for Models

 - [Address](docs/Address.md)
 - [Amount](docs/Amount.md)
 - [BankAccount](docs/BankAccount.md)
 - [BrowserInfo](docs/BrowserInfo.md)
 - [Card](docs/Card.md)
 - [DisableRequest](docs/DisableRequest.md)
 - [DisableResult](docs/DisableResult.md)
 - [ELV](docs/ELV.md)
 - [ForexQuote](docs/ForexQuote.md)
 - [FraudCheckResult](docs/FraudCheckResult.md)
 - [FraudResult](docs/FraudResult.md)
 - [Installments](docs/Installments.md)
 - [ModificationRequest](docs/ModificationRequest.md)
 - [ModificationResult](docs/ModificationResult.md)
 - [Name](docs/Name.md)
 - [PaymentRequest](docs/PaymentRequest.md)
 - [PaymentRequest3d](docs/PaymentRequest3d.md)
 - [PaymentResult](docs/PaymentResult.md)
 - [Recurring](docs/Recurring.md)
 - [RecurringDetail](docs/RecurringDetail.md)
 - [RecurringDetailsRequest](docs/RecurringDetailsRequest.md)
 - [RecurringDetailsResult](docs/RecurringDetailsResult.md)
 - [ThreeDSecureData](docs/ThreeDSecureData.md)
 - [TokenDetails](docs/TokenDetails.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author




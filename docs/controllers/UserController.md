# UserController

All URIs are relative to `"/v2"`

The controller class is defined in **[UserController.java](../../src/main/java/org/openapitools/controller/UserController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUser**](#createUser) | **POST** /user | Create user
[**createUsersWithArrayInput**](#createUsersWithArrayInput) | **POST** /user/createWithArray | Creates list of users with given input array
[**createUsersWithListInput**](#createUsersWithListInput) | **POST** /user/createWithList | Creates list of users with given input array
[**deleteUser**](#deleteUser) | **DELETE** /user/{username} | Delete user
[**getUserByName**](#getUserByName) | **GET** /user/{username} | Get user by user name
[**loginUser**](#loginUser) | **GET** /user/login | Logs user into the system
[**logoutUser**](#logoutUser) | **GET** /user/logout | Logs out current logged in user session
[**updateUser**](#updateUser) | **PUT** /user/{username} | Updated user

<a name="createUser"></a>
# **createUser**
```java
Mono<Object> UserController.createUser(_body)
```

Create user

This can only be done by the logged in user.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**_body** | [**User**](../../docs/models/User.md) | Created user object |



### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: Not defined

<a name="createUsersWithArrayInput"></a>
# **createUsersWithArrayInput**
```java
Mono<Object> UserController.createUsersWithArrayInput(_body)
```

Creates list of users with given input array

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**_body** | [**List&lt;User&gt;**](../../docs/models/User.md) | List of user object |



### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: Not defined

<a name="createUsersWithListInput"></a>
# **createUsersWithListInput**
```java
Mono<Object> UserController.createUsersWithListInput(_body)
```

Creates list of users with given input array

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**_body** | [**List&lt;User&gt;**](../../docs/models/User.md) | List of user object |



### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: Not defined

<a name="deleteUser"></a>
# **deleteUser**
```java
Mono<Object> UserController.deleteUser(username)
```

Delete user

This can only be done by the logged in user.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**username** | `String` | The name that needs to be deleted |



### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: Not defined

<a name="getUserByName"></a>
# **getUserByName**
```java
Mono<User> UserController.getUserByName(username)
```

Get user by user name

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**username** | `String` | The name that needs to be fetched. Use user1 for testing.  |

### Return type
[**User**](../../docs/models/User.md)


### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`, `application/xml`

<a name="loginUser"></a>
# **loginUser**
```java
Mono<String> UserController.loginUser(usernamepassword)
```

Logs user into the system

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**username** | `String` | The user name for login |
**password** | `String` | The password for login in clear text |

### Return type
`String`


### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`, `application/xml`

<a name="logoutUser"></a>
# **logoutUser**
```java
Mono<Object> UserController.logoutUser()
```

Logs out current logged in user session




### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: Not defined

<a name="updateUser"></a>
# **updateUser**
```java
Mono<Object> UserController.updateUser(username_body)
```

Updated user

This can only be done by the logged in user.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**username** | `String` | name that need to be updated |
**_body** | [**User**](../../docs/models/User.md) | Updated user object |



### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: Not defined

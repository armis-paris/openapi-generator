/**
 * OpenAPI Petstore
 *
 * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.apis

import org.openapitools.client.models.User

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.openapitools.client.infrastructure.ApiClient
import org.openapitools.client.infrastructure.ApiInfrastructureResponse
import org.openapitools.client.infrastructure.ClientException
import org.openapitools.client.infrastructure.ClientError
import org.openapitools.client.infrastructure.ServerException
import org.openapitools.client.infrastructure.ServerError
import org.openapitools.client.infrastructure.MultiValueMap
import org.openapitools.client.infrastructure.RequestConfig
import org.openapitools.client.infrastructure.RequestMethod
import org.openapitools.client.infrastructure.ResponseType
import org.openapitools.client.infrastructure.Success
import org.openapitools.client.infrastructure.toMultiValue

class UserApi(basePath: kotlin.String = defaultBasePath) : ApiClient(basePath) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "http://petstore.swagger.io/v2")
        }
    }

    /**
    * Create user
    * This can only be done by the logged in user.
    * @param body Created user object 
    * @return void
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    suspend fun createUser(body: User) : Unit = withContext(Dispatchers.IO) {
        val localVarResponse = createUserWithHttpInfo(body = body)

        return@withContext when (localVarResponse.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * Create user
    * This can only be done by the logged in user.
    * @param body Created user object 
    * @return ApiInfrastructureResponse<Unit?>
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    suspend fun createUserWithHttpInfo(body: User) : ApiInfrastructureResponse<Unit?> = withContext(Dispatchers.IO) {
        val localVariableConfig = createUserRequestConfig(body = body)

        return@withContext request<User, Unit>(
            localVariableConfig
        )
    }

    /**
    * To obtain the request config of the operation createUser
    *
    * @param body Created user object 
    * @return RequestConfig
    */
    fun createUserRequestConfig(body: User) : RequestConfig<User> {
        val localVariableBody = body
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/user",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
    * Creates list of users with given input array
    * 
    * @param body List of user object 
    * @return void
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    suspend fun createUsersWithArrayInput(body: kotlin.collections.List<User>) : Unit = withContext(Dispatchers.IO) {
        val localVarResponse = createUsersWithArrayInputWithHttpInfo(body = body)

        return@withContext when (localVarResponse.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * Creates list of users with given input array
    * 
    * @param body List of user object 
    * @return ApiInfrastructureResponse<Unit?>
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    suspend fun createUsersWithArrayInputWithHttpInfo(body: kotlin.collections.List<User>) : ApiInfrastructureResponse<Unit?> = withContext(Dispatchers.IO) {
        val localVariableConfig = createUsersWithArrayInputRequestConfig(body = body)

        return@withContext request<kotlin.collections.List<User>, Unit>(
            localVariableConfig
        )
    }

    /**
    * To obtain the request config of the operation createUsersWithArrayInput
    *
    * @param body List of user object 
    * @return RequestConfig
    */
    fun createUsersWithArrayInputRequestConfig(body: kotlin.collections.List<User>) : RequestConfig<kotlin.collections.List<User>> {
        val localVariableBody = body
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/user/createWithArray",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
    * Creates list of users with given input array
    * 
    * @param body List of user object 
    * @return void
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    suspend fun createUsersWithListInput(body: kotlin.collections.List<User>) : Unit = withContext(Dispatchers.IO) {
        val localVarResponse = createUsersWithListInputWithHttpInfo(body = body)

        return@withContext when (localVarResponse.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * Creates list of users with given input array
    * 
    * @param body List of user object 
    * @return ApiInfrastructureResponse<Unit?>
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    suspend fun createUsersWithListInputWithHttpInfo(body: kotlin.collections.List<User>) : ApiInfrastructureResponse<Unit?> = withContext(Dispatchers.IO) {
        val localVariableConfig = createUsersWithListInputRequestConfig(body = body)

        return@withContext request<kotlin.collections.List<User>, Unit>(
            localVariableConfig
        )
    }

    /**
    * To obtain the request config of the operation createUsersWithListInput
    *
    * @param body List of user object 
    * @return RequestConfig
    */
    fun createUsersWithListInputRequestConfig(body: kotlin.collections.List<User>) : RequestConfig<kotlin.collections.List<User>> {
        val localVariableBody = body
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/user/createWithList",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
    * Delete user
    * This can only be done by the logged in user.
    * @param username The name that needs to be deleted 
    * @return void
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    suspend fun deleteUser(username: kotlin.String) : Unit = withContext(Dispatchers.IO) {
        val localVarResponse = deleteUserWithHttpInfo(username = username)

        return@withContext when (localVarResponse.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * Delete user
    * This can only be done by the logged in user.
    * @param username The name that needs to be deleted 
    * @return ApiInfrastructureResponse<Unit?>
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    suspend fun deleteUserWithHttpInfo(username: kotlin.String) : ApiInfrastructureResponse<Unit?> = withContext(Dispatchers.IO) {
        val localVariableConfig = deleteUserRequestConfig(username = username)

        return@withContext request<Unit, Unit>(
            localVariableConfig
        )
    }

    /**
    * To obtain the request config of the operation deleteUser
    *
    * @param username The name that needs to be deleted 
    * @return RequestConfig
    */
    fun deleteUserRequestConfig(username: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/user/{username}".replace("{"+"username"+"}", "$username"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
    * Get user by user name
    * 
    * @param username The name that needs to be fetched. Use user1 for testing. 
    * @return User
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    suspend fun getUserByName(username: kotlin.String) : User = withContext(Dispatchers.IO) {
        val localVarResponse = getUserByNameWithHttpInfo(username = username)

        return@withContext when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as User
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * Get user by user name
    * 
    * @param username The name that needs to be fetched. Use user1 for testing. 
    * @return ApiInfrastructureResponse<User?>
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    suspend fun getUserByNameWithHttpInfo(username: kotlin.String) : ApiInfrastructureResponse<User?> = withContext(Dispatchers.IO) {
        val localVariableConfig = getUserByNameRequestConfig(username = username)

        return@withContext request<Unit, User>(
            localVariableConfig
        )
    }

    /**
    * To obtain the request config of the operation getUserByName
    *
    * @param username The name that needs to be fetched. Use user1 for testing. 
    * @return RequestConfig
    */
    fun getUserByNameRequestConfig(username: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/user/{username}".replace("{"+"username"+"}", "$username"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
    * Logs user into the system
    * 
    * @param username The user name for login 
    * @param password The password for login in clear text 
    * @return kotlin.String
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    suspend fun loginUser(username: kotlin.String, password: kotlin.String) : kotlin.String = withContext(Dispatchers.IO) {
        val localVarResponse = loginUserWithHttpInfo(username = username, password = password)

        return@withContext when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.String
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * Logs user into the system
    * 
    * @param username The user name for login 
    * @param password The password for login in clear text 
    * @return ApiInfrastructureResponse<kotlin.String?>
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    suspend fun loginUserWithHttpInfo(username: kotlin.String, password: kotlin.String) : ApiInfrastructureResponse<kotlin.String?> = withContext(Dispatchers.IO) {
        val localVariableConfig = loginUserRequestConfig(username = username, password = password)

        return@withContext request<Unit, kotlin.String>(
            localVariableConfig
        )
    }

    /**
    * To obtain the request config of the operation loginUser
    *
    * @param username The user name for login 
    * @param password The password for login in clear text 
    * @return RequestConfig
    */
    fun loginUserRequestConfig(username: kotlin.String, password: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                put("username", listOf(username.toString()))
                put("password", listOf(password.toString()))
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/user/login",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
    * Logs out current logged in user session
    * 
    * @return void
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    suspend fun logoutUser() : Unit = withContext(Dispatchers.IO) {
        val localVarResponse = logoutUserWithHttpInfo()

        return@withContext when (localVarResponse.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * Logs out current logged in user session
    * 
    * @return ApiInfrastructureResponse<Unit?>
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    suspend fun logoutUserWithHttpInfo() : ApiInfrastructureResponse<Unit?> = withContext(Dispatchers.IO) {
        val localVariableConfig = logoutUserRequestConfig()

        return@withContext request<Unit, Unit>(
            localVariableConfig
        )
    }

    /**
    * To obtain the request config of the operation logoutUser
    *
    * @return RequestConfig
    */
    fun logoutUserRequestConfig() : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/user/logout",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
    * Updated user
    * This can only be done by the logged in user.
    * @param username name that need to be deleted 
    * @param body Updated user object 
    * @return void
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    suspend fun updateUser(username: kotlin.String, body: User) : Unit = withContext(Dispatchers.IO) {
        val localVarResponse = updateUserWithHttpInfo(username = username, body = body)

        return@withContext when (localVarResponse.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * Updated user
    * This can only be done by the logged in user.
    * @param username name that need to be deleted 
    * @param body Updated user object 
    * @return ApiInfrastructureResponse<Unit?>
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    suspend fun updateUserWithHttpInfo(username: kotlin.String, body: User) : ApiInfrastructureResponse<Unit?> = withContext(Dispatchers.IO) {
        val localVariableConfig = updateUserRequestConfig(username = username, body = body)

        return@withContext request<User, Unit>(
            localVariableConfig
        )
    }

    /**
    * To obtain the request config of the operation updateUser
    *
    * @param username name that need to be deleted 
    * @param body Updated user object 
    * @return RequestConfig
    */
    fun updateUserRequestConfig(username: kotlin.String, body: User) : RequestConfig<User> {
        val localVariableBody = body
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.PUT,
            path = "/user/{username}".replace("{"+"username"+"}", "$username"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

}

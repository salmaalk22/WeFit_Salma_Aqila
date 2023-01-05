package com.example.wefit.api

import retrofit2.Response
import retrofit2.http.*


public interface LogApi {
    @GET("/rest/v1/Log?select=*&order=id.asc")
    suspend fun get(
        @Header("Authorization") token: String,
        @Header("apikey") apiKey: String
    ) : Response<List<LogItem>>

    @POST("/rest/v1/Log")
    suspend fun create(
        @Header("Authorization") token: String,
        @Header("apikey") apiKey: String,
        @Body LogData: LogData
    )

    @PATCH("/rest/v1/Log")
    suspend fun update(
        @Header("Authorization") token: String,
        @Header("apikey") apiKey: String,
        @Query("id") idQuery : String,
        @Body LogData: LogData
    ) : Response<Unit>

    @DELETE("/rest/v1/Log")
    suspend fun delete(
        @Header("Authorization") token: String,
        @Header("apikey") apiKey: String,
        @Query("id") idQuery : String
    ) : Response<Unit>
}
package indi.lirui.library.net

import okhttp3.MultipartBody
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.*
import java.util.*

/**
 * restful
 */

interface RestService {

    @GET
    fun get(@Url url: String?, @QueryMap params: WeakHashMap<String, Any>?): Call<String>

    @FormUrlEncoded
    @POST
    fun post(@Url url: String?, @QueryMap params: WeakHashMap<String, Any>?): Call<String>

    @FormUrlEncoded
    fun put(@Url url: String?, @QueryMap params: WeakHashMap<String, Any>?): Call<String>

    @DELETE
    fun delete(@Url url: String?, @QueryMap params: WeakHashMap<String, Any>?): Call<String>


    // 分片下载到内存中, 下载一部分写入一部分
    @Streaming
    @GET
    fun download(@Url url: String?, @QueryMap params: WeakHashMap<String, Any>?): Call<ResponseBody>

    fun upload(@Url url: String?, @Part file: MultipartBody.Part?): Call<String>

}
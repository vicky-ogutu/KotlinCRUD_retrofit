package com.example.kotlinretrofit

import retrofit2.Call
import retrofit2.http.*

interface RetroService {

    @GET("posts")
    @Headers("Accept:application/json", "Content-Type:application/json")
    fun getPostList(): Call<PostList>

    @GET("posts")
    @Headers("Accept:application/json", "Content-Type:application/json")
    fun searchText(@Query("name") searchPost:String): Call<PostList>

    @GET("posts/{userId}")
    @Headers("Accept:application/json", "Content-Type:application/json")
    fun getPost(@Path("userId") userId: String) : Call<PostList>

    @POST("posts")
    @Headers("Accept:application/json", "Content-Type:application/json")
    fun createPost(@Body params:PostList) : Call<PostsResponse>


    @PATCH("posts/{userId}")
    @Headers("Accept:application/json", "Content-Type:application/json")
    fun updatePost(@Path("userId")userId: String,    @Body params:PostList): Call<PostList>



    fun deleteUser(@Path("userId") userId:String):Call<PostList>
}
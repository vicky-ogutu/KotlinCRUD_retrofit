package com.example.kotlinretrofit

data class PostList(val data: List<Posts>)
data class  Posts(val userId:String?, val id:String?, val title:String, val body:String?)
data class  PostsResponse(val data: List<Posts>)

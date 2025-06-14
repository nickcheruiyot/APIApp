package com.example.apiapp.data.model.remote

import com.example.apiapp.data.model.Post
import retrofit2.http.GET

interface ApiService {    @GET("posts")
suspend fun getPosts(): List<Post>

}
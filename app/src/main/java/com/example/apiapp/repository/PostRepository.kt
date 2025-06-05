package com.example.apiapp.repository

import com.example.apiapp.data.model.Post
import com.example.apiapp.data.model.remote.RetrofitInstance

class PostRepository {
    suspend fun getPosts(): List<Post> {
        return RetrofitInstance.api.getPosts()
    }

}
package com.example.apiapp.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SmallTopAppBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.apiapp.data.model.Post
import com.example.apiapp.viewModel.PostViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PostListScreen(viewModel: PostViewModel) {
    val posts by viewModel.posts.collectAsState()

    Scaffold(
        topBar = {
            SmallTopAppBar(
                title = { Text("Posts") }
            )
        }
    ) { padding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
        ) {
            items(posts) { post ->
                PostItem(post)
            }
        }
    }
}

@Composable
fun PostItem(post: Post) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Text(
            text = post.title,
            style = MaterialTheme.typography.titleMedium
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = post.body,
            style = MaterialTheme.typography.bodyMedium
        )
        Divider(modifier = Modifier.padding(vertical = 8.dp))
    }
}

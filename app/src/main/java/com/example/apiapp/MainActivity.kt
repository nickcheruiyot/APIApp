package com.example.apiapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.apiapp.ui.PostListScreen
import com.example.apiapp.ui.theme.APIAppTheme
import com.example.apiapp.viewModel.PostViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            APIAppTheme {
                val postViewModel: PostViewModel = viewModel()
                PostListScreen(viewModel = postViewModel)
            }
        }
    }
}

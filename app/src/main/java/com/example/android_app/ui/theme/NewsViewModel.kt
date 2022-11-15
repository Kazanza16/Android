package com.example.android_app.ui.theme

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.android_app.model.Article
import com.example.android_app.network.Api
import kotlinx.coroutines.launch

class NewsViewModel : ViewModel() {
        init {
            getListNews()
        }

    fun getListNews() {
        viewModelScope.launch {
            val response = Api.newsAPIService.getTopHeadline()
            val articles = response.articles

            articles.forEach{article: Article ->
                Log.d("response", article.toString())
            }
        }
    }
}
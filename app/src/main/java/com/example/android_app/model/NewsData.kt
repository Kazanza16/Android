package com.example.android_app.model

import android.hardware.camera2.TotalCaptureResult

class NewsData (
    val articles: List<Article>,
    val status: String,
    val totalResult: Int
        )
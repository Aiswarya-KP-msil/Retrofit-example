package com.example.retrofitexample.model

data class ClickToAction(
    val enabled: Boolean,
    val id: String,
    val link: String,
    val text: String,
    val type: String
)
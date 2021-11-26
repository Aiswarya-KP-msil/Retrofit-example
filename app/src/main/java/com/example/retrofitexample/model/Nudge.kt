package com.example.retrofitexample.model

data class Nudge(
    val clickToActions: List<ClickToAction>,
    val descriptions: List<String>,
    val headline: String,
    val images: List<Any>,
    val metadata: Metadata,
    val placeHolderID: String,
    val type: String
)
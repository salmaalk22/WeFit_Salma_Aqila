package com.example.wefit.api

data class LogItem (
    val id: String,
    val title: String,
    val description: String? = null,
    val done_at: String? = null,
    val created_at: String
)
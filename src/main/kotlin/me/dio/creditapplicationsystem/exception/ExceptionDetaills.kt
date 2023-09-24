package me.dio.creditapplicationsystem.exception

import java.time.LocalDateTime

data class ExceptionDetaills(
    val title: String,
    val timestamp: LocalDateTime,
    val status: Int,
    val exception: String,
    val details: MutableMap<String, String?>
)

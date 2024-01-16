package com.example.kmmize

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
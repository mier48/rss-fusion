package com.albertomier.rssfusion

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
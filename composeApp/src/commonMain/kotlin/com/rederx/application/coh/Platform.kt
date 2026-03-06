package com.rederx.application.coh

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
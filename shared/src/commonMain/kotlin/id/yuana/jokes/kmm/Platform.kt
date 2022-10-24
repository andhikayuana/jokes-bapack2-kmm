package id.yuana.jokes.kmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
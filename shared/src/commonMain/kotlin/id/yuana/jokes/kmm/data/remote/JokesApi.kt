package id.yuana.jokes.kmm.data.remote

import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.json.Json

object JokesApi {

    private val httpClient = HttpClient {
        install(ContentNegotiation) {
            json(Json {
                prettyPrint = true
                isLenient = true
                ignoreUnknownKeys = true
            })
        }
    }

    @Throws(Exception::class)
    suspend fun getRandom(): String {
        val jokes = httpClient.get("https://jokes-bapack2-api.yuana.id/v1/text/random")
            .body<JokesResponse>()
        return jokes.data
    }
}
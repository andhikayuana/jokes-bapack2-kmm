package id.yuana.jokes.kmm.data.remote

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class JokesResponse(
    @SerialName("code")
    val code: Int,
    @SerialName("msg")
    val msg: String,
    @SerialName("data")
    val data: String
)

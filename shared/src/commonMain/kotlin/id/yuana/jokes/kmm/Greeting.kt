package id.yuana.jokes.kmm

class Greeting {
    private val platform: Platform = getPlatform()

    fun greeting(): String {
        return "Guess what it is! > ${platform.name.reversed()}!" +
                "\nThere are only ${daysUntilNewYear()} days left until New Year! 🎅🏼 "
    }
}
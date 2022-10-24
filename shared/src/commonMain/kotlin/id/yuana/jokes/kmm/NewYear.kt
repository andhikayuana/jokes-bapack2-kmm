package id.yuana.jokes.kmm

import kotlinx.datetime.*

fun daysUntilNewYear(): Int {
    val today = Clock.System.todayIn(TimeZone.currentSystemDefault())
    val closestNewYer = LocalDate(today.year + 1, 1, 1)
    return today.daysUntil(closestNewYer)
}
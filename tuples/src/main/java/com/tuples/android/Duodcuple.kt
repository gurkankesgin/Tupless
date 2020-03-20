package com.tuples.tupless

import java.io.Serializable

data class Duodcuple<out A, out B, out C, out D, out E, out F, out G, out H, out I, out J, out K, out L>(
    val first: A,
    val second: B,
    val third: C,
    val fourth: D,
    val fifth: E,
    val sixth: F,
    val seventh: G,
    val eighth: H,
    val ninth: I,
    val tenth: J,
    val eleventh: K,
    val twelfth: L

) : Serializable {

    override fun toString(): String =
        "($first, $second, $third, $fourth, $fifth,$sixth,$seventh,$eighth,$ninth,$tenth,$eleventh,$twelfth)"
}

fun <T> Duodcuple<T, T, T, T, T, T, T, T, T, T, T, T>.toList(): List<T> =
    listOf(
        first,
        second,
        third,
        fourth,
        fifth,
        sixth,
        seventh,
        eighth,
        ninth,
        tenth,
        eleventh,
        twelfth
    )
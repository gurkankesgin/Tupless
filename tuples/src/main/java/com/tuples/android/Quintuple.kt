package com.tuples.tupless

import java.io.Serializable

data class Quintuple<out A, out B, out C, out D, out E>(
    val first: A,
    val second: B,
    val third: C,
    val fourth: D,
    val fifth: E
) : Serializable {


    override fun toString(): String = "($first, $second, $third, $fourth, $fifth)"
}

fun <T> Quintuple<T, T, T, T, T>.toList(): List<T> = listOf(first, second, third, fourth, fifth)
package com.example.noteappcleanarchitecture.featurenote.domain.util

sealed class OrderType {
    object Ascending : OrderType()
    object Descending : OrderType()
}

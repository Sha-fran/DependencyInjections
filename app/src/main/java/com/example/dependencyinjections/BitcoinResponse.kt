package com.example.dependencyinjections

class BitcoinResponse(val data:Data?) {
}

data class Data (val id:String, val rateUsd:String)
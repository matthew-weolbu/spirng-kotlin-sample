package com.example.demo.coroutine

import kotlinx.coroutines.delay

class SuspendExample {
  suspend fun greet() {
    delay(1000)
    println("Hello, World!")
  }
}
package dev.yuyuyuyuyu.simpletopappbar.example.multiplatform

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "MultiplatformExample",
    ) {
        App()
    }
}
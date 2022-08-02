import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import browser.WebView

@Composable
fun App(
) {
    MaterialTheme {
        Row (
            modifier = Modifier.fillMaxSize()
        ) {
            Column(
                modifier = Modifier.fillMaxHeight().weight(1f)
            ) {
                WebView("https://www.google.com")
            }

            Column(
                modifier = Modifier.fillMaxHeight().weight(1f)
            ) {

                WebView("https://mempool.space")
            }
        }

    }
}

fun main() = application {
    Window(
        title = "Compose CEF Sample",
        onCloseRequest = ::exitApplication
    ) {
        App()
    }
}

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.asCoroutineDispatcher
import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking
import java.io.FileNotFoundException
import java.net.URL
import java.time.Instant
import java.util.Collections.list
import java.util.concurrent.Executors

fun main() {
    val asyncMain = AsyncCoroutine()
    val asCoroutineDispatcher = Executors.newSingleThreadExecutor().asCoroutineDispatcher();
    println("main method starts:" + Instant.now().toString())
    println("starts in thread:" + Thread.currentThread().name)
    var justStringFuture: String? = ""
    var httpFuture: String? = ""
    runBlocking {
        val launchHttpFuture = GlobalScope.async(asCoroutineDispatcher) {
            println("launchHttpFuture in thread:" + Thread.currentThread().name)
            httpFuture = asyncMain.makeHttpCallAsync()
        }
        val launchJustStringTask = GlobalScope.async(asCoroutineDispatcher) {
            println("launchJustStringFuture in thread:" + Thread.currentThread().name)
            justStringFuture = asyncMain.getJustStringAsync()
        }
        launchJustStringTask.await()
        launchHttpFuture.await()
    }
    println("finish time" + Instant.now().toString())
    println("httpFuture time: $httpFuture")
    println("justStringFuture time: $justStringFuture")
//    list(1)
}

class AsyncCoroutine {

    private val justString: String
        get() {
            println("getJustString:" + Thread.currentThread().name)
            return Instant.now().toString()
        }

    suspend fun makeHttpCallAsync(): String {
        return makeHttpCall()
    }

    private fun makeHttpCall(): String {
        println("makeHttpCall: " + Thread.currentThread().name)
        return try {
            URL("http://localhost/webui/").readText()
        } catch (e: FileNotFoundException) {
            "FileNotFoundException"
        }
    }

    suspend fun getJustStringAsync(): String {
        println(Instant.now().toString())
        return (justString)
    }
}

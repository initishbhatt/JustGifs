package initishbhatt.com.justgifs

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import io.reactivex.Observable
import io.reactivex.disposables.CompositeDisposable
import java.util.concurrent.TimeUnit

/**
 * @author nitishbhatt
 */
class JustGifsSplash : AppCompatActivity() {
    private val disposeBag = CompositeDisposable()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initiateSplash()
    }

    private fun initiateSplash() {
        val dummyProcessTime = 3L
        val disposable = Observable.timer(dummyProcessTime, TimeUnit.SECONDS).subscribe {
            startActivity(Intent(applicationContext, JustGifsActivity::class.java))
            finish()
        }
        disposeBag.add(disposable)
    }

    override fun onDestroy() {
        super.onDestroy()
        disposeBag.clear()
    }
}
package `in`.arunkumarsampath.dagger.workmanager.home

import `in`.arunkumarsampath.dagger.workmanager.R
import `in`.arunkumarsampath.dagger.workmanager.jobs.HelloWorldWorker
import android.os.Bundle
import com.jakewharton.rxbinding2.view.clicks
import dagger.android.support.DaggerAppCompatActivity
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.rxkotlin.addTo
import kotlinx.android.synthetic.main.activity_main.*
import java.util.concurrent.TimeUnit

class HomeActivity : DaggerAppCompatActivity() {

    private val subs = CompositeDisposable()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupUi()
    }

    private fun setupUi() {
        scheduleWorkButton
            .clicks()
            .debounce(300, TimeUnit.MILLISECONDS)
            .doOnNext {
                HelloWorldWorker.start()
            }.subscribe()
            .addTo(subs)
    }

    override fun onDestroy() {
        subs.clear()
        super.onDestroy()
    }
}

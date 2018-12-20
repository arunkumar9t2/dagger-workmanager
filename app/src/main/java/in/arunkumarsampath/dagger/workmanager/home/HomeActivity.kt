package `in`.arunkumarsampath.dagger.workmanager.home

import `in`.arunkumarsampath.dagger.workmanager.R
import android.os.Bundle
import dagger.android.support.DaggerAppCompatActivity

class HomeActivity : DaggerAppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

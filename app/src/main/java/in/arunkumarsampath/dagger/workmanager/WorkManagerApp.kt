package `in`.arunkumarsampath.dagger.workmanager

import `in`.arunkumarsampath.dagger.workmanager.di.app.DaggerAppComponent
import dagger.android.support.DaggerApplication
import timber.log.Timber

class WorkManagerApp : DaggerApplication() {

    val appComponent by lazy {
        DaggerAppComponent
            .builder()
            .application(this)
            .build()
    }

    override fun onCreate() {
        super.onCreate()
        initTimber()
    }

    private fun initTimber() {
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }

    override fun applicationInjector() = appComponent
}
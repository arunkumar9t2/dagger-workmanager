package `in`.arunkumarsampath.dagger.workmanager

import `in`.arunkumarsampath.dagger.workmanager.di.app.DaggerAppComponent
import androidx.work.Configuration
import androidx.work.WorkManager
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
        initWorkManager()
    }


    private fun initTimber() {
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }

    private fun initWorkManager() {
        WorkManager.initialize(this, Configuration.Builder().run {
            setWorkerFactory(appComponent.daggerWorkerFactory())
            build()
        })
    }


    override fun applicationInjector() = appComponent
}
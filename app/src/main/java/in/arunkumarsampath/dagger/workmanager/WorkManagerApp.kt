package `in`.arunkumarsampath.dagger.workmanager

import `in`.arunkumarsampath.dagger.workmanager.di.app.DaggerAppComponent
import dagger.android.support.DaggerApplication

class WorkManagerApp : DaggerApplication() {

    val appComponent by lazy {
        DaggerAppComponent
            .builder()
            .application(this)
            .build()
    }

    override fun applicationInjector() = appComponent
}
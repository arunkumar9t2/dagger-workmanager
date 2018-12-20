package `in`.arunkumarsampath.dagger.workmanager.di.app

import `in`.arunkumarsampath.dagger.workmanager.WorkManagerApp
import `in`.arunkumarsampath.dagger.workmanager.data.DataModule
import `in`.arunkumarsampath.dagger.workmanager.home.HomeBuilder
import `in`.arunkumarsampath.dagger.workmanager.workmanager.DaggerWorkerFactory
import `in`.arunkumarsampath.dagger.workmanager.workmanager.WorkerSubcomponent
import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        HomeBuilder::class,
        DataModule::class
    ]
)
interface AppComponent : AndroidInjector<WorkManagerApp> {

    fun daggerWorkerFactory(): DaggerWorkerFactory

    // Establish WorkerSubcomponent as subcomponent
    fun workerSubcomponentBuilder(): WorkerSubcomponent.Builder

    @Component.Builder
    interface Builder {
        fun build(): AppComponent
        @BindsInstance
        fun application(application: Application): Builder
    }
}
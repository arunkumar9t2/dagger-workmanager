package `in`.arunkumarsampath.dagger.workmanager.di.app

import `in`.arunkumarsampath.dagger.workmanager.WorkManagerApp
import `in`.arunkumarsampath.dagger.workmanager.home.HomeBuilder
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

        HomeBuilder::class
    ]
)
interface AppComponent : AndroidInjector<WorkManagerApp> {

    @Component.Builder
    interface Builder {
        fun build(): AppComponent
        @BindsInstance
        fun application(application: Application): Builder
    }
}
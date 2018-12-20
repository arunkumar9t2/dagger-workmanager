package `in`.arunkumarsampath.dagger.workmanager.home

import `in`.arunkumarsampath.dagger.workmanager.di.activity.ActivityScope
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class HomeBuilder {

    @ContributesAndroidInjector
    @ActivityScope
    abstract fun contributeHomeActivity(): HomeActivity
}
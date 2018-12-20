package `in`.arunkumarsampath.dagger.workmanager.workmanager

import `in`.arunkumarsampath.dagger.workmanager.jobs.HelloWorldWorker
import androidx.work.RxWorker
import androidx.work.WorkerParameters
import dagger.BindsInstance
import dagger.Subcomponent
import javax.inject.Provider

@Subcomponent(modules = [HelloWorldWorker.Builder::class])
interface WorkerSubcomponent {

    fun workers(): Map<Class<out RxWorker>, Provider<RxWorker>>

    @Subcomponent.Builder
    interface Builder {
        @BindsInstance
        fun workerParameters(param: WorkerParameters): Builder

        fun build(): WorkerSubcomponent
    }
}
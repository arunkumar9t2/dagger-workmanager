package `in`.arunkumarsampath.dagger.workmanager.data.words

import `in`.arunkumarsampath.dagger.workmanager.R
import android.app.Application
import io.reactivex.Single
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DefaultWordsRepository
@Inject
constructor(private val application: Application) : WordsRepository {

    override fun sayHelloWorld(): Single<String> {
        return Single.fromCallable {
            application.getString(R.string.hello_world)
        }
    }
}
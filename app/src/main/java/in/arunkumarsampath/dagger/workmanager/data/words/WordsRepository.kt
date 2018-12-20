package `in`.arunkumarsampath.dagger.workmanager.data.words

import io.reactivex.Single

interface WordsRepository {
    /**
     * @return [Single] return "Hello World" upon subscription.
     */
    fun sayHelloWorld(): Single<String>
}
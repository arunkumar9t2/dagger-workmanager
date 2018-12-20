package `in`.arunkumarsampath.dagger.workmanager.data

import `in`.arunkumarsampath.dagger.workmanager.data.words.DefaultWordsRepository
import `in`.arunkumarsampath.dagger.workmanager.data.words.WordsRepository
import dagger.Binds
import dagger.Module

@Module
abstract class DataModule {

    @Binds
    abstract fun provideWordsRepository(defaultWordsRepository: DefaultWordsRepository): WordsRepository
}
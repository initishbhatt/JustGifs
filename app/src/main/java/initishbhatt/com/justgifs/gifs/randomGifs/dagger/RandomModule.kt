package initishbhatt.com.justgifs.gifs.randomGifs.dagger

import dagger.Module
import dagger.Provides
import initishbhatt.com.justgifs.gifs.api.GifService
import initishbhatt.com.justgifs.gifs.randomGifs.presenter.RandomInteractor
import initishbhatt.com.justgifs.gifs.randomGifs.presenter.RandomInteractorImpl
import initishbhatt.com.justgifs.gifs.randomGifs.presenter.RandomPresenter
import initishbhatt.com.justgifs.gifs.randomGifs.presenter.RandomPresenterImpl

/**
 * @author nitishbhatt
 */
@Module
class RandomModule {

    @Provides
    fun provideSearchPresenter(randomInteractor: RandomInteractor): RandomPresenter {
        return RandomPresenterImpl(randomInteractor, null)
    }

    @Provides
    fun provideSearchInteractor(service: GifService): RandomInteractor {
        return RandomInteractorImpl(service)
    }
}
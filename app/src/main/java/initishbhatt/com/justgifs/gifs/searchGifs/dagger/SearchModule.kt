package initishbhatt.com.justgifs.gifs.searchGifs.dagger

import dagger.Module
import dagger.Provides
import initishbhatt.com.justgifs.gifs.api.GifService
import initishbhatt.com.justgifs.gifs.searchGifs.presenter.SearchInteractor
import initishbhatt.com.justgifs.gifs.searchGifs.presenter.SearchInteractorImpl
import initishbhatt.com.justgifs.gifs.searchGifs.presenter.SearchPresenter
import initishbhatt.com.justgifs.gifs.searchGifs.presenter.SearchPresenterImpl

/**
 * @author nitishbhatt
 */
@Module
class SearchModule {
    @Provides
        fun provideSearchPresenter(searchInteractor: SearchInteractor): SearchPresenter {
            return SearchPresenterImpl(searchInteractor, null)
        }

        @Provides
        fun provideSearchInteractor(service: GifService): SearchInteractor {
            return SearchInteractorImpl(service)
    }

}
package initishbhatt.com.justgifs.gifs.trendingGifs.dagger

import dagger.Module
import dagger.Provides
import initishbhatt.com.justgifs.gifs.api.GifService
import initishbhatt.com.justgifs.gifs.trendingGifs.presenter.TrendingInteractor
import initishbhatt.com.justgifs.gifs.trendingGifs.presenter.TrendingInteractorImpl
import initishbhatt.com.justgifs.gifs.trendingGifs.presenter.TrendingPresenter
import initishbhatt.com.justgifs.gifs.trendingGifs.presenter.TrendingPresenterImpl

/**
 * @author nitishbhatt
 */
@Module
class TrendingModule {

    @Provides
    fun provideTrendingPresenter(trendingInteractor: TrendingInteractor): TrendingPresenter {
        return TrendingPresenterImpl(trendingInteractor, null)
    }

    @Provides
    fun provideTrendingInteractor(service: GifService): TrendingInteractor {
        return TrendingInteractorImpl(service)
    }
}
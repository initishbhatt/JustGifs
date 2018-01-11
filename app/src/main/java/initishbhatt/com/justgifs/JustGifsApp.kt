package initishbhatt.com.justgifs

import android.app.Application
import initishbhatt.com.justgifs.gifs.network.NetworkModule
import initishbhatt.com.justgifs.gifs.searchGifs.dagger.SearchComponent
import initishbhatt.com.justgifs.gifs.searchGifs.dagger.SearchModule
import initishbhatt.com.justgifs.gifs.trendingGifs.dagger.TrendingComponent
import initishbhatt.com.justgifs.gifs.trendingGifs.dagger.TrendingModule
import timber.log.Timber

/**
 * @author nitishbhatt
 */
class JustGifsApp : Application() {
    lateinit var appComponent: AppComponent
    lateinit var trendingComponent: TrendingComponent
    lateinit var searchComponent: SearchComponent

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
        appComponent = createAppComponent()
    }

    private fun createAppComponent(): AppComponent {
        return DaggerAppComponent.builder()
                .networkModule(NetworkModule())
                .appModule(AppModule()).build()
    }

    fun createTrendingGifComponent(): TrendingComponent {
        trendingComponent = appComponent.plus(TrendingModule())
        return trendingComponent
    }

    fun createSearchGifComponent(): SearchComponent {
        searchComponent = appComponent.plus(SearchModule())
        return searchComponent
    }
}
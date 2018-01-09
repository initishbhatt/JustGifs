package initishbhatt.com.justgifs

import android.app.Application
import initishbhatt.com.justgifs.gifs.api.ApiModule
import initishbhatt.com.justgifs.gifs.trendingGifs.dagger.TrendingComponent
import initishbhatt.com.justgifs.gifs.trendingGifs.dagger.TrendingModule

/**
 * @author nitishbhatt
 */
class JustGifsApp : Application() {
    lateinit var appComponent: AppComponent
    lateinit var trendingComponent: TrendingComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = createAppComponent()
    }

    private fun createAppComponent(): AppComponent {
        return DaggerAppComponent.builder()
                .apiModule(ApiModule())
                .appModule(AppModule()).build()
    }

    fun createTrendingGifComponent(): TrendingComponent {
        trendingComponent = appComponent.plus(TrendingModule())
        return trendingComponent
    }
}
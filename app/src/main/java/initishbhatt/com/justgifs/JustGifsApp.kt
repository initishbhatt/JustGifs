package initishbhatt.com.justgifs

import android.app.Application
import com.bumptech.glide.annotation.GlideModule
import com.bumptech.glide.module.AppGlideModule
import com.bumptech.glide.request.target.ViewTarget
import initishbhatt.com.justgifs.gifs.network.NetworkModule
import initishbhatt.com.justgifs.gifs.randomGifs.dagger.RandomComponent
import initishbhatt.com.justgifs.gifs.randomGifs.dagger.RandomModule
import initishbhatt.com.justgifs.gifs.searchGifs.dagger.SearchComponent
import initishbhatt.com.justgifs.gifs.searchGifs.dagger.SearchModule
import initishbhatt.com.justgifs.gifs.trendingGifs.dagger.TrendingComponent
import initishbhatt.com.justgifs.gifs.trendingGifs.dagger.TrendingModule
import timber.log.Timber

/**
 * @author nitishbhatt
 */
class JustGifsApp : Application() {
    private lateinit var appComponent: AppComponent
    private lateinit var trendingComponent: TrendingComponent
    private lateinit var searchComponent: SearchComponent
    private lateinit var randomComponent: RandomComponent

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
        appComponent = createAppComponent()
        ViewTarget.setTagId(R.id.glide_tag)
    }

    private fun createAppComponent(): AppComponent {
        return DaggerAppComponent.builder()
                .application(this)
                .build()
    }

    fun createTrendingGifComponent(): TrendingComponent {
        trendingComponent = appComponent.plus(TrendingModule())
        return trendingComponent
    }

    fun createSearchGifComponent(): SearchComponent {
        searchComponent = appComponent.plus(SearchModule())
        return searchComponent
    }

    fun createRandomGifComponent(): RandomComponent {
        randomComponent = appComponent.plus(RandomModule())
        return randomComponent
    }
}

@GlideModule
class JustGifsGlideModule : AppGlideModule()
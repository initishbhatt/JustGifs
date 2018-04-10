package initishbhatt.com.justgifs

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import initishbhatt.com.justgifs.gifs.api.ApiModule
import initishbhatt.com.justgifs.gifs.network.NetworkModule
import initishbhatt.com.justgifs.gifs.randomGifs.dagger.RandomComponent
import initishbhatt.com.justgifs.gifs.randomGifs.dagger.RandomModule
import initishbhatt.com.justgifs.gifs.searchGifs.dagger.SearchComponent
import initishbhatt.com.justgifs.gifs.searchGifs.dagger.SearchModule
import initishbhatt.com.justgifs.gifs.trendingGifs.dagger.TrendingComponent
import initishbhatt.com.justgifs.gifs.trendingGifs.dagger.TrendingModule
import javax.inject.Singleton

/**
 * @author nitishbhatt
 */
@Singleton
@Component(modules = [AppModule::class, NetworkModule::class, ApiModule::class])
interface AppComponent {
    fun plus(trendingModule: TrendingModule): TrendingComponent
    fun plus(searchModule: SearchModule): SearchComponent
    fun plus(randomModule: RandomModule): RandomComponent

    @Component.Builder
    interface Builder {
        fun build(): AppComponent
        @BindsInstance fun application(application: Application): Builder
    }
}
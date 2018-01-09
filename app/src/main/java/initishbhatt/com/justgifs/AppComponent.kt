package initishbhatt.com.justgifs

import dagger.Component
import initishbhatt.com.justgifs.gifs.api.ApiModule
import initishbhatt.com.justgifs.gifs.trendingGifs.dagger.TrendingComponent
import initishbhatt.com.justgifs.gifs.trendingGifs.dagger.TrendingModule
import javax.inject.Singleton

/**
 * @author nitishbhatt
 */
@Singleton
@Component(modules = [AppModule::class, ApiModule::class])
interface AppComponent {
    fun plus(trendingModule: TrendingModule): TrendingComponent

}
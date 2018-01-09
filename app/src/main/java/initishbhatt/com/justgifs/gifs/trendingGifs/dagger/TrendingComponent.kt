package initishbhatt.com.justgifs.gifs.trendingGifs.dagger

import dagger.Subcomponent
import initishbhatt.com.justgifs.gifs.trendingGifs.view.TrendingFragment

/**
 * @author nitishbhatt
 */
@TrendingScope
@Subcomponent(modules = [TrendingModule::class])
interface TrendingComponent {
    fun inject(target: TrendingFragment)
}
package initishbhatt.com.justgifs.gifs.searchGifs.dagger

import dagger.Subcomponent
import initishbhatt.com.justgifs.gifs.searchGifs.view.SearchFragment

/**
 * @author nitishbhatt
 */
@SearchScope
@Subcomponent(modules = [SearchModule::class])
interface SearchComponent {
    fun inject(target: SearchFragment)
}
package initishbhatt.com.justgifs.gifs.randomGifs.dagger

import dagger.Subcomponent
import initishbhatt.com.justgifs.gifs.randomGifs.view.RandomFragment

/**
 * @author nitishbhatt
 */
@RandomScope
@Subcomponent(modules = [RandomModule::class])
interface RandomComponent {
    fun inject(target: RandomFragment)
}
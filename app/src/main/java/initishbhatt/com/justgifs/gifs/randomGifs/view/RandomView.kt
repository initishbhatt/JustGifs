package initishbhatt.com.justgifs.gifs.randomGifs.view

import initishbhatt.com.justgifs.gifs.model.RandomModel

/**
 * @author nitishbhatt
 */
interface RandomView {
    fun showRandomGifs(randomGifs: List<RandomModel>?)
}
package initishbhatt.com.justgifs.gifs.randomGifs.view

import initishbhatt.com.justgifs.gifs.model.RandomGifs

/**
 * @author nitishbhatt
 */
interface RandomView {
    fun showRandomGifs(randomGifs: List<RandomGifs>?)
}
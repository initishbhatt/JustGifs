package initishbhatt.com.justgifs.gifs.randomGifs

import initishbhatt.com.justgifs.gifs.api.entity.RandomGifsModel

/**
 * @author nitishbhatt
 */
data class RandomGifs(
        val url: String)

fun RandomGifsModel.toRandom(): RandomGifs = RandomGifs(url)
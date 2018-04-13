package initishbhatt.com.justgifs.gifs.model

import initishbhatt.com.justgifs.gifs.api.RandomGifs


/**
 * @author nitishbhatt
 */

data class RandomModel(val title: String, val url: String)

fun RandomGifs.toRandom(): RandomModel = RandomModel(username, url)
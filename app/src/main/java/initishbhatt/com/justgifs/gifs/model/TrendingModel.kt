package initishbhatt.com.justgifs.gifs.model

import initishbhatt.com.justgifs.gifs.api.TrendingGifResponse
import initishbhatt.com.justgifs.gifs.api.TrendingGifs


/**
 * @author nitishbhatt
 */
data class TrendingModel(val title: String, val image: String)

fun TrendingGifs.toTrending():TrendingModel
= TrendingModel(title,url)
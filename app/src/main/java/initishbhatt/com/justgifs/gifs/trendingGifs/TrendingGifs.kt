package initishbhatt.com.justgifs.gifs.trendingGifs

import initishbhatt.com.justgifs.gifs.api.entity.TrendingGifsModel

/**
 * @author nitishbhatt
 */
data class TrendingGifs(
        val title: String,
        val url: String
)

fun TrendingGifsModel.toTrending(): TrendingGifs = TrendingGifs(title, url)
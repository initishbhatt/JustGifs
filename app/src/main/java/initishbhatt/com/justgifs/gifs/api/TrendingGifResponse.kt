package initishbhatt.com.justgifs.gifs.api

import com.squareup.moshi.Json
import initishbhatt.com.justgifs.gifs.model.TrendingGifs

/**
 * @author nitishbhatt
 */
class TrendingGifResponse {
    @Json(name = "data")
    lateinit var data: List<TrendingGifs>

}
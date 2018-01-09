package initishbhatt.com.justgifs.gifs.api

import com.google.gson.annotations.SerializedName
import initishbhatt.com.justgifs.gifs.model.TrendingGifs

/**
 * @author nitishbhatt
 */
class TrendingGifResponse {
    @SerializedName("data") lateinit var data: List<TrendingGifs>

}
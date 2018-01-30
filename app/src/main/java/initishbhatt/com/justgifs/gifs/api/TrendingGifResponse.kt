package initishbhatt.com.justgifs.gifs.api

import com.google.gson.annotations.SerializedName
import initishbhatt.com.justgifs.gifs.model.TrendingGifs

/**
 * @author nitishbhatt
 */
class TrendingGifResponse {
    @SerializedName("data")
     var data: List<TrendingGifs> = ArrayList()

}
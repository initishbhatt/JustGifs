package initishbhatt.com.justgifs.gifs.api

import com.google.gson.annotations.SerializedName
import initishbhatt.com.justgifs.gifs.model.SearchedGifs

/**
 * @author nitishbhatt
 */
class SearchGifResponse {
    @SerializedName("data")
    lateinit var data: List<SearchedGifs>
}
package initishbhatt.com.justgifs.gifs.api

import com.google.gson.annotations.SerializedName
import initishbhatt.com.justgifs.gifs.model.RandomGifs

/**
 * @author nitishbhatt
 */
class RandomGifResponse {
    @SerializedName("data")
    var data: List<RandomGifs> = ArrayList()
}
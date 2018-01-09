package initishbhatt.com.justgifs.gifs.api

import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * @author nitishbhatt
 */
interface GifService {
    @GET("/v1/gifs/trending?")
    fun getTrendingGifs(@Query("limit") limit: Int, @Query("rating") rating: String): Single<TrendingGifResponse>
}
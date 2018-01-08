package initishbhatt.com.justgifs.api

import initishbhatt.com.justgifs.BuildConfig
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * @author nitishbhatt
 */
interface GifService {
    @GET("/v1/gifs/trending?" + BuildConfig.API_KEY)
    fun getTrendingGifs(@Query("limit") limit: Int, @Query("rating") rating: String): Single<TrendingGifs>
}
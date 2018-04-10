package initishbhatt.com.justgifs.gifs.api

import initishbhatt.com.justgifs.gifs.api.entity.RandomGifResponse
import initishbhatt.com.justgifs.gifs.api.entity.SearchGifResponse
import initishbhatt.com.justgifs.gifs.api.entity.TrendingGifResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * @author nitishbhatt
 */
interface GifService {
    @GET("/v1/gifs/trending?")
    fun getTrendingGifs(@Query("limit") limit: Int, @Query("rating") rating: String): Single<TrendingGifResponse>

    @GET("/v1/gifs/search?")
    fun getSearchedGifs(@Query("q") searchTag: String, @Query("limit") limit: Int, @Query("offset") offset: Int, @Query("rating") rating: String, @Query("lang") lang: String): Single<SearchGifResponse>

    @GET("/v1/gifs/random?")
    fun getRandomGifs(@Query("tag") tag: String, @Query("rating") rating: String): Single<RandomGifResponse>
}
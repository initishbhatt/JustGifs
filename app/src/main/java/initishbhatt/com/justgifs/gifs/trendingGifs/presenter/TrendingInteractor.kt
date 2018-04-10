package initishbhatt.com.justgifs.gifs.trendingGifs.presenter

import initishbhatt.com.justgifs.gifs.api.entity.TrendingGifResponse
import io.reactivex.Single


/**
 * @author nitishbhatt
 */
interface TrendingInteractor {
    fun getTrendingGifs(): Single<TrendingGifResponse>
}
package initishbhatt.com.justgifs.gifs.trendingGifs.presenter

import initishbhatt.com.justgifs.gifs.api.GifService
import initishbhatt.com.justgifs.gifs.api.TrendingGifResponse
import io.reactivex.Single

/**
 * @author nitishbhatt
 */
class TrendingInteractorImpl(val gifService: GifService) : TrendingInteractor {
    override fun getTrendingGifs(): Single<TrendingGifResponse> {
        return gifService.getTrendingGifs(10, "g")
    }
}
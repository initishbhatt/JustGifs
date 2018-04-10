package initishbhatt.com.justgifs.gifs.trendingGifs.presenter

import initishbhatt.com.justgifs.gifs.api.GifService
import initishbhatt.com.justgifs.gifs.api.entity.TrendingGifResponse
import io.reactivex.Single

/**
 * @author nitishbhatt
 */
class TrendingInteractorImpl(private val gifService: GifService) : TrendingInteractor {
    override fun getTrendingGifs(): Single<TrendingGifResponse> {
        return gifService.getTrendingGifs(1, "g")
    }
}
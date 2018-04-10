package initishbhatt.com.justgifs.gifs.searchGifs.presenter

import initishbhatt.com.justgifs.gifs.api.GifService
import initishbhatt.com.justgifs.gifs.api.entity.SearchGifResponse
import io.reactivex.Single

/**
 * @author nitishbhatt
 */
class SearchInteractorImpl(private val gifService: GifService) : SearchInteractor {
    override fun getSearchedGifs(): Single<SearchGifResponse> {
        return gifService.getSearchedGifs("cricket", 5, 0, "G", "en")
    }
}
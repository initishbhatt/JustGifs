package initishbhatt.com.justgifs.gifs.searchGifs.presenter

import initishbhatt.com.justgifs.gifs.api.entity.SearchGifResponse
import io.reactivex.Single

/**
 * @author nitishbhatt
 */
interface SearchInteractor {
    fun getSearchedGifs(): Single<SearchGifResponse>
}
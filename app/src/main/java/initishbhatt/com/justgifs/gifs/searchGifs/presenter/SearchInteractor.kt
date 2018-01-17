package initishbhatt.com.justgifs.gifs.searchGifs.presenter

import initishbhatt.com.justgifs.gifs.api.SearchGifResponse
import initishbhatt.com.justgifs.gifs.model.SearchedGifs
import io.reactivex.Single

/**
 * @author nitishbhatt
 */
interface SearchInteractor {
    fun getSearchedGifs(): Single<SearchGifResponse>
}
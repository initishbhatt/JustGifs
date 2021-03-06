package initishbhatt.com.justgifs.gifs.searchGifs.view

import initishbhatt.com.justgifs.gifs.model.SearchedModel

/**
 * @author nitishbhatt
 */
interface SearchView {
    fun showLoading()
    fun hideLoading()
    fun showError(throwable: String?)
    fun showSearchedGifs(searchedGifs: List<SearchedModel>?)
}
package initishbhatt.com.justgifs.gifs.searchGifs.view

import initishbhatt.com.justgifs.gifs.model.SearchedGifs

/**
 * @author nitishbhatt
 */
interface SearchView {
    fun showSearchedGifs(searchedGifs: List<SearchedGifs>?)
}
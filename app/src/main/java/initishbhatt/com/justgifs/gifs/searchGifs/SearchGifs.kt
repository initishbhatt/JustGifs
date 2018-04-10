package initishbhatt.com.justgifs.gifs.searchGifs

import initishbhatt.com.justgifs.gifs.api.entity.SearchedGifsModel

/**
 * @author nitishbhatt
 */
data class SearchGifs(
        val url: String
)

fun SearchedGifsModel.toSearch(): SearchGifs = SearchGifs(url)
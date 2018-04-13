package initishbhatt.com.justgifs.gifs.model

import com.google.gson.annotations.SerializedName
import initishbhatt.com.justgifs.gifs.api.SearchedGifs


/**
 * @author nitishbhatt
 */
data class SearchedModel(val title:String,val url:String)

fun SearchedGifs.toSearch():SearchedModel
        = SearchedModel(title,url)
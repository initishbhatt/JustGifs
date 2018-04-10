package initishbhatt.com.justgifs.gifs.trendingGifs.view

import initishbhatt.com.justgifs.gifs.trendingGifs.TrendingGifs

/**
 * @author nitishbhatt
 */
interface TrendingView {
    fun showLoading()
    fun hideLoading()
    fun showError(throwable: String?)
    fun showTrendingGifs(trendingGifs: List<TrendingGifs>)
}
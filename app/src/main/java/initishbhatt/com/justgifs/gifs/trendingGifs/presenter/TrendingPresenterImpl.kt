package initishbhatt.com.justgifs.gifs.trendingGifs.presenter

import initishbhatt.com.justgifs.gifs.trendingGifs.TrendingGifs
import initishbhatt.com.justgifs.gifs.trendingGifs.toTrending
import initishbhatt.com.justgifs.gifs.trendingGifs.view.TrendingView
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * @author nitishbhatt
 */
class TrendingPresenterImpl(val interactor: TrendingInteractor, private var view: TrendingView?) : TrendingPresenter {

    override fun setView(trendingView: TrendingView) {
        view = trendingView
        getListOfTrendingGifs()
    }

    private fun getListOfTrendingGifs() {
        view?.showLoading()
        interactor.getTrendingGifs()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .map {
                    it.data.map {
                        it.toTrending()
                    }
                }
                .subscribe({ this.showTrendingGifs(it) }, this::showError)
    }

    private fun showTrendingGifs(trendingGifResponse: List<TrendingGifs>) {
        view?.apply {
            hideLoading()
            showTrendingGifs(trendingGifResponse)
        }
    }

    private fun showError(throwable: Throwable) {
        view?.apply {
            hideLoading()
            showError(throwable.message)
        }
    }
}
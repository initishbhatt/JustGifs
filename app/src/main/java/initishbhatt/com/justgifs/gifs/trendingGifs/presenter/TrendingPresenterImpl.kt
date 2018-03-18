package initishbhatt.com.justgifs.gifs.trendingGifs.presenter

import initishbhatt.com.justgifs.gifs.api.TrendingGifResponse
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
                .subscribe(this::showTrendingGifs, this::showError)
    }

    private fun showTrendingGifs(trendingGifResponse: TrendingGifResponse?) {
        view?.apply {
            hideLoading()
            showTrendingGifs(trendingGifResponse?.data)
        }
    }

    private fun showError(throwable: Throwable) {
        view?.apply {
            hideLoading()
            showError(throwable.message)
        }
    }
}
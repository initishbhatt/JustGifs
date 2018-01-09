package initishbhatt.com.justgifs.gifs.trendingGifs.presenter

import initishbhatt.com.justgifs.gifs.api.TrendingGifResponse
import initishbhatt.com.justgifs.gifs.trendingGifs.view.TrendingView
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import timber.log.Timber

/**
 * @author nitishbhatt
 */
class TrendingPresenterImpl(val interactor: TrendingInteractor, private var view: TrendingView?) : TrendingPresenter {

    override fun setView(trendingView: TrendingView) {
        view = trendingView
        getListOfTrendingGifs()
    }

    private fun getListOfTrendingGifs() {
        interactor.getTrendingGifs()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ trendingGifResponse -> onSuccess(trendingGifResponse) },
                        { e -> onFaliure(e) })
    }

    private fun onSuccess(trendingGifResponse: TrendingGifResponse?) {
        view?.showTrendingGifs(trendingGifResponse?.data)
    }

    private fun onFaliure(e: Throwable?) {
        Timber.e(e?.message, e?.stackTrace.toString())
    }
}
package initishbhatt.com.justgifs.gifs.searchGifs.presenter

import initishbhatt.com.justgifs.gifs.api.SearchGifResponse
import initishbhatt.com.justgifs.gifs.searchGifs.view.SearchView
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import timber.log.Timber

/**
 * @author nitishbhatt
 */
class SearchPresenterImpl(val interactor: SearchInteractor, private var view: SearchView?) : SearchPresenter {

    override fun setView(searchView: SearchView) {
        view = searchView
        getSearchedGifs()
    }

    private fun getSearchedGifs() {
        interactor.getSearchedGifs()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ searchGifResponse -> onSuccess(searchGifResponse) },
                        { e -> onFaliure(e) })
    }

    private fun onSuccess(searchGifResponse: SearchGifResponse?) {
        view?.showSearchedGifs(searchGifResponse?.data)
    }

    private fun onFaliure(e: Throwable?) {
        Timber.e(e?.message, e?.stackTrace.toString())
    }
}
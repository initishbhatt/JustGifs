package initishbhatt.com.justgifs.gifs.searchGifs.presenter

import initishbhatt.com.justgifs.gifs.model.toSearch
import initishbhatt.com.justgifs.gifs.searchGifs.view.SearchView
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * @author nitishbhatt
 */
class SearchPresenterImpl(val interactor: SearchInteractor, private var view: SearchView?) : SearchPresenter {

    override fun setView(searchView: SearchView) {
        view = searchView
        getSearchedGifs()
    }

    private fun getSearchedGifs() {
        view?.showLoading()
        interactor.getSearchedGifs()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .map {
                    it.data.map {
                        it.toSearch()
                    }
                }
                .subscribe({ searchGifResponse ->
                    view?.apply {
                        hideLoading()
                        showSearchedGifs(searchGifResponse)
                    }
                }) { throwable ->
                    view?.apply {
                        hideLoading()
                        showError(throwable.message)
                    }
                }

    }

}
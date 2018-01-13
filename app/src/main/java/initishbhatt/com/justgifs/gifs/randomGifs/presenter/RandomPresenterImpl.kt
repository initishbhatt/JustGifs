package initishbhatt.com.justgifs.gifs.randomGifs.presenter

import initishbhatt.com.justgifs.gifs.api.RandomGifResponse
import initishbhatt.com.justgifs.gifs.randomGifs.view.RandomView
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import timber.log.Timber

/**
 * @author nitishbhatt
 */
class RandomPresenterImpl(val interactor: RandomInteractor, private var view: RandomView?) : RandomPresenter {
    override fun setView(randomView: RandomView) {
        view = randomView
        getRandomGifs()
    }

    private fun getRandomGifs() {

        interactor.getRandomGif()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ randomGifResponse -> onSuccess(randomGifResponse) },
                        { e -> onFaliure(e) })
    }

    private fun onSuccess(randomGifResponse: RandomGifResponse?) {
        view?.showRandomGifs(randomGifResponse?.data)
    }

    private fun onFaliure(e: Throwable?) {
        Timber.e(e?.message, e?.stackTrace.toString())
    }
}
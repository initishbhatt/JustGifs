package initishbhatt.com.justgifs.presenter

import com.nhaarman.mockito_kotlin.mock
import com.nhaarman.mockito_kotlin.verify
import com.nhaarman.mockito_kotlin.verifyNoMoreInteractions
import com.nhaarman.mockito_kotlin.whenever
import initishbhatt.com.justgifs.gifs.api.entity.TrendingGifResponse
import initishbhatt.com.justgifs.gifs.api.entity.TrendingGifsModel
import initishbhatt.com.justgifs.gifs.trendingGifs.presenter.TrendingInteractor
import initishbhatt.com.justgifs.gifs.trendingGifs.presenter.TrendingPresenter
import initishbhatt.com.justgifs.gifs.trendingGifs.presenter.TrendingPresenterImpl
import initishbhatt.com.justgifs.gifs.trendingGifs.view.TrendingView
import initishbhatt.com.justgifs.utils.RxSchedulersOverrideRule
import io.reactivex.Single
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.MockitoAnnotations
import org.mockito.junit.MockitoJUnitRunner

/**
 * @author nitishbhatt
 */
@RunWith(MockitoJUnitRunner::class)
class TrendingPresenterImplTest {
    @JvmField
    @Rule
    val overrideSchedulersRule = RxSchedulersOverrideRule()

    val mockTrendingInteractor: TrendingInteractor = mock()
    val mockTrendingView: TrendingView = mock()

    private var trendingGifs: List<TrendingGifsModel> = ArrayList()

    private var trendingPresenter: TrendingPresenter? = null


    @Before
    fun setup() {
        MockitoAnnotations.initMocks(this)
        trendingPresenter = TrendingPresenterImpl(mockTrendingInteractor, mockTrendingView)
    }

    @Test
    fun shouldShowRandomGifs_success() {
        //given:
        //val randomObservable = Single.just(randomGifs)

        whenever(mockTrendingInteractor.getTrendingGifs()).thenReturn(Single.just(TrendingGifResponse()))
        trendingPresenter?.setView(mockTrendingView)

        //then:
        verify(mockTrendingView).showLoading()
        verify(mockTrendingView).hideLoading()
        verify(mockTrendingView).showTrendingGifs(trendingGifs)
        verifyNoMoreInteractions(mockTrendingView)

    }

    @Test
    fun shouldShowRandomGifs_failure() {
        val msg = "This is error"
        whenever(mockTrendingInteractor.getTrendingGifs()).thenReturn(Single.error(Throwable(msg)))
        trendingPresenter?.setView(mockTrendingView)

        verify(mockTrendingView).showLoading()
        verify(mockTrendingView).hideLoading()
        verify(mockTrendingView).showError(msg)
        verifyNoMoreInteractions(mockTrendingView)
    }
}
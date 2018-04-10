package initishbhatt.com.justgifs.interactor

import com.nhaarman.mockito_kotlin.mock
import initishbhatt.com.justgifs.gifs.api.GifService
import initishbhatt.com.justgifs.gifs.api.entity.TrendingGifsModel
import initishbhatt.com.justgifs.gifs.trendingGifs.presenter.TrendingInteractor
import initishbhatt.com.justgifs.gifs.trendingGifs.presenter.TrendingInteractorImpl
import initishbhatt.com.justgifs.utils.RxSchedulersOverrideRule
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
class TrendingInteractorImplTest {
    @JvmField
    @Rule
    val overrideSchedulersRule = RxSchedulersOverrideRule()
    val list: List<TrendingGifsModel> = ArrayList()

    var mockTrendingInteractor: TrendingInteractor? = null
    val mockGifService: GifService = mock()

    @Before
    @Throws(Exception::class)
    fun setup() {
        MockitoAnnotations.initMocks(this)
        mockTrendingInteractor = TrendingInteractorImpl(mockGifService)
    }

    @Test
    fun test_trendingGifs() {

    }


}
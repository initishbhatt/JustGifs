package initishbhatt.com.justgifs

import com.nhaarman.mockito_kotlin.mock
import com.nhaarman.mockito_kotlin.verify
import initishbhatt.com.justgifs.gifs.api.RandomGifResponse
import initishbhatt.com.justgifs.gifs.model.RandomGifs
import initishbhatt.com.justgifs.gifs.randomGifs.presenter.RandomInteractor
import initishbhatt.com.justgifs.gifs.randomGifs.presenter.RandomPresenter
import initishbhatt.com.justgifs.gifs.randomGifs.presenter.RandomPresenterImpl
import initishbhatt.com.justgifs.gifs.randomGifs.view.RandomView
import initishbhatt.com.justgifs.utils.RxSchedulersOverrideRule
import io.reactivex.Single
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito.`when`
import org.mockito.MockitoAnnotations
import org.mockito.junit.MockitoJUnitRunner


/**
 * @author nitishbhatt
 */
@RunWith(MockitoJUnitRunner::class)
class RandomPresenterImplTest {
    @JvmField
    @Rule
    val overrideSchedulersRule = RxSchedulersOverrideRule()

    val mockRandomInteractor: RandomInteractor = mock()
    val mockRandomView: RandomView = mock()

    private var randomGifs: List<RandomGifs> = ArrayList()

    private var randomPresenter: RandomPresenter? = null


    @Before
    fun setup() {
        MockitoAnnotations.initMocks(this)
        randomPresenter = RandomPresenterImpl(mockRandomInteractor, mockRandomView)
    }

    @Test
    fun shouldShowRandomGifs() {
        //given:
        //val randomObservable = Single.just(randomGifs)

        `when`(mockRandomInteractor.getRandomGif()).thenReturn(Single.just(RandomGifResponse()))
        randomPresenter?.setView(mockRandomView)

        //then:
        verify(mockRandomView).showRandomGifs(randomGifs)

    }
}
package initishbhatt.com.justgifs

import com.nhaarman.mockito_kotlin.mock
import com.nhaarman.mockito_kotlin.verify
import initishbhatt.com.justgifs.gifs.api.SearchGifResponse
import initishbhatt.com.justgifs.gifs.model.SearchedGifs
import initishbhatt.com.justgifs.gifs.searchGifs.presenter.SearchInteractor
import initishbhatt.com.justgifs.gifs.searchGifs.presenter.SearchPresenter
import initishbhatt.com.justgifs.gifs.searchGifs.presenter.SearchPresenterImpl
import initishbhatt.com.justgifs.gifs.searchGifs.view.SearchView
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
class SearchPresenterImplTest {
    @JvmField
    @Rule
    val overrideSchedulersRule = RxSchedulersOverrideRule()

    val mockSearchInteractor: SearchInteractor = mock()
    val mockSearchView: SearchView = mock()

    private var searchGifs: List<SearchedGifs> = ArrayList()

    private var searchPresenter: SearchPresenter? = null


    @Before
    fun setup() {
        MockitoAnnotations.initMocks(this)
        searchPresenter = SearchPresenterImpl(mockSearchInteractor, mockSearchView)
    }

    @Test
    fun shouldShowRandomGifs() {
        //given:
        //val randomObservable = Single.just(randomGifs)

        `when`(mockSearchInteractor.getSearchedGifs()).thenReturn(Single.just(SearchGifResponse()))
        searchPresenter?.setView(mockSearchView)

        //then:
        verify(mockSearchView).showSearchedGifs(searchGifs)

    }
}
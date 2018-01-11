package initishbhatt.com.justgifs.gifs.searchGifs.view

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import initishbhatt.com.justgifs.JustGifsApp
import initishbhatt.com.justgifs.R
import initishbhatt.com.justgifs.gifs.model.SearchedGifs
import initishbhatt.com.justgifs.gifs.searchGifs.presenter.SearchPresenter
import kotlinx.android.synthetic.main.fragment_search.*
import javax.inject.Inject

/**
 * @author nitishbhatt
 */
class SearchFragment : Fragment(), SearchView {
    @Inject
    lateinit var presenter: SearchPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (context.applicationContext as JustGifsApp).createSearchGifComponent().inject(this)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_search, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
        presenter.setView(this)
    }

    private fun initViews() {
        searched_gifs.setHasFixedSize(true)
        val layoutManager = GridLayoutManager(context, 2)
        searched_gifs.layoutManager = layoutManager
        searched_gifs.adapter = SearchAdapter()
    }

    override fun showSearchedGifs(searchedGifs: List<SearchedGifs>?) {
        (searched_gifs.adapter as SearchAdapter).showGifs(searchedGifs)
    }

    companion object {
        fun newInstance(): SearchFragment {
            return SearchFragment()
        }
    }
}
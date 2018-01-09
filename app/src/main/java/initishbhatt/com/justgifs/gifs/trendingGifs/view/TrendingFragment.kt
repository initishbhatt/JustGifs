package initishbhatt.com.justgifs.gifs.trendingGifs.view

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import initishbhatt.com.justgifs.JustGifsApp
import initishbhatt.com.justgifs.R
import initishbhatt.com.justgifs.gifs.model.TrendingGifs
import initishbhatt.com.justgifs.gifs.trendingGifs.presenter.TrendingPresenter
import kotlinx.android.synthetic.main.fragment_trending.*
import javax.inject.Inject


/**
 * @author nitishbhatt
 */
class TrendingFragment : Fragment(), TrendingView {
    @Inject
    lateinit var presenter: TrendingPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (context.applicationContext as JustGifsApp).createTrendingGifComponent().inject(this)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_trending, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
        presenter.setView(this)
    }

    private fun initViews() {
        trending_gifs.setHasFixedSize(true)
        val layoutManager = GridLayoutManager(context, 2)
        trending_gifs.layoutManager = layoutManager
        trending_gifs.adapter = TrendingAdapter()
    }

    override fun showTrendingGifs(trendingGifs: List<TrendingGifs>?) {
        (trending_gifs.adapter as TrendingAdapter).addGifs(trendingGifs)
    }

}
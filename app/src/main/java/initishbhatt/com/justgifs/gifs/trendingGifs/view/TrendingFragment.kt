package initishbhatt.com.justgifs.gifs.trendingGifs.view

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import initishbhatt.com.justgifs.JustGifsApp
import initishbhatt.com.justgifs.R
import initishbhatt.com.justgifs.databinding.FragmentTrendingBinding
import initishbhatt.com.justgifs.gifs.model.TrendingModel
import initishbhatt.com.justgifs.gifs.trendingGifs.presenter.TrendingPresenter
import kotlinx.android.synthetic.main.fragment_trending.*
import timber.log.Timber
import javax.inject.Inject


/**
 * @author nitishbhatt
 */
class TrendingFragment : Fragment(), TrendingView {

    @Inject
    lateinit var presenter: TrendingPresenter
    private lateinit var binding: FragmentTrendingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (context!!.applicationContext as JustGifsApp).createTrendingGifComponent().inject(this)
        binding = FragmentTrendingBinding.inflate(activity!!.layoutInflater)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_trending, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
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

    override fun showTrendingGifs(trendingGifs: List<TrendingModel>?) {
        (trending_gifs.adapter as TrendingAdapter).addGifs(trendingGifs)
    }

    override fun showLoading() {
        binding.progressVisibility = true
    }

    override fun hideLoading() {
        binding.progressVisibility = false
    }

    override fun showError(throwable: String?) {
        Timber.d(throwable)
    }

}
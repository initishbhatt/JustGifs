package initishbhatt.com.justgifs.gifs.randomGifs.view

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import initishbhatt.com.justgifs.JustGifsApp
import initishbhatt.com.justgifs.R
import initishbhatt.com.justgifs.gifs.model.RandomModel
import initishbhatt.com.justgifs.gifs.randomGifs.presenter.RandomPresenter
import kotlinx.android.synthetic.main.fragment_random.*
import javax.inject.Inject

/**
 * @author nitishbhatt
 */
class RandomFragment : Fragment(), RandomView {

    @Inject
    lateinit var presenter: RandomPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (context!!.applicationContext as JustGifsApp).createRandomGifComponent().inject(this)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_random, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
        presenter.setView(this)
    }

    private fun initViews() {
        random_gifs.setHasFixedSize(true)
        val layoutManager = GridLayoutManager(context, 1)
        random_gifs.layoutManager = layoutManager
        random_gifs.adapter = RandomAdapter()
    }

    override fun showRandomGifs(randomGifs: List<RandomModel>?) {
        (random_gifs.adapter as RandomAdapter).showGifs(randomGifs)

    }

}
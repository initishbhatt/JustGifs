package initishbhatt.com.justgifs.gifs.trendingGifs.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import initishbhatt.com.justgifs.R
import kotlinx.android.synthetic.main.activity_main.*

class TrendingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        loadTrendingFragment(savedInstanceState)
    }

    private fun loadTrendingFragment(savedInstanceState: Bundle?) {
        if (savedInstanceState == null) {
            supportFragmentManager
                    .beginTransaction()
                    .add(R.id.trendingGifs, TrendingFragment(), TrendingFragment::class.simpleName)
                    .commit()
        }
    }
}

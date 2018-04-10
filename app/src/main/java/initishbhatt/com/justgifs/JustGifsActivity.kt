package initishbhatt.com.justgifs

import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


/**
 * @author nitishbhatt
 */
class JustGifsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        tab_layout.addTab(tab_layout.newTab().setText("Trending Gifs"))
        tab_layout.addTab(tab_layout.newTab().setText("Search Gifs"))
        tab_layout.addTab(tab_layout.newTab().setText("Gif of The Day"))
        val pageAdapter = JustGifsPageAdapter(supportFragmentManager, tab_layout.tabCount)
        view_pager.adapter = pageAdapter
        view_pager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tab_layout))
        tab_layout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabReselected(tab: TabLayout.Tab) {
                //do nothing
            }

            override fun onTabUnselected(tab: TabLayout.Tab) {
                //do nothing
            }

            override fun onTabSelected(tab: TabLayout.Tab) {
                view_pager.currentItem = tab.position
            }
        })
    }
}

package initishbhatt.com.justgifs

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import initishbhatt.com.justgifs.gifs.randomGifs.view.RandomFragment
import initishbhatt.com.justgifs.gifs.searchGifs.view.SearchFragment
import initishbhatt.com.justgifs.gifs.trendingGifs.view.TrendingFragment

/**
 * @author nitishbhatt
 */
class JustGifsPageAdapter(fragmentManager: FragmentManager, private var tabCount: Int) : FragmentPagerAdapter(fragmentManager) {

    override fun getItem(position: Int): Fragment? {
        return when (position) {
            0 -> TrendingFragment()
            1 -> SearchFragment()
            2 -> RandomFragment()
            else -> null
        }
    }

    override fun getCount(): Int {
        return tabCount
    }
}
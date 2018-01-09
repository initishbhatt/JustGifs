package initishbhatt.com.justgifs.gifs.trendingGifs.view

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import initishbhatt.com.justgifs.R
import initishbhatt.com.justgifs.gifs.model.TrendingGifs
import kotlinx.android.synthetic.main.items_trending.view.*

/**
 * @author nitishbhatt
 */
class TrendingAdapter : RecyclerView.Adapter<TrendingAdapter.ViewHolder>() {
    private var trendingGifs: List<TrendingGifs> = ArrayList()

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(trendingGifs[position])
    }

    override fun getItemCount(): Int {
        return trendingGifs.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val root = (LayoutInflater.from(parent?.context).inflate(R.layout.items_trending, parent, false))
        return ViewHolder(root)
    }

    fun addGifs(trendingGifs: List<TrendingGifs>?) {
        if (trendingGifs != null) {
            this.trendingGifs = trendingGifs
            notifyDataSetChanged()
        }
    }


    inner class ViewHolder(root: View) : RecyclerView.ViewHolder(root) {
        fun bind(trendingGifs: TrendingGifs) = with(itemView) {
            gif_name.text = trendingGifs.title
            Glide.with(context).load(trendingGifs.images.fixedHeightStill.url).into(gif_imageview)
        }
    }
}
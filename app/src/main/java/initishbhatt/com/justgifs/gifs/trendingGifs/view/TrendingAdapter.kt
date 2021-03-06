package initishbhatt.com.justgifs.gifs.trendingGifs.view

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import initishbhatt.com.justgifs.GlideApp
import initishbhatt.com.justgifs.R
import initishbhatt.com.justgifs.gifs.model.TrendingModel
import kotlinx.android.synthetic.main.items_trending.view.*

/**
 * @author nitishbhatt
 */
class TrendingAdapter : RecyclerView.Adapter<TrendingAdapter.ViewHolder>() {
    private var trendingGifs: List<TrendingModel> = ArrayList()

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(trendingGifs[position])
    }

    override fun getItemCount(): Int {
        return trendingGifs.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val root = (LayoutInflater.from(parent.context).inflate(R.layout.items_trending, parent, false))
        return ViewHolder(root)
    }

    fun addGifs(trendingGifs: List<TrendingModel>?) {
        if (trendingGifs != null) {
            this.trendingGifs = trendingGifs
            notifyDataSetChanged()
        }
    }


    inner class ViewHolder(root: View) : RecyclerView.ViewHolder(root) {
        fun bind(trendingGifs: TrendingModel) = with(itemView) {
            gif_name.text = trendingGifs.title
            GlideApp.with(context)
                    .load(trendingGifs.image)
                    .into(gif_imview)
        }
    }
}
package initishbhatt.com.justgifs.gifs.randomGifs.view

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import initishbhatt.com.justgifs.GlideApp
import initishbhatt.com.justgifs.R
import initishbhatt.com.justgifs.gifs.model.RandomModel
import kotlinx.android.synthetic.main.items_trending.view.*

/**
 * @author nitishbhatt
 */
class RandomAdapter : RecyclerView.Adapter<RandomAdapter.ViewHolder>() {
    private var randomGifs: List<RandomModel> = ArrayList()
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(randomGifs[position])
    }

    override fun getItemCount(): Int {
        return randomGifs.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val root = (LayoutInflater.from(parent.context).inflate(R.layout.items_trending, parent, false))
        return ViewHolder(root)
    }

    fun showGifs(randomGifs: List<RandomModel>?) {
        if (randomGifs != null) {
            this.randomGifs = randomGifs
            notifyDataSetChanged()
        }
    }

    inner class ViewHolder(root: View) : RecyclerView.ViewHolder(root) {
        fun bind(randomGifs: RandomModel) = with(itemView) {
            gif_name.text = randomGifs.title
            GlideApp.with(context)
                    .load(randomGifs.url)
                    .into(gif_imview)
        }
    }
}
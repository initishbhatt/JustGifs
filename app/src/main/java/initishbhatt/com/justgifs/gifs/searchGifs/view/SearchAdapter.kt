package initishbhatt.com.justgifs.gifs.searchGifs.view

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import initishbhatt.com.justgifs.GlideApp
import initishbhatt.com.justgifs.R
import initishbhatt.com.justgifs.gifs.model.SearchedModel
import kotlinx.android.synthetic.main.items_trending.view.*

/**
 * @author nitishbhatt
 */
class SearchAdapter : RecyclerView.Adapter<SearchAdapter.ViewHolder>() {
    private var searchedGifs: List<SearchedModel> = ArrayList()

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(searchedGifs[position])
    }

    override fun getItemCount(): Int {
        return searchedGifs.size
    }

    fun showGifs(searchedGifs: List<SearchedModel>?) {
        if (searchedGifs != null) {
            this.searchedGifs = searchedGifs
            notifyDataSetChanged()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val root = (LayoutInflater.from(parent.context).inflate(R.layout.items_trending, parent, false))
        return ViewHolder(root)
    }

    inner class ViewHolder(root: View) : RecyclerView.ViewHolder(root) {
        fun bind(searchedGifs: SearchedModel) = with(itemView) {
            gif_name.text = searchedGifs.title
            GlideApp.with(context)
                    .load(searchedGifs.url)
                    .into(gif_imview)
        }
    }
}
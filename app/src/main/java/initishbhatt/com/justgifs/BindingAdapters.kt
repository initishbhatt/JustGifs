package initishbhatt.com.justgifs

import android.databinding.BindingAdapter
import android.databinding.BindingConversion
import android.view.View
import android.widget.ImageView
import com.bumptech.glide.Glide
import javax.inject.Singleton


/**
 * @author nitishbhatt
 */
@Singleton
class BindingAdapters {

    @BindingAdapter("android:src")
    fun setImageUrl(view: ImageView, url: String) {
        GlideApp.with(view.context).load(url).into(view)
    }
}

@BindingConversion
fun convertBooleanToVisibility(visible: Boolean): Int {
    return if (visible) View.VISIBLE else View.GONE
}
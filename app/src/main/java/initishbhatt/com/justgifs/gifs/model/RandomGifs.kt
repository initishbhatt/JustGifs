package initishbhatt.com.justgifs.gifs.model
import com.google.gson.annotations.SerializedName


/**
 * @author nitishbhatt
 */

data class RandomGifs(
		@SerializedName("type") val type: String, //gif
		@SerializedName("id") val id: String, //xWJOxVYbzGVtm
		@SerializedName("url") val url: String, //http://giphy.com/gifs/foxadhd-drugs-lsd-fancis-crick-xWJOxVYbzGVtm
		@SerializedName("image_original_url") val imageOriginalUrl: String, //https://media0.giphy.com/media/xWJOxVYbzGVtm/giphy.gif
		@SerializedName("image_url") val imageUrl: String, //https://media0.giphy.com/media/xWJOxVYbzGVtm/giphy.gif
		@SerializedName("image_mp4_url") val imageMp4Url: String, //https://media0.giphy.com/media/xWJOxVYbzGVtm/giphy.mp4
		@SerializedName("image_frames") val imageFrames: String, //6
		@SerializedName("image_width") val imageWidth: String, //500
		@SerializedName("image_height") val imageHeight: String, //500
		@SerializedName("fixed_height_downsampled_url") val fixedHeightDownsampledUrl: String, //https://media0.giphy.com/media/xWJOxVYbzGVtm/200_d.gif
		@SerializedName("fixed_height_downsampled_width") val fixedHeightDownsampledWidth: String, //200
		@SerializedName("fixed_height_downsampled_height") val fixedHeightDownsampledHeight: String, //200
		@SerializedName("fixed_width_downsampled_url") val fixedWidthDownsampledUrl: String, //https://media0.giphy.com/media/xWJOxVYbzGVtm/200w_d.gif
		@SerializedName("fixed_width_downsampled_width") val fixedWidthDownsampledWidth: String, //200
		@SerializedName("fixed_width_downsampled_height") val fixedWidthDownsampledHeight: String, //200
		@SerializedName("fixed_height_small_url") val fixedHeightSmallUrl: String, //https://media0.giphy.com/media/xWJOxVYbzGVtm/100.gif
		@SerializedName("fixed_height_small_still_url") val fixedHeightSmallStillUrl: String, //https://media0.giphy.com/media/xWJOxVYbzGVtm/100_s.gif
		@SerializedName("fixed_height_small_width") val fixedHeightSmallWidth: String, //100
		@SerializedName("fixed_height_small_height") val fixedHeightSmallHeight: String, //100
		@SerializedName("fixed_width_small_url") val fixedWidthSmallUrl: String, //https://media0.giphy.com/media/xWJOxVYbzGVtm/100w.gif
		@SerializedName("fixed_width_small_still_url") val fixedWidthSmallStillUrl: String, //https://media0.giphy.com/media/xWJOxVYbzGVtm/100w_s.gif
		@SerializedName("fixed_width_small_width") val fixedWidthSmallWidth: String, //100
		@SerializedName("fixed_width_small_height") val fixedWidthSmallHeight: String, //100
		@SerializedName("username") val username: String, //foxadhd
		@SerializedName("caption") val caption: String
)

data class RandomMeta(
		@SerializedName("status") val status: Int, //200
		@SerializedName("msg") val msg: String, //OK
		@SerializedName("response_id") val responseId: String //5a560730397a375036b16baa
)
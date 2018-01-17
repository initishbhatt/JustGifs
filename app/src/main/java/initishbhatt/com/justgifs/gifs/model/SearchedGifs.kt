package initishbhatt.com.justgifs.gifs.model

import com.google.gson.annotations.SerializedName


/**
 * @author nitishbhatt
 */
data class SearchedGifs(
        @SerializedName("type") val type: String, //gif
        @SerializedName("id") val id: String, //11R5KYi6ZdP8Z2
        @SerializedName("slug") val slug: String, //crickets-11R5KYi6ZdP8Z2
        @SerializedName("url") val url: String, //https://giphy.com/gifs/crickets-11R5KYi6ZdP8Z2
        @SerializedName("bitly_gif_url") val bitlyGifUrl: String, //https://gph.is/1KCbe3h
        @SerializedName("bitly_url") val bitlyUrl: String, //https://gph.is/1KCbe3h
        @SerializedName("embed_url") val embedUrl: String, //https://giphy.com/embed/11R5KYi6ZdP8Z2
        @SerializedName("username") val username: String,
        @SerializedName("source") val source: String, //https://www.jdmcity.com/archive/index.php/t-23470.html
        @SerializedName("rating") val rating: String, //g
        @SerializedName("content_url") val contentUrl: String,
        @SerializedName("source_tld") val sourceTld: String, //www.jdmcity.com
        @SerializedName("source_post_url") val sourcePostUrl: String, //https://www.jdmcity.com/archive/index.php/t-23470.html
        @SerializedName("is_indexable") val isIndexable: Int, //0
        @SerializedName("is_sticker") val isSticker: Int, //0
        @SerializedName("import_datetime") val importDatetime: String, //2015-05-11 22:43:00
        @SerializedName("trending_datetime") val trendingDatetime: String, //1970-01-01 00:00:00
        @SerializedName("images") val images: SearchedImages,
        @SerializedName("title") val title: String //awkward silence GIF
)

data class SearchedImages(
        @SerializedName("fixed_height_still") val fixedHeightStill: SearchedFixedHeightStill,
        @SerializedName("original_still") val originalStill: SearchedOriginalStill,
        @SerializedName("fixed_width") val fixedWidth: SearchedFixedWidth,
        @SerializedName("fixed_height_small_still") val fixedHeightSmallStill: SearchedFixedHeightSmallStill,
        @SerializedName("fixed_height_downsampled") val fixedHeightDownsampled: SearchedFixedHeightDownsampled,
        @SerializedName("preview") val preview: SearchedPreview,
        @SerializedName("fixed_height_small") val fixedHeightSmall: SearchedFixedHeightSmall,
        @SerializedName("downsized_still") val downsizedStill: SearchedDownsizedStill,
        @SerializedName("downsized") val downsized: SearchedDownsized,
        @SerializedName("downsized_large") val downsizedLarge: SearchedDownsizedLarge,
        @SerializedName("fixed_width_small_still") val fixedWidthSmallStill: SearchedFixedWidthSmallStill,
        @SerializedName("preview_webp") val previewWebp: SearchedPreviewWebp,
        @SerializedName("fixed_width_still") val fixedWidthStill: SearchedFixedWidthStill,
        @SerializedName("fixed_width_small") val fixedWidthSmall: SearchedFixedWidthSmall,
        @SerializedName("downsized_small") val downsizedSmall: SearchedDownsizedSmall,
        @SerializedName("fixed_width_downsampled") val fixedWidthDownsampled: SearchedFixedWidthDownsampled,
        @SerializedName("downsized_medium") val downsizedMedium: SearchedDownsizedMedium,
        @SerializedName("original") val original: SearchedOriginal,
        @SerializedName("fixed_height") val fixedHeight: SearchedFixedHeight,
        @SerializedName("looping") val looping: SearchedLooping,
        @SerializedName("original_mp4") val originalMp4: SearchedOriginalMp4,
        @SerializedName("preview_gif") val previewGif: SearchedPreviewGif,
        @SerializedName("480w_still") val wStill: SearchedWStill
)

data class SearchedOriginalStill(
        @SerializedName("url") val url: String, //https://media0.giphy.com/media/11R5KYi6ZdP8Z2/giphy_s.gif
        @SerializedName("width") val width: String, //400
        @SerializedName("height") val height: String //300
)

data class SearchedFixedHeightDownsampled(
        @SerializedName("url") val url: String, //https://media0.giphy.com/media/11R5KYi6ZdP8Z2/200_d.gif
        @SerializedName("width") val width: String, //267
        @SerializedName("height") val height: String, //200
        @SerializedName("size") val size: String, //212534
        @SerializedName("webp") val webp: String, //https://media0.giphy.com/media/11R5KYi6ZdP8Z2/200_d.webp
        @SerializedName("webp_size") val webpSize: String //40762
)

data class SearchedPreviewWebp(
        @SerializedName("url") val url: String, //https://media0.giphy.com/media/11R5KYi6ZdP8Z2/giphy-preview.webp
        @SerializedName("width") val width: String, //400
        @SerializedName("height") val height: String, //300
        @SerializedName("size") val size: String //28738
)

data class SearchedDownsizedMedium(
        @SerializedName("url") val url: String, //https://media0.giphy.com/media/11R5KYi6ZdP8Z2/giphy.gif
        @SerializedName("width") val width: String, //400
        @SerializedName("height") val height: String, //300
        @SerializedName("size") val size: String //958017
)

data class SearchedDownsized(
        @SerializedName("url") val url: String, //https://media0.giphy.com/media/11R5KYi6ZdP8Z2/giphy-downsized.gif
        @SerializedName("width") val width: String, //400
        @SerializedName("height") val height: String, //300
        @SerializedName("size") val size: String //958017
)

data class SearchedPreview(
        @SerializedName("width") val width: String, //256
        @SerializedName("height") val height: String, //192
        @SerializedName("mp4") val mp4: String, //https://media0.giphy.com/media/11R5KYi6ZdP8Z2/giphy-preview.mp4
        @SerializedName("mp4_size") val mp4Size: String //44333
)

data class SearchedFixedHeightStill(
        @SerializedName("url") val url: String, //https://media0.giphy.com/media/11R5KYi6ZdP8Z2/200_s.gif
        @SerializedName("width") val width: String, //267
        @SerializedName("height") val height: String //200
)

data class SearchedFixedHeightSmall(
        @SerializedName("url") val url: String, //https://media0.giphy.com/media/11R5KYi6ZdP8Z2/100.gif
        @SerializedName("width") val width: String, //133
        @SerializedName("height") val height: String, //100
        @SerializedName("size") val size: String, //80156
        @SerializedName("mp4") val mp4: String, //https://media0.giphy.com/media/11R5KYi6ZdP8Z2/100.mp4
        @SerializedName("mp4_size") val mp4Size: String, //6441
        @SerializedName("webp") val webp: String, //https://media0.giphy.com/media/11R5KYi6ZdP8Z2/100.webp
        @SerializedName("webp_size") val webpSize: String //18092
)

data class SearchedFixedHeight(
        @SerializedName("url") val url: String, //https://media0.giphy.com/media/11R5KYi6ZdP8Z2/200.gif
        @SerializedName("width") val width: String, //267
        @SerializedName("height") val height: String, //200
        @SerializedName("size") val size: String, //289697
        @SerializedName("mp4") val mp4: String, //https://media0.giphy.com/media/11R5KYi6ZdP8Z2/200.mp4
        @SerializedName("mp4_size") val mp4Size: String, //11168
        @SerializedName("webp") val webp: String, //https://media0.giphy.com/media/11R5KYi6ZdP8Z2/200.webp
        @SerializedName("webp_size") val webpSize: String //54442
)

data class SearchedFixedWidthStill(
        @SerializedName("url") val url: String, //https://media0.giphy.com/media/11R5KYi6ZdP8Z2/200w_s.gif
        @SerializedName("width") val width: String, //200
        @SerializedName("height") val height: String //150
)

data class SearchedDownsizedSmall(
        @SerializedName("width") val width: String, //400
        @SerializedName("height") val height: String, //300
        @SerializedName("mp4") val mp4: String, //https://media0.giphy.com/media/11R5KYi6ZdP8Z2/giphy-downsized-small.mp4
        @SerializedName("mp4_size") val mp4Size: String //118129
)

data class SearchedFixedWidth(
        @SerializedName("url") val url: String, //https://media0.giphy.com/media/11R5KYi6ZdP8Z2/200w.gif
        @SerializedName("width") val width: String, //200
        @SerializedName("height") val height: String, //150
        @SerializedName("size") val size: String, //169175
        @SerializedName("mp4") val mp4: String, //https://media0.giphy.com/media/11R5KYi6ZdP8Z2/200w.mp4
        @SerializedName("mp4_size") val mp4Size: String, //8457
        @SerializedName("webp") val webp: String, //https://media0.giphy.com/media/11R5KYi6ZdP8Z2/200w.webp
        @SerializedName("webp_size") val webpSize: String //33988
)

data class SearchedLooping(
        @SerializedName("mp4") val mp4: String, //https://media0.giphy.com/media/11R5KYi6ZdP8Z2/giphy-loop.mp4
        @SerializedName("mp4_size") val mp4Size: String //2195854
)

data class SearchedOriginalMp4(
        @SerializedName("width") val width: String, //480
        @SerializedName("height") val height: String, //360
        @SerializedName("mp4") val mp4: String, //https://media0.giphy.com/media/11R5KYi6ZdP8Z2/giphy.mp4
        @SerializedName("mp4_size") val mp4Size: String //52998
)

data class SearchedPreviewGif(
        @SerializedName("url") val url: String, //https://media0.giphy.com/media/11R5KYi6ZdP8Z2/giphy-preview.gif
        @SerializedName("width") val width: String, //285
        @SerializedName("height") val height: String, //214
        @SerializedName("size") val size: String //48950
)

data class SearchedFixedWidthSmall(
        @SerializedName("url") val url: String, //https://media0.giphy.com/media/11R5KYi6ZdP8Z2/100w.gif
        @SerializedName("width") val width: String, //100
        @SerializedName("height") val height: String, //75
        @SerializedName("size") val size: String, //48807
        @SerializedName("mp4") val mp4: String, //https://media0.giphy.com/media/11R5KYi6ZdP8Z2/100w.mp4
        @SerializedName("mp4_size") val mp4Size: String, //5680
        @SerializedName("webp") val webp: String, //https://media0.giphy.com/media/11R5KYi6ZdP8Z2/100w.webp
        @SerializedName("webp_size") val webpSize: String //11588
)

data class SearchedFixedWidthDownsampled(
        @SerializedName("url") val url: String, //https://media0.giphy.com/media/11R5KYi6ZdP8Z2/200w_d.gif
        @SerializedName("width") val width: String, //200
        @SerializedName("height") val height: String, //150
        @SerializedName("size") val size: String, //117501
        @SerializedName("webp") val webp: String, //https://media0.giphy.com/media/11R5KYi6ZdP8Z2/200w_d.webp
        @SerializedName("webp_size") val webpSize: String //25278
)

data class SearchedFixedHeightSmallStill(
        @SerializedName("url") val url: String, //https://media0.giphy.com/media/11R5KYi6ZdP8Z2/100_s.gif
        @SerializedName("width") val width: String, //133
        @SerializedName("height") val height: String //100
)

data class SearchedWStill(
        @SerializedName("url") val url: String, //https://media3.giphy.com/media/11R5KYi6ZdP8Z2/480w_s.jpg
        @SerializedName("width") val width: String, //480
        @SerializedName("height") val height: String //360
)

data class SearchedDownsizedLarge(
        @SerializedName("url") val url: String, //https://media0.giphy.com/media/11R5KYi6ZdP8Z2/giphy.gif
        @SerializedName("width") val width: String, //400
        @SerializedName("height") val height: String, //300
        @SerializedName("size") val size: String //958017
)

data class SearchedOriginal(
        @SerializedName("url") val url: String, //https://media0.giphy.com/media/11R5KYi6ZdP8Z2/giphy.gif
        @SerializedName("width") val width: String, //400
        @SerializedName("height") val height: String, //300
        @SerializedName("size") val size: String, //958017
        @SerializedName("frames") val frames: String, //16
        @SerializedName("mp4") val mp4: String, //https://media0.giphy.com/media/11R5KYi6ZdP8Z2/giphy.mp4
        @SerializedName("mp4_size") val mp4Size: String, //52998
        @SerializedName("webp") val webp: String, //https://media0.giphy.com/media/11R5KYi6ZdP8Z2/giphy.webp
        @SerializedName("webp_size") val webpSize: String //131906
)

data class SearchedFixedWidthSmallStill(
        @SerializedName("url") val url: String, //https://media0.giphy.com/media/11R5KYi6ZdP8Z2/100w_s.gif
        @SerializedName("width") val width: String, //100
        @SerializedName("height") val height: String //75
)

data class SearchedDownsizedStill(
        @SerializedName("url") val url: String, //https://media0.giphy.com/media/11R5KYi6ZdP8Z2/giphy-downsized_s.gif
        @SerializedName("width") val width: String, //400
        @SerializedName("height") val height: String, //300
        @SerializedName("size") val size: String //67396
)

data class SearchMeta(
        @SerializedName("status") val status: Int, //200
        @SerializedName("msg") val msg: String, //OK
        @SerializedName("response_id") val responseId: String //5a5606636e70596a590b5fc8
)

data class SearchPagination(
        @SerializedName("total_count") val totalCount: Int, //7024
        @SerializedName("count") val count: Int, //5
        @SerializedName("offset") val offset: Int //0
)


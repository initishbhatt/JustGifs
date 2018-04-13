package initishbhatt.com.justgifs.gifs.api

import com.google.gson.annotations.SerializedName

/**
 * @author nitishbhatt
 */
class TrendingGifResponse {
    @SerializedName("data")
    var data: List<TrendingGifs> = ArrayList()

}

data class TrendingGifs(

        @SerializedName("type") val type: String, //gif
        @SerializedName("id") val id: String, //3ohs7Qa1M9DxGaI94A
        @SerializedName("slug") val slug: String, //animation-cat-dance-3ohs7Qa1M9DxGaI94A
        @SerializedName("url") val url: String, //https://giphy.com/gifs/animation-cat-dance-3ohs7Qa1M9DxGaI94A
        @SerializedName("bitly_gif_url") val bitlyGifUrl: String, //https://gph.is/2zKutd1
        @SerializedName("bitly_url") val bitlyUrl: String, //https://gph.is/2zKutd1
        @SerializedName("embed_url") val embedUrl: String, //https://giphy.com/embed/3ohs7Qa1M9DxGaI94A
        @SerializedName("username") val username: String, //zakeno
        @SerializedName("source") val source: String,
        @SerializedName("rating") val rating: String, //g
        @SerializedName("title") val title: String,
        @SerializedName("content_url") val contentUrl: String,
        @SerializedName("user") val user: User,
        @SerializedName("source_tld") val sourceTld: String,
        @SerializedName("source_post_url") val sourcePostUrl: String,
        @SerializedName("is_indexable") val isIndexable: Int, //0
        @SerializedName("is_sticker") val isSticker: Int, //0
        @SerializedName("import_datetime") val importDatetime: String, //2017-11-15 22:01:55
        @SerializedName("trending_datetime") val trendingDatetime: String, //2018-01-03 11:00:01
        @SerializedName("images") val images: Images
)

data class Images(
        @SerializedName("fixed_height") val fixedHeight: FixedHeight,
        @SerializedName("fixed_height_still") val fixedHeightStill: FixedHeightStill,
        @SerializedName("fixed_height_downsampled") val fixedHeightDownsampled: FixedHeightDownsampled,
        @SerializedName("fixed_width") val fixedWidth: FixedWidth,
        @SerializedName("fixed_width_still") val fixedWidthStill: FixedWidthStill,
        @SerializedName("fixed_width_downsampled") val fixedWidthDownsampled: FixedWidthDownsampled,
        @SerializedName("fixed_height_small") val fixedHeightSmall: FixedHeightSmall,
        @SerializedName("fixed_height_small_still") val fixedHeightSmallStill: FixedHeightSmallStill,
        @SerializedName("fixed_width_small") val fixedWidthSmall: FixedWidthSmall,
        @SerializedName("fixed_width_small_still") val fixedWidthSmallStill: FixedWidthSmallStill,
        @SerializedName("downsized") val downsized: Downsized,
        @SerializedName("downsized_still") val downsizedStill: DownsizedStill,
        @SerializedName("downsized_large") val downsizedLarge: DownsizedLarge,
        @SerializedName("downsized_medium") val downsizedMedium: DownsizedMedium,
        @SerializedName("original") val original: Original,
        @SerializedName("original_still") val originalStill: OriginalStill,
        @SerializedName("looping") val looping: Looping,
        @SerializedName("original_mp4") val originalMp4: OriginalMp4,
        @SerializedName("preview") val preview: Preview,
        @SerializedName("downsized_small") val downsizedSmall: DownsizedSmall,
        @SerializedName("preview_gif") val previewGif: PreviewGif,
        @SerializedName("preview_webp") val previewWebp: PreviewWebp,
        @SerializedName("480w_still") val wStill: WStill
)

data class FixedHeightDownsampled(
        @SerializedName("url") val url: String, //https://media0.giphy.com/media/3ohs7Qa1M9DxGaI94A/200_d.gif
        @SerializedName("width") val width: String, //200
        @SerializedName("height") val height: String, //200
        @SerializedName("size") val size: String, //14740
        @SerializedName("webp") val webp: String, //https://media0.giphy.com/media/3ohs7Qa1M9DxGaI94A/200_d.webp
        @SerializedName("webp_size") val webpSize: String //14380
)

data class FixedWidthStill(
        @SerializedName("url") val url: String, //https://media0.giphy.com/media/3ohs7Qa1M9DxGaI94A/200w_s.gif
        @SerializedName("width") val width: String, //200
        @SerializedName("height") val height: String, //200
        @SerializedName("size") val size: String //3859
)

data class OriginalMp4(
        @SerializedName("mp4") val mp4: String, //https://media0.giphy.com/media/3ohs7Qa1M9DxGaI94A/giphy.mp4
        @SerializedName("mp4_size") val mp4Size: String, //88446
        @SerializedName("width") val width: String, //480
        @SerializedName("height") val height: String //480
)

data class FixedWidth(
        @SerializedName("url") val url: String, //https://media0.giphy.com/media/3ohs7Qa1M9DxGaI94A/200w.gif
        @SerializedName("width") val width: String, //200
        @SerializedName("height") val height: String, //200
        @SerializedName("size") val size: String, //40279
        @SerializedName("mp4") val mp4: String, //https://media0.giphy.com/media/3ohs7Qa1M9DxGaI94A/200w.mp4
        @SerializedName("mp4_size") val mp4Size: String, //30515
        @SerializedName("webp") val webp: String, //https://media0.giphy.com/media/3ohs7Qa1M9DxGaI94A/200w.webp
        @SerializedName("webp_size") val webpSize: String //41190
)

data class PreviewWebp(
        @SerializedName("url") val url: String, //https://media0.giphy.com/media/3ohs7Qa1M9DxGaI94A/giphy-preview.webp
        @SerializedName("width") val width: String, //336
        @SerializedName("height") val height: String, //336
        @SerializedName("size") val size: String //48490
)

data class WStill(
        @SerializedName("url") val url: String, //https://media0.giphy.com/media/3ohs7Qa1M9DxGaI94A/480w_s.jpg
        @SerializedName("width") val width: String, //480
        @SerializedName("height") val height: String //480
)

data class Downsized(
        @SerializedName("url") val url: String, //https://media0.giphy.com/media/3ohs7Qa1M9DxGaI94A/giphy-downsized.gif
        @SerializedName("width") val width: String, //600
        @SerializedName("height") val height: String, //600
        @SerializedName("size") val size: String //272190
)

data class Preview(
        @SerializedName("mp4") val mp4: String, //https://media0.giphy.com/media/3ohs7Qa1M9DxGaI94A/giphy-preview.mp4
        @SerializedName("mp4_size") val mp4Size: String, //39268
        @SerializedName("width") val width: String, //344
        @SerializedName("height") val height: String //344
)

data class DownsizedMedium(
        @SerializedName("url") val url: String, //https://media0.giphy.com/media/3ohs7Qa1M9DxGaI94A/giphy.gif
        @SerializedName("width") val width: String, //600
        @SerializedName("height") val height: String, //600
        @SerializedName("size") val size: String //272190
)

data class FixedWidthSmallStill(
        @SerializedName("url") val url: String, //https://media0.giphy.com/media/3ohs7Qa1M9DxGaI94A/100w_s.gif
        @SerializedName("width") val width: String, //100
        @SerializedName("height") val height: String, //100
        @SerializedName("size") val size: String //2090
)

data class DownsizedStill(
        @SerializedName("url") val url: String, //https://media0.giphy.com/media/3ohs7Qa1M9DxGaI94A/giphy-downsized_s.gif
        @SerializedName("width") val width: String, //600
        @SerializedName("height") val height: String, //600
        @SerializedName("size") val size: String //17888
)

data class Original(
        @SerializedName("url") val url: String, //https://media0.giphy.com/media/3ohs7Qa1M9DxGaI94A/giphy.gif
        @SerializedName("width") val width: String, //600
        @SerializedName("height") val height: String, //600
        @SerializedName("size") val size: String, //272190
        @SerializedName("frames") val frames: String, //36
        @SerializedName("mp4") val mp4: String, //https://media0.giphy.com/media/3ohs7Qa1M9DxGaI94A/giphy.mp4
        @SerializedName("mp4_size") val mp4Size: String, //88446
        @SerializedName("webp") val webp: String, //https://media0.giphy.com/media/3ohs7Qa1M9DxGaI94A/giphy.webp
        @SerializedName("webp_size") val webpSize: String, //191970
        @SerializedName("hash") val hash: String //054597ccab98222ddc52da8e0cd8012b
)

data class OriginalStill(
        @SerializedName("url") val url: String, //https://media0.giphy.com/media/3ohs7Qa1M9DxGaI94A/giphy_s.gif
        @SerializedName("width") val width: String, //600
        @SerializedName("height") val height: String, //600
        @SerializedName("size") val size: String //17888
)

data class FixedHeightSmallStill(
        @SerializedName("url") val url: String, //https://media0.giphy.com/media/3ohs7Qa1M9DxGaI94A/100_s.gif
        @SerializedName("width") val width: String, //100
        @SerializedName("height") val height: String, //100
        @SerializedName("size") val size: String //2090
)

data class FixedWidthDownsampled(
        @SerializedName("url") val url: String, //https://media0.giphy.com/media/3ohs7Qa1M9DxGaI94A/200w_d.gif
        @SerializedName("width") val width: String, //200
        @SerializedName("height") val height: String, //200
        @SerializedName("size") val size: String, //14740
        @SerializedName("webp") val webp: String, //https://media0.giphy.com/media/3ohs7Qa1M9DxGaI94A/200w_d.webp
        @SerializedName("webp_size") val webpSize: String //14380
)

data class FixedHeightSmall(
        @SerializedName("url") val url: String, //https://media0.giphy.com/media/3ohs7Qa1M9DxGaI94A/100.gif
        @SerializedName("width") val width: String, //100
        @SerializedName("height") val height: String, //100
        @SerializedName("size") val size: String, //14619
        @SerializedName("mp4") val mp4: String, //https://media0.giphy.com/media/3ohs7Qa1M9DxGaI94A/100.mp4
        @SerializedName("mp4_size") val mp4Size: String, //12859
        @SerializedName("webp") val webp: String, //https://media0.giphy.com/media/3ohs7Qa1M9DxGaI94A/100.webp
        @SerializedName("webp_size") val webpSize: String //16076
)

data class PreviewGif(
        @SerializedName("url") val url: String, //https://media0.giphy.com/media/3ohs7Qa1M9DxGaI94A/giphy-preview.gif
        @SerializedName("width") val width: String, //299
        @SerializedName("height") val height: String, //299
        @SerializedName("size") val size: String //48427
)

data class FixedHeight(
        @SerializedName("url") val url: String, //https://media0.giphy.com/media/3ohs7Qa1M9DxGaI94A/200.gif
        @SerializedName("width") val width: String, //200
        @SerializedName("height") val height: String, //200
        @SerializedName("size") val size: String, //40279
        @SerializedName("mp4") val mp4: String, //https://media0.giphy.com/media/3ohs7Qa1M9DxGaI94A/200.mp4
        @SerializedName("mp4_size") val mp4Size: String, //30515
        @SerializedName("webp") val webp: String, //https://media0.giphy.com/media/3ohs7Qa1M9DxGaI94A/200.webp
        @SerializedName("webp_size") val webpSize: String //41190
)

data class DownsizedSmall(
        @SerializedName("mp4") val mp4: String, //https://media0.giphy.com/media/3ohs7Qa1M9DxGaI94A/giphy-downsized-small.mp4
        @SerializedName("mp4_size") val mp4Size: String, //151612
        @SerializedName("width") val width: String, //600
        @SerializedName("height") val height: String //600
)

data class FixedHeightStill(
        @SerializedName("url") val url: String, //https://media0.giphy.com/media/3ohs7Qa1M9DxGaI94A/200_s.gif
        @SerializedName("width") val width: String, //200
        @SerializedName("height") val height: String, //200
        @SerializedName("size") val size: String //3859
)

data class FixedWidthSmall(
        @SerializedName("url") val url: String, //https://media0.giphy.com/media/3ohs7Qa1M9DxGaI94A/100w.gif
        @SerializedName("width") val width: String, //100
        @SerializedName("height") val height: String, //100
        @SerializedName("size") val size: String, //14619
        @SerializedName("mp4") val mp4: String, //https://media0.giphy.com/media/3ohs7Qa1M9DxGaI94A/100w.mp4
        @SerializedName("mp4_size") val mp4Size: String, //12859
        @SerializedName("webp") val webp: String, //https://media0.giphy.com/media/3ohs7Qa1M9DxGaI94A/100w.webp
        @SerializedName("webp_size") val webpSize: String //16076
)

data class DownsizedLarge(
        @SerializedName("url") val url: String, //https://media0.giphy.com/media/3ohs7Qa1M9DxGaI94A/giphy.gif
        @SerializedName("width") val width: String, //600
        @SerializedName("height") val height: String, //600
        @SerializedName("size") val size: String //272190
)

data class Looping(
        @SerializedName("mp4") val mp4: String, //https://media0.giphy.com/media/3ohs7Qa1M9DxGaI94A/giphy-loop.mp4
        @SerializedName("mp4_size") val mp4Size: String //916310
)

data class User(
        @SerializedName("avatar_url") val avatarUrl: String, //https://media1.giphy.com/avatars/zakeno/f6UV8BQyaPsF.gif
        @SerializedName("banner_url") val bannerUrl: String,
        @SerializedName("profile_url") val profileUrl: String, //https://giphy.com/zakeno/
        @SerializedName("username") val username: String, //zakeno
        @SerializedName("display_name") val displayName: String, //Kiernan Sjursen-Lien
        @SerializedName("twitter") val twitter: String //zakeno
)
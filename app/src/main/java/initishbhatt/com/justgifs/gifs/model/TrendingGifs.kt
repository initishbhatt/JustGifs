package initishbhatt.com.justgifs.gifs.model
import com.squareup.moshi.Json


/**
 * @author nitishbhatt
 */

data class TrendingGifs(

		@Json(name = "type") val type: String, //gif
		@Json(name = "id") val id: String, //3ohs7Qa1M9DxGaI94A
		@Json(name = "slug") val slug: String, //animation-cat-dance-3ohs7Qa1M9DxGaI94A
		@Json(name = "url") val url: String, //https://giphy.com/gifs/animation-cat-dance-3ohs7Qa1M9DxGaI94A
		@Json(name = "bitly_gif_url") val bitlyGifUrl: String, //https://gph.is/2zKutd1
		@Json(name = "bitly_url") val bitlyUrl: String, //https://gph.is/2zKutd1
		@Json(name = "embed_url") val embedUrl: String, //https://giphy.com/embed/3ohs7Qa1M9DxGaI94A
		@Json(name = "username") val username: String, //zakeno
		@Json(name = "source") val source: String,
		@Json(name = "rating") val rating: String, //g
		@Json(name = "title") val title: String,
		@Json(name = "content_url") val contentUrl: String,
		@Json(name = "user") val user: User,
		@Json(name = "source_tld") val sourceTld: String,
		@Json(name = "source_post_url") val sourcePostUrl: String,
		@Json(name = "is_indexable") val isIndexable: Int, //0
		@Json(name = "is_sticker") val isSticker: Int, //0
		@Json(name = "import_datetime") val importDatetime: String, //2017-11-15 22:01:55
		@Json(name = "trending_datetime") val trendingDatetime: String, //2018-01-03 11:00:01
		@Json(name = "images") val images: Images
)

data class Images(
		@Json(name = "fixed_height") val fixedHeight: FixedHeight,
		@Json(name = "fixed_height_still") val fixedHeightStill: FixedHeightStill,
		@Json(name = "fixed_height_downsampled") val fixedHeightDownsampled: FixedHeightDownsampled,
		@Json(name = "fixed_width") val fixedWidth: FixedWidth,
		@Json(name = "fixed_width_still") val fixedWidthStill: FixedWidthStill,
		@Json(name = "fixed_width_downsampled") val fixedWidthDownsampled: FixedWidthDownsampled,
		@Json(name = "fixed_height_small") val fixedHeightSmall: FixedHeightSmall,
		@Json(name = "fixed_height_small_still") val fixedHeightSmallStill: FixedHeightSmallStill,
		@Json(name = "fixed_width_small") val fixedWidthSmall: FixedWidthSmall,
		@Json(name = "fixed_width_small_still") val fixedWidthSmallStill: FixedWidthSmallStill,
		@Json(name = "downsized") val downsized: Downsized,
		@Json(name = "downsized_still") val downsizedStill: DownsizedStill,
		@Json(name = "downsized_large") val downsizedLarge: DownsizedLarge,
		@Json(name = "downsized_medium") val downsizedMedium: DownsizedMedium,
		@Json(name = "original") val original: Original,
		@Json(name = "original_still") val originalStill: OriginalStill,
		@Json(name = "looping") val looping: Looping,
		@Json(name = "original_mp4") val originalMp4: OriginalMp4,
		@Json(name = "preview") val preview: Preview,
		@Json(name = "downsized_small") val downsizedSmall: DownsizedSmall,
		@Json(name = "preview_gif") val previewGif: PreviewGif,
		@Json(name = "preview_webp") val previewWebp: PreviewWebp,
		@Json(name = "480w_still") val wStill: WStill
)

data class FixedHeightDownsampled(
		@Json(name = "url") val url: String, //https://media0.giphy.com/media/3ohs7Qa1M9DxGaI94A/200_d.gif
		@Json(name = "width") val width: String, //200
		@Json(name = "height") val height: String, //200
		@Json(name = "size") val size: String, //14740
		@Json(name = "webp") val webp: String, //https://media0.giphy.com/media/3ohs7Qa1M9DxGaI94A/200_d.webp
		@Json(name = "webp_size") val webpSize: String //14380
)

data class FixedWidth(
		@Json(name = "url") val url: String, //https://media0.giphy.com/media/3ohs7Qa1M9DxGaI94A/200w.gif
		@Json(name = "width") val width: String, //200
		@Json(name = "height") val height: String, //200
		@Json(name = "size") val size: String, //40279
		@Json(name = "mp4") val mp4: String, //https://media0.giphy.com/media/3ohs7Qa1M9DxGaI94A/200w.mp4
		@Json(name = "mp4_size") val mp4Size: String, //30515
		@Json(name = "webp") val webp: String, //https://media0.giphy.com/media/3ohs7Qa1M9DxGaI94A/200w.webp
		@Json(name = "webp_size") val webpSize: String //41190
)

data class OriginalMp4(
		@Json(name = "mp4") val mp4: String, //https://media0.giphy.com/media/3ohs7Qa1M9DxGaI94A/giphy.mp4
		@Json(name = "mp4_size") val mp4Size: String, //88446
		@Json(name = "width") val width: String, //480
		@Json(name = "height") val height: String //480
)

data class FixedHeightSmallStill(
		@Json(name = "url") val url: String, //https://media0.giphy.com/media/3ohs7Qa1M9DxGaI94A/100_s.gif
		@Json(name = "width") val width: String, //100
		@Json(name = "height") val height: String, //100
		@Json(name = "size") val size: String //2090
)

data class DownsizedMedium(
		@Json(name = "url") val url: String, //https://media0.giphy.com/media/3ohs7Qa1M9DxGaI94A/giphy.gif
		@Json(name = "width") val width: String, //600
		@Json(name = "height") val height: String, //600
		@Json(name = "size") val size: String //272190
)

data class OriginalStill(
		@Json(name = "url") val url: String, //https://media0.giphy.com/media/3ohs7Qa1M9DxGaI94A/giphy_s.gif
		@Json(name = "width") val width: String, //600
		@Json(name = "height") val height: String, //600
		@Json(name = "size") val size: String //17888
)

data class FixedWidthSmallStill(
		@Json(name = "url") val url: String, //https://media0.giphy.com/media/3ohs7Qa1M9DxGaI94A/100w_s.gif
		@Json(name = "width") val width: String, //100
		@Json(name = "height") val height: String, //100
		@Json(name = "size") val size: String //2090
)

data class Downsized(
		@Json(name = "url") val url: String, //https://media0.giphy.com/media/3ohs7Qa1M9DxGaI94A/giphy-downsized.gif
		@Json(name = "width") val width: String, //600
		@Json(name = "height") val height: String, //600
		@Json(name = "size") val size: String //272190
)

data class Original(
		@Json(name = "url") val url: String, //https://media0.giphy.com/media/3ohs7Qa1M9DxGaI94A/giphy.gif
		@Json(name = "width") val width: String, //600
		@Json(name = "height") val height: String, //600
		@Json(name = "size") val size: String, //272190
		@Json(name = "frames") val frames: String, //36
		@Json(name = "mp4") val mp4: String, //https://media0.giphy.com/media/3ohs7Qa1M9DxGaI94A/giphy.mp4
		@Json(name = "mp4_size") val mp4Size: String, //88446
		@Json(name = "webp") val webp: String, //https://media0.giphy.com/media/3ohs7Qa1M9DxGaI94A/giphy.webp
		@Json(name = "webp_size") val webpSize: String, //191970
		@Json(name = "hash") val hash: String //054597ccab98222ddc52da8e0cd8012b
)

data class FixedHeight(
		@Json(name = "url") val url: String, //https://media0.giphy.com/media/3ohs7Qa1M9DxGaI94A/200.gif
		@Json(name = "width") val width: String, //200
		@Json(name = "height") val height: String, //200
		@Json(name = "size") val size: String, //40279
		@Json(name = "mp4") val mp4: String, //https://media0.giphy.com/media/3ohs7Qa1M9DxGaI94A/200.mp4
		@Json(name = "mp4_size") val mp4Size: String, //30515
		@Json(name = "webp") val webp: String, //https://media0.giphy.com/media/3ohs7Qa1M9DxGaI94A/200.webp
		@Json(name = "webp_size") val webpSize: String //41190
)

data class DownsizedSmall(
		@Json(name = "mp4") val mp4: String, //https://media0.giphy.com/media/3ohs7Qa1M9DxGaI94A/giphy-downsized-small.mp4
		@Json(name = "mp4_size") val mp4Size: String, //151612
		@Json(name = "width") val width: String, //600
		@Json(name = "height") val height: String //600
)

data class DownsizedStill(
		@Json(name = "url") val url: String, //https://media0.giphy.com/media/3ohs7Qa1M9DxGaI94A/giphy-downsized_s.gif
		@Json(name = "width") val width: String, //600
		@Json(name = "height") val height: String, //600
		@Json(name = "size") val size: String //17888
)

data class Looping(
		@Json(name = "mp4") val mp4: String, //https://media0.giphy.com/media/3ohs7Qa1M9DxGaI94A/giphy-loop.mp4
		@Json(name = "mp4_size") val mp4Size: String //916310
)

data class WStill(
		@Json(name = "url") val url: String, //https://media0.giphy.com/media/3ohs7Qa1M9DxGaI94A/480w_s.jpg
		@Json(name = "width") val width: String, //480
		@Json(name = "height") val height: String //480
)

data class Preview(
		@Json(name = "mp4") val mp4: String, //https://media0.giphy.com/media/3ohs7Qa1M9DxGaI94A/giphy-preview.mp4
		@Json(name = "mp4_size") val mp4Size: String, //39268
		@Json(name = "width") val width: String, //344
		@Json(name = "height") val height: String //344
)

data class FixedHeightStill(
		@Json(name = "url") val url: String, //https://media0.giphy.com/media/3ohs7Qa1M9DxGaI94A/200_s.gif
		@Json(name = "width") val width: String, //200
		@Json(name = "height") val height: String, //200
		@Json(name = "size") val size: String //3859
)

data class DownsizedLarge(
		@Json(name = "url") val url: String, //https://media0.giphy.com/media/3ohs7Qa1M9DxGaI94A/giphy.gif
		@Json(name = "width") val width: String, //600
		@Json(name = "height") val height: String, //600
		@Json(name = "size") val size: String //272190
)

data class PreviewWebp(
		@Json(name = "url") val url: String, //https://media0.giphy.com/media/3ohs7Qa1M9DxGaI94A/giphy-preview.webp
		@Json(name = "width") val width: String, //336
		@Json(name = "height") val height: String, //336
		@Json(name = "size") val size: String //48490
)

data class FixedHeightSmall(
		@Json(name = "url") val url: String, //https://media0.giphy.com/media/3ohs7Qa1M9DxGaI94A/100.gif
		@Json(name = "width") val width: String, //100
		@Json(name = "height") val height: String, //100
		@Json(name = "size") val size: String, //14619
		@Json(name = "mp4") val mp4: String, //https://media0.giphy.com/media/3ohs7Qa1M9DxGaI94A/100.mp4
		@Json(name = "mp4_size") val mp4Size: String, //12859
		@Json(name = "webp") val webp: String, //https://media0.giphy.com/media/3ohs7Qa1M9DxGaI94A/100.webp
		@Json(name = "webp_size") val webpSize: String //16076
)

data class PreviewGif(
		@Json(name = "url") val url: String, //https://media0.giphy.com/media/3ohs7Qa1M9DxGaI94A/giphy-preview.gif
		@Json(name = "width") val width: String, //299
		@Json(name = "height") val height: String, //299
		@Json(name = "size") val size: String //48427
)

data class FixedWidthSmall(
		@Json(name = "url") val url: String, //https://media0.giphy.com/media/3ohs7Qa1M9DxGaI94A/100w.gif
		@Json(name = "width") val width: String, //100
		@Json(name = "height") val height: String, //100
		@Json(name = "size") val size: String, //14619
		@Json(name = "mp4") val mp4: String, //https://media0.giphy.com/media/3ohs7Qa1M9DxGaI94A/100w.mp4
		@Json(name = "mp4_size") val mp4Size: String, //12859
		@Json(name = "webp") val webp: String, //https://media0.giphy.com/media/3ohs7Qa1M9DxGaI94A/100w.webp
		@Json(name = "webp_size") val webpSize: String //16076
)

data class FixedWidthDownsampled(
		@Json(name = "url") val url: String, //https://media0.giphy.com/media/3ohs7Qa1M9DxGaI94A/200w_d.gif
		@Json(name = "width") val width: String, //200
		@Json(name = "height") val height: String, //200
		@Json(name = "size") val size: String, //14740
		@Json(name = "webp") val webp: String, //https://media0.giphy.com/media/3ohs7Qa1M9DxGaI94A/200w_d.webp
		@Json(name = "webp_size") val webpSize: String //14380
)

data class FixedWidthStill(
		@Json(name = "url") val url: String, //https://media0.giphy.com/media/3ohs7Qa1M9DxGaI94A/200w_s.gif
		@Json(name = "width") val width: String, //200
		@Json(name = "height") val height: String, //200
		@Json(name = "size") val size: String //3859
)

data class User(
		@Json(name = "avatar_url") val avatarUrl: String, //https://media1.giphy.com/avatars/zakeno/f6UV8BQyaPsF.gif
		@Json(name = "banner_url") val bannerUrl: String,
		@Json(name = "profile_url") val profileUrl: String, //https://giphy.com/zakeno/
		@Json(name = "username") val username: String, //zakeno
		@Json(name = "display_name") val displayName: String, //Kiernan Sjursen-Lien
		@Json(name = "twitter") val twitter: String //zakeno
)

data class Pagination(
		@Json(name = "count") val count: Int, //2
		@Json(name = "offset") val offset: Int //0
)

data class Meta(
		@Json(name = "status") val status: Int, //200
		@Json(name = "msg") val msg: String, //OK
		@Json(name = "response_id") val responseId: String //5a4cb91f6237734149e5c5ae
)
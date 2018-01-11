package initishbhatt.com.justgifs.gifs.randomGifs.presenter

import initishbhatt.com.justgifs.gifs.api.GifService
import initishbhatt.com.justgifs.gifs.api.RandomGifResponse
import io.reactivex.Single

/**
 * @author nitishbhatt
 */
class RandomInteractorImpl(private val gifService: GifService) : RandomInteractor {
    override fun getRandomGif(): Single<RandomGifResponse> {
        return gifService.getRandomGifs("any tag", "G")
    }
}
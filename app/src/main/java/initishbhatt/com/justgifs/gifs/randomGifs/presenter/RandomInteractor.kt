package initishbhatt.com.justgifs.gifs.randomGifs.presenter

import initishbhatt.com.justgifs.gifs.api.entity.RandomGifResponse
import io.reactivex.Single

/**
 * @author nitishbhatt
 */
interface RandomInteractor {
    fun getRandomGif(): Single<RandomGifResponse>
}
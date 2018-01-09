package initishbhatt.com.justgifs.gifs.api

import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

/**
 * @author nitishbhatt
 */
@Module
class ApiModule {

    @Provides
    @Singleton
    fun provideGifService(retrofit: Retrofit): GifService {
        return retrofit.create(GifService::class.java)
    }
}
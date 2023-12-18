package com.corn.cornpos.di

import android.app.Application
import androidx.room.Room
import com.corn.cornpos.data.database.CornPosDataBase
import com.corn.cornpos.data.remote.CornPosApi
import com.corn.cornpos.repository.CornDataBaseRepository
import com.corn.cornpos.repository.CornPosDataBaseRepositoryImpl
import com.corn.cornpos.util.Constants.Companion.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

        @Provides
        @Singleton
        fun provideApi(): CornPosApi {
            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create()
        }


    @Provides
    @Singleton
    fun provideCornPosDatabase(app: Application):CornPosDataBase{
        return Room.databaseBuilder(app,
            CornPosDataBase::class.java,
            "beStar_db"
        ).build()
    }

    @Provides
    @Singleton
    fun ProvideDataBaseRepository(db:CornPosDataBase):CornDataBaseRepository{
        return CornPosDataBaseRepositoryImpl(db.userInfoDao, db.loginDao, db.productsDao, db.categoryDao, db.dealsDao, db.tableDeo, db.customerDao, db.adsOnDao, db.orderDetailsDao)
    }




}
package dev.ehyeon.hiltandroomexampleapplication.module;

import android.content.Context;

import androidx.room.Room;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import dev.ehyeon.hiltandroomexampleapplication.data.memo.MemoDao;
import dev.ehyeon.hiltandroomexampleapplication.room.ExampleDatabase;

@Module
@InstallIn(SingletonComponent.class)
public class SingletonModule {

    @Provides
    @Singleton
    public ExampleDatabase provideExampleDatabase(@ApplicationContext Context context) {
        return Room.databaseBuilder(context, ExampleDatabase.class, "Example Database").build();
    }

    @Provides
    @Singleton
    public MemoDao provideMemoDao(ExampleDatabase exampleDatabase) {
        return exampleDatabase.memoDao();
    }
}

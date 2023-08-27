package dev.ehyeon.hiltandroomexampleapplication.room;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import dev.ehyeon.hiltandroomexampleapplication.data.memo.Memo;
import dev.ehyeon.hiltandroomexampleapplication.data.memo.MemoDao;

@Database(entities = {Memo.class}, version = 1)
public abstract class ExampleDatabase extends RoomDatabase {

    public abstract MemoDao memoDao();
}

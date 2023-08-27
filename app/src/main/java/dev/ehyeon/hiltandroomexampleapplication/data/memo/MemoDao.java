package dev.ehyeon.hiltandroomexampleapplication.data.memo;

import androidx.annotation.NonNull;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface MemoDao {

    @Query("SELECT * FROM memo WHERE id = :id")
    Memo selectMemoById(@NonNull Long id);

    @Query("SELECT * FROM memo")
    Memo selectAllMemo();

    @Insert
    void insertMemo(@NonNull Memo... memos);

    @Query("UPDATE memo SET title = :title, content = :content WHERE id = :id")
    void updateMemoById(@NonNull Long id, @NonNull String title, @NonNull String content);

    @Delete
    void deleteMemo(@NonNull Memo memo);

    @Query("DELETE FROM memo WHERE id = :id")
    void deleteMemoById(@NonNull Long id);

    @Query("DELETE FROM memo")
    void deleteAllMemo();
}

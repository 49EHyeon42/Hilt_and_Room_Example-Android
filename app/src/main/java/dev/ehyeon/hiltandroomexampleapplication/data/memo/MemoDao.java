package dev.ehyeon.hiltandroomexampleapplication.data.memo;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

@Dao
public interface MemoDao {

    @Query("SELECT * FROM memo WHERE id = :id")
    Memo selectMemoById(Long id);

    @Query("SELECT * FROM memo")
    Memo selectAllMemo();

    @Insert
    void insertMemo(Memo... memos);

    @Update
    void updateMemo(Memo... memos);

    @Query("UPDATE memo SET title = :title, content = :content WHERE id = :id")
    void updateMemoById(Long id, String title, String content);

    @Delete
    void deleteMemo(Memo memo);

    @Query("DELETE FROM memo WHERE id = :id")
    void deleteMemoById(Long id);

    @Query("DELETE FROM memo")
    void deleteAllMemo();
}

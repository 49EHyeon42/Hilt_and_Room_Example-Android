package dev.ehyeon.hiltandroomexampleapplication.data.memo;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Memo {

    @PrimaryKey(autoGenerate = true)
    public Long id;

    @NonNull
    public String title;

    @NonNull
    public String content;

    public Memo(@NonNull String title, @NonNull String content) {
        this.title = title;
        this.content = content;
    }

    @NonNull
    public Long getId() {
        return id;
    }

    @NonNull
    public String getTitle() {
        return title;
    }

    public void setTitle(@NonNull String title) {
        this.title = title;
    }

    @NonNull
    public String getContent() {
        return content;
    }

    public void setContent(@NonNull String content) {
        this.content = content;
    }
}

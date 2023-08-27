package dev.ehyeon.hiltandroomexampleapplication.ui;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;

import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;
import dev.ehyeon.hiltandroomexampleapplication.data.memo.Memo;
import dev.ehyeon.hiltandroomexampleapplication.data.memo.MemoDao;

@HiltViewModel
public class MainActivityViewModel extends ViewModel {

    protected MemoDao memoDao;

    @Inject
    public MainActivityViewModel(@NonNull MemoDao memoDao) {
        this.memoDao = memoDao;
    }

    public void insertMemo(@NonNull String title, @NonNull String content) {
        new Thread(() -> memoDao.insertMemo(new Memo(title, content))).start();
    }

    public void deleteAllMemo() {
        new Thread(() -> memoDao.deleteAllMemo()).start();
    }
}

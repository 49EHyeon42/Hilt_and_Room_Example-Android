package dev.ehyeon.hiltandroomexampleapplication.ui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;
import dev.ehyeon.hiltandroomexampleapplication.R;
import dev.ehyeon.hiltandroomexampleapplication.data.memo.Memo;
import dev.ehyeon.hiltandroomexampleapplication.room.ExampleDatabase;

@AndroidEntryPoint
public class MainActivity extends AppCompatActivity {

    @Inject
    protected ExampleDatabase exampleDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.insertMemoButton).setOnClickListener(ignored ->
                new Thread(() -> exampleDatabase.memoDao().insertMemo(new Memo("title", "content"))).start());

        findViewById(R.id.deleteAllMemoButton).setOnClickListener(ignored ->
                new Thread(() -> exampleDatabase.memoDao().deleteAllMemo()).start());
    }
}

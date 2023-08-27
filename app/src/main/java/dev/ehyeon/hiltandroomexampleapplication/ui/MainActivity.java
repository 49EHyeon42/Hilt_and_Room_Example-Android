package dev.ehyeon.hiltandroomexampleapplication.ui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;
import dev.ehyeon.hiltandroomexampleapplication.R;
import dev.ehyeon.hiltandroomexampleapplication.room.ExampleDatabase;

@AndroidEntryPoint
public class MainActivity extends AppCompatActivity {

    @Inject
    protected ExampleDatabase exampleDatabase;

    private MainActivityViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewModel = new ViewModelProvider(this).get(MainActivityViewModel.class);

        findViewById(R.id.insertMemoButton).setOnClickListener(ignored ->
                viewModel.insertMemo("title", "content"));

        findViewById(R.id.deleteAllMemoButton).setOnClickListener(ignored ->
                viewModel.deleteAllMemo());
    }
}

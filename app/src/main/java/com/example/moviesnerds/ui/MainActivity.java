package com.example.moviesnerds.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.moviesnerds.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, movieView {


    moviePresenter presenter;
    @BindView(R.id.txtMovieName)
    TextView movietxtview;
    @BindView(R.id.getMovies)
    Button getMovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        getMovie.setOnClickListener(this);
        presenter = new moviePresenter(this);

    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.getMovies) {
            presenter.getMovieName();
        }
    }

    @Override
    public void onGetMovieName(String name) {
        movietxtview.setText(name);
    }
}

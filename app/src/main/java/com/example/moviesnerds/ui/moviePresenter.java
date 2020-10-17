package com.example.moviesnerds.ui;

import com.example.moviesnerds.pojo.movieModel;

public class moviePresenter {
    movieView view;

    public moviePresenter(movieView view) {
        this.view = view;
    }

    public movieModel getMoveFromDataBase() {
        return new movieModel(1,"religious","20-10-2010","okey");
    }

    public void getMovieName(){
        view.onGetMovieName(getMoveFromDataBase().getName());
    }
}

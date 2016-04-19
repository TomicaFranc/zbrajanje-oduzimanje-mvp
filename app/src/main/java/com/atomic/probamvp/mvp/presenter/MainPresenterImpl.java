package com.atomic.probamvp.mvp.presenter;

import com.atomic.probamvp.listeners.MainListener;
import com.atomic.probamvp.mvp.interactors.MainInteractorImpl;
import com.atomic.probamvp.mvp.views.MainInteractor;
import com.atomic.probamvp.mvp.views.MainPresenter;
import com.atomic.probamvp.mvp.views.MainView;

/**
 * Created by tom on 18.04.16..
 */
public class MainPresenterImpl implements MainPresenter, MainListener {

    MainView view;
    MainInteractor interactor;

    public MainPresenterImpl(MainView view){
        this.view = view;
        interactor = new MainInteractorImpl();
    }

    @Override
    public void suma(int x, int y) {
        interactor.zbrajaj(x, y, this);
    }

    @Override
    public void razlika(int x, int y) {
        interactor.oduzmi(x, y, this);
    }

    @Override
    public void dohvatiRjesenje(int rjesenje) {
        view.pokaziRezultat(rjesenje);
    }
}

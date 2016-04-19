package com.atomic.probamvp.mvp.interactors;

import android.util.Log;

import com.atomic.probamvp.listeners.MainListener;
import com.atomic.probamvp.mvp.views.MainInteractor;

/**
 * Created by tom on 18.04.16..
 */
public class MainInteractorImpl implements MainInteractor {

    public void zbrajaj(int x, int y, MainListener listener){
        int zbroj;
        zbroj = x + y;
        Log.d("broj","zbroj = " + zbroj);

        //napravit listener za vracanje rezultata
        listener.dohvatiRjesenje(zbroj);
    }

    @Override
    public void oduzmi(int x, int y, MainListener listener) {
        int razlika;
        razlika = x - y;
        Log.d("broj", "razlika = " + razlika);

        listener.dohvatiRjesenje(razlika);
    }
}

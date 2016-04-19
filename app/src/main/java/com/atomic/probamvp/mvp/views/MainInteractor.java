package com.atomic.probamvp.mvp.views;

import com.atomic.probamvp.listeners.MainListener;

/**
 * Created by tom on 18.04.16..
 */
public interface MainInteractor {
    void zbrajaj(int x, int y, MainListener listener);
    void oduzmi(int x, int y, MainListener listener);
}

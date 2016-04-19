package com.atomic.probamvp.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.atomic.probamvp.R;
import com.atomic.probamvp.mvp.presenter.MainPresenterImpl;
import com.atomic.probamvp.mvp.views.MainPresenter;
import com.atomic.probamvp.mvp.views.MainView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements MainView {

    MainPresenter presenter;

    @Bind(R.id.number1) TextView n1;
    @Bind(R.id.number2) TextView n2;
    @Bind(R.id.rezultat) TextView rjesenjeSpace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        presenter = new MainPresenterImpl(this);

    }

    @OnClick(R.id.zbroji)
    public void click(View view){
        String num1 = n1.getText().toString();
        int broj1 = Integer.parseInt(num1);
        String num2 = n2.getText().toString();
        int broj2 = Integer.parseInt(num2);

        Log.d("broj","broj1: " + broj1);
        Log.d("broj","broj2: " + broj2);

        presenter.suma(broj1, broj2);
    }

    @OnClick(R.id.oduzmi)
    public void click2(View view){
        String num1 = n1.getText().toString();
        int broj1 = Integer.parseInt(num1);
        String num2 = n2.getText().toString();
        int broj2 = Integer.parseInt(num2);

        Log.d("broj","broj1: " + broj1);
        Log.d("broj","broj2: " + broj2);

        presenter.razlika(broj1, broj2);
    }

    @Override
    public void pokaziRezultat(int rjesenje) {
        Log.d("broj", "rjesenje: " + rjesenje);
        rjesenjeSpace.setText(" " + rjesenje);
    }
}

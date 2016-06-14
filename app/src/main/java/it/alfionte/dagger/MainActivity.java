package it.alfionte.dagger;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import javax.inject.Inject;

import static it.alfionte.dagger.DaggerApplication.getNetworkComponent;

public class MainActivity extends AppCompatActivity {

    @Inject
    NetworkApi networkApi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getNetworkComponent(this).inject(this);

        boolean injected = networkApi != null;
        Log.d("tag", "DaggerTest "+String.valueOf(injected));
    }
}

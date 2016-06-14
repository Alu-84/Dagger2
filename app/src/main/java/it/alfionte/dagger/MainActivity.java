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

        boolean isLucaUserValid = networkApi.validateUser("Luca", "Bonzi");
        boolean isCiccioUserValid = networkApi.validateUser("Ciccio", null);

        Log.d("tag", "DaggerTest Luca Bonzi, isUserValid: "+ isLucaUserValid);
        Log.d("tag", "DaggerTest Ciccio Null, isUserValid: "+ isCiccioUserValid);
    }
}

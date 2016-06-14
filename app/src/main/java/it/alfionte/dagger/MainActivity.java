package it.alfionte.dagger;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import javax.inject.Inject;

import static it.alfionte.dagger.DaggerApplication.getValidateUserComponent;

public class MainActivity extends AppCompatActivity {

    @Inject
    NetworkApi networkApi;

    @Inject
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getValidateUserComponent(this).inject(this);

        boolean isUserValid = networkApi.validateUser(user);
        Log.d("tag", "DaggerTest " + user.toString() + ", isUserValid: " + isUserValid);
    }
}

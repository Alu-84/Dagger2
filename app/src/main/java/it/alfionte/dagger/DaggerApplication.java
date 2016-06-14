package it.alfionte.dagger;

import android.app.Application;
import android.content.Context;

import it.alfionte.dagger.Components.DaggerValidateUserComponent;
import it.alfionte.dagger.Components.ValidateUserComponent;

public class DaggerApplication extends Application {

    private ValidateUserComponent validateUserComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        validateUserComponent = DaggerValidateUserComponent.builder().build();
    }

    public static ValidateUserComponent getValidateUserComponent(Context context) {
        return ((DaggerApplication)context.getApplicationContext()).validateUserComponent;
    }
}

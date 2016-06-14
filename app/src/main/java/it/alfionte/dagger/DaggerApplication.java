package it.alfionte.dagger;

import android.app.Application;
import android.content.Context;

public class DaggerApplication extends Application {

    private MyComponent networkComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        networkComponent = DaggerMyComponent.builder().build();
    }

    public static MyComponent getNetworkComponent(Context context) {
        return ((DaggerApplication)context.getApplicationContext()).networkComponent;
    }
}

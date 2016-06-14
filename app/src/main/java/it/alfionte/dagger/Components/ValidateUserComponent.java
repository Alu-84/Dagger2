package it.alfionte.dagger.Components;

import javax.inject.Singleton;

import dagger.Component;
import it.alfionte.dagger.MainActivity;
import it.alfionte.dagger.Modules.NetworkApiModule;
import it.alfionte.dagger.Modules.UserModule;

/**
 * Created by gabriele on 13/06/16.
 */

@Singleton
@Component(modules = {NetworkApiModule.class, UserModule.class})

public interface ValidateUserComponent {
    // to update the fields in your activities
    void inject(MainActivity activity);
}
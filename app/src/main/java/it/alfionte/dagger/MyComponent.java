package it.alfionte.dagger;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by gabriele on 13/06/16.
 */

@Singleton
@Component(modules = {NetworkApiModule.class})

public interface MyComponent {
    // to update the fields in your activities
    void inject(MainActivity activity);
}
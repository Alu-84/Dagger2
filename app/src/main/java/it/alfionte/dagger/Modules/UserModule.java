package it.alfionte.dagger.Modules;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import it.alfionte.dagger.User;

@Module
public class UserModule {

    @Provides
    @Singleton
    User providesUser() {
        return new User("Lars", "Vogel");
    }
}
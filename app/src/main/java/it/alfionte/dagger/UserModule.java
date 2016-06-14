package it.alfionte.dagger;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class UserModule {

    @Provides
    @Singleton
    User providesUser() {
        return new User("Lars", "Vogel");
    }
}
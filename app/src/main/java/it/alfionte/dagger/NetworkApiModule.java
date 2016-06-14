package it.alfionte.dagger;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class NetworkApiModule {

    @Provides
    @Singleton
    public NetworkApi getNetwork(){
        return new NetworkApi();
    }
}
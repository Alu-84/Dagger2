package it.alfionte.dagger.Modules;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import it.alfionte.dagger.NetworkApi;

@Module
public class NetworkApiModule {

    @Provides
    @Singleton
    public NetworkApi getNetwork(){
        return new NetworkApi();
    }
}
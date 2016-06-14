package it.alfionte.dagger;

import android.text.TextUtils;

public class NetworkApi {

    public boolean validateUser(User user) {
        if (user == null || TextUtils.isEmpty(user.getFirstName()) || TextUtils.isEmpty(user.getLastName())) {
            return false;
        } else {
            return true;
        }
    }
}

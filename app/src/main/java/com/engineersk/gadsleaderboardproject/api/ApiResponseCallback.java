package com.engineersk.gadsleaderboardproject.api;

public interface ApiResponseCallback<T> {
    void onResponse(T response);
    void onError(Throwable error);
}

package com.retrofitexample;

import androidx.annotation.NonNull;

import java.lang.ref.WeakReference;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

class NetworkResponse<T> implements Callback<T> {

    private WeakReference<NetworkResponseListener<T>> listener;

    NetworkResponse(NetworkResponseListener<T> listener) {
        this.listener = new WeakReference<>(listener);
    }

    @Override
    public void onResponse(@NonNull Call<T> call, @NonNull Response<T> response) {
        if (listener != null && listener.get() != null) {
            listener.get().onResponseReceived(response.body());
        }
    }

    @Override
    public void onFailure(@NonNull Call<T> call, @NonNull Throwable t) {
        if (listener != null && listener.get() != null) {
            listener.get().onError(t.getMessage());
        }
    }
}
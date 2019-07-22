package com.retrofitexample;

public interface NetworkResponseListener<T> {

    void onResponseReceived(T response);

    void onError(String message);
}
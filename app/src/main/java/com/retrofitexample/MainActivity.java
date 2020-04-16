package com.retrofitexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity implements NetworkResponseListener<List<Hero>> {
//test
    //test1
    //test2
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getHeroes();
    }

    private void getHeroes() {

        DemoApi api = ApiClient.getClient().create(DemoApi.class);

        Call<List<Hero>> call = api.getHeroes();

        call.enqueue(new NetworkResponse<>(this));
    }

    @Override
    public void onResponseReceived(List<Hero> response) {
        for (Hero hero : response) {
            System.out.println(". . . . . response " + hero.toString());
        }
        System.out.println("abcde");
    }

    @Override
    public void onError(String message) {
        System.out.println(". . . . . error message" + message);
    }
}


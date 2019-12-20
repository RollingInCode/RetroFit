package com.retrofit.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        MiddlewareDTO user1 = new MiddlewareDTO("bike.148@rom3rehab.com","123456789");
        GetMiddlewareService service = RetroFitClientInstance.getRetrofitInstance().create(GetMiddlewareService.class);
        Call<MiddlewareList> call = service.getMiddleware();
        call.enqueue(new Callback<MiddlewareList>() {
            @Override
            public void onResponse(Call<MiddlewareList> call, Response<MiddlewareList> response) {

                MiddlewareList body = response.body();
                List<MiddlewareDTO> users = body.getUsers();
                users.size();
            }

            @Override
            public void onFailure(Call<MiddlewareList> call, Throwable t) {
                int i = 1 + 1;
            }
        });
    }
}

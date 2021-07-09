package com.example.kotlinretrofit

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitInstance {

    companion object{
        val baseURL ="https://jsonplaceholder.typicode.com/"

        fun getRetrofitInstance() : Retrofit{

            val logging = HttpLoggingInterceptor();
            logging.level = HttpLoggingInterceptor.Level.BODY;

            val client  =OkHttpClient.Builder();
            client.addInterceptor(logging);

            return  Retrofit.Builder()
                .baseUrl(baseURL)
                .client(client.build())
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        }


    }
}
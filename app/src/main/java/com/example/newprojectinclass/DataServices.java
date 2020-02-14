package com.example.newprojectinclass;

import retrofit2.Call;
import retrofit2.http.GET;

public interface DataServices {


    @GET("E14trR2lD")
    Call<Pokemon> getAllPokemons();

}

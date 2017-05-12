package com.jgao.retrofitrx.network;

import com.jgao.retrofitrx.model.Model;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by jgao on 2017-05-12.
 */

public interface RestAPI{

    //@GET("example/buku")
    //Call<Model> loadListBook();

    @GET("example/buku")
    Observable<Model> loadListBook();
}

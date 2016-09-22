package com.example.saurabh.rxsample.rest;

import com.example.saurabh.rxsample.data.SearchResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by saurabh on 22/09/16.
 */

public interface WebService {
    @GET("/search/repositories")
    Call<SearchResponse> getSearchResults(@Query("q") String query);
}

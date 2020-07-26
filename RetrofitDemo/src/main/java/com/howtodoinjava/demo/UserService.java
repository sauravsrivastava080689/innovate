package com.howtodoinjava.demo;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface UserService {

    @GET("/api/users")
    public Call<UsersApiResponse> getUsers(@Query("per_page") int per_page, @Query("page") int page);

    @GET("/api/users/{id}")
    public Call<UserApiResponse> getUser(@Path("id") long id);

}
package com.bridgitamakove.flightbookingproject

import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("api/student")


    fun getStudents(): Call<List<Student>>
}
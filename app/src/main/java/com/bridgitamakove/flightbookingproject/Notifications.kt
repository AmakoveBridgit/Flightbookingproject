package com.bridgitamakove.flightbookingproject

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Notifications : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notifications)

        val textView: TextView = findViewById(R.id.tvNotifications)


        fetchData { students ->
            val studentNames = students.joinToString("\n") { "${ it.first_name } ${ it.last_name}" }
            textView.text = studentNames
        }
    }

    private fun fetchData(onResult: (List<Student>) -> Unit) {
        val call = RetrofitClient.apiService.getStudents()


        call.enqueue(object : Callback<List<Student>> {
            override fun onResponse(call: Call<List<Student>>, response: Response<List<Student>>) {
                if (response.isSuccessful) {
                    val students = response.body()
                    if (students != null) {
                        onResult(students)
                    }
                } else {
                    Log.e("Notifications", "Failed to fetch data")
                }
            }

            override fun onFailure(call: Call<List<Student>>, t: Throwable) {
                Log.e("Notifications", "Error: ${t.message}")
            }
        })
    }
}

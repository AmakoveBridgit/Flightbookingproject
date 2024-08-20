package com.bridgitamakove.flightbookingproject

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class NotificationsViewModel : ViewModel() {
        private val _studentNames = MutableLiveData<String>()
        val studentNames: LiveData<String> get() = _studentNames

        fun updateStudentNames(names: List<String>) {
            _studentNames.value = names.joinToString("\n")
        }



    }


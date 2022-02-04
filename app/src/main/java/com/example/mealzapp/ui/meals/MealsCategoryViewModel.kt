package com.example.mealzapp.ui.meals

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.model.MealsRepository
import com.example.model.response.MealsResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MealsCategoryViewModel(private val repository: MealsRepository = MealsRepository()) :
    ViewModel() {

    init {
        viewModelScope.launch(Dispatchers.IO) {
            val meals = getMeals()
            mealsState.value = meals
        }
    }

    val mealsState = mutableStateOf(emptyList<MealsResponse>())


    private suspend fun getMeals(): List<MealsResponse> {
        return repository.getMeals().categories
    }
}
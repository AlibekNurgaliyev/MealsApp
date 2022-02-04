package com.example.model.response

import com.google.gson.annotations.SerializedName

data class MealsCategoriesResponse(
     val categories: List<MealsResponse>
)

data class MealsResponse(
    @SerializedName("idCategory")  val id: Int,
    @SerializedName("strCategory")  val name: String,
    @SerializedName("strCategoryThumb")  val description: String,
    @SerializedName("strCategoryDescription")  val imageUrl: String
)


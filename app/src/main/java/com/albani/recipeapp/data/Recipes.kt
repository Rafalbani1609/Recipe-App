package com.albani.recipeapp.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize

data class Recipes(
    val name: String,
    val catagory: String,
    val description: String,
    val ingredients: String,
    val photo: String,
    val price: String,
    val calories: String,
    val carbo: String,
    val protein: String,
    val instructions: String
) : Parcelable
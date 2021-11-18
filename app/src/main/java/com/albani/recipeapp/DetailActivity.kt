package com.albani.recipeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.albani.recipeapp.data.Recipes
import com.albani.recipeapp.databinding.ActivityDetailBinding
import com.bumptech.glide.Glide

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    companion object {
        const val DATA_RECIPES = "data"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val data = intent.getParcelableExtra<Recipes>(DATA_RECIPES)

        binding.apply {
            tvFoodDetail.text = data?.name
            tvCalories.text = data?.calories
            tvCarbo.text = data?.carbo
            tvProtein.text = data?.protein
            tvDescription.text = data?.description
            tvIngridientsDetail.text = data?.ingredients
            tvDirectionDetail.text = data?.instructions
        }

        Glide.with(applicationContext).load(data?.photo).into(binding.imgDetail)

    }
}
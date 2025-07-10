package org.example.lesson_11

class RecipeCategory(
    val title: String,
    val titleImage: String,
    val listOfRecipes: MutableList<Recipe>,
){}

class Recipe(
    val title: String,
    val image: String,
    var numberOfPortions: Int,
    val listOfIngredients: MutableList<Ingredient>,
    val cookingMethod: String,
    ){}

class Ingredient(
    val name: String,
    val quantity: Int,
    val measureUnit: String,
){}

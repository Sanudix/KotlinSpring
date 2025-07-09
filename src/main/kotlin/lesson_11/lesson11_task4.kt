package org.example.lesson_11

class RecipeCategory(
    val title: String,
    val titleImage: String,
    val listOfRecipes: MutableList<String>,
    val listOfRecipesImages: MutableList<String>,
){}

class Recipe(
    val title: String,
    val titleImage: String,
    var numberOfPortions: Int,
    val listOfIngredientsTitle: MutableList<String>,
    val listOfIngredientQuantity: MutableList<String>,
    val cookingMethod: String,
    ){}

class Ingredient(
    val name: String,
    val quantity: Int,
    val measureUnit: String,
){}

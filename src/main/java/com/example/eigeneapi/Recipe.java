package com.example.eigeneapi;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Recipe {

    private String recipeTitle;
    private long id;

    public Recipe() {
    }

    public String getRecipeTitle() {
        return recipeTitle;
    }

    public void setRecipeTitle(String recipeTitle) {
        this.recipeTitle = recipeTitle;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Id
    public long getId() {return id;}

}

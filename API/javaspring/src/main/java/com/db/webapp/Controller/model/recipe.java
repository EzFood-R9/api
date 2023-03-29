package com.db.webapp.Controller.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="recipe")
public class recipe {



    @Id
    @Column(name ="COL1")
    private String recipe;
    @Column(name ="COL2")
    private String recipename;
    @Column(name ="COL3")
    private String instructions; 



    public recipe() {
    }

    public recipe(String recipe, String recipename, String instructions) {
        this.recipe = recipe;
        this.recipename = recipename;
        this.instructions = instructions;
    }

    public String getRecipe() {
        return this.recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    public String getRecipename() {
        return this.recipename;
    }

    public void setRecipename(String recipename) {
        this.recipename = recipename;
    }

    public String getInstructions() {
        return this.instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public recipe Srecipe(String recipe) {
        setRecipe(recipe);
        return this;
    }

    public recipe recipename(String recipename) {
        setRecipename(recipename);
        return this;
    }

    public recipe instructions(String instructions) {
        setInstructions(instructions);
        return this;
    }


   
    
}
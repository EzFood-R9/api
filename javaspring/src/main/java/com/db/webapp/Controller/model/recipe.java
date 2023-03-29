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
    @Column(name ="COL4")
    private String imgurl;


    public recipe() {
    }

    public recipe(String recipe, String recipename, String instructions, String imgurl) {
        this.recipe = recipe;
        this.recipename = recipename;
        this.instructions = instructions;
        this.imgurl = imgurl;
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

    public String getImgurl() {
        return this.imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public recipe srecipe(String recipe) {
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

    public recipe imgurl(String imgurl) {
        setImgurl(imgurl);
        return this;
    }



    
}
package com.example.newprojectinclass;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Pokemon {

    @SerializedName("Pokemon")
    @Expose
    private List<Pokemon_> pokemon = null;

    public List<Pokemon_> getPokemon() {
        return pokemon;
    }

    public void setPokemon(List<Pokemon_> pokemon) {
        this.pokemon = pokemon;
    }

}
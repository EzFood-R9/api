package com.db.webapp.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.db.webapp.Controller.model.recipe;

import java.util.List;



@Repository
public interface reciperepo extends JpaRepository <recipe, String> {

    @Query(value ="SELECT * FROM recipe", nativeQuery= true)
    List<reciperepo> getrecipe();


}
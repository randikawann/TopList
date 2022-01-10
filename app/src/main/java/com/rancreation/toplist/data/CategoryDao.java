package com.rancreation.toplist.data;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.rancreation.toplist.models.Category;

import java.util.List;

/**
 * Created by Randika Wanninayaka on 2022-01-07.
 */
@Dao
public interface CategoryDao {

    @Query("SELECT * FROM CATEGORY")
    LiveData<List<Category>> getCategoryList();

    @Query("SELECT * FROM CATEGORY WHERE catId = :catId")
    LiveData<Category> getCategoryListById(String catId);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    Long createNewCategory(Category category);

    @Delete
    void deleteCategory(Category category);
}

package com.rancreation.toplist.data;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.rancreation.toplist.models.retrofit.Category;
import com.rancreation.toplist.models.room.CategoryEntity;

import java.util.List;

/**
 * Created by Randika Wanninayaka on 2022-01-07.
 */
@Dao
public interface CategoryDao {

    @Query("SELECT * FROM CATEGORYENTITY")
    LiveData<List<CategoryEntity>> getCategoryList();

    @Query("SELECT * FROM CATEGORYENTITY WHERE catId = :catId")
    LiveData<CategoryEntity> getCategoryListById(String catId);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    Long createNewCategory(CategoryEntity category);

    @Delete
    void deleteCategory(CategoryEntity category);
}

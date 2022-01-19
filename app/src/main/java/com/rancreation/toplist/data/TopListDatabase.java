package com.rancreation.toplist.data;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.rancreation.toplist.models.room.CategoryEntity;

/**
 * Created by Randika Wanninayaka on 2022-01-07.
 */
@Database(entities = {CategoryEntity.class}, version = 1)
public abstract class TopListDatabase extends RoomDatabase {

    public abstract CategoryDao categoryDao();
}

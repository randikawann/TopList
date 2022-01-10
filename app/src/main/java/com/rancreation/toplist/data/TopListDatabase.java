package com.rancreation.toplist.data;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.rancreation.toplist.models.Category;

/**
 * Created by Randika Wanninayaka on 2022-01-07.
 */
@Database(entities = {Category.class}, version = 1)
public abstract class TopListDatabase extends RoomDatabase {

    public abstract CategoryDao categoryDao();
}

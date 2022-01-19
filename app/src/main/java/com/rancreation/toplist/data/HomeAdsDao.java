package com.rancreation.toplist.data;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.rancreation.toplist.models.room.CategoryEntity;
import com.rancreation.toplist.models.room.DistrictEntity;
import com.rancreation.toplist.models.room.HomeAdsEntity;

import java.util.List;

/**
 * Created by Randika Wanninayaka on 2022-01-19.
 */
@Dao
public interface HomeAdsDao {

    @Query("SELECT * FROM HomeAdsEntity")
    LiveData<List<HomeAdsEntity>> getCategoryList();

    @Query("SELECT * FROM HomeAdsEntity WHERE classifiedType =:classifiedType")
    LiveData<List<HomeAdsEntity>> getCategoryListByType(String classifiedType);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    Long createNewHomeAds(HomeAdsEntity homeAdsEntity);
}

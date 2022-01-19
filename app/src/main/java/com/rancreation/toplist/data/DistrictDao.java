package com.rancreation.toplist.data;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.rancreation.toplist.models.retrofit.City;
import com.rancreation.toplist.models.room.CategoryEntity;
import com.rancreation.toplist.models.room.CityEntity;
import com.rancreation.toplist.models.room.DistrictEntity;

import java.util.List;

/**
 * Created by Randika Wanninayaka on 2022-01-19.
 */
@Dao
public interface DistrictDao {

    @Query("SELECT * FROM DISTRICTENTITY")
    LiveData<List<DistrictEntity>> getDistrictList();

    @Query("SELECT * FROM DISTRICTENTITY WHERE distId = :distId")
    LiveData<List<DistrictEntity>> getDistrictListById(String distId);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    Long createNewDistrict(DistrictEntity districtEntity);

    @Delete
    void deleteDistrict(DistrictEntity districtEntity);

    // cities ------------
    @Query("SELECT * FROM CITYENTITY")
    LiveData<List<CityEntity>> getCityList();

    @Query("SELECT * FROM CITYENTITY WHERE districtId = :districtId")
    LiveData<List<CityEntity>> getCityListById(String districtId);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    Long createNewCity(CityEntity cityEntity);

    @Delete
    void deleteCity(CityEntity cityEntity);
}

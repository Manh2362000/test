package com.example.test;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StreetRepository extends JpaRepository<Street,Integer> {
    @Query(value = "select * from streets s where s.name like %:name% and s.district_id=:distinctId",nativeQuery = true)

    List<Street> findByNameAndId(@Param("name") String name,@Param("distinctId") int distinctId);

    @Query(value = "select * from streets s where s.name like %:name%",nativeQuery = true)
    List<Street> findByName(@Param("name") String name);

}
package com.korea.project2_team4.Repository;

import com.korea.project2_team4.Model.Entity.Photo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhotoRepository extends JpaRepository<Photo, Long> {
}

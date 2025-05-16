package com.MultipleDB.db2.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MultipleDB.db2.entity.Pen;

public interface PenRepo extends JpaRepository<Pen, Integer>{

}

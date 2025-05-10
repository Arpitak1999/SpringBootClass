package com.SpringBootClass.repository;
import org.springframework.data.repository.CrudRepository;
import com.SpringBootClass.entitiees.MasterEntity;
import java.io.Serializable;

public interface ContactMasterRepo extends CrudRepository<MasterEntity, Serializable> {
	

}

package com.MultipleDB.db2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MultipleDB.db2.entity.Pen;
import com.MultipleDB.db2.repo.PenRepo;

@Service
public class PenSvc {
    @Autowired
	private PenRepo penRepo;
	
    public void savePen() {
    	Pen p = new Pen();
    	p.setPenName("Link StarLine");
    	p.setPenPrice(10.00);
    }
}

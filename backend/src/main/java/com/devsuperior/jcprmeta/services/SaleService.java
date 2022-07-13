package com.devsuperior.jcprmeta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.jcprmeta.entities.Sale;
import com.devsuperior.jcprmeta.repositories.SaleRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository saleRepository;	
	
	public List<Sale> findSales() {
		return saleRepository.findAll();
	}

}

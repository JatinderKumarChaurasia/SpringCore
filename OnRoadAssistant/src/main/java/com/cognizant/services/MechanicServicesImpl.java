package com.cognizant.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.model.Mechanic;
import com.cognizant.repository.MechanicRepository;

@Service(value="mechanicService")
public class MechanicServicesImpl implements MechanicService {
	
	@Autowired
	private MechanicRepository mechanicRepository;
	
	/* (non-Javadoc)
	 * @see com.cognizant.services.MechanicService#save(com.cognizant.model.Mechanic)
	 */
	@Override
	@Transactional
	public Mechanic save(Mechanic mechanic){
		return mechanicRepository.save(mechanic);
	}
}

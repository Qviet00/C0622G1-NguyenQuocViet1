package com.example.contract.service.impl;

import com.example.contract.model.Contract;
import com.example.contract.repository.IContractRepository;
import com.example.contract.service.IContractService;
import com.example.dto.ContractPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ContractService implements IContractService {
    @Autowired
    private IContractRepository iContractRepository;

    @Override
    public Page<ContractPage> showListConTract(Pageable pageable) {
        return iContractRepository.showListConTract(pageable);
    }

    @Override
    public Contract findById(int id) {
        return this.iContractRepository.findById(id).orElse(null );
    }

    @Override
    public void add(Contract contract) {
        iContractRepository.save(contract);
    }

}

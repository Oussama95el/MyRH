package com.simplon.myRh_backend.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {

    private final CompanyRepository companyRepository;

    @Autowired
    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public Company save(Company company){
        return companyRepository.save(company);
    }

    public Company findByEmail(String email){
        return companyRepository.findByEmail(email);
    }

    public List<Company> findAll(){
        return companyRepository.findAll();
    }

    public Company updateCompany(Company company){
        return companyRepository.save(company);
    }

    public void deleteCompany(Long id){
        companyRepository.deleteById(id);
    }

    public Company findByName(String name) {
        return companyRepository.findByName(name);
    }
}

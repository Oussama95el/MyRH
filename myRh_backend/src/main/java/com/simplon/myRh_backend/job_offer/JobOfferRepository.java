package com.simplon.myRh_backend.job_offer;

import com.simplon.myRh_backend.company.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

@Repository
public interface JobOfferRepository extends JpaRepository<JobOffer, Long> {


    Optional<List<JobOffer>> findJobOfferByTitleContains(String title);

    Optional<List<JobOffer>> findJobOffersByCompany(Company company);

}

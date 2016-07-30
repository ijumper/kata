package uk.co.ijump.kata;

/**
 * Created by brianmason on 26/07/2016.
 */


import java.util.List;

import org.springframework.data.repository.CrudRepository;


    public interface ReportRepository extends CrudRepository<Report, Long> {

        List<Report> findById(long id);
    }



package vn.com.job.data.service;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import vn.com.job.data.entity.SamplePerson;

public interface SamplePersonRepository extends JpaRepository<SamplePerson, UUID> {

}
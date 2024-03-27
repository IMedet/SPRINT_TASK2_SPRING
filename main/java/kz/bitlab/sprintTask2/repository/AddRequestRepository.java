package kz.bitlab.sprintTask2.repository;


import kz.bitlab.sprintTask2.model.ApplicationRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddRequestRepository extends JpaRepository<ApplicationRequest, Long> {

}

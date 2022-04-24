package vn.com.job.data.service;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import vn.com.job.data.entity.User;

public interface UserRepository extends JpaRepository<User, UUID> {

    User findByUsername(String username);
}
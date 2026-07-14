package com.example.usersystemapi.repository;


import com.example.usersystemapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findByLastName(String lastName);

    List<User> findByFirstName(String firstName);

    List<User> findByDepartment(String department);

    List<User> findByAgeLessThan(Integer age);

    @Query("SELECT user FROM User user WHERE user.age>=:threshold")
    List<User> findByAgeLargerThan(@Param("threshold") int threshold);





}

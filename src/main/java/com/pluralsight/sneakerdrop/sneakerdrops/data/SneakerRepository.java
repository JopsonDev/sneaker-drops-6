package com.pluralsight.sneakerdrop.sneakerdrops.data;

import com.pluralsight.sneakerdrop.sneakerdrops.models.Sneaker;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SneakerRepository extends JpaRepository<Sneaker, Long> {

    List<Sneaker> findSneakerByModel(String model);

    List<Sneaker> findSneakerByPrice(double price);

    List<Sneaker> findSneakerByReleaseYear(int year);
}

package com.example.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class StreetService {
    @Autowired
    private StreetRepository streetRepository;
    public Page<Street> findAll(int page, int limit) {
        return streetRepository.findAll(
                PageRequest.of(page - 1, limit));
    }

    public List<Street> getAll() {
        return streetRepository.findAll();
    }

    public List<Street> findByName(String name){
        return streetRepository.findByName(name);
    }

    public Optional<Street> findById(Integer id) {
        return streetRepository.findById(id);
    }

    public Street save(Street product) {
        return streetRepository.save(product);
    }
}
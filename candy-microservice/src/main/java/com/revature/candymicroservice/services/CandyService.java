package com.revature.candymicroservice.services;

import com.revature.candymicroservice.models.Candy;

import java.util.List;

public interface CandyService {
    // Basic CRUD business logic
    public Candy createCandy(Candy c);

    public List<Candy> getAll();

    public Candy getById(int id);

    public Candy editCandy(Candy c);

    public void deleteCandyById(int id);
}

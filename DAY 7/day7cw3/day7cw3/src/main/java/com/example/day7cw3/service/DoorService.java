package com.example.day7cw3.service;



import java.util.List;

import org.springframework.stereotype.Service;

import com.example.day7cw3.model.Door;
import com.example.day7cw3.repository.DoorRepo;

@Service
public class DoorService {
    public DoorRepo doorRepo;

    public DoorService(DoorRepo doorRepo) {
        this.doorRepo = doorRepo;
    }
    @SuppressWarnings("null")
    public Door postDetail(Door door)
    {
       return doorRepo.save(door);
    }
    public List<Door> getAll()
    {
        return doorRepo.findAll();
    }
    public List<Door> getByAccessType(String accessType)
    {
        return doorRepo.findByAccessType(accessType);
    }
    public Door getByDoorId(int doorId)
    {
        return doorRepo.findById(doorId).orElse(null);
    }
}
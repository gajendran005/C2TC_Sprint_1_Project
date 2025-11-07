package com.tnsif.Mall.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import com.tnsif.Mall.entity.Mall;
import com.tnsif.Mall.repository.MallRepository;

@Service
public class MallService {

    @Autowired
    private MallRepository mallRepository;

    // Create or Update Mall
    public Mall saveMall(Mall mall) {
        return mallRepository.save(mall);
    }

    // Get all Malls
    public List<Mall> getAllMalls() {
        return mallRepository.findAll();
    }

    // Get Mall by ID
    public Optional<Mall> getMallById(Long id) {
        return mallRepository.findById(id);
    }

    // Delete Mall by ID
    public void deleteMall(Long id) {
        mallRepository.deleteById(id);
    }
}


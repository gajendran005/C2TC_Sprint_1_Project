package com.tnsif.Mall.controler;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
import com.tnsif.Mall.entity.Mall;
import com.tnsif.Mall.service.MallService;

@RestController
@RequestMapping("/mallservice")
public class MallController {

    @Autowired
    private MallService mallService;

    @PostMapping
    public Mall createMall(@RequestBody Mall mall) {
        return mallService.saveMall(mall);
    }

    @GetMapping
    public List<Mall> getAllMalls() {
        return mallService.getAllMalls();
    }

    @GetMapping("/{id}")
    public Optional<Mall> getMallById(@PathVariable Long id) {
        return mallService.getMallById(id);
    }

    @PutMapping("/{id}")
    public Mall updateMall(@PathVariable Long id, @RequestBody Mall mall) {
        mall.setId(id);
        return mallService.saveMall(mall);
    }

    @DeleteMapping("/{id}")
    public String deleteMall(@PathVariable Long id) {
        mallService.deleteMall(id);
        return "Mall deleted successfully with ID: " + id;
    }
}


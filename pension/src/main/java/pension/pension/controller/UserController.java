package pension.pension.controller;

import pension.pension.model.User;
import pension.pension.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    @PostMapping("/calculate")
    public Double calculatePension(@RequestBody User user) {
        // Pension value calculations
        //Double value = user.getVerwachtPensioenWaarde() + user.getFulltimeSalaris();
        return UserService.getPensioenWaarde(user);
        //return 100.00;
    }
}

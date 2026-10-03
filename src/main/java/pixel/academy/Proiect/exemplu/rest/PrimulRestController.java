package pixel.academy.Proiect.exemplu.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimulRestController {

    @GetMapping("/jora")
    public String afiseazaMesaj() {
        return "Gheorghe";
    }

    @GetMapping("/misa")
    public String afiseazaMesaj2() {
        return "Mihai";
    }



}

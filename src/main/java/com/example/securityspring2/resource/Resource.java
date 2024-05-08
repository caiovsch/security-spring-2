package com.example.securityspring2.resource;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/front/admin/database")
public class Resource {

    @PostMapping("schema/{schema}")
    public String executeExport(@PathVariable("schema") String string) {
        return "Success";
    }

    @GetMapping("/schema/all")
    public String[] getAll() {
        return new String[]{"teste"};
    }

}


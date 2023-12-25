package br.dev.gspadilha.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@RestController
@RequestMapping("/primeiroController")
public class PrimeiroController {

    record User(String name, String pass) {
    }

    @GetMapping("/primeiroMethod")
    public String primeiroMethod() {
        return "Você chegou em algum lugar no demo!";
    }

    @GetMapping("/methodWithParameters/{id}")
    public String methodWithParameters(@PathVariable String id) {
        return "O parâmetro informado é " + id + "!";
    }

    @GetMapping("/methodWithQueryParams")
    public String methodWithQueryParams(@RequestParam String id) {
        return "O parâmetro informado é " + id + "!";
    }

    @GetMapping("/methodWithMultipleQueryParams")
    public String methodWithMultipleQueryParams(@RequestParam Map<String, String> params) {
        return "O parâmetro informado é " + params.entrySet() + "!";
    }

    @PostMapping("/methodWithBody")
    public String methodWithBody(@RequestBody User user) {
        return "O usuário é " + user.name() + " com senha" + user.pass() + "!";
    }

    @PostMapping("/methodWithHeaders")
    public String methodWithHeaders(@RequestHeader Map<String, String> params) {
        return "Os headers enviados são " + params.entrySet() + "!";
    }

    @PostMapping("/methodWithResponseEntity")
    public ResponseEntity<Object> methodWithResponseEntity() {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Request Not Found");
    }

}

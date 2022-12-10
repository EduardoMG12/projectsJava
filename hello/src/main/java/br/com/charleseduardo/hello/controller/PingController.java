package br.com.charleseduardo.hello.controller;
import br.com.charleseduardo.hello.dto.PingDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {
@GetMapping("/ping")
    public ResponseEntity pong(){
        return new ResponseEntity<>("Hello World", HttpStatus.OK);

    }
    @PostMapping("/ping")
    public ResponseEntity ping(@RequestBody PingDto pingDto){
        return new ResponseEntity<>("ping" + pingDto.algo, HttpStatus.OK);

    }
}

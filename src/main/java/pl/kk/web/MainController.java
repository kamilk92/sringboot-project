package pl.kk.web;

import org.apache.tomcat.jni.Local;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController("/")
public class MainController {

    private DateTimeFormatter dateTimeFormatter;

    public MainController() {
        dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    }

    @GetMapping
    public ResponseEntity<String> getHello() {

        LocalDateTime nowDatetime = LocalDateTime.now();
        String nowStringDatetime = dateTimeFormatter.format(nowDatetime);


        return ResponseEntity.ok(nowStringDatetime);
    }
}

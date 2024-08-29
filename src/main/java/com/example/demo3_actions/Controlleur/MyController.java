package com.example.demo3_actions.Controlleur;

import java.time.LocalDate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/")
    public MyInfo getInfo() {
        return new MyInfo("Meriem", "mbouhbou@campus-eni.fr", LocalDate.now());
    }

    class MyInfo {
        private String name;
        private String email;
        private LocalDate  date;

        public MyInfo(String name, String email, LocalDate  date) {
            this.name = name;
            this.email = email;
            this.date = date;
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        public LocalDate  getDate() {
            return date;
        }
    }
}

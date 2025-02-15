package ru.yandex.practicum.report.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/reports")
@CrossOrigin
public class ReportController {

    @GetMapping
    public ResponseEntity<String> getReports() {
        return ResponseEntity.ok("reports");
    }

}

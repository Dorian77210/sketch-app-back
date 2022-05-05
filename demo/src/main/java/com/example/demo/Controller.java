package com.example.demo;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/")
public class Controller {
    @RequestMapping(value = "/example", method = RequestMethod.GET)
    @ResponseBody
    public Test getExample() {
        return new Test();
    }

    @RequestMapping(value = "/impl", method = RequestMethod.GET)
    @ResponseBody
    public Inter getImpl() {
        return new Impl();
    }

    @PostMapping("/file")
    public String fromJSON(@RequestParam("file") MultipartFile file) throws IOException {
        System.out.println(new String(file.getBytes()));
        return "ok";
    }
}

package com.wolf.provider.controller;

import com.wolf.provider.entity.Info;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class InfoController {
    @PostMapping("/info/list")
    public List<Info> infoList(@RequestBody Info info) {
        Integer id = info.getId();
        ArrayList<Info> resultList = new ArrayList<>();
        Info result1 = new Info();
        result1.setId(id + 1);
        result1.setName(result1.getId() + "_name");

        Info result2 = new Info();
        result2.setId(id + 2);
        result2.setName(result2.getId() + "_name");

        resultList.add(result1);
        resultList.add(result2);
        return resultList;
    }
}

package com.example.springwebservice.controller;

import com.example.springwebservice.controller.dto.request.AddBalanceRequest;
import com.example.springwebservice.controller.dto.request.QueryStockRequest;
import com.example.springwebservice.controller.dto.response.AddBalanceResponse;
import com.example.springwebservice.controller.dto.response.StatusResponse;
import com.example.springwebservice.model.entity.User;
import com.example.springwebservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping
    public Map<String, String> getAddBalanceResultList(@RequestBody AddBalanceRequest request) {
        String response = userService.addBalance(request);
        Map<String, String>result = userService.getAddUnrealResultList(request);
        return result;
    }


} // Class end

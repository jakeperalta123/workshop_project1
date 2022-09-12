package com.example.springwebservice.service;


import com.example.springwebservice.controller.dto.request.AddBalanceRequest;
import com.example.springwebservice.controller.dto.request.QueryStockRequest;
import com.example.springwebservice.model.MtmsbRepository;
import com.example.springwebservice.model.TcnudRepository;
import com.example.springwebservice.model.UserRepository;
import com.example.springwebservice.model.entity.User;
import com.example.springwebservice.model.entity.tcnud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    @Autowired
    MtmsbRepository mtmsbRepository;

    @Autowired
    TcnudRepository tcnudRepository;

    public String addBalanceHcmio(AddBalanceRequest request) {

        User user = new User();

        user.setTradeDate(request.getTradeDate());
        user.setBranchNo(request.getBranchNo());
        user.setCustSeq(request.getCustSeq());
        user.setDocSeq(request.getDocSeq());
        user.setStock(request.getStock());
        user.setBsType("B");
        user.setPrice(request.getPrice());
        user.setQty(request.getQty());
        user.setAmt(request.getPrice() * request.getQty());
        user.setFee(user.getAmt() * 0.001425);
        user.setTax(user.getAmt() * 0.003);
        user.setNetAmt(user.getAmt() + user.getFee());
        user.setModDate(String.valueOf(java.time.LocalDate.now()));
        user.setModTime(String.valueOf(java.time.LocalTime.now()));
        user.setModUser("Jake");

        userRepository.save(user);
        return "OK";
    }

    public String addBalanceTcnud(AddBalanceRequest request) {
        tcnud tcnud = new tcnud();

        tcnud.setTradeDate(request.getTradeDate());
        tcnud.setBranchNo(request.getBranchNo());
        tcnud.setCustSeq(request.getCustSeq());
        tcnud.setDocSeq(request.getDocSeq());
        tcnud.setStock(request.getStock());
        tcnud.setPrice(request.getPrice());
        tcnud.setQty(request.getQty());
        tcnud.setRemainQty(request.getQty());
        tcnud.setFee(request.getPrice() * request.getQty() * 0.001425);
        tcnud.setCost((request.getPrice() * request.getQty()) * 1.001425);
        tcnud.setModDate(String.valueOf(java.time.LocalDate.now()));
        tcnud.setModTime(String.valueOf(java.time.LocalTime.now()));
        tcnud.setModUser("Jake");

        tcnudRepository.save(tcnud);
        return "OK";
    }

    public List<Map<String, String>> returnAddBalanceResult(AddBalanceRequest request) {
        List<Map<String, String>> resultList = new ArrayList<>();
        Map<String, String> result = new HashMap<>();
    }



} // Class end

package com.example.springwebservice.service;


import com.example.springwebservice.controller.dto.request.AddBalanceRequest;
import com.example.springwebservice.controller.dto.request.QueryStockRequest;
import com.example.springwebservice.controller.dto.response.AddBalanceResponse;
import com.example.springwebservice.model.MtmsbRepository;
import com.example.springwebservice.model.TcnudRepository;
import com.example.springwebservice.model.UserRepository;
import com.example.springwebservice.model.entity.User;
import com.example.springwebservice.model.entity.mtsmb;
import com.example.springwebservice.model.entity.tcnud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.transaction.Transactional;
import java.util.*;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    @Autowired
    MtmsbRepository mtmsbRepository;

    @Autowired
    TcnudRepository tcnudRepository;
    @Transactional
    public String addBalance(AddBalanceRequest request) {

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

        DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        Calendar c1 = Calendar.getInstance();
        //user.setModDate(dateFormat.format(c1.getTime()));

        Format timeFormat = new SimpleDateFormat("HHmmss");
        //user.setModTime(timeFormat.format(new Date()));

        System.out.println(String.valueOf(java.time.LocalDate.now()));
        System.out.println(String.valueOf(java.time.LocalTime.now()));
        user.setModUser("Jake");

        userRepository.save(user);


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
        //tcnud.setModDate(String.valueOf(java.time.LocalDate.now()));
        //tcnud.setModTime(String.valueOf(java.time.LocalTime.now()));
        tcnud.setModUser("Jake");

        tcnudRepository.save(tcnud);

        mtsmb mtsmb = new mtsmb();
        Map<String, String>stockNameAndCode = new HashMap<>();
        stockNameAndCode.put("2357", "華碩");
        stockNameAndCode.put("6214", "精誠");

        mtsmb.setStock(request.getStock());
        //檢查內建資料庫是否含有該股票
        for (Map.Entry<String, String> entry : stockNameAndCode.entrySet()) {
            if(stockNameAndCode.containsKey(entry.getKey())) {
                mtsmb.setStockName(entry.getValue());
            }
        }
        mtsmb.setCurPrice(368);
        //mtsmb.setModDate(String.valueOf(java.time.LocalDate.now()));
        //mtsmb.setModTime(String.valueOf(java.time.LocalTime.now()));
        mtsmb.setModUser("Jake");
        mtmsbRepository.save(mtsmb);
        return "OK";
    }

    public Map<String, String>getAddUnrealResultList(AddBalanceRequest request) {
        Map<String, String> resultList = userRepository.getAddUnrealResultList(request.getTradeDate(), request.getBranchNo(), request.getCustSeq(), request.getDocSeq());
        return resultList;
    }













} // Class end

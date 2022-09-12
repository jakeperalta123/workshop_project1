package com.example.springwebservice.model;

import com.example.springwebservice.model.entity.User;
import com.example.springwebservice.model.entity.tcnud;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;


import javax.persistence.JoinColumn;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Map;

public interface UserRepository extends JpaRepository<User, String> {

    @Query(value = "SELECT hcmio.tradeDate, hcmio.docSeq, hcmio.stock, hcmio.price, hcmio.NetAmt, mtsmb.stockName, mtsmb.nowPrice, tcnud.qty, tcnud.remainQty, tcnud.fee, tcnud.cost WHERE FROM hcmio h INNER JOIN mtsmb m ON h.stcok = m.stock INNER JOIN tcnud t ON h.tradeDate = t.tradeDate, h.branchNo = t.branchNo, h.custSeq = t.custSeq, h.docSeq = t.docSeq ")
    public Map<String, String> findByTradeDateAndBranchNoAndCustSeqAndDocSeqAndStockAndPriceAndQty()

}

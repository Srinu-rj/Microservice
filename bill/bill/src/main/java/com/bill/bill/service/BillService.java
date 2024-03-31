package com.bill.bill.service;

import com.bill.bill.entity.Bill;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BillService {
    Bill addBill(Bill bill);

    List<Bill> saveAllBills(List<Bill> bills);

    List<Bill> getBills();

    Bill getById(int billId);

    Bill updateBill(Integer id, Bill updateBill);

    String deleteBill(int billId);
}

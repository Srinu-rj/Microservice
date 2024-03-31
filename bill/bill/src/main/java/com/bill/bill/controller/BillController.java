package com.bill.bill.controller;


import com.bill.bill.entity.Bill;
import com.bill.bill.service.BillService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bill")
@Slf4j
@RequiredArgsConstructor
public class BillController {

    private final BillService billService;

    @PostMapping("/add")
    public Bill addBill(@RequestBody Bill bill) {
        return billService.addBill(bill);
    }

    @PostMapping("/addList")
    public List<Bill> addBillsList(@RequestBody List<Bill> bills) {
        return billService.saveAllBills(bills);
    }

    @GetMapping("/get")
    public List<Bill> findAllBills() {
        return billService.getBills();
    }

    @GetMapping("/bill/{billId}")
    public Bill findById(@PathVariable("billId") int billId) {
        return billService.getById(billId);
    }

    @PutMapping("/{id}")
    public Bill updateBill(@PathVariable Integer id, @RequestBody Bill updateBill) {
        return billService.updateBill(id, updateBill);
    }

    @DeleteMapping("/delete/{billId}")
    public String deleteBill(@PathVariable int billId) {
        return billService.deleteBill(billId);
    }

}

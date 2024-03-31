package com.bill.bill.serviceImpl;

import com.bill.bill.entity.Bill;
import com.bill.bill.repository.BillRepository;
import com.bill.bill.service.BillService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BillServiceImpl implements BillService {

    private final BillRepository billRepository;
    @Override
    public List<Bill> getBills() {
        return billRepository.findAll();
    }

    @Override
    public Bill addBill(Bill updateBill) {
        return billRepository.save(updateBill);
    }

    @Override
    public Bill getById(int billId) {
        return billRepository.findById(billId).orElseThrow(() -> new IllegalStateException("updateBill not found"));
    }

    @Override
    public Bill updateBill(Integer id, Bill updateBill) {
        Bill existBill = billRepository.findById(updateBill.getBillId())
                .orElseThrow(() -> new RuntimeException("Can't Find billId"));

        existBill.setBillId(existBill.getBillId());
        existBill.setBillDate(updateBill.getBillDate());
        existBill.setTotalCost(updateBill.getTotalCost());

        return billRepository.save(existBill);
    }

    @Override
    public String deleteBill(int billId) {
        billRepository.deleteById(billId);
        return "product repo !! " + billId;
    }

    @Override
    public List<Bill> saveAllBills(List<Bill> bills) {
        return billRepository.saveAll(bills);
    }


}

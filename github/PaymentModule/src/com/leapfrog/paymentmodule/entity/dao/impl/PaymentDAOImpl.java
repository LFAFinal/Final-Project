/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.paymentmodule.entity.dao.impl;

import com.leapfroog.mfp.entity.Payment;
import com.leapfrog.paymentmodule.entity.dao.PaymentDAO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Anonymous
 */
public class PaymentDAOImpl implements PaymentDAO {

    private final List<Payment> PaymentList = new ArrayList<>();

    @Override
    public List<Payment> getAll() {
        return PaymentList;
    }

    @Override
    public Payment getByid(int id) {
        for (Payment c : PaymentList) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }

    @Override
    public int insert(Payment c) {

        return (PaymentList.add(c) ? 1 : 0);
    }

}

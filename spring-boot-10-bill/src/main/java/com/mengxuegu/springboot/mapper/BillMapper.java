package com.mengxuegu.springboot.mapper;

import com.mengxuegu.springboot.entities.Bill;

/**
 * @Auther: 梦学谷
 */
//@Mapper 或 @MapperScan
public interface BillMapper {

    Bill getBillByBid(Integer bid);

    int addBill(Bill bill);



}

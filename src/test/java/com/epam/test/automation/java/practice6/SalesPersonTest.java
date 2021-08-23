package com.epam.test.automation.java.practice6;


import org.testng.annotations.Test;

import java.math.BigDecimal;

import static org.testng.AssertJUnit.assertEquals;

public class SalesPersonTest {

    @Test
    public void ifSalesPersonThenSuccess() {

        var salesPerson = new SalesPerson("NN", new BigDecimal(100), 200);
        salesPerson.setBonus(new BigDecimal(20));
        var salery = salesPerson.toPay();
        assertEquals(new BigDecimal(140), salery);
    }
}

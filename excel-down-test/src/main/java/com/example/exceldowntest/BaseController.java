package com.example.exceldowntest;

import jakarta.servlet.http.HttpServletResponse;
import org.apache.poi.util.IOUtils;
import org.apache.xmlbeans.impl.common.IOUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class BaseController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/down/order.xlsx")
    public void download(HttpServletResponse response) throws IOException {
        response.setContentType("application/octet-stream");
        response.setHeader("Content-Disposition", "attachment' filename=order.xlsx");
        ByteArrayInputStream stream = FileExporter.contactListToExcelFile(createTestData());
        IOUtils.copy(stream, response.getOutputStream());
    }

    private List<Order> createTestData() {
        List<Order> customers = new ArrayList<Order>();
        customers.add(new Order("Vernon", "Barlow", "0123456789", "test1@simplesolution.dev"));
        customers.add(new Order("Maud", "Brock", "0123456788", "test2@simplesolution.dev"));
        customers.add(new Order("Chyna", "Cowan", "0123456787", "test3@simplesolution.dev"));
        customers.add(new Order("Krisha", "Tierney", "0123456786", "test4@simplesolution.dev"));
        customers.add(new Order("Sherry", "Rosas", "0123456785", "test5@simplesolution.dev"));
        return customers;
    }
}

package com.example.purchaseanalysis;

import com.example.purchaseanalysis.parser.Product;
import com.example.purchaseanalysis.parser.Sale;
import com.example.purchaseanalysis.parser.SaleRoot;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.IOException;

public class test {

//    private Product product;
//    private Sale sale;
//
//    public test(Product product, Sale sale) {
//        this.product = product;
//        this.sale = sale;
//    }

    public static void main(String[] args) throws JAXBException, IOException {

//        Stream<Path> walk = Files.walk(Paths.get("C:\\TestMaxi"));
//        List<String> fileNameList = walk.filter(Files::isRegularFile)
//                .map(Path::toString).collect(Collectors.toList());
//        for (String string : fileNameList) {
//            System.out.println(string);
//        }
        Product product = new Product();
        Sale sale = new Sale();


        JAXBContext context = JAXBContext.newInstance(SaleRoot.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
//        for (int i = 0; i < fileNameList.size(); i++) {
        SaleRoot saleRoot = (SaleRoot) unmarshaller.unmarshal(new File("C:\\TestMaxi\\sale_05.05.2018.xml"));
        System.out.println(saleRoot);
//        }
    }
}

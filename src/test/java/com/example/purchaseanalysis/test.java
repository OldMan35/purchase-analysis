package com.example.purchaseanalysis;

import com.example.purchaseanalysis.parser.Products;
import com.example.purchaseanalysis.parser.Sale;
import com.example.purchaseanalysis.parser.Sales;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class test {

    public static void main(String[] args) throws JAXBException, IOException {

//        Stream<Path> walk = Files.walk(Paths.get("C:\\TestMaxi"));
//        List<String> fileNameList = walk.filter(Files::isRegularFile)
//                .map(Path::toString).collect(Collectors.toList());
//        for (String string : fileNameList) {
//            System.out.println(string);
//        }


        JAXBContext context = JAXBContext.newInstance(Sales.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
//        for (int i = 0; i < fileNameList.size(); i++) {
            Sales sales = (Sales) unmarshaller.unmarshal(new File("C:\\TestMaxi\\sale_05.05.2018.xml"));
            System.out.println(sales);
//        }
    }
}

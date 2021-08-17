package com.example.purchaseanalysis.parser;

import org.springframework.beans.factory.annotation.Value;

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

public class SaleReader {

//    @Value("${upload.path}")
//    private String uploadPath;
//
//
//    public void parser() throws JAXBException, IOException {
//
//        Stream<Path> walk = Files.walk(Paths.get(uploadPath));
//        List<String> fileNameList = walk.filter(Files::isRegularFile)
//                .map(Path::toString).collect(Collectors.toList());
//
//        JAXBContext context = JAXBContext.newInstance(Sales.class);
//        Unmarshaller unmarshaller = context.createUnmarshaller();
//        for (int i = 0; i < fileNameList.size(); i++) {
//            Sales sales = (Sales) unmarshaller.unmarshal(new File(fileNameList.get(i)));
//        }
//
//    }

}

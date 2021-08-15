package com.example.purchaseanalysis;

import com.example.purchaseanalysis.model.SalesModelFromXml;

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

        Stream<Path> walk = Files.walk(Paths.get("C:\\TestMaxi"));
        List<String> fileNameList = walk.filter(Files::isRegularFile)
                .map(Path::toString).collect(Collectors.toList());

        for (String string : fileNameList) {
            System.out.println(string);
        }
        JAXBContext context = JAXBContext.newInstance(SalesModelFromXml.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        for (int i = 0; i < fileNameList.size(); i++) {
            SalesModelFromXml sales = (SalesModelFromXml) unmarshaller.unmarshal(new File(fileNameList.get(i)));
            System.out.println(sales.getCARD_NUMBER());
        }
    }
}

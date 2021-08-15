package com.example.purchaseanalysis;

import com.example.purchaseanalysis.parser.Sale;
import com.example.purchaseanalysis.parser.SalesXml;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class test {

    public static void main(String[] args) throws JAXBException, IOException, ParserConfigurationException, SAXException {
        SalesXml salesXml = new SalesXml();
        Sale sale = new Sale();

        Stream<Path> walk = Files.walk(Paths.get("C:\\TestMaxi"));
        List<String> fileNameList = walk.filter(Files::isRegularFile)
                .map(Path::toString).collect(Collectors.toList());

        JAXBContext context = JAXBContext.newInstance(SalesXml.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        for (int i = 0; i < fileNameList.size(); i++) {
            SalesXml sales = (SalesXml) unmarshaller.unmarshal(new File(fileNameList.get(i)));
            System.out.println(sales);
        }


//        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
//        Document document = documentBuilderFactory.newDocumentBuilder().parse(new File(fileNameList.get(1)));
//        Node rootNode = document.getFirstChild();
//        System.out.println("FirstChild" + " " + rootNode.getNodeName()); //Sales
//
//        NodeList rootChild = rootNode.getChildNodes();
//        Node saleNode = null;
//        for (int i = 0; i < rootChild.getLength(); i++) {
////            System.out.println("ChildNodes" + " " + rootChild.item(i).getNodeName());
//            if ("SALE".equals(rootChild.item(i).getNodeName())) {//Sale
//                saleNode = rootChild.item(i);
//            }
//        }
//        assert saleNode != null;
//
//        NodeList saleChild = saleNode.getChildNodes();
//        Node productsNode = null;
//        for (int i = 0; i < saleChild.getLength(); i++) {
//            System.out.println("saleChild" + " " + saleChild.item(i).getNodeName());
//            if ("PRODUCTS".equals(saleChild.item(i).getNodeName())) {//products
//                productsNode = saleChild.item(i);
//            }
//        }
////        sale.setCARD_NUMBER();
//
//        assert productsNode != null;
//
//        NodeList productsChild = productsNode.getChildNodes();
//        Node productNode = null;
//        for (int i = 0; i < productsChild.getLength(); i++) {
//            System.out.println("productsChild" + " " + productsChild.item(i).getNodeName());
//            if ("PRODUCT".equals(productsChild.item(i).getNodeName())) {//product
//                productNode = productsChild.item(i);
//            }
//        }
//        assert productNode != null;
//        NodeList productChild = productNode.getChildNodes();
//        for (int i = 0; i < productChild.getLength(); i++) {
//            System.out.println("productChild" + " " + productChild.item(i).getNodeName());
//        }
    }
}

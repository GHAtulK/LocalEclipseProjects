package javaassignment.problemstatement5;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class CarXMLReader {
    public static void main(String[] args) {
        try {
            File inputFile = new File("cars.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            NodeList carNodeList = doc.getElementsByTagName("car");

            for (int temp = 0; temp < carNodeList.getLength(); temp++) {
                Element carElement = (Element) carNodeList.item(temp);
                String name = carElement.getElementsByTagName("name").item(0).getTextContent();
                String owner = carElement.getElementsByTagName("owner").item(0).getTextContent();
                String modelNumber = carElement.getElementsByTagName("modelNumber").item(0).getTextContent();
                int launchYear = Integer.parseInt(carElement.getElementsByTagName("launchYear").item(0).getTextContent());
                double price = Double.parseDouble(carElement.getElementsByTagName("price").item(0).getTextContent());

                Car car = new Car(name, owner, modelNumber, launchYear, price);
                System.out.println(car);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

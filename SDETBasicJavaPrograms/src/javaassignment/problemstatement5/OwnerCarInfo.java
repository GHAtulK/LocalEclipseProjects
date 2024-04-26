package javaassignment.problemstatement5;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class OwnerCarInfo {
    private String owner;
    private List<Car> cars;

    public OwnerCarInfo(String owner) {
        this.owner = owner;
        this.cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        this.cars.add(car);
    }

    public String getOwner() {
        return owner;
    }

    public List<Car> getCars() {
        return cars;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Owner: ").append(owner).append("\n");
        for (Car car : cars) {
            sb.append(car.toString()).append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        try {
            File inputFile = new File("cars.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            NodeList carNodeList = doc.getElementsByTagName("car");

            // Store cars information for specific owners
            List<OwnerCarInfo> ownerCarList = new ArrayList<>();
            for (int temp = 0; temp < carNodeList.getLength(); temp++) {
                Element carElement = (Element) carNodeList.item(temp);
                String owner = carElement.getElementsByTagName("owner").item(0).getTextContent();

                // Check if owner is one of the specific owners you want to include
                if (owner.equals("John Doe") || owner.equals("Jane Smith")) {
                    Car car = new Car(
                            carElement.getElementsByTagName("name").item(0).getTextContent(),
                            owner,
                            carElement.getElementsByTagName("modelNumber").item(0).getTextContent(),
                            Integer.parseInt(carElement.getElementsByTagName("launchYear").item(0).getTextContent()),
                            Double.parseDouble(carElement.getElementsByTagName("price").item(0).getTextContent())
                    );

                    // Add car information to corresponding owner's list
                    OwnerCarInfo ownerCarInfo = getOwnerCarInfo(owner, ownerCarList);
                    if (ownerCarInfo == null) {
                        ownerCarInfo = new OwnerCarInfo(owner);
                        ownerCarInfo.addCar(car);
                        ownerCarList.add(ownerCarInfo);
                    } else {
                        ownerCarInfo.addCar(car);
                    }
                }
            }

            // Print the information
            for (OwnerCarInfo ownerCarInfo : ownerCarList) {
                System.out.println(ownerCarInfo);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Helper method to get OwnerCarInfo object by owner name
    private static OwnerCarInfo getOwnerCarInfo(String owner, List<OwnerCarInfo> ownerCarList) {
        for (OwnerCarInfo ownerCarInfo : ownerCarList) {
            if (ownerCarInfo.getOwner().equals(owner)) {
                return ownerCarInfo;
            }
        }
        return null;
    }
}
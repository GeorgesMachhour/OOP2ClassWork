/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xmlreadwrite;

import org.w3c.dom.*;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import java.io.File;

/**
 *
 * @author ahmad
 */
public class XMLReader {
    public static void main(String[] args) {
        try {
            // Load the XML file
            File xmlFile = new File("C:/Users/ahmad/Desktop/students.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

            // Parse the XML document
            Document doc = dBuilder.parse(xmlFile);
            doc.getDocumentElement().normalize();

            System.out.println("Root element: " + doc.getDocumentElement().getNodeName());

            // Get list of all <student> elements
            NodeList studentList = doc.getElementsByTagName("student");

            for (int i = 0; i < studentList.getLength(); i++) {
                Node studentNode = studentList.item(i);

                if (studentNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element studentElement = (Element) studentNode;

                    String name = studentElement.getElementsByTagName("name")
                                    .item(0).getTextContent();
                    String grade = studentElement.getElementsByTagName("grade")
                                    .item(0).getTextContent();

                    System.out.println("Student " + (i + 1) + ":");
                    System.out.println("Name: " + name);
                    System.out.println("Grade: " + grade);
                    System.out.println("--------------------");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

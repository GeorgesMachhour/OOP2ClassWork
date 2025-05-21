/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xmlreadwrite;

/**
 *
 * @author ahmad
 */
import org.w3c.dom.*;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class XMLWriter {
    public static void main(String[] args) {
        try {
            // Create document builder
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            // Root element <students>
            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("students");
            doc.appendChild(rootElement);

            // First student
            Element student1 = doc.createElement("student");
            rootElement.appendChild(student1);

            Element name1 = doc.createElement("name");
            name1.appendChild(doc.createTextNode("Alice"));
            student1.appendChild(name1);

            Element grade1 = doc.createElement("grade");
            grade1.appendChild(doc.createTextNode("90"));
            student1.appendChild(grade1);

            // Second student
            Element student2 = doc.createElement("student");
            rootElement.appendChild(student2);

            Element name2 = doc.createElement("name");
            name2.appendChild(doc.createTextNode("Bob"));
            student2.appendChild(name2);

            Element grade2 = doc.createElement("grade");
            grade2.appendChild(doc.createTextNode("85"));
            student2.appendChild(grade2);

            // Write the content into an XML file
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes"); 
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("C:/Users/ahmad/Desktop/students.xml"));

            transformer.transform(source, result);
            System.out.println("XML file written successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

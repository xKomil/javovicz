package uni.lodz;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UserXMLSerializer implements IUserXMLSerializer {

    @Override
    public void xml(List<User> users) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.newDocument();

            Element rootElement = doc.createElement("users");
            doc.appendChild(rootElement);

            for (User user : users) {
                Element userElement = doc.createElement("user");
                rootElement.appendChild(userElement);

                Element imieElement = doc.createElement("imie");
                imieElement.appendChild(doc.createTextNode(user.getImie()));
                userElement.appendChild(imieElement);

                Element nazwiskoElement = doc.createElement("nazwisko");
                nazwiskoElement.appendChild(doc.createTextNode(user.getNazwisko()));
                userElement.appendChild(nazwiskoElement);

                Element wiekElement = doc.createElement("wiek");
                wiekElement.appendChild(doc.createTextNode(String.valueOf(user.getWiek())));
                userElement.appendChild(wiekElement);

                Element emailElement = doc.createElement("email");
                emailElement.appendChild(doc.createTextNode(user.getEmail()));
                userElement.appendChild(emailElement);
            }

            // Zapisz dokument XML do pliku
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");

            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("src/main/resources/outputXML.xml"));

            transformer.transform(source, result);

        } catch (ParserConfigurationException | TransformerException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deXml(List<User> users) {
        try {
            File xmlFile = new File("src/main/resources/outputXML.xml");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(xmlFile);

            doc.getDocumentElement().normalize();

            NodeList nodeList = doc.getElementsByTagName("user");

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);

                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;

                    String imie = element.getElementsByTagName("imie").item(0).getTextContent();
                    String nazwisko = element.getElementsByTagName("nazwisko").item(0).getTextContent();
                    int wiek = Integer.parseInt(element.getElementsByTagName("wiek").item(0).getTextContent());
                    String email = element.getElementsByTagName("email").item(0).getTextContent();

                    User user = new User(imie, nazwisko, wiek, email);
                    users.add(user);
                }
            }

        } catch (ParserConfigurationException | IOException | org.xml.sax.SAXException e) {
            e.printStackTrace();
        }
    }
}

package by.me.main;

import by.me.data.Node;
import by.me.service.NodeBuilder;
import by.me.service.XmlToStringReader;

import java.io.File;

public class Main {

    public static void main(String[] args) throws Exception {

        File inputFile = new File("src/main/resources/input.xml");

        String inputString = new XmlToStringReader().read(inputFile);

        if (inputString == null || "".equals(inputString.trim())) {
            throw new Exception("Can not to read file properly");
        }
        inputString = inputString.trim();

        NodeBuilder nodeBuilder = new NodeBuilder();

        Node resultNode = nodeBuilder.build(inputString, 0);

    }

}

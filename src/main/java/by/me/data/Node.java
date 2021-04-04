package by.me.data;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Node {

    private String name;

    private List<Node> childNodes;

    private Map<String, String> attributes;

    private String content;

    private static int level = 0;


    public void setName(String name) {
        this.name = name;
    }

    public void setChildNodes(List<Node> childNodes) {
        this.childNodes = childNodes;
    }

    public void setAttributes(Map<String, String> attributes) {
        this.attributes = attributes;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public List<Node> getChildNodes() {
        return childNodes;
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }

    public String getContent() {
        return content;
    }

    public void printStructure() {

        String prefix = "|\t".repeat(level);
        System.out.println(prefix + "{");
        System.out.println(prefix + "|-Node name: " + name);

        if (attributes != null && !attributes.isEmpty()) {
            System.out.println(prefix + "|-Attributes: " + attributes);
        }
        if (content != null) {
            System.out.println(prefix + "|-Content: " + content);
        }
        if (childNodes != null && !childNodes.isEmpty()) {
            level++;
            System.out.println(prefix + "|-Child nodes:");
            for (Node node : childNodes) {

                node.printStructure();

            }
            level--;
        }
        System.out.println(prefix + "}");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        if (hashCode()!=node.hashCode()){
            return false;
        }
        return Objects.equals(name, node.name)
                && Objects.equals(childNodes, node.childNodes)
                && Objects.equals(attributes, node.attributes)
                && Objects.equals(content, node.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, childNodes, attributes, content);
    }
}

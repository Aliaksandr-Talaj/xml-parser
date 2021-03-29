package by.me.data;

import java.util.List;
import java.util.Map;

public class Node {

    private String name;

    private List<Node> childNodes;

    private Map<String, String> attributes;

    private String content;


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
}

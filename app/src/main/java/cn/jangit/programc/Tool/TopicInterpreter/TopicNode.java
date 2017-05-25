package cn.jangit.programc.Tool.TopicInterpreter;

import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.Vector;

/**
 * Created by jangitlau on 2017/5/25.
 */

public class TopicNode{
    String attributeType="type";
    ArrayList<Object> data = new ArrayList<Object>();
    String uri = "";
    public TopicNode(Node node){
        NamedNodeMap namedNodeMap = node.getAttributes();
        Node namedNode=namedNodeMap.getNamedItem(attributeType);
        String nodeType=namedNode.getNodeValue();
        switch (nodeType){
            case "choice":
                doTypeChioce(node);
                break;
            case "other":
                doTypeOther(node);
                break;
        }
    }

    public Object get() {
        return uri == null ? data : uri;
    }

    private void doTypeChioce(Node node){
        NodeList nodeList=node.getChildNodes();
        for (int count = 0; count < nodeList.getLength(); count++) {
            Node newNode = nodeList.item(count);
            if (newNode.getNodeName().contains("question")) {
                data.add(new Topic.Question(newNode.getTextContent()));
            } else if (newNode.getNodeName().contains("answer")) {
                NamedNodeMap namedNodeMap = newNode.getAttributes();
                Node namedNode = namedNodeMap.getNamedItem("isCorrent");
                data.add(new Topic.Answer(newNode.getTextContent(), namedNode.getNodeValue() == "true" ? true : false));
            }

        }
    }

    private void doTypeOther(Node node){
        this.uri = node.getFirstChild().getNodeValue();
    }


}

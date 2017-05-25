package cn.jangit.programc.Tool.TopicInterpreter;

import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.Vector;

/**
 * Created by jangitlau on 2017/5/25.
 */

public class TopicNode{
    String attributeType="type";
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

    private void doTypeChioce(Node node){
        NodeList nodeList=node.getChildNodes();


    }

    private void doTypeOther(Node node){
        String nodeValue=node.getFirstChild().getNodeValue();
    }
}

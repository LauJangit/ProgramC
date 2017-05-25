package cn.jangit.programc.Tool.TopicInterpreter;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import java.io.StringReader;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

/**
 * Created by jangitlau on 2017/5/25.
 */


public class TopicInterpreter {
    String firstLayer="programc";
    int cursor=0;
    int size=0;

    ArrayList<TopicNode> topicList=new ArrayList<TopicNode>();

    public TopicInterpreter(String _Xml){
        try{
            DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = builderFactory.newDocumentBuilder();
            StringReader stringReader = new StringReader(_Xml);
            InputSource inputSource = new InputSource(stringReader);
            Document document = builder.parse(inputSource);
            Element rootNode=document.getDocumentElement();
            if(this.firstLayer.toLowerCase()==rootNode.getNodeName().toLowerCase().toString()){
                this.size=0;
                System.out.println("debug:"+rootNode.getNodeName().toLowerCase()+this.firstLayer);
                return;
            }
            NodeList topicNodeList=rootNode.getElementsByTagName("topic");
            for(int count=0;count<topicNodeList.getLength();count++){
                topicList.add(new TopicNode(topicNodeList.item(count)));
            }
            this.size = topicList.size();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public Object getNextTopic() {
        if (cursor + 1 >= 0) {
            cursor--;
            return topicList.get(cursor);
        } else {
            return null;
        }
    }

    public Object getPrevTopic() {
        if (cursor - 1 >= 0) {
            cursor--;
            return topicList.get(cursor);
        } else {
            return null;
        }
    }

    public Object getTopic(int _Index) {
        if (_Index >= 0 && _Index < getSize()) {
            return topicList.get(cursor);
        } else {
            return null;
        }
    }

    public void setCursor(int _Cursor){
        this.cursor = _Cursor;
    }

    public int getSize(){
        return this.size;
    }
}

package HomeWork;

public class StringRemove {
    public String removeTargetWord(String target, String message){
        int temp=message.indexOf("word");
        return message.substring(temp,message.length());

    }
}

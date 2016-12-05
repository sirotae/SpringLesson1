package lesson1.example3_factorybean;

import lesson1.common_interfaces.MessageRenderer;
import lesson1.common_classes.StandardOutMessageRenderer;
import lesson1.common_more_classes.ChineseMessageProvider;
import lesson1.common_more_classes.EnglishMessageProvider;
import org.springframework.beans.factory.FactoryBean;


public class MessageRendererFactoryBean implements FactoryBean<MessageRenderer> {

    private String language; //CH, EN

    @Override
    public MessageRenderer getObject() throws Exception {
        MessageRenderer messageRenderer = new StandardOutMessageRenderer();
        switch(language) {
            case "EN": messageRenderer.setMessageProvider(new EnglishMessageProvider());
                break;
            case "CH": messageRenderer.setMessageProvider(new ChineseMessageProvider());
                break;
        }
        return messageRenderer;
    }

    @Override
    public Class<MessageRenderer> getObjectType() {
        return MessageRenderer.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}

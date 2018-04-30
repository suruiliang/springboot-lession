package com.yuqiyu.core;

import com.yuqiyu.entity.MailEntity;
import com.yuqiyu.enums.MailContentTypeEnum;
import com.yuqiyu.utils.PropertiesUtil;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeUtility;
import java.util.List;
import java.util.Properties;

/**
 * Created by Administrator on 2018/4/15/015.
 */
public class MailSender {
    private static MailEntity mail = new MailEntity();

    public MailSender title(String title) {
        mail.setTitle(title);
        return this;
    }

    public MailSender content(String content) {
        mail.setContent(content);
        return this;
    }

    public MailSender contentType(MailContentTypeEnum typeEnum) {
        mail.setContentType(typeEnum.getValue());
        return this;
    }

    public MailSender targets(List<String> targets) {
        mail.setList(targets);
        return this;
    }

    public void send() throws Exception {
        if (mail.getContentType() == null)
            mail.setContentType(MailContentTypeEnum.HTML.getValue());

        if (mail.getTitle() == null || mail.getTitle().trim().length() == 0) {
            throw new Exception("邮件标题没有设置.调用title方法设置");
        }

        if (mail.getContent() == null || mail.getContent().trim().length() == 0) {
            throw new Exception("邮件内容没有设置.调用content方法设置");
        }

        if (mail.getList().size() == 0) {
            throw new Exception("没有接受者邮箱地址.调用targets方法设置");
        }

        final PropertiesUtil properties = new PropertiesUtil("mail");
        final Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.host", properties.getValue("mail.smtp.service"));
        props.put("mail.smtp.port", properties.getValue("mail.smtp.prot"));
        props.put("mail.user", properties.getValue("mail.from.address"));
        props.put("mail.password", properties.getValue("mail.from.smtp.pwd"));

        Authenticator authenticator = new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                String userName = props.getProperty("mail.user");
                String password = props.getProperty("mail.password");
                return new PasswordAuthentication(userName, password);
            }
        };
        Session mailSession = Session.getInstance(props, authenticator);
        MimeMessage message = new MimeMessage(mailSession);
        String nickName = MimeUtility.encodeText(properties.getValue("mail.from.nickname"));
        InternetAddress form = new InternetAddress(nickName + " <" + props.getProperty("mail.user") + ">");
        message.setFrom(form);

        message.setSubject(mail.getTitle());
        if (mail.getContentType().equals(MailContentTypeEnum.HTML.getValue())) {
            message.setContent(mail.getContent(), mail.getContentType());
        } else if (mail.getContentType().equals(MailContentTypeEnum.TEXT.getValue())) {
            message.setText(mail.getContent());
        }
        List<String> targets = mail.getList();
        for (int i = 0; i < targets.size(); i++) {
            try {
                InternetAddress to = new InternetAddress(targets.get(i));
                message.setRecipient(Message.RecipientType.TO, to);
                Transport.send(message);
            } catch (Exception e) {
                continue;
            }

        }
    }
}

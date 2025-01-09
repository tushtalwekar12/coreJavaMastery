package section_16_oops3_abstract_class;

abstract class MailSender {
    abstract void composeMail(String mail , String sendTo , String SentFrom);
    abstract boolean sendMail(String mail);
    abstract void receivedMail();
}
class GmailSender extends MailSender{
    void composeMail(String mail , String sendTo , String SentFrom){
        System.out.println("SendTo :" + sendTo);
        System.out.println("Mail :" + mail);
        System.out.println("SentFrom :" + SentFrom);
    }
    boolean sendMail(String mail){
        System.out.println("Gmail Service");
        System.out.println("Sent email" + mail);
        return true;
    }
    void receivedMail(){
        System.out.println("Received Mail");

    }
}
class YahooMailSender extends MailSender{
    void composeMail(String mail, String sendTo, String sentFrom){
        System.out.println("Yahoo Mail Service");
        System.out.println("Yahoo mail composing");
        System.out.println("SendTo :" + sendTo);
        System.out.println("Mail :" + mail);
        System.out.println("SentFrom :" +sentFrom);
    }
    boolean sendMail(String mail){
        System.out.println("Yahoo Mail Service");
        System.out.println("Mail Send :"+ mail);
        return true;
    }
    void receivedMail(){
        System.out.println("yahoo Mail Service ");
        System.out.println("Mail received");

    }
}
public class Example3 {
    public static  void main(String [] args){
        GmailSender gmailSender = new GmailSender();
        YahooMailSender yahooMailSender = new YahooMailSender();

        MailSender mailSender = new GmailSender();
        mailSender.sendMail("tushtalwelar@gmail.com");

        mailSender.receivedMail();

        MailSender mailSender1 = new YahooMailSender();
        mailSender1.sendMail("pranaysir@gmail.com");
        mailSender1.receivedMail();
    }

}

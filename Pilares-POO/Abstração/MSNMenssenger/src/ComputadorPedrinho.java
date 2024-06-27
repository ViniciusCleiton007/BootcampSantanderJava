public class ComputadorPedrinho {
    public static void main(String[] args) {

        System.out.println("MSN");
        MSNMenssenger msn = new MSNMenssenger();
        msn.enviarMensagem();
        msn.receberMensagem();

        System.out.println("FACE");
        FacebookMenssenger face = new FacebookMenssenger();
        face.enviarMensagem();
        face.receberMensagem();

        System.out.println("Telegram");
        Telegram tele = new Telegram();
        tele.enviarMensagem();
        tele.receberMensagem();
    }
}

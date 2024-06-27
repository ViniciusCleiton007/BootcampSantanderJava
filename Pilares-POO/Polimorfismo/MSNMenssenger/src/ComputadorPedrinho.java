import Apps.FacebookMenssenger;
import Apps.MSNMenssenger;
import Apps.ServicoMensagemInstantanea;
import Apps.Telegram;

public class ComputadorPedrinho {
    public static void main(String[] args) {

        ServicoMensagemInstantanea smi = null;

        String appEscolhido = "tlg";

        if (appEscolhido.equals("msn"))
            smi = new MSNMenssenger();
        else if (appEscolhido.equals("fbm"))
            smi = new FacebookMenssenger();
        else if (appEscolhido.equals("tlg"))
            smi = new Telegram();

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
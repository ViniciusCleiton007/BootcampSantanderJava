
package Apps;

public class FacebookMenssenger extends ServicoMensagemInstantanea {
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Facebook Menssenger");
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Facebook Menssenger");
    }

}

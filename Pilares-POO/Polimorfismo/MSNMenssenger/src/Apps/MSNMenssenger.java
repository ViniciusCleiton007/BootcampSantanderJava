
package Apps;

public class MSNMenssenger extends ServicoMensagemInstantanea {
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo MSN Menssenger");
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo MSN Menssenger");
    }

}

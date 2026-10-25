import java.util.Scanner;

public class RecebeValores {
    private String nomeCliente; // Recebe o nome do cliente
    private float distanciaEntrega; // Recebe o dado de distancia da entrega (Já processado)
    private int idCombo; // Revcebe o Id do combo do lanche.
    private boolean estaChovendo; // Recebe a informação de se esta chovendo.

    public String getNomeCliente() {
        return nomeCliente;
    }

    public float getDistanciaEntrega() {
        return distanciaEntrega;
    }

    public int getIdCombo() {
        return idCombo;
    }

    public boolean getEstaChovendo() {
        return estaChovendo;
    }

    private void setNome(Scanner sc) {
        boolean condicaoSaida = false;
        while (!condicaoSaida) {
            try {
                System.out.println("Digite o nome do cliente:");
                String nomeTemporario = sc.nextLine();
                boolean nomeValido = validaNome(nomeTemporario);
                if (nomeValido == true) {
                    nomeTemporario = trataNome(nomeTemporario);
                    this.nomeCliente = nomeTemporario;
                    condicaoSaida = true;
                } else {
                    System.out.println("Tente novamente.\n");
                    continue;
                }
            } catch (Exception e) {
                System.out.println("Nome invalido, digite apenas letras\n");
            }
        }
    }

    // Validação se o nome contem espaços vazios, ou numeros.
    private boolean validaNome(String nomeTemporario) {
        // valida se o nome está vazio, com trim, ele retira os espaços em branco.
        if (nomeTemporario.trim().isEmpty()) { 
            System.out.println("Nome não pode ser vazio.");
            return false;
        } else if (nomeTemporario.matches(".*\\d.*")) { // valida se o nome tem numeros, se tiver retorna false.
            System.out.println("Nome não pode conter números.");
            return false;
        } else {
            return true;
        }
    }

    private String trataNome(String nomeTemporario) {
        nomeTemporario = nomeTemporario.trim().toLowerCase();
        return nomeTemporario;
    }

    public void coletaValores() {
        Scanner sc = new Scanner(System.in);
        this.setNome(sc); // Recebe o nome
        sc.close();
    }
}

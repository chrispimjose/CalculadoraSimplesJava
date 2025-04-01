import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        // Entrada de dados usando JOptionPane
        String num1Str = JOptionPane.showInputDialog("Digite o primeiro número:");
        String num2Str = JOptionPane.showInputDialog("Digite o segundo número:");
        String operacao = JOptionPane.showInputDialog("Escolha a operação:\n1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão\n5 - Verificar se é par");

        // Conversão das entradas para números
        double num1 = Double.parseDouble(num1Str);
        double num2 = Double.parseDouble(num2Str);
        double resultado = 0;
        boolean ehPar = false;
        String mensagem = "";

        // Usando if para validar divisão por zero
        if (operacao.equals("4") && num2 == 0) {
            JOptionPane.showMessageDialog(null, "Erro: Divisão por zero não permitida!");
        } else {
            // Usando switch para as operações
            switch (operacao) {
                case "1": // Soma
                    resultado = num1 + num2;
                    mensagem = num1 + " + " + num2 + " = " + resultado;
                    break;
                    
                case "2": // Subtração
                    resultado = num1 - num2;
                    mensagem = num1 + " - " + num2 + " = " + resultado;
                    break;
                    
                case "3": // Multiplicação
                    resultado = num1 * num2;
                    mensagem = num1 + " * " + num2 + " = " + resultado;
                    break;
                    
                case "4": // Divisão
                    resultado = num1 / num2;
                    mensagem = num1 + " / " + num2 + " = " + resultado;
                    break;
                    
                case "5": // Verifica se o primeiro número é par usando operador booleano
                    ehPar = (num1 % 2 == 0);
                    if (ehPar) {
                        mensagem = num1 + " é par";
                    } else {
                        mensagem = num1 + " é ímpar";
                    }
                    break;
                    
                default:
                    mensagem = "Operação inválida!";
                    break;
            }
            
            // Exibe o resultado
            JOptionPane.showMessageDialog(null, mensagem);
        }
    }
}

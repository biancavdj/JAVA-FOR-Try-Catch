import java.util.Scanner;

public class App{

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        double tempAlta = 0; 
        int diaTempAlta = 0;
        String horaTempAlta = null, cidadeTempAlta = null, sensacaoTermicaTempAlta = null;
        String chuvaTempAlta = null; // Se choveu no dia com a maior temperatura

        String relatorioChuvas = "";

        for (int dia = 1; dia <= 30; dia++)
    
            try {
                System.out.println("Dia: " + dia);
                System.out.print("Temperatura: ");
                double temperatura = ler.nextDouble();
                ler.nextLine(); // Limpa o buffer

                System.out.print("Horário (HH:mm): ");
                String horario = ler.nextLine();

                System.out.print("Cidade: ");
                String cidade = ler.nextLine();

                System.out.print("Sensação térmica: ");
                String sensacaoTermica = ler.nextLine();

                System.out.print("Houve chuvas? (sim/não): ");
                String chuva = ler.nextLine();

                // Verifica se a temperatura atual é a maior
                if (temperatura > tempAlta) {
                    tempAlta = temperatura;
                    diaTempAlta = dia;
                    horaTempAlta = horario;
                    cidadeTempAlta = cidade;
                    sensacaoTermicaTempAlta = sensacaoTermica;
                    chuvaTempAlta = chuva; // Armazena se choveu nesse dia
                }
                
                if (chuva.equalsIgnoreCase("sim")) {
                    relatorioChuvas += "Dia " + dia + ", sensação térmica: " + sensacaoTermica + "\n";
                }
            

            } catch (Exception e) {
                System.out.println("Entrada inválida. Tente novamente.");
                ler.nextLine(); // Limpa o buffer para corrigir possíveis erros
            }

            System.out.println("\nResumo do mês de abril:\n");
            System.out.println("O dia com a temperatura mais alta foi o dia " + diaTempAlta + ", com " + tempAlta + "°C.");
            System.out.println("A temperatura mais alta ocorreu às " + horaTempAlta + " na cidade de " + cidadeTempAlta + ".");
            System.out.println("A sensação térmica nesse horário foi " + sensacaoTermicaTempAlta + ".");
            System.out.println("Houve chuva nesse dia? True = sim | False = não : " + (chuvaTempAlta.equalsIgnoreCase("sim")));
    
    
    
            if (relatorioChuvas != "") {
                System.out.println("\nRelatório de dias com chuva no mês de abril:");
                System.out.println(relatorioChuvas);
            } else {
                System.out.println("\nNão houve chuva durante o mês de abril.");
            }

            ler.close();

        }

}



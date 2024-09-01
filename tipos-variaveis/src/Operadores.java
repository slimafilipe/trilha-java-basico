public class Operadores {
    public static void main(String[] args) {
        int a, b;
        String nomeUm = "FILIPE";
        String nomeDois = new String("FILIPE");

        System.out.println(nomeUm.equals(nomeDois));
        //Operadores ternnários
        System.out.println("------------Operadores Ternários---------------");
        a = 5;
        b = 6;
        String resultado = a == b ? "Verdadeiro" : "falso";
        System.out.println(resultado);

        //Operadores Relacionais
        System.out.println("-------------Operadores Relacionais-----------");
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        System.out.println("NumeroUm é igual a numeroDois? " + simNao);
        simNao = numero1 != numero2;
        System.out.println("numeroUm é difente de numeroDois? " + simNao);


        //Operadores lógicos
        System.out.println("------------Operadores Lógicos-----------");
        boolean condicao1 = true;
        boolean condicao2 = false;
        if(condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras");
        }
        if(condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeira");
        }

    }    
}

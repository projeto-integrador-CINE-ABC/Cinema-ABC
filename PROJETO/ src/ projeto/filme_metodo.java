private static void filmes() {
       Scanner input = new Scanner(System.in);
        //variavel de tentativa
        int t = 0;
        //variavel que vai dar o rumo a escolha do filme
        int filme = 0;
        //variavel de saida que esta atrelada ao while
        String opcao;
        //variavel que vai controlar o if e suas respectivas condiçoes
        boolean tentativa = true;

        do {//loop de saida
            do {//loop das escolhas de filme
                System.out.println("-------------------------------------------------");
                System.out.println("escolha o filme abaixo\n"
                        + "a partir das opçoes aseguir :\n"
                        + "-------------------------------------------------\n"
                        + "(1) Dora Aventureira     \n"
                        + "(2) O Morto Não Falan    \n"
                        + "(3) A Odiseia Dos Tolos  \n"
                        + "-------------------------------------------------\n");
                filme = input.nextInt();

               //opçoes de filme
                System.out.println();
                switch (filme) {
                    case 1:
                        System.out.println("-------------------------------------------------");
                        System.out.println(" Voce escolhel o filme 1 ");
                        System.out.println(" (1) Dora Aventureira  ");
                        System.out.println("-------------------------------------------------");
                        break;
                    case 2:
                        System.out.println("-------------------------------------------------");
                        System.out.println(" Voce escolhel o filme 2 ");
                        System.out.println(" (2) O Morto Não Falan ");
                        System.out.println("-------------------------------------------------");
                        break;
                    case 3:
                        System.out.println("-------------------------------------------------");
                        System.out.println(" Voce escolhel o filme 3 ");
                        System.out.println(" (1) A Odiseia Dos Tolos ");
                        System.out.println("-------------------------------------------------");
                        break;
                    default:
                        System.out.println("-------------------------------------------------");
                        System.out.println(" Filme invalido! ");
                        System.out.println(" Porfavor tente novamente 1");
                        System.out.println("-------------------------------------------------");
                        t++;
                }

                break;

            } while (filme != 1 || filme != 2 || filme != 3);

            if (t == 3) {
                System.out.println("-------------------------------------------------");              
                System.out.println("seu numero de tentativas acabaram");
                System.out.println("-------------------------------------------------");
                break;
            }

            input.nextLine();
            System.out.println("-------------------------------------------------");
            System.out.print("Deseja continuar : [s] - sim [n] - não\n");
            System.out.println("-------------------------------------------------");
            opcao = input.nextLine();

        } while (opcao.equalsIgnoreCase("s"));
    }

 private static void filmes() {
        Scanner input = new Scanner(System.in);
        //variavel de tentativa
        int t = 0;
        //variavel que vai dar o rumo a escolha do filme
        int filme = 0;
        //variavel de saida que esta atrelada ao while
        String opcao;
        //variavel que  vai contar os filmes escolhidos
        int cont_filme1, cont_filme2, cont_filme3;
        //inicializando variavel dos cont
        cont_filme1 = cont_filme2 = cont_filme3 = 0;

        do {//loop de saida
            do {//loop das escolhas de filme
                System.out.println("-------------------------------------------------");
                System.out.println("ESCOLHA O FILME ABAIXO:\n"
                        + "A partir das opções aseguir :\n"
                        + "-------------------------------------------------\n"
                        + "(1) Dora Aventureira.    \n"
                        + "(2) O Morto não Fala.    \n"
                        + "(3) A Odiseia dos Tolos.  \n"
                        + "-------------------------------------------------\n");
                filme = input.nextInt();

                //opçoes de filme
                System.out.println();
                switch (filme) {
                    case 1:
                        System.out.println("-------------------------------------------------");
                        System.out.println(" Você escolheu o filme 1. ");
                        System.out.println(" (1) Dora Aventureira.  ");
                        System.out.println("-------------------------------------------------");
                        cont_filme1++;
                        break;
                    case 2:
                        System.out.println("-------------------------------------------------");
                        System.out.println(" Você escolheu o filme 2. ");
                        System.out.println(" (2) O Morto Não Fala. ");
                        System.out.println("-------------------------------------------------");
                        cont_filme2++;
                        break;
                    case 3:
                        System.out.println("-------------------------------------------------");
                        System.out.println(" Você escolheu o filme 3. ");
                        System.out.println(" (1) A Odiseia Dos Tolos. ");
                        System.out.println("-------------------------------------------------");
                        cont_filme3++;
                        break;

                    default:
                        System.out.println("-------------------------------------------------");
                        System.out.println(" Filme inválido! ");
                        System.out.println(" Por favor tente novamente 1");
                        System.out.println("-------------------------------------------------");
                        t++;
                }

                break;

            } while (filme != 1 || filme != 2 || filme != 3);
            System.out.println("-------------------------------------------------");
            System.out.println("Total de Filmes Escolidos\n");
            System.out.println(" O Publico de Dora Aventureira foi :  " + cont_filme1);
            System.out.println(" O Publico de O Morto Não Fala foi :  " + cont_filme2);
            System.out.println(" O Publico de A Odiseia Dos Tolos  :  " + cont_filme3);

            System.out.println("-------------------------------------------------");
            if (t == 3) {
                System.out.println("-------------------------------------------------");
                System.out.println("Seu número de tentativas acabaram");
                System.out.println("-------------------------------------------------");
                break;
            }

            input.nextLine();
            System.out.println("-------------------------------------------------");
            System.out.print("Deseja continuar : [s] - Sim [n] - Não\n");
            System.out.println("-------------------------------------------------");
            opcao = input.nextLine();

        } while (opcao.equalsIgnoreCase("s"));
        System.out.println("-------------------------------------------------");
        System.out.println(" O Total de Filmes Asistidos foi de : " + (cont_filme1 + cont_filme2 + cont_filme3));
        System.out.println("-------------------------------------------------");
    }

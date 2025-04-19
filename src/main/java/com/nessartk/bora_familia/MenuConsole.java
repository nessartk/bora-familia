package com.nessartk.bora_familia;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuConsole {


    List<Usuario> usuarios= new ArrayList<>();
    List<Evento> eventos = new ArrayList<>();


    private final Scanner sc = new Scanner(System.in);


    public void iniciar(){
        int opcao;

        do{
            exibirMenu();
            opcao= sc.nextInt();

            switch (opcao){
                case 1 -> cadastrarUsuario();
                case 2 -> cadastrarEvento();
                case 3 -> listarUsuarios();
                case 4 -> listarEventos();
                case 5 -> System.out.println("Encerrando o programa");
                default -> System.out.println("Opção inválida");
            }

        } while(opcao !=5);
    }
    public void exibirMenu(){
        System.out.println("\n===== Menu Bora Família =====");
        System.out.println("Escolha uma opção: ");
        System.out.println("1. Cadastrar Usuário");
        System.out.println("2. Cadastrar Evento");
        System.out.println("3. Listar Usuários");
        System.out.println("4. Listar Eventos");
        System.out.println("5. Sair");

    }

    private void cadastrarUsuario(){
        System.out.println("Nome: ");
        String nome = sc.nextLine();
      //  System.out.println("Membro da família");
      //  String membro = sc.nextLine();
        System.out.println("Email: ");
        String email= sc.nextLine();
        System.out.println("Perosnalize seu usuário");
        String imagem= sc.nextLine();

        Usuario usuario = new Usuario();
        usuario.setNome(nome);
       // usuario.setMembrolDaFamilia(membro); // enum
        usuario.setEmail(email);
        usuario.setImage(imagem);

        usuarios.add(usuario);

        System.out.println("Usuário cadastrado com sucesso!");
    }

    private void cadastrarEvento() {
        System.out.println("Título: ");
        String titulo = sc.nextLine();
        System.out.println("Descrição: ");
        String descricao = sc.nextLine();
        System.out.println("Data e hora início (yyyy-MM-ddTHH:mm): ");
        LocalDateTime horaInicio = LocalDateTime.parse(sc.nextLine());
        System.out.println("Data e hora término (yyyy-MM-ddTHH:mm): ");
        LocalDateTime horaFim = LocalDateTime.parse(sc.nextLine());
        System.out.println("Localizacao:");
        String local = sc.nextLine();
        System.out.println("Tipo de Evento: ");
        String tipo = sc.nextLine();
        System.out.println("Evento criado por:");
        String usuario = sc.nextLine();
        System.out.println("cor para destacar o evento: ");
        String cor = sc.nextLine();

        Usuario usuarioResponsavel = usuarios.get(usuarios.indexOf(usuario));

        Evento evento = new Evento();
        evento.setTitulo(titulo);
        evento.setDescricao(descricao);
        evento.setDataHorarioInicio(horaInicio);
        evento.setDataHorarioTermino(horaFim);
        evento.setLocalizacao(local);
        //evento.setTipo(TipoEvento tipo);
        evento.setResponsavel(usuarioResponsavel);
        evento.setCor(cor);

        eventos.add(evento);
        System.out.println("Evento Cadastrado!");

    }
        private void listarUsuarios(){
            if(usuarios.isEmpty()){
                System.out.println("Nenhum usuário cadastrado!");
            }else{
                System.out.println("\n--- Usuários ---");
                for( Usuario u: usuarios){
                    System.out.println(", Nome: " + u.getNome());
                }
            }
        }

        private void listarEventos(){
        if(eventos.isEmpty()){
            System.out.println("Nenhum evento cadastrado!");
        }else{
            System.out.println("\n--- Eventos ---");
            for(Evento e: eventos){
                System.out.println("Título: " + e.getTitulo() +
                        ", Descrição: " + e.getDescricao() +
                        ", Início: " + e.getDataHorarioInicio() +
                        ", Fim: " + e.getDataHorarioTermino()   +
                        ", Local: " + e.getLocalizacao() +
                        ", cor: " + e.getCor() +
                        ", Responsável: " + e.getResponsavel().getNome());

            }
        }
        }

    }







import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        String usuario, contrasena;
        int opcion, opcion2, opcion3;
        int num = 10;
        Scanner sc = new Scanner(System.in);
        System.out.println("El nombre de usuario es:");
        System.out.println("pokemon");
        System.out.println("La contraseña es: ");
        System.out.println("pikachu");
        System.out.println("=============================");
        System.out.println("Bienvendio usuario");
        do {
            System.out.println("=============================");
            System.out.println("Por favor ingrese sus datos");
            System.out.println("=============================");
            System.out.println("Ingrese el nombre de susario: ");
            usuario = sc.nextLine();
            System.out.println("ingrese su contrasena: ");
            contrasena = sc.nextLine();

            if (usuario.equals("pokemon") && contrasena.equals("pikachu")) {
                System.out.println("bienvendio usuario " + usuario + " al inicio de sesion.");
                num = num - 10;
            }
            System.out.println("Error de sesion, ingrese su cuenta nuevamente.");
        } while (num != 0);
        System.out.println("==========================================================================");
        System.out.println("Tenemos una lista de Pokemones con sus caracteristicas en los que estan: ");
        System.out.println("=============================");
        System.out.println("Bulbasaur fase 1 (opcion1) ");
        System.out.println("=============================");
        System.out.println("ivysaur fase 2 (opcion2) ");
        System.out.println("=============================");
        System.out.println("venusaur fase 3 (opcion3) ");
        System.out.println("=============================");
        System.out.println("charmander fase 1 (opcion4) ");
        System.out.println("=============================");
        System.out.println("charmeleon fase 2 (opcion5) ");
        System.out.println("=============================");
        System.out.println("charizard fase 3 (opcion6) ");
        System.out.println("=============================");
        System.out.println("squirtle fase 1 (opcion7) ");
        System.out.println("=============================");
        System.out.println("wartortle fase 2(opcion8) ");
        System.out.println("=============================");
        System.out.println("blastoise fase 3 (opcion9) ");
        System.out.println("=============================");
        System.out.println("caterpie fase 1 (opcion10) ");
        System.out.println("=============================");
        System.out.println("metapod fase 2 (opcion11) ");
        System.out.println("=============================");
        System.out.println("blutterfree fase 3 (opcion12) ");
        System.out.println("=============================");
        opcion = sc.nextInt();
        System.out.println("=============================");

        switch (opcion) {
            case 1:
                System.out.println("Elegiste a bulbasaur fase 1 ");
                System.out.println("Este Pokémon nace con una semilla en el lomo, que brota con el paso del tiempo.");
                System.out.println("=============================");
                System.out.println("ALTURA: ");
                System.out.println("0,7 m ");
                System.out.println("=============================");
                System.out.println("CATEGORIA: ");
                System.out.println("semilla");
                System.out.println("=============================");
                System.out.println("PESO: ");
                System.out.println("6,4 kg");
                System.out.println("=============================");
                System.out.println("HABILIDAD: ");
                System.out.println("espesura (Potencia sus movimientos de tipo Planta cuando le quedan pocos PS.)");
                System.out.println("=============================");
                System.out.println("TIPO: ");
                System.out.println("planta Y veneno ");
                System.out.println("=============================");
                System.out.println("DEVILIDADES: ");
                System.out.println("fuego, psiquico, volador y hielo: ");
                System.out.println("=============================");
                System.out.println("ESTADISTICAS: ");
                System.out.println("PS ");
                System.out.println("3 ");
                System.out.println("=============================");
                System.out.println("ATAQUE: ");
                System.out.println("3 ");
                System.out.println("=============================");
                System.out.println("DEFENSA: ");
                System.out.println("3 ");
                System.out.println("=============================");
                System.out.println("ATAQUE ESPECIAL: ");
                System.out.println("4 ");
                System.out.println("=============================");
                System.out.println("DEFENSA ESPECIAL: ");
                System.out.println("4 ");
                System.out.println("=============================");
                System.out.println("VELOCIDAD: ");
                System.out.println("3 ");
                break;

            case 2:
                System.out.println("Elegiste a ivysaur fase 2 ");
                System.out.println(
                        "cuando le crece bastante el bulbo del lomo, pierde la capacidad de erguirse sobre las patas traseras.");
                System.out.println("=============================");
                System.out.println("ALTURA: ");
                System.out.println("1,0 m ");
                System.out.println("=============================");
                System.out.println("CATEGORIA: ");
                System.out.println("semilla");
                System.out.println("=============================");
                System.out.println("PESO: ");
                System.out.println("13,0 kg");
                System.out.println("=============================");
                System.out.println("HABILIDAD: ");
                System.out.println("espesura (Potencia sus movimientos de tipo Planta cuando le quedan pocos PS.)");
                System.out.println("=============================");
                System.out.println("TIPO: ");
                System.out.println("planta Y veneno ");
                System.out.println("=============================");
                System.out.println("DEVILIDADES: ");
                System.out.println("fuego, psiquico, volador y hielo: ");
                System.out.println("=============================");
                System.out.println("ESTADISTICAS: ");
                System.out.println("PS ");
                System.out.println("4 ");
                System.out.println("=============================");
                System.out.println("ATAQUE: ");
                System.out.println("4 ");
                System.out.println("=============================");
                System.out.println("DEFENSA: ");
                System.out.println("4 ");
                System.out.println("=============================");
                System.out.println("ATAQUE ESPECIAL: ");
                System.out.println("5 ");
                System.out.println("=============================");
                System.out.println("DEFENSA ESPECIAL: ");
                System.out.println("5 ");
                System.out.println("=============================");
                System.out.println("VELOCIDAD: ");
                System.out.println("4 ");

                break;

            case 3:
                System.out.println("Elegiste a ivysaur fase 3");
                System.out.println(
                        "La planta florece cuando absorbe energía solar, lo cual le obliga a buscar siempre la luz del sol.");
                System.out.println("=============================");
                System.out.println("ALTURA: ");
                System.out.println("2,0 m ");
                System.out.println("=============================");
                System.out.println("CATEGORIA: ");
                System.out.println("semilla");
                System.out.println("=============================");
                System.out.println("PESO: ");
                System.out.println("100,0 kg");
                System.out.println("=============================");
                System.out.println("HABILIDAD: ");
                System.out.println("espesura (Potencia sus movimientos de tipo Planta cuando le quedan pocos PS.)");
                System.out.println("=============================");
                System.out.println("TIPO: ");
                System.out.println("planta Y veneno ");
                System.out.println("=============================");
                System.out.println("DEVILIDADES: ");
                System.out.println("fuego, psiquico, volador y hielo: ");
                System.out.println("=============================");
                System.out.println("ESTADISTICAS: ");
                System.out.println("PS ");
                System.out.println("5 ");
                System.out.println("=============================");
                System.out.println("ATAQUE: ");
                System.out.println("5 ");
                System.out.println("=============================");
                System.out.println("DEFENSA: ");
                System.out.println("5 ");
                System.out.println("=============================");
                System.out.println("ATAQUE ESPECIAL: ");
                System.out.println("6 ");
                System.out.println("=============================");
                System.out.println("DEFENSA ESPECIAL: ");
                System.out.println("6 ");
                System.out.println("=============================");
                System.out.println("VELOCIDAD: ");
                System.out.println("5 ");
                break;

            case 4:
                System.out.println("Elegiste a charmander fase 1");
                System.out.println(
                        "Prefiere las cosas calientes. Dicen que cuando llueve le sale vapor de la punta de la cola.");
                System.out.println("=============================");
                System.out.println("ALTURA: ");
                System.out.println("0,6 m ");
                System.out.println("=============================");
                System.out.println("CATEGORIA: ");
                System.out.println("lagartija");
                System.out.println("=============================");
                System.out.println("PESO: ");
                System.out.println("8.5 kg");
                System.out.println("=============================");
                System.out.println("HABILIDAD: ");
                System.out.println("mar llamas (Potencia sus movimientos de tipo Fuego cuando le quedan pocos PS)");
                System.out.println("=============================");
                System.out.println("TIPO: ");
                System.out.println("fuego");
                System.out.println("=============================");
                System.out.println("DEVILIDADES: ");
                System.out.println("agua, tierra y roca ");
                System.out.println("=============================");
                System.out.println("ESTADISTICAS: ");
                System.out.println("PS ");
                System.out.println("3 ");
                System.out.println("=============================");
                System.out.println("ATAQUE: ");
                System.out.println("4 ");
                System.out.println("=============================");
                System.out.println("DEFENSA: ");
                System.out.println("3 ");
                System.out.println("=============================");
                System.out.println("ATAQUE ESPECIAL: ");
                System.out.println("4 ");
                System.out.println("=============================");
                System.out.println("DEFENSA ESPECIAL: ");
                System.out.println("3 ");
                System.out.println("=============================");
                System.out.println("VELOCIDAD: ");
                System.out.println("4 ");
                break;

            case 5:
                System.out.println("Elegiste a chermeleon fase 2");
                System.out.println(
                        "Este Pokémon de naturaleza agresiva ataca en combate con su cola llameante y hace trizas al rival con sus afiladas garras.");
                System.out.println("=============================");
                System.out.println("ALTURA: ");
                System.out.println("1,1 m ");
                System.out.println("=============================");
                System.out.println("CATEGORIA: ");
                System.out.println("llama");
                System.out.println("=============================");
                System.out.println("PESO: ");
                System.out.println("19.0 kg");
                System.out.println("=============================");
                System.out.println("HABILIDAD: ");
                System.out.println("mar llamas (Potencia sus movimientos de tipo Fuego cuando le quedan pocos PS)");
                System.out.println("=============================");
                System.out.println("TIPO: ");
                System.out.println("fuego");
                System.out.println("=============================");
                System.out.println("DEVILIDADES: ");
                System.out.println("agua, tierra y roca ");
                System.out.println("=============================");
                System.out.println("ESTADISTICAS: ");
                System.out.println("PS ");
                System.out.println("4 ");
                System.out.println("=============================");
                System.out.println("ATAQUE: ");
                System.out.println("4 ");
                System.out.println("=============================");
                System.out.println("DEFENSA: ");
                System.out.println("4 ");
                System.out.println("=============================");
                System.out.println("ATAQUE ESPECIAL: ");
                System.out.println("5 ");
                System.out.println("=============================");
                System.out.println("DEFENSA ESPECIAL: ");
                System.out.println("4 ");
                System.out.println("=============================");
                System.out.println("VELOCIDAD: ");
                System.out.println("5 ");
                break;

            case 6:
                System.out.println("Elegiste a charizard fase 3");
                System.out.println(
                        "Escupe un fuego tan caliente que funde las rocas. Causa incendios forestales sin querer.");
                System.out.println("=============================");
                System.out.println("ALTURA: ");
                System.out.println("1,7 m ");
                System.out.println("=============================");
                System.out.println("CATEGORIA: ");
                System.out.println("llama");
                System.out.println("=============================");
                System.out.println("PESO: ");
                System.out.println("90.5 kg");
                System.out.println("=============================");
                System.out.println("HABILIDAD: ");
                System.out.println("mar llamas (Potencia sus movimientos de tipo Fuego cuando le quedan pocos PS)");
                System.out.println("=============================");
                System.out.println("TIPO: ");
                System.out.println("fuego y volador");
                System.out.println("=============================");
                System.out.println("DEVILIDADES: ");
                System.out.println("agua, tierra y roca(hace daño*4) ");
                System.out.println("=============================");
                System.out.println("ESTADISTICAS: ");
                System.out.println("PS ");
                System.out.println("5 ");
                System.out.println("=============================");
                System.out.println("ATAQUE: ");
                System.out.println("5 ");
                System.out.println("=============================");
                System.out.println("DEFENSA: ");
                System.out.println("5 ");
                System.out.println("=============================");
                System.out.println("ATAQUE ESPECIAL: ");
                System.out.println("7 ");
                System.out.println("=============================");
                System.out.println("DEFENSA ESPECIAL: ");
                System.out.println("5 ");
                System.out.println("=============================");
                System.out.println("VELOCIDAD: ");
                System.out.println("6 ");
                break;

            case 7:
                System.out.println("Elegiste a squirtle fase 1");
                System.out.println(
                        "Cuando retrae su largo cuello en el caparazón, dispara agua a una presión increíble.");
                System.out.println("=============================");
                System.out.println("ALTURA: ");
                System.out.println("0,5 m ");
                System.out.println("=============================");
                System.out.println("CATEGORIA: ");
                System.out.println("tortuguita");
                System.out.println("=============================");
                System.out.println("PESO: ");
                System.out.println("9,0 kg");
                System.out.println("=============================");
                System.out.println("HABILIDAD: ");
                System.out.println("torrente (Potencia sus movimientos de tipo Agua cuando le quedan pocos PS.)");
                System.out.println("=============================");
                System.out.println("TIPO: ");
                System.out.println("agua");
                System.out.println("=============================");
                System.out.println("DEVILIDADES: ");
                System.out.println("planta y electrico ");
                System.out.println("=============================");
                System.out.println("ESTADISTICAS: ");
                System.out.println("PS ");
                System.out.println("3 ");
                System.out.println("=============================");
                System.out.println("ATAQUE: ");
                System.out.println("3 ");
                System.out.println("=============================");
                System.out.println("DEFENSA: ");
                System.out.println("4 ");
                System.out.println("=============================");
                System.out.println("ATAQUE ESPECIAL: ");
                System.out.println("3 ");
                System.out.println("=============================");
                System.out.println("DEFENSA ESPECIAL: ");
                System.out.println("4 ");
                System.out.println("=============================");
                System.out.println("VELOCIDAD: ");
                System.out.println("3 ");
                break;

            case 8:
                System.out.println("Elegiste a wartortle fase 2");
                System.out.println(
                        "Se lo considera un símbolo de longevidad. Los ejemplares más ancianos tienen musgo sobre el caparazón.");
                System.out.println("=============================");
                System.out.println("ALTURA: ");
                System.out.println("1,0 m ");
                System.out.println("=============================");
                System.out.println("CATEGORIA: ");
                System.out.println("tortuga");
                System.out.println("=============================");
                System.out.println("PESO: ");
                System.out.println("22,5 kg");
                System.out.println("=============================");
                System.out.println("HABILIDAD: ");
                System.out.println("torrente (Potencia sus movimientos de tipo Agua cuando le quedan pocos PS.)");
                System.out.println("=============================");
                System.out.println("TIPO: ");
                System.out.println("agua");
                System.out.println("=============================");
                System.out.println("DEVILIDADES: ");
                System.out.println("planta y electrico ");
                System.out.println("=============================");
                System.out.println("ESTADISTICAS: ");
                System.out.println("PS ");
                System.out.println("4 ");
                System.out.println("=============================");
                System.out.println("ATAQUE: ");
                System.out.println("4 ");
                System.out.println("=============================");
                System.out.println("DEFENSA: ");
                System.out.println("5 ");
                System.out.println("=============================");
                System.out.println("ATAQUE ESPECIAL: ");
                System.out.println("4 ");
                System.out.println("=============================");
                System.out.println("DEFENSA ESPECIAL: ");
                System.out.println("5 ");
                System.out.println("=============================");
                System.out.println("VELOCIDAD: ");
                System.out.println("4 ");
                break;

            case 9:
                System.out.println("Elegiste a blastoise fase 3");
                System.out.println(
                        "Para acabar con su enemigo, lo aplasta con el peso de su cuerpo. En momentos de apuro, se esconde en el caparazón.");
                System.out.println("=============================");
                System.out.println("ALTURA: ");
                System.out.println("1,6 m ");
                System.out.println("=============================");
                System.out.println("CATEGORIA: ");
                System.out.println("armazon");
                System.out.println("=============================");
                System.out.println("PESO: ");
                System.out.println("85,5 kg");
                System.out.println("=============================");
                System.out.println("HABILIDAD: ");
                System.out.println("torrente (Potencia sus movimientos de tipo Agua cuando le quedan pocos PS.)");
                System.out.println("=============================");
                System.out.println("TIPO: ");
                System.out.println("agua");
                System.out.println("=============================");
                System.out.println("DEVILIDADES: ");
                System.out.println("planta y electrico ");
                System.out.println("=============================");
                System.out.println("ESTADISTICAS: ");
                System.out.println("PS ");
                System.out.println("5 ");
                System.out.println("=============================");
                System.out.println("ATAQUE: ");
                System.out.println("5 ");
                System.out.println("=============================");
                System.out.println("DEFENSA: ");
                System.out.println("6 ");
                System.out.println("=============================");
                System.out.println("ATAQUE ESPECIAL: ");
                System.out.println("5 ");
                System.out.println("=============================");
                System.out.println("DEFENSA ESPECIAL: ");
                System.out.println("7 ");
                System.out.println("=============================");
                System.out.println("VELOCIDAD: ");
                System.out.println("5 ");
                break;
            case 10:
                System.out.println("Elegiste a caterpie fase 1");
                System.out.println(
                        "Para protegerse, despide un hedor horrible por las antenas con el que repele a sus enemigos.");
                System.out.println("=============================");
                System.out.println("ALTURA: ");
                System.out.println("0,3 m ");
                System.out.println("=============================");
                System.out.println("CATEGORIA: ");
                System.out.println("gusano");
                System.out.println("=============================");
                System.out.println("PESO: ");
                System.out.println("2,9 kg");
                System.out.println("=============================");
                System.out.println("HABILIDAD: ");
                System.out.println(
                        "polvo escudo(El polvo de escamas que lo envuelve lo protege de los efectos secundarios de los ataques recibidos.)");
                System.out.println("=============================");
                System.out.println("TIPO: ");
                System.out.println("bicho");
                System.out.println("=============================");
                System.out.println("DEVILIDADES: ");
                System.out.println("fuego, volador y roca");
                System.out.println("=============================");
                System.out.println("ESTADISTICAS: ");
                System.out.println("PS ");
                System.out.println("3 ");
                System.out.println("=============================");
                System.out.println("ATAQUE: ");
                System.out.println("2 ");
                System.out.println("=============================");
                System.out.println("DEFENSA: ");
                System.out.println("3 ");
                System.out.println("=============================");
                System.out.println("ATAQUE ESPECIAL: ");
                System.out.println("2 ");
                System.out.println("=============================");
                System.out.println("DEFENSA ESPECIAL: ");
                System.out.println("2 ");
                System.out.println("=============================");
                System.out.println("VELOCIDAD: ");
                System.out.println("3 ");
                break;

            case 11:
                System.out.println("Elegiste a metapod fase 2");
                System.out.println(
                        "Como en este estado solo puede endurecer su coraza, permanece inmóvil a la espera de evolucionar.");
                System.out.println("=============================");
                System.out.println("ALTURA: ");
                System.out.println("0,7 m ");
                System.out.println("=============================");
                System.out.println("CATEGORIA: ");
                System.out.println("capullo");
                System.out.println("=============================");
                System.out.println("PESO: ");
                System.out.println("9,9 kg");
                System.out.println("=============================");
                System.out.println("HABILIDAD: ");
                System.out.println("mudar (Puede curar sus problemas de estado al mudar la piel.))");
                System.out.println("=============================");
                System.out.println("TIPO: ");
                System.out.println("bicho");
                System.out.println("=============================");
                System.out.println("DEVILIDADES: ");
                System.out.println("fuego, volador y roca");
                System.out.println("=============================");
                System.out.println("ESTADISTICAS: ");
                System.out.println("PS ");
                System.out.println("3 ");
                System.out.println("=============================");
                System.out.println("ATAQUE: ");
                System.out.println("2 ");
                System.out.println("=============================");
                System.out.println("DEFENSA: ");
                System.out.println("4 ");
                System.out.println("=============================");
                System.out.println("ATAQUE ESPECIAL: ");
                System.out.println("2 ");
                System.out.println("=============================");
                System.out.println("DEFENSA ESPECIAL: ");
                System.out.println("2 ");
                System.out.println("=============================");
                System.out.println("VELOCIDAD: ");
                System.out.println("2 ");
                break;

            case 12:
                System.out.println("Elegiste a butterfree fase 3");
                System.out.println("Aletea a gran velocidad para lanzar al aire sus escamas extremadamente tóxicas.");
                System.out.println("=============================");
                System.out.println("ALTURA: ");
                System.out.println("1,1 m ");
                System.out.println("=============================");
                System.out.println("CATEGORIA: ");
                System.out.println("mariposa");
                System.out.println("=============================");
                System.out.println("PESO: ");
                System.out.println("32,0 kg");
                System.out.println("=============================");
                System.out.println("HABILIDAD: ");
                System.out.println("ojo compuesto (Aumenta la precisión de sus movimientos.)");
                System.out.println("=============================");
                System.out.println("TIPO: ");
                System.out.println("bicho y volador");
                System.out.println("=============================");
                System.out.println("DEVILIDADES: ");
                System.out.println("fuego, volador, electrico, hielo y roca (hace daño*4)");
                System.out.println("=============================");
                System.out.println("ESTADISTICAS: ");
                System.out.println("PS ");
                System.out.println("4 ");
                System.out.println("=============================");
                System.out.println("ATAQUE: ");
                System.out.println("3 ");
                System.out.println("=============================");
                System.out.println("DEFENSA: ");
                System.out.println("3 ");
                System.out.println("=============================");
                System.out.println("ATAQUE ESPECIAL: ");
                System.out.println("6 ");
                System.out.println("=============================");
                System.out.println("DEFENSA ESPECIAL: ");
                System.out.println("5 ");
                System.out.println("=============================");
                System.out.println("VELOCIDAD: ");
                System.out.println("5 ");
                break;

        }
        System.out.println(
                "adicional tenemos preparado unos resultados para que usted se de cuenta quien ganaria en una pelea con los pokemones fase 3 estos son:");
        System.out.println("=============================");
        System.out.println("venusaur fase 3 (opcion1) ");
        System.out.println("=============================");
        System.out.println("charizard fase 3 (opcion2)");
        System.out.println("=============================");
        System.out.println("blastoise fase 3 (opcion3)");
        System.out.println("=============================");
        System.out.println("blutterfree fase 3 (opcion4)");
        System.out.println("=============================");
        System.out.println("ingrese el numero del primer peleador: ");
        opcion2 = sc.nextInt();
        System.out.println("ingrese el numero del segundo peleador: ");
        opcion3 = sc.nextInt();

        if ((opcion2 == 1) && (opcion3 == 2)) {
            var ps = (5 - 5);
            var ataque = (5 - 5);
            var defensa = (5 - 5);
            var ataque_especial = (7 - 6);
            var defensa_especial = (6 - 5);
            var velocidad = (6 - 5);
            System.out.println("en puntos de salud, quedarian empatados con: " + ps);
            System.out.println("en puntos de ataque, quedarian empatados con: " + ataque);
            System.out.println("en puntos de defensa, quedarian empatados " + defensa);
            System.out.println("en ataque especial, ganaria charizard con: " + ataque_especial);
            System.out.println("en defensa especial, ganaria venusaur con: " + defensa_especial);
            System.out.println("en velocidad, ganaria charizard con: " + velocidad);
            System.out.println("por ende el ganador es charizard, con 3 puntos");

        }

        else if ((opcion2 == 1) && (opcion3 == 3)) {
            var ps = (5 - 5);
            var ataque = (5 - 5);
            var defensa = (6 - 5);
            var ataque_especial = (6 - 5);
            var defensa_especial = (7 - 6);
            var velocidad = (5 - 5);
            System.out.println("en puntos de salud, quedarian empatados con: " + ps);
            System.out.println("en puntos de ataque, quedarian empatados con: " + ataque);
            System.out.println("en defensa, ganaria blastoise con: " + defensa);
            System.out.println("en ataque especial, ganaria blastoise con: " + ataque_especial);
            System.out.println("en defensa especial, ganaria blastoise con: " + defensa_especial);
            System.out.println("en velocidad, quedarian empatados con: " + velocidad);
            System.out.println("por ende el ganador es blastoise, con 3 puntos ");

        } else if ((opcion2 == 2) && (opcion3 == 1)) {
            var ps = (5 - 4);
            var ataque = (5 - 3);
            var defensa = (6 - 3);
            var ataque_especial = (6 - 6);
            var defensa_especial = (7 - 5);
            var velocidad = (5 - 5);
            System.out.println("en puntos de salud, ganaria venusaur con: " + ps);
            System.out.println("en puntos de ataque, ganaria venusaur con: " + ataque);
            System.out.println("en defensa, ganaria venusaur con: " + defensa);
            System.out.println("en ataque especial, quedarian empatados con: " + ataque_especial);
            System.out.println("en defensa especial, ganaria venusuar con: " + defensa_especial);
            System.out.println("en velocidad, quedarian empatados con: " + velocidad);
            System.out.println("por ende el ganador es vanusuar, con 8 puntos");

        } else if ((opcion2 == 3) && (opcion3 == 1)) {
            var ps = (5 - 5);
            var ataque = (5 - 5);
            var defensa = (6 - 5);
            var ataque_especial = (6 - 5);
            var defensa_especial = (7 - 6);
            var velocidad = (5 - 5);
            System.out.println("en puntos de salud, quedarian empatados con: " + ps);
            System.out.println("en puntos de ataque, quedarian empatados con: " + ataque);
            System.out.println("en defensa, ganaria blastoise con: " + defensa);
            System.out.println("en ataque especial, ganaria blastoise con: " + ataque_especial);
            System.out.println("en defensa especial, ganaria blastoise con: " + defensa_especial);
            System.out.println("en velocidad, quedarian empatados con: " + velocidad);
            System.out.println("por ende el ganador es blastoise, con 3 puntos ");

        } else if ((opcion2 == 2) && (opcion3 == 3)) {
            var ps = (5 - 5);
            var ataque = (5 - 5);
            var defensa = (6 - 5);
            var ataque_especial = (7 - 5);
            var defensa_especial = (7 - 5);
            var velocidad = (6 - 5);
            System.out.println("en puntos de salud, quedarian empatados con: " + ps);
            System.out.println("en puntos de ataque, quedarian empatados con: " + ataque);
            System.out.println("en defensa, ganaria blastoise con: " + defensa);
            System.out.println("en ataque especial, ganaria charizard con: " + ataque_especial);
            System.out.println("en defensa especial, ganaria blastoise con: " + defensa_especial);
            System.out.println("en velocidad, ganaria charizard con: " + velocidad);
            System.out.println("por ende quedarian empatados");

        } else if ((opcion2 == 3) && (opcion3 == 2)) {
            var ps = (5 - 5);
            var ataque = (5 - 5);
            var defensa = (6 - 5);
            var ataque_especial = (7 - 5);
            var defensa_especial = (7 - 5);
            var velocidad = (6 - 5);
            System.out.println("en puntos de salud, quedarian empatados con: " + ps);
            System.out.println("en puntos de ataque, quedarian empatados con: " + ataque);
            System.out.println("en defensa, ganaria blastoise con: " + defensa);
            System.out.println("en ataque especial, ganaria charizard con: " + ataque_especial);
            System.out.println("en defensa especial, ganaria blastoise con: " + defensa_especial);
            System.out.println("en velocidad, ganaria charizard con: " + velocidad);
            System.out.println("por ende quedarian empatados");

        } else if ((opcion2 == 2) && (opcion3 == 4)) {
            var ps = (5 - 4);
            var ataque = (5 - 3);
            var defensa = (5 - 3);
            var ataque_especial = (7 - 6);
            var defensa_especial = (5 - 5);
            var velocidad = (6 - 5);
            System.out.println("en puntos de salud, ganaria charizard con: " + ps);
            System.out.println("en puntos de ataque, ganaria charizard con: " + ataque);
            System.out.println("en defensa, ganaria charizard con: " + defensa);
            System.out.println("en ataque especial, ganaria charizard con: " + ataque_especial);
            System.out.println("en defensa especial, quedarian empatados: " + defensa_especial);
            System.out.println("en velocidad, ganaria charizard con: " + velocidad);
            System.out.println("por ende ganaria charizard con 7");

        } else if ((opcion2 == 4) && (opcion3 == 2)) {
            var ps = (5 - 4);
            var ataque = (5 - 3);
            var defensa = (5 - 3);
            var ataque_especial = (7 - 6);
            var defensa_especial = (5 - 5);
            var velocidad = (6 - 5);
            System.out.println("en puntos de salud, ganaria charizard con: " + ps);
            System.out.println("en puntos de ataque, ganaria charizard con: " + ataque);
            System.out.println("en defensa, ganaria charizard con: " + defensa);
            System.out.println("en ataque especial, ganaria charizard con: " + ataque_especial);
            System.out.println("en defensa especial, quedarian empatados: " + defensa_especial);
            System.out.println("en velocidad, ganaria charizard con: " + velocidad);
            System.out.println("por ende ganaria charizard con 7");

        } else if ((opcion2 == 3) && (opcion3 == 4)) {
            var ps = (5 - 4);
            var ataque = (5 - 3);
            var defensa = (6 - 3);
            var ataque_especial = (6 - 5);
            var defensa_especial = (7 - 5);
            var velocidad = (5 - 5);
            System.out.println("en puntos de salud, ganaria blastoise con: " + ps);
            System.out.println("en puntos de ataque, ganaria blastoise con: " + ataque);
            System.out.println("en defensa, ganaria blastoise con: " + defensa);
            System.out.println("en ataque especial, ganaria butterfree con: " + ataque_especial);
            System.out.println("en defensa especial, ganaria blastoise con: " + defensa_especial);
            System.out.println("en velocidad, quedarian empates con : " + velocidad);
            System.out.println("por ende ganaria blastoise con 8 puntos");

        } else if ((opcion2 == 4) && (opcion3 == 3)) {
            var ps = (5 - 4);
            var ataque = (5 - 3);
            var defensa = (6 - 3);
            var ataque_especial = (6 - 5);
            var defensa_especial = (7 - 5);
            var velocidad = (5 - 5);
            System.out.println("en puntos de salud, ganaria blastoise con: " + ps);
            System.out.println("en puntos de ataque, ganaria blastoise con: " + ataque);
            System.out.println("en defensa, ganaria blastoise con: " + defensa);
            System.out.println("en ataque especial, ganaria butterfree con: " + ataque_especial);
            System.out.println("en defensa especial, ganaria blastoise con: " + defensa_especial);
            System.out.println("en velocidad, quedarian empates con : " + velocidad);
            System.out.println("por ende ganaria blastoise con 8 puntos");

        } else if ((opcion2 == 1) && (opcion3 == 4)) {
            var ps = (5 - 4);
            var ataque = (5 - 3);
            var defensa = (5 - 3);
            var ataque_especial = (6 - 6);
            var defensa_especial = (6 - 5);
            var velocidad = (5 - 5);
            System.out.println("en puntos de salud, ganaria venusuar con: " + ps);
            System.out.println("en puntos de ataque, ganaria venusaur con: " + ataque);
            System.out.println("en defensa, ganaria venusaur con: " + defensa);
            System.out.println("en ataque especial, quedarian empatados con: " + ataque_especial);
            System.out.println("en defensa especial, ganaria venusuar con: " + defensa_especial);
            System.out.println("en velocidad, quedarian empatados con: " + velocidad);
            System.out.println("por ende el ganador es vanusuar, con 6 puntos");

        } else if ((opcion2 == 4) && (opcion3 == 1)) {
            var ps = (5 - 4);
            var ataque = (5 - 3);
            var defensa = (5 - 3);
            var ataque_especial = (6 - 6);
            var defensa_especial = (6 - 5);
            var velocidad = (5 - 5);
            System.out.println("en puntos de salud, ganaria venusuar con: " + ps);
            System.out.println("en puntos de ataque, ganaria venusaur con: " + ataque);
            System.out.println("en defensa, ganaria venusaur con: " + defensa);
            System.out.println("en ataque especial, quedarian empatados con: " + ataque_especial);
            System.out.println("en defensa especial, ganaria venusuar con: " + defensa_especial);
            System.out.println("en velocidad, quedarian empatados con: " + velocidad);
            System.out.println("por ende el ganador es vanusuar, con 6 puntos");

        }

    }
}

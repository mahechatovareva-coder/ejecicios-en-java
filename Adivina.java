import java.util.Scanner;

public class adivina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Personajes: Radamel Falcao Garcia, Goku, Michael Jordan, Eminem, Darth Vader, Adam Sandler, Bruce Wayne,Tin Tin, Ayudante de Santa,Joe Biden,Jose Saramago, Gunter Grass y Kim Jong Un");
        System.out.println("\nPiensa en uno de ellos y NO me digas cual es ... ");
        System.out.println("Responde solo : si / no");
        System.out.print("Presiona ENTER para empezar");
        sc.nextLine();

        System.out.print("\nP1: ¿Tu personaje existe en la vida real?");
        String r1 = sc.nextLine().toLowerCase();

        if (r1.equals("no")) {
            //FICTICIOS:Goku, Darth Vader , Bruce Wayne, Tin Tin, Ayudante de Santa
            System.out.println("P2: ¿Tu personaje es humano?");
            String r2 = sc.nextLine().toLowerCase();
            if (r2.equals("no")) {
                System.out.println("\n¡Tu personaje es Ayudante de  Santa!(el perro de los Simpson)");
            } else {
                System.out.println("P3: ¿Usa capa,mascara o traje de super heroe/villano");
                String r3 = sc.nextLine().toLowerCase();
                if (r3.contains("si")) {
                    System.out.println("P4:¿Es de Star Wars y dice 'Yo soy tu padre'?");
                    String r4 = sc.nextLine().toLowerCase();
                    if (r4.contains("si")) {
                        System.out.println("\n¡Tu personaje es Darth Vader!");
                    }
                } else {
                    System.out.println("\n¡Tu personaje es Bruce Wayne / Batman!");
                }
            }
        } else {
            System.out.println("P4: ¿Tiene cabello amarillo, es de animey lanza Kamehameha?");
            String r4 = sc.nextLine().toLowerCase();
            if (r4.contains("si")) {
                System.out.println("\n¡Tu personaje es Gocu!");
            } else {
                System.out.println("\n¡Tu personaje es Tin Tin!");
                    System.out.println("P2:¿Es deportista profesional");
                    String r2 = sc.nextLine().toLowerCase();
                    if (r2.contains("si")) {
                        System.out.println("P3:¡Su deporte es el futbol?");
                        String r3 = sc.nextLine().toLowerCase();
                        if (r3.contains("si")) {
                            System.out.println("\n¡Tu personaje es Radamel Falcao Garcia!");
                        } else {
                            System.out.println("\n¡Tu personaje es Michael Jordan");
                        }
                    } else {
                        System.out.println("P3: ¿Es canatante o actor de Hollywood (entretenimiento)");
                        String r3 = sc.nextLine().toLowerCase();
                        if (r3.contains("si")) {
                            System.out.println("P4 ¿Es rapero de Detroit, blanco y canta Lose Yourself");
                            String r5 = sc.nextLine().toLowerCase();
                            if (r4.contains("si")) {
                                System.out.println("\n ¡Tu personaje es Eminem!");
                            } else {
                                System.out.println("\n¡Tu personaje es Adan Sandler!");
                            }
                        } else {
                            System.out.println("P4: ¿Es politico o gobierna un pais?");
                            String r6 = sc.nextLine().toLowerCase();
                            if (r4.contains("si")) {
                                System.out.println("P5: ¿Gobierna Corea del Norte?");
                                String r5 = sc.nextLine().toLowerCase();
                                if (r5.contains("si")) {
                                    System.out.println("\n ¡Tu personaje es Kim Jong Un!");
                                } else {
                                    System.out.println("\n ¡Tu personaje es Joe Biden!");
                                }
                            } else {
                                System.out.println("P5 :¿Es escritor Portugues ganador de Nobel?");
                                String r7 = sc.nextLine().toLowerCase();
                                if (r7.contains("si")) {
                                    System.out.println("\n ¡Tu personaje es Jose Saramago!");
                                } else {
                                    System.out.println("\n ¡Tu personaje es Gunter Grass!");
                                }

                            }
                        }
                    }
                }
                sc.close();
            }
        }
    }

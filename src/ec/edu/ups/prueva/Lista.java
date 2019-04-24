/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.prueva;


import Controladores.ControladorAve;
import Controladores.ControladorNoVascular;
import Controladores.ControladoresPez;
import Controladores.ControladorVascular;
import ec.edu.ups.clases.Ave;
import ec.edu.ups.clases.NoVascular;
import ec.edu.ups.clases.Pez;
import ec.edu.ups.clases.Vascular;
import java.util.Scanner;

/**
 *
 * @author Amstrong
 */
public class Lista {

    public static void main(String[] args) {

        Scanner l2 = new Scanner(System.in);
        Scanner l = new Scanner(System.in);
        Scanner l3 = new Scanner(System.in);
        ControladoresPez cp = new ControladoresPez();
        ControladorAve ca = new ControladorAve();
        ControladorVascular cv = new ControladorVascular();
        ControladorNoVascular cnv = new ControladorNoVascular();
        
        int metodo = -1;
        int codigo;
        int o;
        
       
        do {
            System.out.println("1 Pez ");
            System.out.println("2 Ave");
            System.out.println("3 Vascular");
            System.out.println("4 No Vascular");
            System.out.println("5 Salir");
            o = l2.nextInt();
            switch (o) {
                case 1:
                    do {
                        System.out.println("1 Create ");
                        System.out.println("2 Reade");
                        System.out.println("3 Update");
                        System.out.println("4 Delete");
                        System.out.println("5 Regresar");
                        
                        metodo = l2.nextInt();
                        switch (metodo) {
                            case 1:

                                System.out.println("INGRESAR DATOS DEL PEZ:");
                                System.out.println("Ingresar codigo");
                                codigo = l2.nextInt();
                                System.out.println("Ingresar nombre");
                                String nombre = l.nextLine();
                                System.out.println("Ingresar los años de vida");
                                int añosVida = l2.nextInt();
                                System.out.println("Ingresar el peso");
                                double peso = l2.nextDouble();
                                System.out.println("Ingresar el tamaño");
                                double tamaño = l2.nextDouble();
                                System.out.println("Ingrese si es domestico o salvaje");
                                String domesticoSalvaje = l2.next();
                                System.out.println("Ingrese el color");
                                String color = l.nextLine();
                                System.out.println("Ingrese el tipo de alimento que consume");
                                String tipoAlimento = l.nextLine();
                                System.out.println("Ingrese si es capaz de casar (true/false)");
                                boolean capacidadCazar = l2.nextBoolean();
                                System.out.println("Ingrese a que profundidad se encuentra el pez");
                                double profundida = l2.nextDouble();
                                System.out.println("Ingrese el numero de aletas del pez");
                                int aletas = l2.nextInt();
                                System.out.println("Ingrese si es de agua dulse o salada");
                                String dulceSalada = l2.next();
                                System.out.println("Ingrese que tipo de pez es");
                                String tipo = l.nextLine();
                                Pez pez = new Pez(profundida, aletas, dulceSalada, tipo, domesticoSalvaje, color, tipoAlimento, capacidadCazar, nombre, añosVida, peso, tamaño, codigo);
                                cp.create(pez);
                                break;
                            case 2:
                                System.out.println("Ingrese el codigo del objeto a leer");
                                System.out.println(cp.read(l2.nextInt()));
                                ;
                                break;
                            case 3:
                                
                                System.out.println("Ingrese el codigo del objeto a modificar ");
                                codigo = l2.nextInt();
                                if(cp.read(codigo)!=null){
                                System.out.println("INGRESAR DATOS DEL PEZ:");
                                System.out.println("Ingresar nombre");
                                nombre = l.nextLine();
                                System.out.println("Ingresar los años de vida");
                                añosVida = l2.nextInt();
                                System.out.println("Ingresar el peso");
                                peso = l2.nextDouble();
                                System.out.println("Ingresar el tamaño");
                                tamaño = l2.nextDouble();
                                System.out.println("Ingrese si es domestico o salvaje");
                                domesticoSalvaje = l2.next();
                                System.out.println("Ingrese el color");
                                color = l.nextLine();
                                System.out.println("Ingrese el tipo de alimento que consume");
                                tipoAlimento = l.nextLine();
                                System.out.println("Ingrese si es capaz de casar (true/false)");
                                capacidadCazar = l2.nextBoolean();
                                System.out.println("Ingrese a que profundidad se encuentra el pez");
                                profundida = l2.nextDouble();
                                System.out.println("Ingrese el numero de aletas del pez");
                                aletas = l2.nextInt();
                                System.out.println("Ingrese si es de agua dulse o salada");
                                dulceSalada = l2.next();
                                System.out.println("Ingrese que tipo de pez es");
                                tipo = l.nextLine();
                                Pez pez2 = new Pez(profundida, aletas, dulceSalada, tipo, domesticoSalvaje, color, tipoAlimento, capacidadCazar, nombre, añosVida, peso, tamaño, codigo);
                                cp.update(pez2);
                                }else{
                                    System.out.println("no exixte el objeto");
                                }
                                break;
                            case 4:
                                System.out.println("Ingrese el codigo del objeto a elmiminar");
                                codigo = l2.nextInt();
                                cp.delete(codigo);
                                break;
                        }

                    } while (metodo != 5);
                    break;
                case 2:
                    do {
                        System.out.println("1 Create ");
                        System.out.println("2 Reade");
                        System.out.println("3 Update");
                        System.out.println("4 Delete");
                        System.out.println("5 Regresar");
                        metodo = l2.nextInt();
                        switch (metodo) {
                            case 1:
                                System.out.println("INGRESAR DATOS DEL AVE:");
                                System.out.println("Ingresar codigo");
                                codigo = l2.nextInt();
                                System.out.println("Ingresar nombre");
                                String nombre = l.nextLine();
                                System.out.println("Ingresar los años de vida");
                                int añosVida = l2.nextInt();
                                System.out.println("Ingresar el peso");
                                double peso = l2.nextDouble();
                                System.out.println("Ingresar el tamaño");
                                double tamaño = l2.nextDouble();
                                System.out.println("Ingrese si es domestico o salvaje");
                                String domesticoSalvaje = l2.next();
                                System.out.println("Ingrese el color");
                                String color = l.nextLine();
                                System.out.println("Ingrese el tipo de alimento que consume");
                                String tipoAlimento = l.nextLine();
                                System.out.println("Ingrese si es capaz de casar(true/false)");
                                boolean capacidadCazar = l3.nextBoolean();
                                System.out.println("Ingres si es capas de volar (true/false)");
                                boolean capacidadvolar = l2.nextBoolean();
                                System.out.println("Ingrese la maxima altura que puede volar (0 si no vuela)");
                                double maximaalturaVuelo = l2.nextDouble();
                                System.out.println("Ingresas el tamaño de las alas");
                                double tamañoAlas = l2.nextDouble();
                                System.out.println("Ingrese si es capaz de nadar (true/false)");
                                boolean capacidadNadar = l2.nextBoolean();
                                Ave ave = new Ave(codigo, maximaalturaVuelo, tamañoAlas, capacidadvolar, capacidadNadar, domesticoSalvaje, color, tipoAlimento, capacidadCazar, nombre, añosVida, peso, tamaño);
                                ca.create(ave);
                                break;
                            case 2:
                                System.out.println("Ingrese el codigo del objeto a leer");
                                System.out.println(ca.read(l2.nextInt()));
                                break;
                            case 3:
                                System.out.println("Ingresar el codigo del ave");
                                codigo = l2.nextInt();
                                if(ca.read(codigo)!=null){
                                System.out.println("INGRESAR DATOS DEL AVE:");
                                System.out.println("Ingresar nombre");
                                nombre = l.nextLine();
                                System.out.println("Ingresar los años de vida");
                                añosVida = l2.nextInt();
                                System.out.println("Ingresar el peso");
                                peso = l2.nextDouble();
                                System.out.println("Ingresar el tamaño");
                                tamaño = l2.nextDouble();
                                System.out.println("Ingrese si es domestico o salvaje");
                                domesticoSalvaje = l2.next();
                                System.out.println("Ingrese el color");
                                color = l.nextLine();
                                System.out.println("Ingrese el tipo de alimento que consume");
                                tipoAlimento = l.nextLine();
                                System.out.println("Ingrese si es capaz de casar(true/false)");
                                capacidadCazar = l3.nextBoolean();
                                System.out.println("Ingres si es capas de volar (true/false)");
                                capacidadvolar = l2.nextBoolean();
                                System.out.println("Ingrese la maxima altura que puede volar (0 si no vuela)");
                                maximaalturaVuelo = l2.nextDouble();
                                System.out.println("Ingresas el tamaño de las alas");
                                tamañoAlas = l2.nextDouble();
                                System.out.println("Ingrese si es capaz de nadar (true/false)");
                                capacidadNadar = l2.nextBoolean();
                                Ave ave2 = new Ave(codigo, maximaalturaVuelo, tamañoAlas, capacidadvolar, capacidadNadar, domesticoSalvaje, color, tipoAlimento, capacidadCazar, nombre, añosVida, peso, tamaño);
                                ca.update(ave2);
                                } else{
                                    System.err.println("el animal no exixte");
                                }
                                break;
                            case 4:
                                System.out.println("Ingrese el codigo del objeto a elmiminar");
                                codigo = l2.nextInt();
                                ca.delet(codigo);
                                break;
                        }
                    } while (metodo != 5);
                    break;
                case 3:
                    do {
                        System.out.println("1 Create ");
                        System.out.println("2 Reade");
                        System.out.println("3 Update");
                        System.out.println("4 Delete");
                        System.out.println("5 Regresar"); 
                        metodo = l2.nextInt();
                        switch (metodo) {
                            case 1:
                                System.out.println("INGRESAR DATOS DEL VEGETAL VASCULAR:");
                                System.out.println("Ingresar codigo");
                                codigo = l2.nextInt();
                                System.out.println("Ingresar nombre");
                                String nombre = l.nextLine();
                                System.out.println("Ingresar los años de vida");
                                int añosVida = l2.nextInt();
                                System.out.println("Ingresar el peso");
                                double peso = l2.nextDouble();
                                System.out.println("Ingresar el tamaño");
                                double tamaño = l2.nextDouble();
                                System.out.println("Ingrese si tiene hojas (true/false)");
                                boolean hojas = l2.nextBoolean();
                                System.out.println("Ingrese si tiene frutos (true/false)");
                                boolean frutas = l2.nextBoolean();
                                System.out.println("Ingre el uso del vegetal (comida, medicina, etc..)");
                                String usoVegetal = l.nextLine();
                                System.out.println("Ingres el lugar donde crece");
                                String lugarCrecimiento = l.nextLine();
                                System.out.println("Ingrese el tamaño aproximado de la raiz");
                                double tamañoRaiz = l2.nextDouble();
                                System.out.println("Ingrese el tamaño aproximado del tallo");
                                double tamañoTallo = l2.nextDouble();
                                System.out.println("Ingrese el tamaño aproximado de la hoja");
                                double tamañoHoja = l2.nextDouble();
                                System.out.println("Ingrese la cantidad maxiam de fruto que produce");
                                int cantidadMaximaFrutos = l2.nextInt();
                                Vascular vascular = new Vascular(codigo, tamañoRaiz, tamañoTallo, tamañoHoja, cantidadMaximaFrutos, hojas, frutas, usoVegetal, lugarCrecimiento, nombre, añosVida, peso, tamaño);
                                cv.create(vascular);
                                break;
                            case 2:
                                System.out.println("Ingrese el codigo del objeto a leer");
                                System.out.println(cv.read(l.nextInt()));
                                break;
                            case 3:
                                System.out.println("Ingresar codigo del objeto a modificar");
                                codigo = l2.nextInt();
                                if(cv.read(codigo)!=null){
                                System.out.println("INGRESAR DATOS DEL VEGETAL VASCULAR:");
                                System.out.println("Ingresar nombre");
                                nombre = l.nextLine();
                                System.out.println("Ingresar los años de vida");
                                añosVida = l2.nextInt();
                                System.out.println("Ingresar el peso");
                                peso = l2.nextDouble();
                                System.out.println("Ingresar el tamaño");
                                tamaño = l2.nextDouble();
                                System.out.println("Ingrese si tiene hojas (true/false)");
                                hojas = l2.nextBoolean();
                                System.out.println("Ingrese si tiene frutos (true/false)");
                                frutas = l2.nextBoolean();
                                System.out.println("Ingre el uso del vegetal (comida, medicina, etc..)");
                                usoVegetal = l.nextLine();
                                System.out.println("Ingres el lugar donde crece");
                                lugarCrecimiento = l.nextLine();
                                System.out.println("Ingrese el tamaño aproximado de la raiz");
                                tamañoRaiz = l2.nextDouble();
                                System.out.println("Ingrese el tamaño aproximado del tallo");
                                tamañoTallo = l2.nextDouble();
                                System.out.println("Ingrese el tamaño aproximado de la hoja");
                                tamañoHoja = l2.nextDouble();
                                System.out.println("Ingrese la cantidad maxiam de fruto que produce");
                                cantidadMaximaFrutos = l2.nextInt();
                                Vascular vascular2 = new Vascular(codigo, tamañoRaiz, tamañoTallo, tamañoHoja, cantidadMaximaFrutos, hojas, frutas, usoVegetal, lugarCrecimiento, nombre, añosVida, peso, tamaño);
                                cv.update(vascular2);
                                }else{
                                    System.err.println("la fruta no existe");
                                }
                                break;
                            case 4:
                                System.out.println("Ingrese el codigo del objeto a elmiminar");
                                codigo = l2.nextInt();
                                cv.delet(codigo);
                                break;
                            case 5:
                                cv.imprimir();
                        }
                    } while (metodo != 5);
                    break;
                case 4:
                    do {
                        System.out.println("1 Create ");
                        System.out.println("2 Reade");
                        System.out.println("3 Update");
                        System.out.println("4 Delete");
                        System.out.println("5 Regresar");
                        metodo = l2.nextInt();
                        switch (metodo) {
                            case 1:
                                System.out.println("INGRESAR DATOS DEL VEGETAL NO VASCULAR:");
                                System.out.println("Ingresar codigo");
                                codigo = l2.nextInt();
                                System.out.println("Ingresar nombre");
                                String nombre = l.nextLine();
                                System.out.println("Ingresar los años de vida");
                                int añosVida = l2.nextInt();
                                System.out.println("Ingresar el peso");
                                double peso = l2.nextDouble();
                                System.out.println("Ingresar el tamaño");
                                double tamaño = l2.nextDouble();
                                System.out.println("Ingrese si tiene hojas (true/false)");
                                boolean hojas = l2.nextBoolean();
                                System.out.println("Ingrese si tiene frutos (true/false)");
                                boolean frutas = l2.nextBoolean();
                                System.out.println("Ingre el uso del vegetal (comida, medicina, etc..)");
                                String usoVegetal = l.nextLine();
                                System.out.println("Ingres el lugar donde crece");
                                String lugarCrecimiento = l.nextLine();
                                System.out.println("Ingrese el tipo de vegetal no Vascular al que pertenece");
                                String tipo = l.nextLine();
                                System.out.println("Ingrese si tiene rizoides (true/false)");
                                boolean rizoides = l2.nextBoolean();
                                System.out.println("Ingrese si tiene escamas (true/false)");
                                boolean escamas = l2.nextBoolean();
                                System.out.println("Ingrese la cantidad de escamas");
                                double cantidadEscamas = l2.nextDouble();
                                NoVascular noVascular = new NoVascular(codigo, tipo, rizoides, escamas, hojas, frutas, usoVegetal, lugarCrecimiento, nombre, añosVida, peso, tamaño, cantidadEscamas);
                                cnv.create(noVascular);
                                break;
                            case 2:
                                System.out.println("Ingrese el codigo del objeto a leer");
                                System.out.println(cnv.read(l.nextInt()));
                                break;
                            case 3:
                                System.out.println("Ingresar codigo del objeto a modificar");
                                codigo = l2.nextInt();
                                if(cnv.read(codigo)!=null){
                                System.out.println("INGRESAR DATOS DEL VEGETAL NO VASCULAR:");
                                System.out.println("Ingresar nombre");
                                nombre = l.nextLine();
                                System.out.println("Ingresar los años de vida");
                                añosVida = l2.nextInt();
                                System.out.println("Ingresar el peso");
                                peso = l2.nextDouble();
                                System.out.println("Ingresar el tamaño");
                                tamaño = l2.nextDouble();
                                System.out.println("Ingrese si tiene hojas (true/false)");
                                hojas = l2.nextBoolean();
                                System.out.println("Ingrese si tiene frutos (true/false)");
                                frutas = l2.nextBoolean();
                                System.out.println("Ingre el uso del vegetal (comida, medicina, etc..)");
                                usoVegetal = l.nextLine();
                                System.out.println("Ingres el lugar donde crece");
                                lugarCrecimiento = l.nextLine();
                                System.out.println("Ingrese el tipo de vegetal no Vascular al que pertenece");
                                tipo = l.nextLine();
                                System.out.println("Ingrese si tiene rizoides (true/false)");
                                rizoides = l2.nextBoolean();
                                System.out.println("Ingrese si tiene escamas (true/false)");
                                escamas = l2.nextBoolean();
                                System.out.println("Ingrese la cantidad de escamas");
                                cantidadEscamas = l2.nextDouble();
                                NoVascular noVascular2 = new NoVascular(codigo, tipo, rizoides, escamas, hojas, frutas, usoVegetal, lugarCrecimiento, nombre, añosVida, peso, tamaño, cantidadEscamas);
                                cnv.update(noVascular2);
                                }else{
                                    System.err.println("el animal NoVascular no existe");
                                }
                                break;
                            case 4:
                                System.out.println("Ingrese el codigo del objeto a elmiminar");
                                codigo = l2.nextInt();
                                cnv.delet(codigo);
                                break;
                        }
                    } while (metodo != 5);
            }
        } while (o < 5);
    }
}

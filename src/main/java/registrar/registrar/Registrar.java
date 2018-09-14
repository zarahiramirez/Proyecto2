/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrar.registrar;

import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import jdk.nashorn.internal.ir.BreakNode;
import registrar.controllers.DepartamentoJpaController;
import registrar.controllers.EmpleadoJpaController;
import registrar.entities.Departamento;
import registrar.entities.Empleado;

/**
 *
 * @author Zarahi
 */
public class Registrar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("registrar_ARegistrar_jar_1.0-SNAPSHOTPU");

        EntityManager em = emf.createEntityManager();
        Scanner scanner = new Scanner(System.in);
        DepartamentoJpaController departamentoController;
        EmpleadoJpaController empleadoController;

        departamentoController = new DepartamentoJpaController(emf);
        empleadoController = new EmpleadoJpaController(emf);

        Departamento dep = new Departamento();
        Empleado emp = new Empleado();
        int opcion;

        
            do {

                System.out.println("¿Que desea hacer?");
                System.out.println("Selecione un numero: 1. Empleados, 2. Departamentos, 3. ver lista de empleado, 4. ver lista de departamentos, 0. Salir:");
                opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {

//            if (opcion == 1) {
                    case 0:

                        System.out.println("Fin del programa.");
                        break;
                    case 1:

                        int iddep;
                        String empleado;

                        System.out.println("Ingresa el nombre del empleado:");
                        empleado = scanner.nextLine();
                        System.out.println("Empleado: " + empleado);

                        List<Departamento> listaDepartamentos = departamentoController.findDepartamentoEntities();
                        System.out.println("Elija el Departamento");
                        for (int i = 0; i < listaDepartamentos.size(); i++) {
                            System.out.println("Id: " + listaDepartamentos.get(i).getIdDep());
                            System.out.println("Nombre: " + listaDepartamentos.get(i).getNombre());
                        }
                        System.out.println("Ingresa ID del departamento:");
                        iddep = scanner.nextInt();
                        System.out.println("ID: " + iddep);

//            dep.setNombre(departamento);
//            departamentoController.create(dep);
                        Departamento departamento = departamentoController.findDepartamento(iddep);

                        emp.setIdDep(departamento);
                        emp.setNombre(empleado);
                        empleadoController.create(emp);

                        break;
//            } else if (opcion == 2) {
                    case 2:

                        String depa;
                        System.out.println("Ingresa el nombre del Departamento:");
                        depa = scanner.nextLine();
                        System.out.println("Departamento: " + depa);

                        dep.setNombre(depa);
                        departamentoController.create(dep);

                        break;
//            } else if (opcion == 3) {
                    case 3:

                        List<Empleado> listaEmpleado = empleadoController.findEmpleadoEntities();
                        System.out.println("Estos son los empleados registrados:");
                        for (int i = 0; i < listaEmpleado.size(); i++) {

//                    System.out.println("ID: "+ listaEmpleado.get(i).getIdEmp());
                            System.out.println("Nombre: " + listaEmpleado.get(i).getNombre());
                            System.out.println("Departamento: " + listaEmpleado.get(i).getIdDep().getNombre());

                        }

                        break;
//            } else if(opcion==4){
                    case 4:

                        List<Departamento> listaDepartmento = departamentoController.findDepartamentoEntities();
                        System.out.println("Estos son los departamentos registrados:");
                        for (int i = 0; i < listaDepartmento.size(); i++) {
                            System.out.println("Nombre: " + listaDepartmento.get(i).getNombre());
//                    
//                }

                        }
                        break;
                    default:
                        System.out.println("Error elige la opcion  del numero  0 al 4");

                }
            } while (opcion !=0);
                    
           
//            }
            //        DepartamentoJpaController departamentoController;
            ////        EmpleadoJpaController empleadoController;
            ////        
            ////        empleadoController=new EmpleadoJpaController(emf);
            //        departamentoController=new DepartamentoJpaController(emf);
            //        
            //        Scanner scanner=new Scanner(System.in);
            //        
        
        
    }

}

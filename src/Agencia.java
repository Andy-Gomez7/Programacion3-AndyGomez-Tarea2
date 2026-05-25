import java.util.ArrayList;
import java.util.Scanner;

public class Agencia{
    ArrayList<Vehiculo> Vehiculos;
    Scanner scan;

    public Agencia(){
        Vehiculos = new ArrayList<Vehiculo>();
        scan = new Scanner(System.in);
    }

    public Vehiculo Buscar(String placa){
        for(Vehiculo vehiculo : Vehiculos){
            if(vehiculo.GetPlaca().equals(placa)){
                return vehiculo; 
            }
        }
        return null;
    }

    public void Registrar(){
        int op;

        while(true){
            System.out.print("Digite la marca del marca: ");
            String Marca = scan.next();
            System.out.println("\n");

            System.out.print("Digite la marca del modelo: ");
            String Modelo = scan.next();
            System.out.println("\n");

            System.out.print("Digite la marca del año: ");
            int anio = scan.nextInt();
            System.out.println("\n");

            System.out.print("Digite la marca del Color: ");
            String Color = scan.next();
            System.out.println("\n");

            System.out.print("Digite la marca la placa del vehiculo: ");
            String placa = scan.next();
            System.out.println("\n");

            System.out.print("Digite la marca del precio: ");
            double precio = scan.nextDouble();
            System.out.println("\n");

            Vehiculo nuevoVehiculo = new Vehiculo(placa, Marca, Modelo, anio, Color, precio);
            Vehiculos.add(nuevoVehiculo);

            System.out.println("Digite: \n1-Agregar otro vehiculo\n2-Salir");
            op = scan.nextInt();
            if(op == 2){
                break;
            }
            
        }
    }

    public void MostrarVehiculos(){

        System.out.println("-------------------------------------------------------");
        System.out.println("-----------------------Vehiculos-----------------------");
        System.out.println("-------------------------------------------------------\n");

        for(Vehiculo vehiculo : Vehiculos){

            System.out.println("Marca: "+vehiculo.GetMarca()+"\n");

            System.out.println("Modelo: "+vehiculo.GetModelo()+"\n");

            System.out.println("Color: "+vehiculo.GetColor()+"\n");

            System.out.println("Año: "+vehiculo.GetAnio()+"\n");

            System.out.println("Precio: "+vehiculo.GetPrecio()+"\n");
            
            System.out.println("Placa: "+vehiculo.GetPlaca()+"\n");
        }
    }

    public void BuscarPlaca(String placa){

        Vehiculo vehiculo = Buscar(placa);
            
        System.out.println("\nMarca: "+vehiculo.GetMarca()+"\n");

        System.out.println("Modelo: "+vehiculo.GetModelo()+"\n");

        System.out.println("Color: "+vehiculo.GetColor()+"\n");

        System.out.println("Año: "+vehiculo.GetAnio()+"\n");

        System.out.println("Precio: "+vehiculo.GetPrecio()+"\n");
            
        System.out.println("Placa: "+vehiculo.GetPlaca()+"\n");
    }

    public void MostrarMarca(String Marca){
        System.out.println("-----------------------Vehiculos"+Marca+"-----------------------\n");

        for(Vehiculo vehiculo : Vehiculos){

            if(vehiculo.GetMarca().equals(Marca)){

                System.out.println("Modelo: "+vehiculo.GetModelo()+"\n");

                System.out.println("Color: "+vehiculo.GetColor()+"\n");

                System.out.println("Año: "+vehiculo.GetAnio()+"\n");

                System.out.println("Precio: "+vehiculo.GetPrecio()+"\n");
            
                System.out.println("Placa: "+vehiculo.GetPlaca()+"\n");
            }
        }
    }
}
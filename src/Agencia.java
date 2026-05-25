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

    private String comprobar(String cad){
        while(cad.isEmpty()){
            System.out.print("\nDigite un dato valido: ");
            cad = scan.nextLine();
        }
        return cad;
    }

    public void Registrar(){
        String Marca, Modelo, Color, placa;
        int anio;
        double precio;

        scan.nextLine();
        System.out.print("\nDigite la marca: ");
        Marca = scan.nextLine();
        Marca = comprobar(Marca);
        
        System.out.print("\nDigite el modelo: ");
        Modelo = scan.nextLine();
        Modelo = comprobar(Modelo);

        System.out.print("\nDigite el color: ");
        Color = scan.nextLine();
        Color = comprobar(Color);

        System.out.print("\nDigite la placa: ");
        placa = scan.nextLine();
        placa = comprobar(placa);

        System.out.print("\nDigte el año: ");
        anio = scan.nextInt();
        while(anio < 1900 || anio > 2026){
            System.out.print("\nDigite un dato valido: ");
            anio = scan.nextInt();   
        }

        System.out.print("\nDigite el precio: ");
        precio = scan.nextDouble();
        while(precio < 0.0){
            System.out.print("\nDigite un dato valido: ");
            precio = scan.nextDouble();
        }

        scan.nextLine();
        Vehiculo nuevoVehiculo = new Vehiculo(placa, Marca, Modelo, anio, Color, precio);
        Vehiculos.add(nuevoVehiculo);
        
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

            System.out.println("-------------------------------------------------------\n");
        }
    }

    public void BuscarPlaca(String placa){

        Vehiculo vehiculo = Buscar(placa);
        if(vehiculo == null){
            System.out.println("Vehiculo no encontrado");
        }
            
        System.out.println("\n\nMarca: "+vehiculo.GetMarca()+"\n");

        System.out.println("Modelo: "+vehiculo.GetModelo()+"\n");

        System.out.println("Color: "+vehiculo.GetColor()+"\n");

        System.out.println("Año: "+vehiculo.GetAnio()+"\n");

        System.out.println("Precio: "+vehiculo.GetPrecio()+"\n");
            
        System.out.println("Placa: "+vehiculo.GetPlaca()+"\n");
    }

    public void MostrarMarca(String Marca){
        System.out.println("\n\n-----------------------Vehiculos"+Marca+"-----------------------\n");

        for(Vehiculo vehiculo : Vehiculos){

            if(vehiculo.GetMarca().equals(Marca)){

                System.out.println("Modelo: "+vehiculo.GetModelo()+"\n");

                System.out.println("Color: "+vehiculo.GetColor()+"\n");

                System.out.println("Año: "+vehiculo.GetAnio()+"\n");

                System.out.println("Precio: "+vehiculo.GetPrecio()+"\n");
            
                System.out.println("Placa: "+vehiculo.GetPlaca()+"\n");

                System.out.println("-------------------------------------------------------\n");
            }
        }
    }

    public void Menu(){
        int op;

        do{
            System.out.print("\nDigite una opcion: \n1-Resgistrar vehiculo\n2-Mostrar lista de vehiculos\n3-Buscar un vehiculo por su placa\n4-Mostrar todos los vehiculos de la marca\n5-Salir\n");
            op = scan.nextInt();

            switch(op){
                case 1:
                    Registrar();
                    break;
                case 2:
                    MostrarVehiculos();
                    break;
                case 3:
                    System.out.print("\nDigite una placa: ");
                    scan.nextLine();
                    String placa = scan.nextLine();
                    BuscarPlaca(placa);
                    break;
                case 4:
                    System.out.print("Digite una marca: ");
                    scan.nextLine();
                    String marca = scan.nextLine();
                    MostrarMarca(marca);
                case 5:
                    break;
                default:
                    break;
            }    
        }while (op != 5);
        
    }
}
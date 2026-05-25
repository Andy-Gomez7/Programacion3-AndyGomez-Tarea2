public class Vehiculo {
    private String placa;
    private String marca;
    private String modelo;
    private int anio;
    private  String color;
    private int precio;

    public Vehiculo(){}

    public Vehiculo(String Placa, String Marca, String Modelo, int Anio, String Color, int Precio){
        placa = Placa;
        marca = Marca;
        modelo = Modelo;
        anio = Anio;
        color = Color;
        precio = Precio;
    }

    public void SetPlaca(String Placa){
        placa = Placa;
    }

    public String GetPlaca(){
        return placa;
    }

    public void SetMarca(String Marca){
        marca = Marca;
    }

    public String GetMarca(){
        return marca;
    }

    public void SetModelo(String Modelo){
        modelo = Modelo;
    }

    public String GetModelo(){
        return modelo;
    }

    public void SetAnio(int Anio){
        anio = Anio;
    }

    public int GetAnio(){
        return anio;
    }

    public void SetColor(String Color){
        color = Color;
    }

    public String GetColor(){
        return color;
    }

    public void SetPrecio(int Precio){
        precio = Precio;
    }

    public int GetPrecio(){
        return precio;
    }
}
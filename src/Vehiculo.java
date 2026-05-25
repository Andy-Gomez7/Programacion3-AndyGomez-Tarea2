public class Vehiculo {
    private String placa;
    private String marca;
    private String modelo;
    private int anio;
    private  String color;
    private double precio;

    public Vehiculo(){}

    public Vehiculo(String Placa, String Marca, String Modelo, int Anio, String Color, double Precio){
        SetPlaca(Placa);
        SetMarca(Marca);
        SetModelo(Modelo);
        SetAnio(Anio);
        SetColor(Color);
        SetPrecio(Precio);;
    }

    public void SetPlaca(String Placa){
        if(Placa.equals(""))
        {
            return;
        }
        placa = Placa;
    }

    public String GetPlaca(){
        return placa;
    }

    public void SetMarca(String Marca){
        if(Marca.equals(""))
        {
            return;
        }
        marca = Marca;
    }

    public String GetMarca(){
        return marca;
    }

    public void SetModelo(String Modelo){
        if(Modelo.equals(""))
        {
            return;
        }
        modelo = Modelo;
    }

    public String GetModelo(){
        return modelo;
    }

    public void SetAnio(int Anio){
        if(Anio < 1900 || Anio > 2026)
        {
            return;
        }
        anio = Anio;
    }

    public int GetAnio(){
        return anio;
    }

    public void SetColor(String Color){
        if(Color.equals(""))
        {
            return;
        }
        color = Color;
    }

    public String GetColor(){
        return color;
    }

    public void SetPrecio(double Precio){
        if(Precio < 0.0)
        {
            return;
        }
        precio = Precio;
    }

    public double GetPrecio(){
        return precio;
    }
}
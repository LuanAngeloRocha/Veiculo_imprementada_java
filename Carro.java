public class Carro extends Veiculo{
    private String placa;

    public void setPlaca(String placa){
        this.placa= placa;
    
    }
    public String getPlaca(){
        return this.placa;

    }

    @Override
    public int getAno() {
        return super.getAno();
    }

    @Override
    public String getMarca() {
        return super.getMarca();
    }

    @Override
    public String getModelo() {
        return super.getModelo();
    }

    @Override
    public void setAno(int ano) {
        super.setAno(ano);
    }

    @Override
    public void setMarca(String marca) {
        super.setMarca(marca);
    }

}


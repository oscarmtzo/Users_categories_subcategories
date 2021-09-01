

public class Categoria {
  private String categoria;
  
  public Categoria (String categoria){
    this.categoria = categoria;
  }

  public String getCategoria(){
    return this.categoria;
  }//getCategoria

  public void setCategoria( String categoria ){
    this.categoria = categoria;
  }//setCategoria

  public String toString(){
    return this.categoria;
  }
}
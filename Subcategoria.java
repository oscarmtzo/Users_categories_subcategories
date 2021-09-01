public class Subcategoria{
  private String subcategoria;

  public Subcategoria (String subcategoria){
    this.subcategoria = subcategoria;
  }//constructor

  public String getSubcategoria(){
    return this.subcategoria;
  }//getSubcategoria

  public void setSubcategoria( String subcategoria ) {
    this.subcategoria = subcategoria;
  }//setSubcategoria

  public String toString(){
    return this.subcategoria;
  }
}
import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    /*String[] categorias = new String[1];
    categorias[0] = "Plomería";
    for (String cat : categorias) {
      System.out.println(cat);
      
    }
    String[] subcategorias = {"cocina internacional","cocina china", "cocina tailandesa" };
    
    for(String subcat :subcategorias ){
      System.out.println(subcat);
    }*/
    //String[] nombres = {};
    /*for (String nombre : nombres){

      System.out.println(nombre);
    }*/
    Categoria[] categories = {
      new Categoria("Herreria"), new Categoria("Plomeria")
    };
    Subcategoria[] subcategories = {
      new Subcategoria("Muebles de Jardin"), new Subcategoria("Soldadura Smaw")
    };
    User Oscar = new User(1, "Oscar", categories, subcategories);
    /*for(String category : Arrays.toString(Oscar.getCategories()) ){
      System.out.println(category);
    }*/
    //System.out.println( Arrays.deepToString( Oscar.getCategories() ) );
    System.out.println();
    System.out.println( Oscar.toString() );
    //System.out.println( Arrays.toString( Oscar.getCategories() ));
  }
}
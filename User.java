import java.util.Arrays;

class User{
  private int id_user;
  private String name;
  private Categoria[] categories;
  private Subcategoria[] subcategories;

  public User (int id_user, String name, Categoria[] categories, Subcategoria[] subcategories){
    this.id_user = id_user;
    this.name = name;
    this.categories = categories;
    this.subcategories = subcategories;
  }
  public int getId_user(){
    return this.id_user;
  }//getId_user

  public void setId_user(int id_user){
    this.id_user = id_user;
  }//setId_user
  public String getName(String name){
    return this.name;
  }//getName

  public void setName(String name){
    this.name = name;
  }//setName

  public Categoria[] getCategories(){
    return this.categories;
  }//getCategories

  public void setCategories(Categoria[] categories){
    this.categories = categories;
  }//setCategories


  public Subcategoria[] getSubcategories(){
    return this.subcategories;
  }//getSubcategories

  public void setSubcategories(Subcategoria[] subcategories){
    this.subcategories = subcategories;
  }//setSubcategories

  public String toString(){
    return "id User: " + id_user + " Name: " + name 
    + " Categorias: " + Arrays.toString(categories) + " Subcategorias: " + Arrays.toString(subcategories);
  }

  
}
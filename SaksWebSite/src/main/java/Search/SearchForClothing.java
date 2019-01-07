package Search;

import base.CommonAPI;

public class SearchForClothing extends CommonAPI {

   public void searchBar(){

       typeOnElement("keyword","Kids Clothing");
       navigateBack();
       typeOnElement("Keyword", "Cookware");
       navigateBack();
       typeOnElement("keyword","Bath towels");
       navigateBack();
       typeOnElement("Keyword", "Sheets");
       navigateBack();
       typeOnElement("keyword","Blanket");
       navigateBack();
       typeOnElement("Keyword", "Tops");
       navigateBack();
       typeOnElement("keyword","Yoga pants");
       navigateBack();
       typeOnElement("Keyword", "Active wear");



    }
}

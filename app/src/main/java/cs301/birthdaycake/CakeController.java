package cs301.birthdaycake;

public class CakeController {
    private CakeView cakeView;
    private CakeModel cakeModel;


    public CakeController(CakeView cakeview) {
       this.cakeView = cakeview;
       cakeModel = cakeview.getCakeModel();
   }

}
